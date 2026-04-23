package pages;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage() {
        this.driver = DriverFactory.getDriver();
    }

    // locator
    private By body = By.xpath("//body");

    public void closePopup() {
        try {
            Thread.sleep(3000);
            driver.findElement(body).click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }
    }
}