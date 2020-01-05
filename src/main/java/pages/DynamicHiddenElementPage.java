package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicHiddenElementPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingImage = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicHiddenElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingImage)));
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingImage)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }
}
