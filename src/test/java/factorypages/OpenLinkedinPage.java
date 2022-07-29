package factorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenLinkedinPage extends BasePage {
    @FindBy(xpath = "//a[@href]//icon[1]")
    private WebElement logoLinkedin;

    public OpenLinkedinPage(WebDriver driver) {
        super(driver);
    }

    public boolean loginLinkedin() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOf(logoLinkedin));
        boolean text = logoLinkedin.isDisplayed();
        return text;
    }
}
