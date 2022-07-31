package tests;

import factorypages.MenuSignPage;
import factorypages.SwagLabsPage;
import models.RegistrationModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import testdata.PrepareRegistrationData;

public class RegistrationToSwagLabs extends BaseFactoryTest {
    @Test
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

    @Test
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

    @Test
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

    @Test
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
