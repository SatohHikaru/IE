package Helper;

import Model.UserModel;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Page.BasePage;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PageHelper {


    public static ExtentHtmlReporter reporter;
    public static BasePage basePage=new BasePage();

    public static UserModel[] getJsonFile(String fileName) {
        final String JSON_PATH = "C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Data\\" + fileName;
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(JSON_PATH));
            UserModel[] userModels = gson.fromJson(reader, UserModel[].class);
            return userModels;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static UserModel getDataFromJsonFile(String fileName, String userNameTest) {
        UserModel[] userModels = getJsonFile(fileName);
        for (UserModel userModel : userModels) {
            if (userModel.getUserName().equals(userNameTest)) {
                return userModel;
            }
        }
        return null;
    }

    public static void ExtentHTMLReporter(String testName,String infoTest){
        reporter = new ExtentHtmlReporter("C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Report\\Test.html");
        basePage.extent.attachReporter(reporter);
        basePage.logger= basePage.extent.createTest(testName);
        basePage.logger.log(Status.INFO,infoTest);
    }

    public static String captureScreen(String fileName) {
        TakesScreenshot ts= (TakesScreenshot) basePage.driver;
        File src =ts.getScreenshotAs(OutputType.FILE);

        String fileSave= "C:\\Users\\NVVinh\\Desktop\\Auto Test Code\\IE\\Test\\src\\main\\resources\\Report\\ImgLogTest\\"+fileName+".png";

        String readImageLog= "ImgLogTest\\"+fileName+".png";
        try {
            FileUtils.copyFile(src, new File(fileSave));
        } catch (IOException e) {
            basePage.logger.log(Status.FAIL,"Unable to log screenshot");
        }

        return readImageLog;
    }
}
