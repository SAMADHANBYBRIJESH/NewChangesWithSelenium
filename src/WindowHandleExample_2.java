import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        String windowID = driver.getWindowHandle();
        //it will give you parent windos address
        System.out.println(windowID);
        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);
        Set<String> windowsID = driver.getWindowHandles();
        for (String str : windowsID){
            if(!str.equals(windowID)){
                driver.switchTo().window(str);
                Thread.sleep(3000);
                driver.findElement(By.linkText("INTERVIEW")).click();
                System.out.println(driver.getTitle());
                driver.close();
            }
        }

        driver.switchTo().window(windowID);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();
    }
}
