package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class RateTheApp extends Home {
    @Test(priority = 2)
    public void rateTheApp(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.myAppMenuOption().get(1).click();
        pom.settingsOption().get(1).click();

    }

}
