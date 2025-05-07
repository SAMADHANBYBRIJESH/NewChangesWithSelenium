import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiDropDownExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(element);
        sel.selectByValue("peach");
        sel.selectByIndex(1);
        sel.selectByVisibleText("Apple");
        Thread.sleep(3000);

       List<WebElement> list = sel.getAllSelectedOptions();
       for(WebElement e : list){
           System.out.println(e.getText());
       }

       // sel.deselectAll();
        //deselect all options one by one
       /* sel.deselectByVisibleText("Peach");
        Thread.sleep(2000);
        sel.deselectByIndex(0);
        Thread.sleep(2000);
        sel.deselectByVisibleText("Orange");*/
        Thread.sleep(2000);
        driver.close();


    }
}
