package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("https://www.facebook.com/");
//        maximize the window
        driver.manage().window().maximize();

//        find the button create new account
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();
        Thread.sleep(1000);
//        fill in the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("moazzam");

        System.out.println( driver.getTitle());
    }
}
