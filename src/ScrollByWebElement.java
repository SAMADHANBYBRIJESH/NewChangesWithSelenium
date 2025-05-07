import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
        WebElement sign = driver.findElement(By.xpath("//h2[text()='Sign in']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",privacy);
        Thread.sleep(3000);

        js.executeScript("arguments[0].scrollIntoView();",sign);
        Thread.sleep(3000);
        driver.close();
    }
}
