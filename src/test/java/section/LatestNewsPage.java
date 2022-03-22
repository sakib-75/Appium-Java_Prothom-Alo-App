package section;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.Section_POM;

public class LatestNewsPage extends Home {
    @Test(priority = 2)
    public void latestNewsPage(){
        Section_POM pom = new Section_POM(driver);
        pom.section().click();
        pom.menuList().get(0).click();
        pom.menuNewsList().get(2).click();

    }

}
