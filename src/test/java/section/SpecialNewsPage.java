package section;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.Section_POM;

public class SpecialNewsPage extends Home {
    @Test(priority = 2)
    public void specialNewsPage(){

        Section_POM pom = new Section_POM(driver);
        pom.section().click();
        pom.menuList().get(1).click();
        // Open 4th news
        pom.menuNewsList().get(3).click();

    }

}
