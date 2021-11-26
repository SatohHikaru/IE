package TestCase;

import Page.*;
import Helper.*;
import org.testng.annotations.Test;

import java.io.IOException;

<<<<<<< HEAD
import static Page.BasePage.*;
import static Helper.ExtentHtmlHelper.*;
import static Helper.SetupHelper.*;
import static Helper.LogHTMLHelper.*;
import static Helper.JsonHelper.*;

public class TestRun {
=======
import static Helper.Helper.getDataFromJsonFile;

public class TestRun extends BaseTest {
>>>>>>> parent of 6d5354b (Update 25/11/2021)

    private static Helper helper = new Helper();
    private static LoginPage loginPage = new LoginPage();
    private static BasePage basepage = new BasePage();
    private static PendingPage pendingpage = new PendingPage();
    private static PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();

    @Test
    void popupPDFImageTestcase() throws IOException {

//        //Enter Main page
//        enterMainPage();

        //LoginPage To page
<<<<<<< HEAD
        //ExtentHTMLReporter("Test Login","Login to Pending list Page");
        loginPage.loginFunction(getDataFromJsonFile("User.json", "quangtestauto"));
        logHTMLByURL("https://applicintweb.com/ExamRightTrunk/Pending");

        //Create Function in Pending page
        ExtentHTMLReporter("Test Select Info in Pending Page","Select info in Pending Page");
        pendingpage.createNewFunction();
        logHTMLByText("//*[@id=\"td-app-name\"]","Life Application for DC");

        //Fill information into inputs
        ExtentHTMLReporter("Test Popup PDF Image","Popup PDF Image is displayed");
        persionalinfomationpage.fillInfoFunction(getDataFromJsonFile("User.json", "quangtestauto"));
        logHTMLByDisplay("//*[@id=\"disableDiv\"]");
=======
        loginPage.loginFunction(getDataFromJsonFile("User.json", "quangtestauto1"));

//        //Create Function in Pending page
//        pendingpage.createNewFunction();
//
//        //Fill information into inputs
//        persionalinfomationpage.fillInfoFunction(getDataFromJsonFile("User.json", "quangtestauto"));
>>>>>>> parent of 6d5354b (Update 25/11/2021)
    }


}

