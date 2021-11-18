package Page;

import org.openqa.selenium.WebDriver;

public class PageHelper {

    public static void enterMainPage(WebDriver driver){
        driver.get("https://applicintweb.com/ExamRightTrunk/Default.aspx");
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
