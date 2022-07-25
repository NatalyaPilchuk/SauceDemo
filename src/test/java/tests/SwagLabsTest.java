package tests;

import constants.Const;
import factorypages.NamePriceOfBagPage;
import factorypages.SwagLabsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends BaseTest {
    @Test
    public void toBuyTheBag() {
        SwagLabsPage swagLabsPage = new SwagLabsPage(driver);
        swagLabsPage.openSwagLabsPage();
        swagLabsPage.inputUserName(Const.USERNAME);
        swagLabsPage.inputPassword(Const.PASSWORD);
        swagLabsPage.clickLoginButton();
        swagLabsPage.addBagToTheCart();
        NamePriceOfBagPage namePriceOfBagPage = new NamePriceOfBagPage(driver);
        Assert.assertEquals("Sauce Labs Backpack", namePriceOfBagPage.getBagName(), "there isn't such item");
        Assert.assertEquals("$29.99", namePriceOfBagPage.getBagPrice(), "there isn't such price");


    }
}
