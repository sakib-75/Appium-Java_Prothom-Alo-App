package section_bangladesh;

import org.testng.annotations.Test;
import section.SubMenuNews_Base;

public class DistrictNews extends SubMenuNews_Base {

    @Test(priority = 2)
    public void districtNews(){

        // Menu Expand Button Index
        int mebIndex = 0;
        // Sub Menu List Index
        int smlIndex = 2;
        // Menu News List Index
        int mnlIndex = 0;

        subMenuNews_Base(mebIndex, smlIndex, mnlIndex);

    }

}
