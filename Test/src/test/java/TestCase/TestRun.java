package TestCase;

import Page.*;
import Helper.*;
import org.testng.annotations.Test;

import static Helper.Helper.getDataFromJsonFile;

public class TestRun extends BaseTest {

    private static Helper helper = new Helper();
    private static LoginPage loginPage = new LoginPage();
    private static BasePage basepage = new BasePage();
    private static PendingPage pendingpage = new PendingPage();
    private static PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();

    @Test
    void popupPDFImageTestcase(){

        //Enter Main page
        basepage.enterMainPage();

        //LoginPage To page
        loginPage.loginFunction(getDataFromJsonFile("User.json", "quangtestauto"));

        //Create Function in Pending page
        pendingpage.createNewFunction();

        //Fill information into inputs
        persionalinfomationpage.fillInfoFunction(getDataFromJsonFile("User.json", "quangtestauto"));
    }

}

