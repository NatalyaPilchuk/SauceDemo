package tests;

import constants.Const;
import factorypages.MenuSignPage;
import factorypages.NamePriceOfBagPage;
import factorypages.SwagLabsPage;
import models.RegistrationModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import testdata.PrepareRegistrationData;

public class SwagLabsTest extends BaseFactoryTest {
    @Test
    public void registrationSwagLabsTest() {
        SwagLabsPage swagLabsPage = new SwagLabsPage(driver);
        swagLabsPage.openSwagLabsPage();
        swagLabsPage.inputUserName(Const.USERNAME);
        swagLabsPage.inputPassword(Const.PASSWORD);
        swagLabsPage.clickLoginButton();
        MenuSignPage menuSignPage = new MenuSignPage(driver);
        Assert.assertTrue(menuSignPage.isMenuSignDisplayed(), "there isn't menu sign");
    }

    @Test
    public void toBuyTheBagTest() {
        SwagLabsPage swagLabsPage = new SwagLabsPage(driver);
        swagLabsPage.openSwagLabsPage();
        swagLabsPage.inputUserName(Const.USERNAME);
        swagLabsPage.inputPassword(Const.PASSWORD);
        swagLabsPage.clickLoginButton();
        MenuSignPage menuSignPage = new MenuSignPage(driver);
        menuSignPage.addBagToTheCart();
        menuSignPage.clickCartButton();
        NamePriceOfBagPage namePriceOfBagPage = new NamePriceOfBagPage(driver);
        Assert.assertEquals("Sauce Labs Backpack", namePriceOfBagPage.getBagName(), "there isn't such item");
        Assert.assertEquals("$29.99", namePriceOfBagPage.getBagPrice(), "there isn't such price");


    }
}
