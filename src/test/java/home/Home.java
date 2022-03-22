package home;

import base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import utilities.Utility;

public class Home extends BaseClass implements Utility {
    @Test(priority = 1)
    public void homePage() {
        AndroidDriver driver = setup();

        implicitWait(driver);
        offNotificationAccess(driver);
        removeAD(driver);
        System.out.println("Home page opened");

    }

}
