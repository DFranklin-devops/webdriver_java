package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getAlertResponse(), "You successfuly clicked an alert", "Response string incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert cancel text incorrect");
    }

    @Test
    public void testSetTextInAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "Dave is awesome";
        alertPage.alert_setInputPrompt(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getAlertResponse(), "You entered: " + text, "Alert prompt text incorrect");
    }

}
