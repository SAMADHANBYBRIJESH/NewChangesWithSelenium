package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class RightClickHomeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
 WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions a = new Actions(driver);
        a.contextClick(element).pause(3000).perform();
        Thread.sleep(3000);
        driver.close();

    }
}
