import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement fileElement = driver.findElement(By.id("file-upload"));
       // fileElement.sendKeys("C:\\Users\\Brijesh\\Desktop\\biogas.png");
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);
        //WebElement displayMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        try{
            if(driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed()){
                System.out.println("Yes! file uploaded successfully");
            }
        } catch (NoSuchElementException e){
                System.out.println("No! file is not uploaded");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
