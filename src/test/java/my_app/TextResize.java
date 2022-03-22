package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class TextResize extends Home {
    @Test(priority = 2)
    public void textResize(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.myAppMenuOption().get(1).click();
        pom.settingsOption().get(0).click();
        pom.textResizeOption().get(2).click();
        pom.textResizeApply().click();

    }

}
