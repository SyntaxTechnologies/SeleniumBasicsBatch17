package Review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
//        maximize the window
        driver.manage().window().maximize();

        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
         alert2.click();

//         accept the alert
//        driver.switchTo().alert().accept();
//        or
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }
}
