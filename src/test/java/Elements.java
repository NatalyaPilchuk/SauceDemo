import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    WebDriver driver;
    WebElement className = driver.findElement(By.className("login-logo"));
    WebElement tag = driver.findElement(By.tagName("link"));
    WebElement linkText = driver.findElement(By.linkText("Facebook"));
    WebElement partiallinkText = driver.findElement(By.partialLinkText("Twitter"));
    WebElement cssClass = driver.findElement(By.cssSelector(".footer"));
    WebElement cssId = driver.findElement(By.cssSelector("#page_wrapper"));
    WebElement cssTag = driver.findElement(By.cssSelector("div.login_wrapper"));
    WebElement cssAttribute1 = driver.findElement(By.cssSelector("[id^='login']"));
    WebElement cssAttribute2 = driver.findElement(By.cssSelector("input[value*='Login']"));
    WebElement cssAttribute3 = driver.findElement(By.cssSelector("[class$='column']"));
    WebElement cssFirstEl = driver.findElement(By.cssSelector("#page_wrapper>div:first-child"));
    WebElement cssLastEl = driver.findElement(By.cssSelector("#page_wrapper>div:nth-child(1)"));
    WebElement xPath1 = driver.findElement(By.xpath("//div[@id='header_container']"));
    WebElement xPath2 = driver.findElement(By.xpath("//a[text()='LinkedIn']"));
    WebElement xPath3 = driver.findElement(By.xpath("//a[contains(text(),'dIn')]"));
    WebElement xPath4 = driver.findElement(By.xpath("//a[contains(@class,'menu')]"));
    WebElement xPath5 = driver.findElement(By.xpath("//input[@id='login-button'and@value='Login']"));
    WebElement xPath6=driver.findElement(By.xpath("//input[@type='text']//parent::div"));
    WebElement xPath7=driver.findElement(By.xpath("//input[@type='password']//ancestor::div[@class='form_column']"));
}
