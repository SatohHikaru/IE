package TestCase;

import Page.*;
import Model.DriverConnect;

import Page.PendingPage;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
//import java.util.concurrent.TimeUnit;


public class TestRun {

    private static PageHelper pagehelper = new PageHelper();
    private static Login login = new Login();
    private static PendingPage pendingpage = new PendingPage();
    private static PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();
    private static WebDriver driver;


//    public static void main(String[] args) {
//
//        //Setup default
//        DriverConnect.setUpDriverChorme();
//        driver = new ChromeDriver();
//        pagehelper.enterMainPage(driver);
//
//        //Testcase Need Run
//        popupPDFImageTestcase(driver);
//
//    }
//
//    public static void LoginTestCase( WebDriver driver){
//
//        Login login = new Login();
//        PendingPage pendingpage = new PendingPage();
//        PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();
//
//        //Login To page
//        login.loginFunction(driver);
//
//    }
//
//    public static void popupPDFImageTestcase( WebDriver driver){
//
//        //Login To page
//        login.loginFunction(driver);
//
//        //Create Function in Pending page
//        pendingpage.createNewFunction(driver);
//
//        //Switch focus when have new tab opened
//        pagehelper.switchFocusNewTab(driver);
//
//        //Fill information into inputs
//        persionalinfomationpage.fillFunction(driver);
//
//    }

    @BeforeTest
    public static void setupDriver(){

        DriverConnect.setUpDriverChorme();
        driver = new ChromeDriver();
        pagehelper.enterMainPage(driver);
    }


    @Test
    void popupPDFImageTestcase(){

        //Login To page
        login.loginFunction(driver);

        //Create Function in Pending page
        pendingpage.createNewFunction(driver);

        //Switch focus when have new tab opened
        pagehelper.switchFocusNewTab(driver);

        //Fill information into inputs
        persionalinfomationpage.fillInfoFunction(driver);
    }

    @AfterTest
    void close(){
       driver.close();
    }

}

