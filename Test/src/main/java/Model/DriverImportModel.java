package Model;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverImportModel {

    public static void setUpDriverChorme(){
        WebDriverManager.chromedriver().setup();
    }

}
