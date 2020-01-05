package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicHiddenElementPage clickDynamicHiddenElementPage() {
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        return new DynamicHiddenElementPage(driver);
    }

    public RenderAfterFactPage clickRenderAfterFactPage() {
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        return new RenderAfterFactPage(driver);
    }
}
