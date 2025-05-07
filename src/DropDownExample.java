import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);

        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByValue("benz");
        Thread.sleep(2000);
        sel.selectByVisibleText("BMW");
       /* List<WebElement> allOptions = sel.getOptions();
        for(WebElement e : allOptions){
            System.out.println(e.getText());
        }*/
        Thread.sleep(3000);
        driver.close();
    }
}
