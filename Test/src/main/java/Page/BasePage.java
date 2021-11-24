package Page;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;


public class BasePage {

    public static WebDriver driver;
    public static ExtentHtmlReporter reporter;
    public static ExtentReports extent = new ExtentReports();

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
    }

    public static void captureScreen() throws IOException {
        TakesScreenshot ts= (TakesScreenshot) driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        String fileSave= "C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Report\\ImgLogTest";
        File finalDestination=new File(fileSave);
        FileUtils.copyFile(src,finalDestination);
    }
}
