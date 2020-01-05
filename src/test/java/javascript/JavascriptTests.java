package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptTests extends BaseTests {
    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToParagraph() {
        int targetParagraph = 5;
        homePage.clickInfiniteScroll().scrollToParagraph(targetParagraph);
    }

    @Test
    public void testDropdownOptions() {
        homePage.clickDropdown();
    }
}
