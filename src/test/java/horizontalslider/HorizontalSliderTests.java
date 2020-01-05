package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSliderMove() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSlider(8);
        assertEquals(horizontalSliderPage.getSliderValue(), 4.0, "Value does not match");
    }
}
