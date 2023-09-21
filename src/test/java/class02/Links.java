package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Links {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
//        get all the links and print them on the console.
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link:links){

            String nameOflink = link.getText();
            System.out.println(nameOflink);
            String linkVal = link.getAttribute("href");
            System.out.println(linkVal);
        }
    }
}
