package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class Version extends Home {
    @Test(priority = 2)
    public void versionPage(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.myAppMenuOption().get(1).click();
        System.out.println("Version page opened");

    }

}
