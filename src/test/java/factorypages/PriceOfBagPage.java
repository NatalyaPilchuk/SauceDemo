package factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceOfBagPage extends BasePage {
    @FindBy(css = ".inventory_item_price")
    private WebElement bagPrice;

    public PriceOfBagPage(WebDriver driver) {
        super(driver);
    }

    public String getBagPrice() {
        return bagPrice.getText();
    }
}
