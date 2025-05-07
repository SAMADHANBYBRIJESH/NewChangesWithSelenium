import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement showButton = driver.findElement(By.id("show-textbox"));
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        WebElement displayedTextBox =  driver.findElement(By.id("displayed-text"));

        System.out.println(displayedTextBox.isDisplayed());
        hideButton.click();
        System.out.println(displayedTextBox.isDisplayed());
        showButton.click();
        System.out.println(displayedTextBox.isDisplayed());

        Thread.sleep(3000);
        driver.close();
    }
}
