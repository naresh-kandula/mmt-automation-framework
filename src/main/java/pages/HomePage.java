package pages;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WaitUtils.waitForClickable;

public class HomePage {

    WebDriver driver;

    public HomePage() {
        this.driver = DriverFactory.getDriver();
    }

    // locator
    private By body = By.xpath("//body");
    private By close_signUp_dialog = By.xpath("//*[@class='commonModal__close']");

    public void closePopup() {
        try {
            Thread.sleep(3000);
            driver.findElement(body).click();
            waitForClickable(close_signUp_dialog);
            driver.findElement(close_signUp_dialog).click();
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }
    }
}