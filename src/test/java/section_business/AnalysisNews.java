package section_business;

import org.testng.annotations.Test;
import section.SubMenuNews_Base;

public class AnalysisNews extends SubMenuNews_Base {
    @Test(priority = 2)
    public void analysisNews(){

        // Menu Expand Button Index
        int mebIndex = 1;
        // Sub Menu List Index
        int smlIndex = 4;
        // Menu News List Index
        int mnlIndex = 3;

        subMenuNews_Base(mebIndex, smlIndex, mnlIndex);

    }

}
