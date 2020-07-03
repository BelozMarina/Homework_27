package pages.actions;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.PageLocators;

public class HomePage extends Base {

    public PageLocators home;

    public HomePage() {
        this.home = new PageLocators();

        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.home);
    }

    public void goToFashionPage() {
        home.clickFashion.click();
    }

    public JewelryPage goToJewelryPage() {
        home.clickJewelry.click();
        return new JewelryPage();
    }

    public HealthAndBeautyPage goToHealthAndBeauty () {
        home.clickHealth$Beauty.click();
        home.clickFragrances.click();
        return new HealthAndBeautyPage();
    }




}
