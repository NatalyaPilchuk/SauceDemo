package factorypages;

import constants.Urls;
import org.openqa.selenium.By;
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

    public void openSwagLabsPage() {
        driver.get(Urls.REGISTER_FORM_URL);
    }

    public void inputUserName(String name) {
        userName.sendKeys(name);
    }

    public void inputPassword(String passw) {
        password.sendKeys(passw);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void addBagToTheCart() {
        addToCart.click();
    }

}
