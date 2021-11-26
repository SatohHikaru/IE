package Page;
import Setup.Setup;

public class BasePage extends Setup {

    public static void enterMainPage(){
       driver.get("https://applicintweb.com/ExamRightTrunk/Default.aspx");
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
