package TestCase;

import Assertion.GlobleVariable;
import Model.DriverImportModel;
import Page.BasePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {

    protected static String getNameData;

    @BeforeTest
    public void setupDriver(ITestContext context){
        DriverImportModel.setUpDriverChorme();
        driver = new ChromeDriver();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        getNameData = context.getCurrentXmlTest().getParameter("AdminData");
        GlobleVariable.SaveData = getNameData;

    }

    @AfterTest
    public static void close(){

        extent.flush();
        driver.quit();

    }

}
