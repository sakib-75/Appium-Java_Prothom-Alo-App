package section_business;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.Section_POM;

public class MarketNews extends Home {
    @Test(priority = 2)
    public void marketNews(){
        Section_POM pom = new Section_POM(driver);
        pom.section().click();

        pom.menuExpandBtn().get(1).click();
        pom.subMenuList().get(0).click();

    }

}
