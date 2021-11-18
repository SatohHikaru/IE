package Model;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverConnect {

    public static void setUpDriverChorme(){
        WebDriverManager.chromedriver().setup();
    }

}
