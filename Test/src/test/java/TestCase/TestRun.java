package TestCase;

import Page.*;
import Model.*;
import Helper.*;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestRun {

    private static WebDriver driver;
    private static Helper helper = new Helper();
    private static LoginPage loginPage = new LoginPage();
    private static BasePage basepage = new BasePage();
    private static PendingPage pendingpage = new PendingPage();
    private static PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();

//    public static void main(String[] args) {
//
//        //Setup default
//        DriverImportModel.setUpDriverChorme();
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
//        LoginPage loginPage = new LoginPage();
//        PendingPage pendingpage = new PendingPage();
//        PersionalInfomationPage persionalinfomationpage = new PersionalInfomationPage();
//
//        //LoginPage To page
//        loginPage.loginFunction(driver);
//
//    }
//
//    public static void popupPDFImageTestcase( WebDriver driver){
//
//        //LoginPage To page
//        loginPage.loginFunction(driver);
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

        DriverImportModel.setUpDriverChorme();
        driver = new ChromeDriver();
        basepage.enterMainPage(driver);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

    }


    @Test
    void popupPDFImageTestcase(){


        //LoginPage To page
        loginPage.loginFunction(driver);


        //Create Function in Pending page
        pendingpage.createNewFunction(driver);

        //Switch focus when have new tab opened
        helper.switchFocusNewTab(driver);

        //Fill information into inputs
        persionalinfomationpage.fillInfoFunction(driver);
    }

    @AfterTest
    void close(){
       driver.close();
    }

}

