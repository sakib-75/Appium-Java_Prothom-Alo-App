package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class SignupWithGoogle extends Home {
    @Test(priority = 2)
    public void signupWithGoogle(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.loginBtn().click();
        pom.signupLink().click();
        pom.googleContainer().click();

    }

}
