package Page;
import Model.UserModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Page.BasePage.getDataFromJsonFile;

public class LoginPage
{

    private By usernameXpath = By.xpath("//*[@id=\"uxTextLogin\"]");
    private By passwordXpath = By.xpath("//*[@id=\"uxTextPass\"]");
    private By loginButtonXpath= By.xpath("//*[@id=\"uxButtonLogin\"]");

    public void loginFunction(WebDriver driver){

        UserModel userModel;
        userModel =getDataFromJsonFile("UserModel.json", "quangtestauto");
        driver.findElement(usernameXpath).sendKeys(userModel.getUserName());
        driver.findElement(passwordXpath).sendKeys(userModel.getPassword());
        driver.findElement(loginButtonXpath).click();

    }
}
