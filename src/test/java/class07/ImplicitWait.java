package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
         String url="http://35.175.58.98/synchronization-waits.php";
         String browser="chrome";
         openBrowserAndLaunchApplication(url,browser);

//         find the button and click on it
        WebElement button1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        button1.click();
//        get the text that appears

        WebElement text1 = driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        String text = text1.getText();
        System.out.println(text);

    }
}
