package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class PrivacyPolicy extends Home {
    @Test(priority = 2)
    public void privacyPolicy() {

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.myAppMenuOption().get(3).click();
        System.out.println("Privacy Policy page opened");

    }

}
