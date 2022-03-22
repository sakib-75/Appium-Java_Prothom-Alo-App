package section;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.Section_POM;

public class PoliticsNews extends Home {
    @Test(priority = 2)
    public void politicsNews() {

        Section_POM pom = new Section_POM(driver);
        pom.section().click();
        pom.menuList().get(4).click();
        // Open 2nd news
        pom.menuNewsList().get(1).click();

    }

}
