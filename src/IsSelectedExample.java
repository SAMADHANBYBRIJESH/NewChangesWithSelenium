import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement radioButton = driver.findElement(By.id("bmwradio"));
        System.out.println(radioButton.isSelected());
        radioButton.click();
        System.out.println(radioButton.isSelected());
        Thread.sleep(3000);
        driver.close();

    }
}
