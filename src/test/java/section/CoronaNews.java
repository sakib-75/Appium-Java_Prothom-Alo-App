package section;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.Section_POM;

public class CoronaNews extends Home {
    @Test(priority = 2)
    public void coronaNews(){

        Section_POM pom = new Section_POM(driver);
        pom.section().click();
        pom.menuList().get(2).click();
        // Open 1st news
        pom.menuNewsList().get(0).click();

    }

}
