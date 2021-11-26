package Assertion;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.io.IOException;

import static Helper.ExtentHtmlHelper.captureScreen;
import static Helper.SetupHelper.*;

public class SoftAssertion {

    public static void assertEqual(String actual, String expected, String message) throws IOException {

        if(actual.equalsIgnoreCase(expected)){
            logger.log(Status.PASS,message);
        }else {
            logger.fail(message, MediaEntityBuilder.createScreenCaptureFromPath(captureScreen("Login Fail")).build());
        }

    }



}
