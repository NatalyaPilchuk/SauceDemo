package factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NameOfBagPage extends BasePage {
    @FindBy(css = ".inventory_item_name")
    private WebElement bagName;

    public NameOfBagPage(WebDriver driver) {
        super(driver);
    }

    public String getBagName() {
        return bagName.getText();
    }
}
