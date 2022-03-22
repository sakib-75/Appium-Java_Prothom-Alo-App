package page_object_model;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Notification_POM {

    AndroidDriver driver;
    public Notification_POM(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.mcc.prothomalo:id/action_notification")
    WebElement notificationBtn;

    @FindBy(id = "com.mcc.prothomalo:id/story_notification_vh_title")
    List<WebElement> notificationNews;

    @FindBy(id = "com.mcc.prothomalo:id/facebook_share")
    WebElement facebookShare;

    @FindBy(id = "com.mcc.prothomalo:id/twitter_share")
    WebElement twitterShare;

    @FindBy(id = "com.mcc.prothomalo:id/all_share")
    WebElement shareAll;

    public WebElement notificationBtn(){
        return notificationBtn;
    }

    public List<WebElement> notificationNews(){
        return notificationNews;
    }

    public WebElement facebookShare(){
        return facebookShare;
    }

    public WebElement twitterShare(){
        return twitterShare;
    }

    public WebElement shareAll(){
        return shareAll;
    }

}
