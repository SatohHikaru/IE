package Assertion;
import Page.BasePage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.io.IOException;

import static Page.BasePage.pageHelper;

public class SoftAssertion {

    public static void assertEqual(String actual, String expected, String message) throws IOException {

        if(actual.equalsIgnoreCase(expected)){
            BasePage.logger.log(Status.PASS,message);
        }else {
           // BasePage.logger.log(Status.FAIL,message);
            BasePage.logger.fail(message, MediaEntityBuilder.createScreenCaptureFromPath(pageHelper.captureScreen("Login Fail")).build());
        }

    }

}
