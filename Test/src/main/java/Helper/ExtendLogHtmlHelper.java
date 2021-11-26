package Helper;

import Setup.Setup;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ExtendLogHtmlHelper extends Setup {

    public static void ExtentHTMLReporter(String testName,String infoTest){
        reporter = new ExtentHtmlReporter("C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Report\\Test.html");
        extent.attachReporter(reporter);
        logger= extent.createTest(testName);
        logger.log(Status.INFO,infoTest);
    }

    public static String captureScreen(String fileName) {
        TakesScreenshot ts= (TakesScreenshot) driver;
        File src =ts.getScreenshotAs(OutputType.FILE);

        String fileSave= "C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Report\\ImgLogTest\\"+fileName+".png";

        String readImageLog= "ImgLogTest\\"+fileName+".png";
        try {
            FileUtils.copyFile(src, new File(fileSave));
        } catch (IOException e) {
            logger.log(Status.FAIL,"Unable to log screenshot");
        }

        return readImageLog;
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
