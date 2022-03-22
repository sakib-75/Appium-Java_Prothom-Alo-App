package section_bangladesh;

import org.testng.annotations.Test;
import section.SubMenuNews_Base;

public class CapitalNews extends SubMenuNews_Base {
    @Test(priority = 2)
    public void capitalNews(){

        // Menu Expand Button Index
        int mebIndex = 0;
        // Sub Menu List Index
        int smlIndex = 1;
        // Menu News List Index
        int mnlIndex = 2;

        subMenuNews_Base(mebIndex, smlIndex, mnlIndex);

    }

}
