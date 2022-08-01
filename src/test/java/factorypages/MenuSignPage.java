package factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuSignPage extends BasePage {

    @FindBy(css = "[class='bm-burger-button']")
    private WebElement menuSign;
    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart;
    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingCartButton;


    public MenuSignPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {

        return shoppingCartButton.isDisplayed();
    }

    public void addBagToTheCart() {
        addToCart.click();
    }

    public NamePriceOfBagPage clickCartButton() {
        shoppingCartButton.click();
        return new NamePriceOfBagPage(driver);
    }

    public boolean isMenuSignDisplayed() {

        return menuSign.isDisplayed();
    }
}
