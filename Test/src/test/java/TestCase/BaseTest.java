package TestCase;

import Page.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import static Helper.LogHTMLHelper.setupHelper;

public class BaseTest extends BasePage {

    @BeforeTest
    public void setupDriver(){
        enterMainPage();
    }

    @AfterTest
    public static void close(){
<<<<<<< HEAD

        setupHelper.extent.flush();
        setupHelper.driver.quit();

=======
        extent.flush();
        driver.close();
>>>>>>> parent of 6d5354b (Update 25/11/2021)
    }

}
