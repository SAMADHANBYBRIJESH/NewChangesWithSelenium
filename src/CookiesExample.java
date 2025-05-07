import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        Cookie ccc = new Cookie("Cmp","Bagan Masale");
        driver.manage().addCookie(ccc);
        System.out.println("Before deletion");
        Set<Cookie> elements = driver.manage().getCookies();
        for(Cookie c : elements){
            System.out.println(c);
        }
        System.out.println("--------"+driver.manage().getCookieNamed("Cmp"));
        System.out.println("After Deletion");
        driver.manage().deleteCookie(ccc);
        Set<Cookie> elementss = driver.manage().getCookies();
        for(Cookie c : elementss){
            System.out.println("@@"+c);
        }
        driver.manage().deleteAllCookies();
        Set<Cookie> element = driver.manage().getCookies();
        for(Cookie c : element){
            System.out.println(c);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
