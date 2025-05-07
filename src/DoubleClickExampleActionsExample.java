import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExampleActionsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
        Actions a = new Actions(driver);
        a.doubleClick(element).pause(2000).perform();

        Thread.sleep(3000);
        driver.close();
    }
}
