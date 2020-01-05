package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private By mceBody = By.id("tinymce");
    private String editorIframe = "mce_0_ifr";
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editorIframe);
    }
    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void clearEditArea() {
        switchToEditArea();
        driver.findElement(mceBody).clear();
        switchToMainArea();
    }

    public void setEditArea(String text) {
        switchToEditArea();
        driver.findElement(mceBody).sendKeys(text);
        switchToMainArea();
    }

    public void clickIndentButton() {
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String results = driver.findElement(mceBody).getText();
        switchToMainArea();
        return results;
    }
}
