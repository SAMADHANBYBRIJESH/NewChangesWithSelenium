package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHomework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.id("APjFqb"));
        Actions a = new Actions(driver);
        a.moveToElement(searchTextBox).pause(2000).click(searchTextBox)
                .keyDown(Keys.SHIFT).pause(2000).sendKeys("air cooler")
                .keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(40000);
        driver.close();

    }
}
