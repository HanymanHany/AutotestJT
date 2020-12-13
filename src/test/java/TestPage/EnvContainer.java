package TestPage;

import Helpers.Helper;

import TestPageLocator.Common.PageAuth;
import TestPageLocator.Common.GeneralLocators;

import org.openqa.selenium.*;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.util.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EnvContainer {
    public static String URL, Pass, Login, BrowserType, PathDriver,Headless;
    public static WebDriver Driver;
    protected static PageAuth authpage;
    public static Helper _ctx;
    public static GeneralLocators pagecommon;

    @BeforeSuite
    @Parameters({"browsername","headless", "pathdriver", "url", "username", "password"})
    public void suiteSetUp(String browserType,String headless, String pathDriver, String url, String username,
            String password) throws Exception {

        if (System.getProperty("url") != null) {
            url = System.getProperty("url");
        }
        Headless=headless;
        Pass = password;
        Login = username;
        BrowserType = browserType;
        PathDriver = pathDriver;
        Driver = getDriverByName(browserType,Headless, pathDriver);
        _ctx = new Helper(Driver);
        URL = url;
        authpage = PageFactory.initElements(Driver, PageAuth.class);
        pagecommon = PageFactory.initElements(Driver, GeneralLocators.class);

        Driver.manage().window().setSize(new Dimension(1920, 1080));


        //Deleted files on directory Logs
       // _ctx.clearDirectory(InitData.PATH_TO_LOGS );
    }


    @AfterSuite
    public void suiteTearDown() {
        Driver.quit();
    }

    @AfterMethod
    public void testTearDown(ITestResult testResult) {
        try {
            String nameMethod = testResult.getName();
            String nameClass = testResult.getTestClass().getName();
            _ctx.writeAllLogInFile(Driver, nameMethod, nameClass);
            EnvContainer.interceptionJSonPage(Driver);

            // EnvContainer.interceptionConsolePage(Driver);
        } catch (Exception ex) {

        }
    }


        public static WebDriver getDriverByName (String browserType, String Headless, String pathDriver){
            WebDriver driver = null;

            if (browserType.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", pathDriver);
                System.setProperty("webdriver.chrome.verboseLogging", "false");
                System.setProperty("webdriver.chrome.args", "--disable-logging");
                System.setProperty("webdriver.chrome.silentOutput", "true");
                Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF); // it

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--log-level=OFF");
                options.addArguments("--silent");

                options.setExperimentalOption("useAutomationExtension", false);
                options.addArguments("--proxy-server='direct://'");
                options.addArguments("--proxy-bypass-list=*");

                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                if (Headless.equals("yes")) {
                    options.setHeadless(true);
                    options.addArguments("--headless");
                    options.addArguments("--window-size=1920,1080");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--disable-extensions");

                }

              //  options.setExperimentalOption("prefs", chromePrefs);
                LoggingPreferences logPrefs = new LoggingPreferences();
                logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
                options.setCapability("goog:loggingPrefs", logPrefs);

                driver = new ChromeDriver(options);
                return driver;
            } else {
                throw new RuntimeException("driver not found");
                // return null;
            }

        }


        /**
         * Intercept function JS ERROR
         */
        public static String interceptionJSonPage (WebDriver webDriver){
            Set<String> errorStrings = new HashSet<>();
            errorStrings.add("SyntaxError");
            errorStrings.add("EvalError");
            errorStrings.add("ReferenceError");
            errorStrings.add("RangeError");
            errorStrings.add("TypeError");
            errorStrings.add("URIError");
            // errorStrings.add("404");

            if (webDriver == null)
                return null;
            if (webDriver.manage() == null)
                return null;
            if (webDriver.manage().logs() == null)
                return null;

            LogEntries logEntries = webDriver.manage().logs().get(LogType.BROWSER);
            if (logEntries != null) {
                for (LogEntry logEntry : logEntries) {
                    for (String errorString : errorStrings) {
                        if (logEntry.getMessage().contains(errorString)) {
                            if (System.getProperty("stopOnJsFail") != null) {
                                Helper.log(new Date(logEntry.getTimestamp()) + " " + logEntry.getLevel()
                                        + " " + logEntry.getMessage());

                            }
                            Assert.fail(new Date(logEntry.getTimestamp()) + " " + logEntry.getLevel()
                                    + " " + logEntry.getMessage());
                        }
                    }
                }
            }
            return null;
        }

}
