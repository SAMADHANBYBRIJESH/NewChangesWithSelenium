package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUptoAnSpecificElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/documentation/webdriver/");
        driver.manage().window().maximize();
        WebElement bottom = driver.findElement(By.xpath("//h2[@class='card-title']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",bottom);
        System.out.println(bottom.getText());
        Thread.sleep(3000);
        driver.close();
    }
}
