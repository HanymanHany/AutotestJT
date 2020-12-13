
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.io.BufferedOutputStream;
import java.io.PrintStream;
import org.testng.ISuiteListener;
import org.testng.Reporter;
//import SuiteListener;
import TestPage.EnvContainer;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
//import javafx.util.Duration;

public class Listener extends TestListenerAdapter {

	private int m_count = 0;

	private double m_start;

	@Override
	public void onTestStart(ITestResult result) {
		m_start = System.currentTimeMillis();
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
			log("Test Success.");
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {

			log("Test Failed.");
	}

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		log("Tests Skipped.");
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
		//SuiteListener.Failed += iTestContext.getFailedTests().size();
	}

	private void log(String string) {
		SuiteListener.log(string);
	}

}
