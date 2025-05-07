import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        WebElement element =  driver.findElement(By.id("login1"));
       /* element.sendKeys("randomtext");
        Thread.sleep(3000);
        element.clear();
        Thread.sleep(2000);
        System.out.println(element.getTagName());
        System.out.println(element.getDomAttribute("id"));*/
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.submit();
        Thread.sleep(1000);
        driver.close();
    }
}
