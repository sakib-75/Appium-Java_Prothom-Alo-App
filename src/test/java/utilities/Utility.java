package utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.time.Duration;

public interface Utility {

    default void implicitWait(AndroidDriver driver) {
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    default void offNotificationAccess(AndroidDriver driver) {
        try {
            driver.findElement(By.id("android:id/button2")).click();
        } catch (Exception e) {
            System.out.println("No notification access option found");
        }
    }

    default void removeAD(AndroidDriver driver) {
        try {
            driver.findElement(By.className("android.widget.ImageButton")).click();
        } catch (Exception e) {
            System.out.println("No AD found");
        }
    }


}
