package tests;

import factorypages.MenuSignPage;
import factorypages.SwagLabsPage;
import models.RegistrationModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import testdata.PrepareRegistrationData;
import utils.RetryAnalyser;

public class RegistrationToSwagLabs extends BaseFactoryTest {
    @Test(priority = 1,retryAnalyzer = RetryAnalyser.class)
    public void validRegistrationTest() {
        SwagLabsPage swagLabsPage = new SwagLabsPage(driver);
        swagLabsPage.openSwagLabsPage();
        RegistrationModel registrationModel = PrepareRegistrationData.getValidRegistration1();
        swagLabsPage.inputUserName(registrationModel.getUserName());
        swagLabsPage.inputPassword(registrationModel.getPassword());
        swagLabsPage.clickLoginButton();
        MenuSignPage menuSignPage = new MenuSignPage(driver);
        Assert.assertTrue(menuSignPage.isMenuSignDisplayed(), "there isn't menu sign");
    }

    @Test(priority = 4,retryAnalyzer = RetryAnalyser.class)
    public void registration2Test() {
        SwagLabsPage swagLabsPage = new SwagLabsPage(driver);
        swagLabsPage.openSwagLabsPage();
        RegistrationModel registrationModel = PrepareRegistrationData.getInvalidRegistration2();
        swagLabsPage.inputUserName(registrationModel.getUserName());
        swagLabsPage.inputPassword(registrationModel.getPassword());
        swagLabsPage.clickLoginButton();
        MenuSignPage menuSignPage = new MenuSignPage(driver);
        Assert.assertTrue(menuSignPage.isMenuSignDisplayed(), "there isn't menu sign");
    }

    @Test(priority = 2, retryAnalyzer = RetryAnalyser.class)
    public void registration3Test() {
        SwagLabsPage swagLabsPage = new SwagLabsPage(driver);
        swagLabsPage.openSwagLabsPage();
        RegistrationModel registrationModel = PrepareRegistrationData.getRegistration3();
        swagLabsPage.inputUserName(registrationModel.getUserName());
        swagLabsPage.inputPassword(registrationModel.getPassword());
        swagLabsPage.clickLoginButton();
        MenuSignPage menuSignPage = new MenuSignPage(driver);
        Assert.assertTrue(menuSignPage.isMenuSignDisplayed(), "there isn't menu sign");
    }

    @Test(priority = 3,retryAnalyzer = RetryAnalyser.class)
    public void registration4Test() {
        SwagLabsPage swagLabsPage = new SwagLabsPage(driver);
        swagLabsPage.openSwagLabsPage();
        RegistrationModel registrationModel = PrepareRegistrationData.getRegistration4();
        swagLabsPage.inputUserName(registrationModel.getUserName());
        swagLabsPage.inputPassword(registrationModel.getPassword());
        swagLabsPage.clickLoginButton();
        MenuSignPage menuSignPage = new MenuSignPage(driver);
        Assert.assertTrue(menuSignPage.isMenuSignDisplayed(), "there isn't menu sign");
    }
}
