package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static AndroidDriver driver;

    public static AndroidDriver setup() {

        DesiredCapabilities cap = new DesiredCapabilities();
        // APK file path
        File appDir = new File("src/main/resources");
        File app = new File(appDir, "prothomalo.apk");

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3 API 30");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        // Appium server
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assert url != null;

        driver = new AndroidDriver(url, cap);
        return driver;

    }


    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
