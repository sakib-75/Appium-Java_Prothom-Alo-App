package page_object_model;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyApp_POM {

    AndroidDriver driver;

    public MyApp_POM(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.mcc.prothomalo:id/action_my_app")
    WebElement myApp;

    @FindBy(id = "com.mcc.prothomalo:id/my_app_option_element_holder_tv_name")
    List<WebElement> myAppMenuOption;

    @FindBy(id = "com.mcc.prothomalo:id/user_profile_element_holder_btn_sign_in")
    WebElement loginBtn;

    @FindBy(id = "com.mcc.prothomalo:id/google_container")
    WebElement googleContainer;

    @FindBy(id = "com.mcc.prothomalo:id/fragment_login_tet_email")
    WebElement loginEmailInp;

    @FindBy(id = "com.mcc.prothomalo:id/fragment_login_tet_password")
    WebElement loginPasswordInp;

    @FindBy(id = "com.mcc.prothomalo:id/fragment_registration_btn_continue")
    WebElement loginContinueBtn;

    @FindBy(id = "com.mcc.prothomalo:id/my_app_option_element_holder_tv_name")
    List<WebElement> settingsOption;

    @FindBy(css = ".android.widget.RadioButton")
    List<WebElement> textResizeOption;

    @FindBy(id = "com.mcc.prothomalo:id/resize_text_apply_button")
    WebElement textResizeApply;

    @FindBy(id = "com.mcc.prothomalo:id/action_login_signup")
    WebElement signupLink;

    @FindBy(id = "com.mcc.prothomalo:id/fragment_registration_tet_name")
    WebElement signupNameInp;

    @FindBy(id = "com.mcc.prothomalo:id/fragment_registration_tet_email")
    WebElement signupEmailInp;

    @FindBy(id = "com.mcc.prothomalo:id/fragment_registration_tet_password")
    WebElement signupPasswordInp;

    @FindBy(id = "com.mcc.prothomalo:id/fragment_registration_btn_continue")
    WebElement signupContinueBtn;

    public WebElement myApp() {
        return myApp;
    }

    public List<WebElement> myAppMenuOption() {
        return myAppMenuOption;
    }

    public WebElement loginBtn() {
        return loginBtn;
    }

    public WebElement googleContainer() {
        return googleContainer;
    }

    public void setLoginEmail(String email) {
        loginEmailInp.sendKeys(email);
    }

    public void setLoginPassword(String password) {
        loginPasswordInp.sendKeys(password);
    }

    public WebElement loginContinueBtn() {
        return loginContinueBtn;
    }

    public List<WebElement> settingsOption() {
        return settingsOption;
    }

    public List<WebElement> textResizeOption() {
        return textResizeOption;
    }

    public WebElement textResizeApply() {
        return textResizeApply;
    }

    public WebElement signupLink() {
        return signupLink;
    }

    public void setSignupName(String name) {
        signupNameInp.sendKeys(name);
    }

    public void setSignupEmail(String email) {
        signupEmailInp.sendKeys(email);
    }

    public void setSignupPassword(String password) {
        signupPasswordInp.sendKeys(password);
    }

    public WebElement signupContinueBtn() {
        return signupContinueBtn;
    }

}
