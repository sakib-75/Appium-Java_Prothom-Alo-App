package my_app;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.MyApp_POM;

public class Bookmarks extends Home {
    @Test(priority = 2)
    public void bookmarks(){

        MyApp_POM pom = new MyApp_POM(driver);
        pom.myApp().click();
        pom.myAppMenuOption().get(0).click();
        System.out.println("Bookmark page opened");

    }

}
