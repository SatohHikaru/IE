package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PendingPage {

    private By forStateXpath = By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlNewAppState\"]/option[8]");
    private By examinerCompanyXpath = By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlNewAppVendor_ddlVendor\"]/option[3]");
    private By createNewXpath= By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_CreateBtn\"]");

    public void createNewFunction(WebDriver driver){

        driver.findElement(forStateXpath).click();
        driver.findElement(examinerCompanyXpath).click();
        driver.findElement(createNewXpath).click();

    }

}
