package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
/**
 * implicit wait application
 */
        driver.findElement(By.id("reveal")).click();
        driver.findElement(By.id("revealed")).sendKeys("jgsgh");
        Thread.sleep(3000);
        driver.close();
    }
}
