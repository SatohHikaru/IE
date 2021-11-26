package Page;
import Model.UserModel;
import org.openqa.selenium.By;

public class LoginPage extends BasePage
{
    private By usernameXpath = By.xpath("//*[@id=\"uxTextLogin\"]");
    private By passwordXpath = By.xpath("//*[@id=\"uxTextPass\"]");
    private By loginButtonXpath= By.xpath("//*[@id=\"form1\"]/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td[2]");

    public void loginFunction(UserModel userModel) {

        driver.findElement(usernameXpath).sendKeys(userModel.getUserName());
        driver.findElement(passwordXpath).sendKeys(userModel.getPassword());
        driver.findElement(loginButtonXpath).click();

    }
}
