package DynamicLoading;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {
    @Test
    public void testDynamicHiddenElement() {
        var dynamicHiddenElementPage = homePage.clickDynamicLoadingPage().clickDynamicHiddenElementPage();
        dynamicHiddenElementPage.clickStartButton();
        assertEquals(dynamicHiddenElementPage.getLoadedText(), "Hello World!", "Hidden Element Text not matching");
    }

    @Test
    public void testRenderAfterFact() {
        var renderAfterFactPage = homePage.clickDynamicLoadingPage().clickRenderAfterFactPage();
        renderAfterFactPage.clickStartButton();
        assertEquals(renderAfterFactPage.getLoadedText(), "Hello World!", "Post render text not matching");
    }
}
