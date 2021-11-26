package TestCase;

import org.testng.annotations.Test;
import java.io.IOException;

import static Page.BasePage.*;
import static Helper.ExtentHtmlHelper.*;
import static Helper.SetupHelper.*;
import static Helper.LogHTMLHelper.*;
import static Helper.JsonHelper.*;

public class TestRun {

    @Test
    void popupPDFImageTestcase() throws IOException {

//        //Enter Main page
//        enterMainPage();

        //LoginPage To page
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
    }


}

