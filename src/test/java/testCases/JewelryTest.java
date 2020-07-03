package testCases;

import base.Base;
import org.testng.annotations.Test;
import pages.actions.HomePage;

public class JewelryTest {
    @Test
    public void goToFashionTest() {
        Base.initConfiguration();
        HomePage home = new HomePage();
        home.goToFashionPage();
        home.goToJewelryPage().getQuantityTabs();
        Base.quitBrowser();
    }
}
