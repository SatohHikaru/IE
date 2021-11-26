package Helper;

import Assertion.SoftAssertion;
import Page.LoginPage;
import Page.PendingPage;
import Page.PersionalInfomationPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupHelper {

    public static ExtentTest logger;
    public static ExtentReports extent = new ExtentReports();
    public static SoftAssertion softsasertion = new SoftAssertion();
    public static WebDriver driver = new ChromeDriver();;
    public static LoginPage loginPage = new LoginPage();
    public static PendingPage pendingpage = new PendingPage();
    public static PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();

}
