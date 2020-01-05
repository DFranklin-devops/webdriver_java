package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager  {

    private WebDriver driver;
    private WebDriver.Navigation navigator;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigator = driver.navigate();
    }

    public void goBack() {
        navigator.back();
    }

    public void goForward() {
        navigator.forward();
    }

    public void refresh() {
        navigator.refresh();
    }

    public void goTo(String url) {
        navigator.to(url);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();

//         System.out.println("Number of tabs " + windows.size());
//         System.out.println("Window Handles: ");
         windows.forEach(System.out::println);

         for (String window : windows) {
//             System.out.println("Switching to window " + window);
             driver.switchTo().window(window);

//             System.out.println("We are on title " + driver.getTitle());

             if (tabTitle.equals(driver.getTitle())) {
                 break;
             }
         }
    }

}
