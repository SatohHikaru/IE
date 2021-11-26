package Page;

<<<<<<< HEAD
import static Helper.SetupHelper.*;
=======
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
>>>>>>> parent of 6d5354b (Update 25/11/2021)
import org.openqa.selenium.By;

public class PendingPage extends BasePage {

    private By forStateXpath = By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlNewAppState\"]/option[8]");
    private By examinerCompanyXpath = By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlNewAppVendor_ddlVendor\"]/option[3]");
    private By createNewXpath= By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_CreateBtn\"]");

    private By CheckTitleXpath=By.xpath("//*[@id=\"td-app-name\"]");

    public void createNewFunction(){

        driver.findElement(forStateXpath).click();
        driver.findElement(examinerCompanyXpath).click();
        driver.findElement(createNewXpath).click();

        //Switch focus when have new tab opened
        switchFocusNewTab();

        ExtentHTMLReporter("Test Select Info in Pending Page","Select info in Pending Page");

        if(driver.findElement(CheckTitleXpath).getText().equals("Life Application for DC")){
            logger.log(Status.PASS,"Select Info Successfully");
        }else{
            logger.log(Status.FAIL,"Fail to Select Info In Pending Page");
        }
    }

}
