package section_bangladesh;

import org.testng.annotations.Test;
import section.SubMenuNews_Base;

public class CrimeNews extends SubMenuNews_Base {
    @Test(priority = 2)
    public void crimeNews(){

        // Menu Expand Button Index
        int mebIndex = 0;
        // Sub Menu List Index
        int smlIndex = 0;
        // Menu News List Index
        int mnlIndex = 1;

        subMenuNews_Base(mebIndex, smlIndex, mnlIndex);

    }

}
