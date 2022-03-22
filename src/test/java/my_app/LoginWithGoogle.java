package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class LoginWithGoogle extends Home {
    @Test(priority = 2)
    public void loginWithGoogle(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.loginBtn().click();
        pom.googleContainer().click();

    }

}
