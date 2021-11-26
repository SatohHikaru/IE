package Page;

import Model.DriverImportModel;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Helper.LogHTMLHelper.setupHelper;
import static Helper.SetupHelper.*;


public class BasePage {

    public static void enterMainPage(){

        DriverImportModel.setUpDriverChorme();
        //driver = new ChromeDriver();
        driver.get("https://applicintweb.com/ExamRightTrunk/Default.aspx");
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    //Focus new tab function
    public static void switchFocusNewTab(){
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
    }

}
