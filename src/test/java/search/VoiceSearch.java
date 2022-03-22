package search;

import home.Home;
import org.testng.annotations.Test;
import page_object_model.Search_POM;

public class VoiceSearch extends Home {
    @Test(priority = 2)
    public void voiceSearch(){

        Search_POM pom = new Search_POM(driver);
        pom.search().click();
        pom.voiceSearch().click();

    }

}
