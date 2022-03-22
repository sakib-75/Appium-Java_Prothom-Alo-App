package section;

import home.Home;
import page_object_model.Section_POM;

public class SubMenuNews_Base extends Home {

    public void subMenuNews_Base(int meb, int sml, int mnl){

        Section_POM pom = new Section_POM(driver);
        pom.section().click();

        pom.menuExpandBtn().get(meb).click();
        pom.subMenuList().get(sml).click();
        pom.menuNewsList().get(mnl).click();

    }

}
