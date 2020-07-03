package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageLocators {
    @FindBy(xpath = "//div[@id='mainContent']//li/a[text()='Fashion']")
    public WebElement clickFashion;


    @FindBy(xpath = "//div[@id='mainContent']//div[text()='Jewelry']")
    public WebElement clickJewelry;

    @FindBy(xpath = "//section[@id='s0-29-13_2-0-1[0]-0-0']//a")
    public List<WebElement> quantityTab;

    @FindBy(xpath = "//div[@id='mainContent']//li/a[text()='Health & Beauty']")
    public WebElement clickHealth$Beauty;

    @FindBy(xpath = "//div[@id='mainContent']//div[text()='Fragrances']")
    public WebElement clickFragrances;

    @FindBy(xpath = "//li[@class=\"x-refine__main__list x-refine__main__list--aspect\"]/ul/li")
    public List<WebElement> selectAllElements;
}
