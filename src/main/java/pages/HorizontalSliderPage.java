package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By sliderContainer = By.cssSelector(".sliderContainer input");
    private By rangeValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider(int numberMoves) {
        System.out.println("Started test, val = " + driver.findElement(rangeValue).getText());
        WebElement container = driver.findElement(sliderContainer);
        container.click();
        System.out.println("Started test, val = " + driver.findElement(rangeValue).getText());
        while (numberMoves-- > 0) {
            container.sendKeys(Keys.ARROW_RIGHT);
            System.out.println("Did " + numberMoves + " val=" + driver.findElement(rangeValue).getText());
        }
    }

    public float getSliderValue() {
        return Float.parseFloat(driver.findElement(rangeValue).getText());
    }
}
