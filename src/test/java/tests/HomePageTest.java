package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void launchApplication() {

        HomePage homePage = new HomePage();
        homePage.closePopup();

        System.out.println("Application launched successfully");
    }
}