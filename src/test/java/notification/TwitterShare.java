package notification;

import org.testng.annotations.Test;
import page_object_model.Notification_POM;

public class TwitterShare extends NewsPage{
    @Test(priority = 4)
    public void twitterShare(){

        Notification_POM pom = new Notification_POM(driver);
        removeAD(driver);
        pom.twitterShare().click();

    }

}
