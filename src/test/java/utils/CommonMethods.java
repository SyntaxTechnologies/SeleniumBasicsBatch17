package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {
  public static  WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){
        //instance

         switch (browser){
             case "chrome":
                 driver=new ChromeDriver();
                 break;
             case "firefox":
                 driver=new FirefoxDriver();
                 break;
         }


        // goto facebook.com
        driver.get(url);
        //        maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser(){
        if(driver!=null) {
            driver.quit();
        }
    }
    public  static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public static WebDriverWait getWait(){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        return wait;
    }

    public  static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }


    public void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    public static void jsClick(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }

  public  static void takeScreenshot(String filename) throws IOException {

      //        declare the isntance
      TakesScreenshot ts=(TakesScreenshot) driver;

//        take screen shot
      File ss = ts.getScreenshotAs(OutputType.FILE);

//        then save on computer
      FileUtils.copyFile(ss,new File(System.getProperty("user.dir")+"\\screenshot\\"+filename+".png"));

  }
}
