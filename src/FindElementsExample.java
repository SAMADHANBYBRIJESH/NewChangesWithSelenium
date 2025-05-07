import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        System.out.println(elements.size());
        for(WebElement e : elements){
            System.out.println(e);
        }
        Thread.sleep(30000);
        driver.close();
    }
}
