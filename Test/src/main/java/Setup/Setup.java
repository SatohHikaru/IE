package Setup;

import Assertion.SoftAssertion;
import Helper.JsonFileHelper;
import Page.LoginPage;
import Page.PendingPage;
import Page.PersionalInfomationPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

public class Setup {
    public static SoftAssertion softsasertion = new SoftAssertion();

    public static JsonFileHelper jsonFileHelper = new JsonFileHelper();
    public static LoginPage loginPage = new LoginPage();
    public static PendingPage pendingpage = new PendingPage();
    public static PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();

    public static ExtentTest logger;
    public static ExtentReports extent = new ExtentReports();
    public static WebDriver driver;
    public static ExtentHtmlReporter reporter;
}
