package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private By body = By.tagName("body");
    private String bottomFrame = "frame-bottom";

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToParent() {
        driver.switchTo().parentFrame();
    }

    /*
    Note - left is a frame inside top frame
     */
    private void switchToLeft() {
        driver.switchTo().frame(leftFrame);
    }

    private void switchToTop() {
        driver.switchTo().frame(topFrame);
    }

    private void switchToBottom() {
        driver.switchTo().frame(bottomFrame);
    }
    public String getLeftFrameText() {
        switchToTop();
        switchToLeft();
        String res = driver.findElement(body).getText();
        switchToParent();
        switchToParent();
        return res;
    }

    public String getBottomFrameText() {
        switchToBottom();
        String res = driver.findElement(body).getText();
        switchToParent();
        return res;
    }
}
