package Page;

import Helper.Helper;
import Model.UserModel;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public static void enterMainPage(WebDriver driver){
       driver.get("https://applicintweb.com/ExamRightTrunk/Default.aspx");
    }

    public static UserModel getDataFromJsonFile(String fileName, String userNameTest) {
        UserModel[] userModels = Helper.getJsonFile(fileName);
        for (UserModel userModel : userModels) {
            if (userModel.getUserName().equals(userNameTest)) {
                return userModel;
            }
        }
        return null;
    }
}
