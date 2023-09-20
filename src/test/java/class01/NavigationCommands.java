package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//        go to google.com
        driver.get("https://www.google.com");
//        max the window
        driver.manage().window().maximize();
//        slow down to observe the process
        Thread.sleep(2000);
//        goto facebook.com
        driver.navigate().to("https://www.facebook.com");
//        slow down to observe
        Thread.sleep(2000);
//        go back
        driver.navigate().back();
//        slow down to observe
        Thread.sleep(2000);
//        go forward
        driver.navigate().forward();
//           slow down to observe
        Thread.sleep(2000);
        driver.navigate().refresh();

//        close
        driver.close();
//        also we can use
//        driver.quit();
    }
}
// 8:45