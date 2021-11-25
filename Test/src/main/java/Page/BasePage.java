package Page;

import Helper.*;
import com.aventstack.extentreports.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Assertion.*;

import java.io.IOException;

public class BasePage {

    public static ExtentTest logger;
    public static ExtentReports extent = new ExtentReports();
    public static SoftAssertion softsasertion = new SoftAssertion();
    public static WebDriver driver;
    public static PageHelper pageHelper = new PageHelper();
    public static LoginPage loginPage = new LoginPage();
    public static BasePage basepage = new BasePage();
    public static PendingPage pendingpage = new PendingPage();
    public static PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();

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

    public static void logHTMLByURL(String linkURL) throws IOException {

        String currentURL=driver.getCurrentUrl();
        Status status = currentURL.equals(linkURL) ? Status.PASS : Status.FAIL ;

        String message = status == Status.PASS ? "log Successfully" : "Log Fail";

        softsasertion.assertEqual(currentURL,linkURL,message);

    }

    public static void logHTMLByText(String location, String text) throws IOException {

        By CheckTitleXpath=By.xpath(location);
        String CheckParagraph=driver.findElement(CheckTitleXpath).getText();

        Status status = CheckParagraph.equals(text) ? Status.PASS : Status.FAIL ;

        String message = status == Status.PASS ? "log Successfully" : "Log Fail";

        softsasertion.assertEqual(CheckParagraph,text,message);

    }

    public static void logHTMLByDisplay (String location) throws IOException {

        By CheckTitleXpath=By.xpath(location);
        String CheckParagraph= Boolean.toString(driver.findElement(CheckTitleXpath).isDisplayed());

        Status status = CheckParagraph.equals(CheckParagraph) ? Status.PASS : Status.FAIL ;

        String message = status == Status.PASS ? "log Successfully" : "Log Fail";

        softsasertion.assertEqual(CheckParagraph,"True",message);

    }

}
