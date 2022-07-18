package tests;

import constants.Const;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends BaseTest {
    @Test
    public void toBuyTheBag ()  {
        //open Url of page
        driver.get(Urls.REGISTER_FORM_URL);
        //Input username
        driver.findElement(By.name("user-name")).sendKeys(Const.USERNAME);
        //Input password
        driver.findElement(By.name("password")).sendKeys(Const.PASSWORD);
        //Click button login
        driver.findElement(By.name("login-button")).click();
        // Choose the bag and add it to the cart
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        //Click the button "cart"
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        //Add check
        WebElement item = driver.findElement(By.cssSelector(".inventory_item_name"));
        String itemOfBag = item.getText();
        Assert.assertEquals("Sauce Labs Backpack", itemOfBag, "there is no such item");
        WebElement price = driver.findElement(By.cssSelector(".inventory_item_price"));
        String priceOfBag = price.getText();
        driver.quit();
        Assert.assertEquals("$29.99", priceOfBag, "there is no such price");
    }
}
