package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;

public class MouseHoverExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions a = new Actions(driver);
        a.moveToElement(element).pause(3000).perform();
        Thread.sleep(3000);
        driver.close();
    }
}
