import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
        Actions a = new Actions(driver);
        a.moveToElement(login).pause(2000).perform();
        Thread.sleep(2000);
        driver.close();
    }
}
