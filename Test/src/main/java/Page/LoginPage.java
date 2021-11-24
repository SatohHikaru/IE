package Page;
import Model.UserModel;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

public class LoginPage extends BasePage
{
    private By usernameXpath = By.xpath("//*[@id=\"uxTextLogin\"]");
    private By passwordXpath = By.xpath("//*[@id=\"uxTextPass\"]");
    private By loginButtonXpath= By.xpath("//*[@id=\"form1\"]/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td[2]");

    public void loginFunction(UserModel userModel){

        driver.findElement(usernameXpath).sendKeys(userModel.getUserName());
        driver.findElement(passwordXpath).sendKeys(userModel.getPassword());
        driver.findElement(loginButtonXpath).click();


        ExtentHTMLReporter();
        ExtentTest logger= extent.createTest("Test Login");
//        String message = "Keep Buy Product Failed" + aa.formatFailMessage("abc","xyz")+"&emsp;&emsp;&emsp;&emsp;"+logger.addScreenCaptureFromPath(captureScreen());
//        logger.log(Status.FAIL,message);

        logger.log(Status.INFO,"Login to Pending list Page");
        if(driver.getCurrentUrl().equals("https://applicintweb.com/ExamRightTrunk/PendingList.aspx?exp=")){
            logger.log(Status.PASS,"Login Successfully");
        }else{
            logger.log(Status.FAIL,"Fail Login");
        }

    }
}
