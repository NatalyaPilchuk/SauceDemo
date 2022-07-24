package tests;

import constants.Const;
import constants.Urls;
import factorypages.NameOfBagPage;
import factorypages.PriceOfBagPage;
import factorypages.SwagLabsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        NameOfBagPage nameOfBagPage = new NameOfBagPage(driver);
        PriceOfBagPage priceOfBagPage = new PriceOfBagPage(driver);
        Assert.assertEquals("Sauce Labs Backpack", nameOfBagPage.getBagName(), "there isn't such item");
        Assert.assertEquals("$29.99", priceOfBagPage.getBagPrice(), "there isn't such price");


    }
}
