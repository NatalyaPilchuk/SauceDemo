package factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NamePriceOfBagPage extends BasePage {
    @FindBy(css = ".inventory_item_name")
    private WebElement bagName;

    @FindBy(css = ".inventory_item_price")
    private WebElement bagPrice;

    public NamePriceOfBagPage(WebDriver driver) {
        super(driver);
    }

    public String getBagName() {
        return bagName.getText();
    }
    public String getBagPrice() {
        return bagPrice.getText();
    }
}
