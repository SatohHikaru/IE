package Assertion;

import Helper.ExtendLogHtmlHelper;
import Setup.Setup;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import java.io.IOException;

public class SoftAssertion extends Setup {

    public static void assertEqual(String actual, String expected, String message) throws IOException {

        if(actual.equalsIgnoreCase(expected)){
            logger.log(Status.PASS,message);
        }else {
           // BasePage.logger.log(Status.FAIL,message);
            logger.fail(message, MediaEntityBuilder.createScreenCaptureFromPath(ExtendLogHtmlHelper.captureScreen("Login Fail")).build());
        }

    }

}
