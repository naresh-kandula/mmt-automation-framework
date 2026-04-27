package pages;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class InventoryPage {

    WebDriver driver;

    public InventoryPage() {
        this.driver = DriverFactory.getDriver();
    }

    private By inventoryContainer = By.id("inventory_container");

    public boolean isInventoryPageLoaded() {
        try {
            WaitUtils.waitForClickable(inventoryContainer);
            return driver.findElement(inventoryContainer).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}