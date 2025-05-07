import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(3000);
        String date = "29";
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td/a"));
        for(WebElement w : allDates){
            if(w.getText().equals(date)){
                w.click();
                System.out.println(w.getText());
            }
        }
        Thread.sleep(3000);
        driver.close();
    }
}
