package section_bangladesh;

import org.testng.annotations.Test;
import section.SubMenuNews_Base;

public class EnvironmentNews extends SubMenuNews_Base {
    @Test(priority = 2)
    public void environmentNews(){

        // Menu Expand Button Index
        int mebIndex = 0;
        // Sub Menu List Index
        int smlIndex = 3;
        // Menu News List Index
        int mnlIndex = 1;

        subMenuNews_Base(mebIndex, smlIndex, mnlIndex);

    }

}
