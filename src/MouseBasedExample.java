import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseBasedExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();

        WebElement elementB = driver.findElement(By.xpath("//li[text()='B']"));
        Actions a = new Actions(driver);
        a.clickAndHold(elementB).pause(2000).release(elementB).build().perform();
        Thread.sleep(2000);
        driver.close();
    }
}
