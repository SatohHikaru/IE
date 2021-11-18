package Page;
import Model.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
    private By usernameXpath = By.xpath("//*[@id=\"uxTextLogin\"]");
    private By passwordXpath = By.xpath("//*[@id=\"uxTextPass\"]");
    private By loginButtonXpath= By.xpath("//*[@id=\"uxButtonLogin\"]");

    public void loginFunction(WebDriver driver){

        User user = new User();
        driver.findElement(usernameXpath).sendKeys(user.getUserName());
        driver.findElement(passwordXpath).sendKeys(user.getPassword());
        driver.findElement(loginButtonXpath).click();

    }
}
