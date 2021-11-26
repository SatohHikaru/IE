package Helper;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

import java.io.IOException;

import static Helper.SetupHelper.softsasertion;

public class LogHTMLHelper {

    public static SetupHelper setupHelper = new SetupHelper();
    public static void logHTMLByURL(String linkURL) throws IOException {

        String currentURL=setupHelper.driver.getCurrentUrl();
        Status status = currentURL.equals(linkURL) ? Status.PASS : Status.FAIL ;

        String message = status == Status.PASS ? "log Successfully" : "Log Fail";

        softsasertion.assertEqual(currentURL,linkURL,message);

    }

    public static void logHTMLByText(String location, String text) throws IOException {

        By CheckTitleXpath=By.xpath(location);
        String CheckParagraph=setupHelper.driver.findElement(CheckTitleXpath).getText();

        Status status = CheckParagraph.equals(text) ? Status.PASS : Status.FAIL ;

        String message = status == Status.PASS ? "log Successfully" : "Log Fail";

        softsasertion.assertEqual(CheckParagraph,text,message);

    }

    public static void logHTMLByDisplay (String location) throws IOException {

        By CheckTitleXpath=By.xpath(location);
        String CheckParagraph= Boolean.toString(setupHelper.driver.findElement(CheckTitleXpath).isDisplayed());

        Status status = CheckParagraph.equals(CheckParagraph) ? Status.PASS : Status.FAIL ;

        String message = status == Status.PASS ? "log Successfully" : "Log Fail";

        softsasertion.assertEqual(CheckParagraph,"True",message);

    }
}
