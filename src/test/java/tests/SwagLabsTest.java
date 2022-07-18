package tests;

import constants.Const;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsTest extends BaseTest {
    @Test
    public void toBuyTheBag () throws InterruptedException {
        //open Url of page
        driver.get(Urls.REGISTER_FORM_URL);
        //Input username
        driver.findElement(By.name("user-name")).sendKeys(Const.USERNAME);
        //Input password
        driver.findElement(By.name("password")).sendKeys(Const.PASSWORD);
        //Click button login
        driver.findElement(By.name("login-button")).click();
        // Choose the bag and add it to the cart
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
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
