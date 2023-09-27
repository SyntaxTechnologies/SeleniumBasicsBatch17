package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {

        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            WebElement userName= driver.findElement(By.name("username"));
            userName.sendKeys("abc");
            Thread.sleep(2000);
            userName.sendKeys(Keys.CONTROL + "a");
            userName.sendKeys(Keys.DELETE);

            Thread.sleep(2000);
            userName.sendKeys("Admin");
            Thread.sleep(2000);
            WebElement password= driver.findElement(By.name("password"));
            password.sendKeys("admin123");
            Thread.sleep(2000);
            WebElement loginBtn= driver.findElement(By.tagName("button"));
            loginBtn.click();
            driver.close();
        }



    }
