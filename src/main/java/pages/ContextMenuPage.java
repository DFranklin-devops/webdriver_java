package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickContext() {
        Actions chain = new Actions(driver);
        chain.contextClick(driver.findElement(hotSpot));
        chain.perform();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }
}
