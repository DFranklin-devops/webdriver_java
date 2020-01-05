package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {
    @Test
    public void testContextClick() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickContext();
        assertEquals(contextMenuPage.alert_getText(), "You selected a context menu", "Alert Text not quite right");
        contextMenuPage.alert_clickToAccept();
    }
}
