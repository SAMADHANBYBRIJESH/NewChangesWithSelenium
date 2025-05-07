package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NeedOfIFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/frames");
        driver.manage().window().maximize();
        List<WebElement> allElements = driver.findElements(By.tagName("iframe"));
        System.out.println(allElements.size());

        //frame switching by using name pr ID
        //driver.switchTo().frame("frame1");
        //driver swithig by using web element
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        WebElement element = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(element.getText());

        //back to parent frame
        driver.switchTo().parentFrame();
        WebElement pElement = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(pElement.getText());

        driver.close();
    }
}
