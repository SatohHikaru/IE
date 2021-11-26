package Helper;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static Helper.SetupHelper.*;

public class ExtentHtmlHelper {


    public static ExtentHtmlReporter reporter;

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


}
