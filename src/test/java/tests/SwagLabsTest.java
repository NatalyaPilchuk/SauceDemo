package tests;

import constants.Const;
import factorypages.MenuSignPage;
import factorypages.NamePriceOfBagPage;
import factorypages.SwagLabsPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RetryAnalyser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SwagLabsTest extends BaseFactoryTest {
    @Test(retryAnalyzer = RetryAnalyser.class)
    public void registrationSwagLabsTest() {
        SwagLabsPage swagLabsPage = new SwagLabsPage(driver);
        swagLabsPage.openSwagLabsPage();
        swagLabsPage.inputUserName(Const.USERNAME);
        swagLabsPage.inputPassword(Const.PASSWORD);
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        byte[]sourceFile=takesScreenshot.getScreenshotAs(OutputType.BYTES);
        try {
            Files.write(Paths.get(String.format("src/test/resources/screenshot.png")), sourceFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        swagLabsPage.clickLoginButton();
        MenuSignPage menuSignPage = new MenuSignPage(driver);
        Assert.assertTrue(menuSignPage.isMenuSignDisplayed(), "there isn't menu sign");
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
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
