package TestCase;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestRun extends BaseTest {

    @Test
    void popupPDFImageTestcase() throws IOException {

        //Enter Main page
        basepage.enterMainPage();

        //LoginPage To page
        pageHelper.ExtentHTMLReporter("Test Login","Login to Pending list Page");
        loginPage.loginFunction(pageHelper.getDataFromJsonFile("User.json", "quangtestauto"));
        logHTMLByURL("https://applicintweb.com/ExamRightTrunk/PendingList.aspx?exp=");

        //Create Function in Pending page
        pageHelper.ExtentHTMLReporter("Test Select Info in Pending Page","Select info in Pending Page");
        pendingpage.createNewFunction();
        logHTMLByText("//*[@id=\"td-app-name\"]","Life Application for DC");

        //Fill information into inputs
        pageHelper.ExtentHTMLReporter("Test Popup PDF Image","Popup PDF Image is displayed");
        persionalinfomationpage.fillInfoFunction(pageHelper.getDataFromJsonFile("User.json", "quangtestauto"));
        logHTMLByDisplay("//*[@id=\"disableDiv\"]");
    }

}

