package pages.actions;

import base.Base;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.PageLocators;

public class HealthAndBeautyPage extends Base {
    public PageLocators locat;

    public HealthAndBeautyPage () {
        this.locat = new PageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.locat);
    }

    public void selectAllElements() {
        for (int i = 0; i < locat.selectAllElements.size(); i++) {
            locat.selectAllElements.get(i).click();
        }
    }

}
