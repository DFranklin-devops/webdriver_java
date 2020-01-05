package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class RenderAfterFactPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadedText = By.id("finish");

    public RenderAfterFactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }
}
