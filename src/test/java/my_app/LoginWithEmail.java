package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class LoginWithEmail extends Home {
    @Test(priority = 2)
    public void loginWithEmail(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.loginBtn().click();

        pom.setLoginEmail("sakibulislam285@gmail.com");
        pom.setLoginPassword("Sakib985064");
        pom.loginContinueBtn().click();

    }

}
