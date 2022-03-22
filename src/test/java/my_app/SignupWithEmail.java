package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class SignupWithEmail extends Home {
    @Test(priority = 2)
    public void signupWithEmail(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.loginBtn().click();
        pom.signupLink().click();

        pom.setSignupName("Sakibul Islam");
        pom.setSignupEmail("Sakibulislam285@gmail.com");
        pom.setSignupPassword("Sakib48569380");
        pom.signupContinueBtn().click();

    }

}
