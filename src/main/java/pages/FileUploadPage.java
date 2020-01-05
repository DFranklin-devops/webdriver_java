package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadResult = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absolutePathToFile) {
        driver.findElement(inputField).sendKeys(absolutePathToFile);
        clickUploadButton();
    }

    public String getUploadedFilename() {
        return driver.findElement(uploadResult).getText();
    }
}
