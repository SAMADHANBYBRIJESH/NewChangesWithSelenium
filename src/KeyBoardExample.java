import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        Actions a = new Actions(driver);
        a.moveToElement(searchTextBox).click(searchTextBox).keyDown(Keys.SHIFT)
                .pause(2000).sendKeys("table tennis").keyUp(Keys.SHIFT)
                .pause(2000).sendKeys(Keys.ENTER).pause(3000).build().perform();
        Thread.sleep(2000);
        driver.close();
    }
}
