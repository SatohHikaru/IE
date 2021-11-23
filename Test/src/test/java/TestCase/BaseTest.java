package TestCase;

import Model.DriverImportModel;
import Page.BasePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {

    @BeforeTest
    public void setupDriver(){
        DriverImportModel.setUpDriverChorme();
        driver = new ChromeDriver();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public static void close(){
        flushHTML();
        driver.close();
    }

}
