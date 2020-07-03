package pages.actions;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.PageLocators;

public class JewelryPage extends Base {
    public PageLocators home;

    public JewelryPage() {
        this.home = new PageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.home);
    }

    public void getQuantityTabs() {
        System.out.println(home.quantityTab.size());
        // name of tab
        for (WebElement test : home.quantityTab) {
            System.out.println("Name tabs: " + test.getText());
        }
        home.quantityTab.get(12).click();
    }


}
