package section_bangladesh;

import org.testng.annotations.Test;
import section.SubMenuNews_Base;

public class CoronaNews extends SubMenuNews_Base {
    @Test(priority = 2)
    public void coronaNews(){

        // Menu Expand Button Index
        int mebIndex = 0;
        // Sub Menu List Index
        int smlIndex = 4;
        // Menu News List Index
        int mnlIndex = 3;

        subMenuNews_Base(mebIndex, smlIndex, mnlIndex);

    }

}
