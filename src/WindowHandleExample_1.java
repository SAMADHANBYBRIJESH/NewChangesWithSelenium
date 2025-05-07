import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());//here parent page title will get
        //driver.close();
        driver.quit();
    }
}
