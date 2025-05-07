package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUpAndDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/");
        driver.manage().window().maximize();
        WebElement aboutSelenium = driver.findElement(By.xpath("//small[@class='text-white']"));
        WebElement topPosition = driver.findElement(By.xpath("//h4[@class='alert-heading text-center m-2']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("arguments[0].scrollIntoView();",aboutSelenium);
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-500)");
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView();",topPosition);
        Thread.sleep(3000);
        driver.close();
    }
}
