package tests;

import constants.Const;
import factorypages.FindLinkPage;
import factorypages.OpenLinkedinPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedinTest extends BaseFactoryTest {
    @Test
    public void linkedinTest() {
        FindLinkPage findLinkPage = new FindLinkPage(driver);
        findLinkPage.openPage();
        findLinkPage.inputUserName(Const.USERNAME);
        findLinkPage.inputPassword(Const.PASSWORD);
        findLinkPage.clickLoginButton();
        removeImplicitlyWait();
        findLinkPage.clickLinkedinButton();
        setImplicitlyWait();
        findLinkPage.switchToTab();
        OpenLinkedinPage openLinkedinPage = new OpenLinkedinPage(driver);
        Assert.assertTrue(openLinkedinPage.loginLinkedin());
    }
}
