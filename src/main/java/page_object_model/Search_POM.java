package page_object_model;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_POM {
    AndroidDriver driver;

    public Search_POM(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.mcc.prothomalo:id/action_search")
    WebElement search;

    @FindBy(id = "com.mcc.prothomalo:id/search_list_fragment_tet_search")
    WebElement searchInput;

    @FindBy(id = "com.mcc.prothomalo:id/search_list_fragment_iv_voice_search")
    WebElement voiceSearch;

    public WebElement search(){
        return search;
    }

    public WebElement searchInput(){
        return searchInput;
    }

    public WebElement voiceSearch(){
        return voiceSearch;
    }

}
