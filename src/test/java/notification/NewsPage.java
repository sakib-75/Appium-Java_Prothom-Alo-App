package notification;

import org.testng.annotations.Test;
import page_object_model.Notification_POM;

public class NewsPage extends NotificationPage {
    @Test(priority = 3)
    public void newsPage(){

        Notification_POM pom = new Notification_POM(driver);
        removeAD(driver);
        pom.notificationNews().get(1).click();

    }

}
