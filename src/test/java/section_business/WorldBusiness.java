package section_business;

import org.testng.annotations.Test;
import section.SubMenuNews_Base;

public class WorldBusiness extends SubMenuNews_Base {
    @Test(priority = 2)
    public void worldBusinessNews(){

        // Menu Expand Button Index
        int mebIndex = 1;
        // Sub Menu List Index
        int smlIndex = 3;
        // Menu News List Index
        int mnlIndex = 2;

        subMenuNews_Base(mebIndex, smlIndex, mnlIndex);

    }

}
