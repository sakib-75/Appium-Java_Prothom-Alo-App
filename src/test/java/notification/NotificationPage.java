package notification;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.Notification_POM;

public class NotificationPage extends Home {
    @Test(priority = 2)
    public void notificationPage(){

        Notification_POM pom = new Notification_POM(driver);
        pom.notificationBtn().click();
        System.out.println("Notification page opened...");

    }


}
