package Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/*goto gmail.com
        click on help
        click on privacy
        click on terms
        switch the focus on terms page and get the title and print on screeen
        then switch the focus back to the gmail page
        and print the title of the main page on screen
        */
public class windowHandle {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AYZoVhcMD2D90uhEL25AWsZ9PYAylCBRFnP56Pa6XVhnky7_n60uc8ceMUQBZabfllStwc51azY5fg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-502300097%3A1696468088339723&theme=glif");
//        maximize the window
        driver.manage().window().maximize();

//        click on help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));

//        click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
//        click on the terms button
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));

        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();

//        get the main page handle
       String  mainPageHandle=driver.getWindowHandle();


//       get all handles
        Set<String> allHandles = driver.getWindowHandles();

   for(String handle:allHandles){
       driver.switchTo().window(handle);
       String title = driver.getTitle();
        if(title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")){
                   break;
        }

   }

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }
}
