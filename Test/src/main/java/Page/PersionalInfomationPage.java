package Page;

import Model.UserModel;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class PersionalInfomationPage extends BasePage{


    private By firstnameXpath = By.xpath("//*[@id=\"ctl_insured_first_name\"]");
    private By middlenameXpath = By.xpath("//*[@id=\"MainPane\"]/table/tbody/tr[3]/td[3]/div/input");
    private By lastnameXpath = By.xpath("//*[@id=\"ctl_insured_last_name\"]");
    private By suffixXpath = By.xpath("//*[@id=\"ctl_insured_suffix\"]");

    private By firstinputDateXpath = By.xpath("//*[@id=\"MainPane\"]/table/tbody/tr[6]/td[3]/div/input[1]");
    private By secinputDateXpath = By.xpath("//*[@id=\"MainPane\"]/table/tbody/tr[6]/td[3]/div/input[2]");
    private By lastinputDateXpath = By.xpath("//*[@id=\"MainPane\"]/table/tbody/tr[6]/td[3]/div/input[3]");

    private By SSNradioboxXpath = By.xpath("//*[@id=\"ctl_insured_sw_1_1\"]");
    private By printbuttonXpath = By.xpath("//*[@id=\"buttonPrint\"]");

    private By CheckPopupApear = By.xpath("//*[@id=\"disableDiv\"]");

    public void fillInfoFunction(UserModel userModel){

        driver.findElement(firstnameXpath).sendKeys(userModel.getFirstName());

        driver.findElement(middlenameXpath).sendKeys(userModel.getMiddleName());
        driver.findElement(lastnameXpath).sendKeys(userModel.getLastName());
        driver.findElement(suffixXpath).sendKeys(userModel.getSuffix());

        driver.findElement(firstinputDateXpath).sendKeys(userModel.getMonth());
        driver.findElement(secinputDateXpath).sendKeys(userModel.getDay());
        driver.findElement(lastinputDateXpath).sendKeys(userModel.getYear());

        driver.findElement(SSNradioboxXpath).click();
        driver.findElement(printbuttonXpath).click();

        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        ExtentHTMLReporter();
        ExtentTest logger= extent.createTest("Test Popup PDF Image");
        logger.log(Status.INFO,"Popup PDF Image is displayed");

        if(driver.findElement(CheckPopupApear).isDisplayed()){
            logger.log(Status.PASS,"Fill Info Successfully");
        }else{
            logger.log(Status.FAIL,"Fail to Fill Info In Personal Information Page");
        }


    }
}
