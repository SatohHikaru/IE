package TestCase;

import Helper.ExtendLogHtmlHelper;
import org.testng.annotations.Test;
import java.io.IOException;

import static Helper.ExtendLogHtmlHelper.*;

public class TestRun extends BaseTest {

    @Test
    void popupPDFImageTestcase() throws IOException {

        //Enter Main page
        enterMainPage();

        //LoginPage To page
        ExtendLogHtmlHelper.ExtentHTMLReporter("Test Login","Login to Pending list Page");
        loginPage.loginFunction(jsonFileHelper.getDataFromJsonFile("User.json", "quangtestauto"));
        logHTMLByURL("https://applicintweb.com/ExamRightTrunk/PendingList.aspx?exp=");

        //Create Function in Pending page
        ExtendLogHtmlHelper.ExtentHTMLReporter("Test Select Info in Pending Page","Select info in Pending Page");
        pendingpage.createNewFunction();
        logHTMLByText("//*[@id=\"td-app-name\"]","Life Application for DC");

        //Fill information into inputs
        ExtendLogHtmlHelper.ExtentHTMLReporter("Test Popup PDF Image","Popup PDF Image is displayed");
        persionalinfomationpage.fillInfoFunction(jsonFileHelper.getDataFromJsonFile("User.json", "quangtestauto"));
        logHTMLByDisplay("//*[@id=\"disableDiv\"]");

    }

}

