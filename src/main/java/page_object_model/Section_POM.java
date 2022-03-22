package page_object_model;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Section_POM {

    AndroidDriver driver;

    public Section_POM(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.mcc.prothomalo:id/action_sections")
    WebElement section;

    @FindBy(id = "com.mcc.prothomalo:id/menu_item_name")
    List<WebElement> menuList;

    @FindBy(id = "com.mcc.prothomalo:id/child_section_name")
    List<WebElement> subMenuList;

    @FindBy(id = "com.mcc.prothomalo:id/left_image_child_row_cv_main_container")
    List<WebElement> menuNewsList;

    @FindBy(id = "com.mcc.prothomalo:id/menu_expand_button")
    List<WebElement> menuExpandBtn;

    public WebElement section() {
        return section;
    }

    public List<WebElement> menuList() {
        return menuList;
    }

    public List<WebElement> subMenuList() {
        return subMenuList;
    }

    public List<WebElement> menuNewsList(){
        return menuNewsList;
    }

    public List<WebElement> menuExpandBtn(){
        return menuExpandBtn;
    }


}
