package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class actionClass2 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://demo.guru99.com/test/simple_context_menu.html";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action= new Actions(driver);
        action.contextClick(rightClick).perform();

    }
}
