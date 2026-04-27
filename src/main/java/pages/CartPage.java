package pages;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class CartPage {

    WebDriver driver;

    public CartPage() {
        this.driver = DriverFactory.getDriver();
    }

    // Locator
    private By cartItem = By.className("inventory_item_name");

    public boolean isItemDisplayed(String expectedItem) {
        try {
            WaitUtils.waitForClickable(cartItem);
            String itemName = driver.findElement(cartItem).getText();
            return itemName.equalsIgnoreCase(expectedItem);
        } catch (Exception e) {
            return false;
        }
    }
}