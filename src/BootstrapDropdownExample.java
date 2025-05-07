import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropdownExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='menu1']")).click();
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements
                (By.xpath("//ul[@class='dropdown-menu']//child::li/a"));
        for (WebElement e : elements){
            if(e.getText().trim().equalsIgnoreCase("JavaScript")){
                e.click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.close();

    }
}
