package Page;

<<<<<<< HEAD
import Model.DriverImportModel;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Helper.LogHTMLHelper.setupHelper;
import static Helper.SetupHelper.*;
=======
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Assertion.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

>>>>>>> parent of 6d5354b (Update 25/11/2021)


<<<<<<< HEAD
public class BasePage {
=======
    public static WebDriver driver;
    public static ExtentTest logger;
    public static ExtentHtmlReporter reporter;
    public static ExtentReports extent = new ExtentReports();
    public static AbstractAssertion As = new AbstractAssertion();
>>>>>>> parent of 6d5354b (Update 25/11/2021)

    public static void enterMainPage(){

        DriverImportModel.setUpDriverChorme();
        //driver = new ChromeDriver();
        driver.get("https://applicintweb.com/ExamRightTrunk/Default.aspx");
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
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

<<<<<<< HEAD
=======
    public static void ExtentHTMLReporter(String testName,String info){
        reporter = new ExtentHtmlReporter("C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Report\\Test.html");
        extent.attachReporter(reporter);
        logger= extent.createTest(testName);
        logger.log(Status.INFO,info);
    }

    public static String captureScreen() throws IOException {
        TakesScreenshot ts= (TakesScreenshot) driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        String fileSave= "C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Report\\ImgLogTest\\test.png";
        File finalDestination=new File(fileSave);

        FileUtils.copyFile(src,finalDestination);

        return fileSave;
    }


>>>>>>> parent of 6d5354b (Update 25/11/2021)
}
