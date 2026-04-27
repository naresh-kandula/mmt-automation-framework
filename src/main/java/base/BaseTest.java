package base;

import drivers.DriverFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverFactory.initDriver();
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}