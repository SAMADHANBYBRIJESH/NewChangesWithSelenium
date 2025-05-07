import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions a = new Actions(driver);
        a.contextClick(element).pause(2000).perform();
        WebElement elementNeedToSelect = driver.findElement(By.xpath("//span[text()='Copy']"));
        a.moveToElement(elementNeedToSelect).pause(2000).click().build().perform();
        Thread.sleep(3000);
        driver.close();
    }
}
