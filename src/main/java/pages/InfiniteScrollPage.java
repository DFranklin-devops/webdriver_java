package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
//    private By fifthParagraph = By.
    private By textBlocks = By.id("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param index is 1-based
     */
    public void scrollToParagraph(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExec = (JavascriptExecutor)driver;
        while (getCountOfParagraphs() < index) {
            jsExec.executeScript(script);
        }
    }

    private int getCountOfParagraphs() {
        return driver.findElements(textBlocks).size();
    }
}
