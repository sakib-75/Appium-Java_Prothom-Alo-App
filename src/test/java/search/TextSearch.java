package search;

import home.Home;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page_object_model.Search_POM;

public class TextSearch extends Home {
    @Test(priority = 2)
    public void textSearch(){

        Search_POM pom = new Search_POM(driver);
        pom.search().click();
        Actions action = new Actions(driver);
        Actions searchText = action.moveToElement(pom.searchInput()).sendKeys("cricket").sendKeys(Keys.ENTER);
        searchText.build().perform();

    }
    
}
