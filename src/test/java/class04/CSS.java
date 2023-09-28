package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/cssSelector.php");
//        maximize the window
        driver.manage().window().maximize();

//        fill in the profile id
        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("moazzamSadiq");

//        fill in the profile name
        WebElement profileName = driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("hello");

//  feedback from jenny
        WebElement feedbackJenny = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedbackJenny.sendKeys("website isnt working");

//        feed back from raj
        WebElement feedbackRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("website is working");

//        contains method to fill course topic
        WebElement courseTopics = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("selenium");

//        using starts with
        WebElement introtoAdv = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introtoAdv.sendKeys("welcome");

//        ends with
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");
    }
}
