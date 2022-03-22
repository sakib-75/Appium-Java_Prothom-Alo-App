package notification;

import org.testng.annotations.Test;
import page_object_model.Notification_POM;

public class Share extends NewsPage {
    @Test(priority = 4)
    public void shareAll(){

        Notification_POM pom = new Notification_POM(driver);
        removeAD(driver);
        pom.shareAll().click();

    }

}
