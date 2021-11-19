package Helper;

import Model.UserModel;
import com.google.gson.Gson;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Helper {
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

    //Focus new tab function
    public static void switchFocusNewTab(WebDriver driver){
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
    }

}
