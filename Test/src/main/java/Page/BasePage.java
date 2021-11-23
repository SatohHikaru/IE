package Page;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;


public class BasePage {

    public static WebDriver driver;
    private static ExtentHtmlReporter reporter;
    private static ExtentReports extent = new ExtentReports();

    public static void enterMainPage(){
       driver.get("https://applicintweb.com/ExamRightTrunk/Default.aspx");
    }

    //Focus new tab function
    public static void switchFocusNewTab(){
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
    }

    public static void ExtentHTMLReporter(){

        reporter = new ExtentHtmlReporter("C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Report\\Test.html");
        extent.attachReporter(reporter);
        ExtentTest logger= extent.createTest("Test");

        logger.log(Status.PASS,"Test Passed");
        logger.log(Status.FAIL,"Test Failed");
        logger.log(Status.SKIP,"Test Skipped");
        logger.log(Status.INFO,"Open page : https://a/sdfasdf");

    }

    public static void flushHTML(){
        extent.flush();
    }
}
