import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brijesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Brijesh\\Pictures\\Camera Roll"+timeStamp()+".png");
        FileHandler.copy(file,dest);
        Thread.sleep(3000);
        driver.close();
    }
    public static String timeStamp(){
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
    }
}
