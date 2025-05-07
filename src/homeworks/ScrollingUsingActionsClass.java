package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsingActionsClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/infinite_scroll");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        a.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        a.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        a.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        a.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        a.sendKeys(Keys.PAGE_UP).perform();
        driver.close();


    }
}
