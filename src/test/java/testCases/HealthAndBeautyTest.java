package testCases;

import base.Base;
import org.testng.annotations.Test;
import pages.actions.HomePage;

public class HealthAndBeautyTest {

    @Test
    public void goToHealthAndBeautyPage() {
        Base.initConfiguration();
        HomePage home = new HomePage();
        home.goToHealthAndBeauty().selectAllElements();
        Base.quitBrowser();
    }
}
