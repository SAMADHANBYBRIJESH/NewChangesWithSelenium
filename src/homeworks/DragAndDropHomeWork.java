package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHomeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        //Switching driver to-iframe
        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement drop = driver.findElement((By.xpath("//p[text()='Drop here']")));
         Actions a = new Actions(driver);
         a.dragAndDrop(drag, drop).pause(2000).perform();
         Thread.sleep(3000);
         driver.close();

    }
}
