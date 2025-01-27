package util;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility { //1:39:00
    public static WebDriver driver;

    public static void setUtilityDriver(){
        driver = BasePage.driver;
    }
}
