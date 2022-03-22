package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class TermsOfUse extends Home {
    @Test(priority = 2)
    public void termsOfUse(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.myAppMenuOption().get(2).click();
        System.out.println("Terms of use page opened");

    }

}
