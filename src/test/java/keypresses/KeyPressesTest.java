package keypresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class KeyPressesTest extends BaseTests {
    @Test
    public void testBackspace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("ABC" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE!");
        char bs = 0x08;
        keyPage.enterText("A" + bs);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE!");
    }
}
