package TestPageLocator.Mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailLocators {
    WebDriver _driver;

    public MailLocators(WebDriver driver) {
        this._driver = driver;
    }

    @FindBy(xpath = "//*[@id='mailbox']//*[contains(@class,'mail-input')]/input")
    public WebElement LoginField;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement PasswordField;
    @FindBy(xpath = "(//*[@id='mailbox']//button)[1]")
    public WebElement NextBtn;
    @FindBy(xpath = "//*[contains(@class,'second-button')]")
    public WebElement SignInBtn;
    @FindBy(xpath = "(//*[@id='mailbox']//*[contains(@class,'error')])[last()]")
    public WebElement ErrorText;

}
