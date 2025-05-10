import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
       driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);
        //Handling alrt by switchTo().alert() method
        // other wise it will give ungandledAlertExceptions
       Alert alert = driver.switchTo().alert();
       alert.accept();
System.out.println("New Line Added");
        driver.findElement(By.id("bmwcheck")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
