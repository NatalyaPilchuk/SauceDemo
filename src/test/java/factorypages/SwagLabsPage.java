package factorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsPage extends BasePage {

    @FindBy(name = "user-name")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "login-button")
    private WebElement loginButton;

    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart;

    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingCartButton;

    public SwagLabsPage(WebDriver driver) {

        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return loginButton.isDisplayed();
    }

    public SwagLabsPage openSwagLabsPage() {
        driver.get(Urls.REGISTER_FORM_URL);
        return this;
    }

    public SwagLabsPage inputUserName(String name) {
        userName.sendKeys(name);
        return this;
    }

    public SwagLabsPage inputPassword(String passw) {
        password.sendKeys(passw);
        return this;
    }

    public MenuSignPage clickLoginButton() {
        loginButton.click();
        return new MenuSignPage(driver);
    }

    public SwagLabsPage addBagToTheCart() {
        addToCart.click();
        return this;
    }

    public SwagLabsPage clickCartButton() {
        shoppingCartButton.click();
        return this;
    }


}
