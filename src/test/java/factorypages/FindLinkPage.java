package factorypages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class FindLinkPage extends BasePage {
    @FindBy(name = "user-name")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//a[text()='LinkedIn']")
    private WebElement link;

    @FindBy(xpath = "//a[@href]//icon[1]")
    private WebElement logoLinkedin;


    public FindLinkPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Urls.REGISTER_FORM_URL);
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

    public void clickLinkedinButton() {
        link.click();
    }

    public void switchToTab() {
        Set<String> tabs = driver.getWindowHandles();
        for (String linkendin : tabs) {
            driver.switchTo().window(linkendin);
        }
    }


}
