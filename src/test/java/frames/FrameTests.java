package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FrameTests extends BaseTests {
    @Test
    void testWysiwyg() {
        var editorPage = homePage.clickWysiwygPage();
        editorPage.clearEditArea();
        String text1 = "hello ";
        String text2 = "world";

        editorPage.setEditArea(text1);
        editorPage.clickIndentButton();
        editorPage.setEditArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text does not match");
    }

    @Test
    void testNestedFrames() {
        var nestedFramesPage = homePage.clickFramesPage().clickNestedFramesPage();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "frame text is wrong");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "frame text is wrong");
    }
}
