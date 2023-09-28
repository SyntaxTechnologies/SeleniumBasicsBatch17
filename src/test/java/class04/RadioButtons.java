package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
//        maximize the window
        driver.manage().window().maximize();
//        task1
//        select the radio button male

//        find the element
        WebElement radioBtnMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radioBtnMale.click();
//        check if you were able to select the option or not
        boolean status = radioBtnMale.isSelected();
        if(status){
            System.out.println("the radio button male was selected");
        }
        else {
            System.out.println("the radio button male was not selected");
        }
//        check if the male radio button is enabled
        boolean btnEnableStatus = radioBtnMale.isEnabled();
        System.out.println("the male radio button is enabled " + btnEnableStatus);
//        check if the male radio button is displayed
        boolean btnisDisplayedStatus = radioBtnMale.isDisplayed();
        System.out.println("the male radio button is displayed " + btnisDisplayedStatus);

//from the age range select 5-15
//        find all the elements that have the age range
        List<WebElement> ageRanges = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for(WebElement ageRange:ageRanges){
//            get the value of the attribute "value"
            String option = ageRange.getAttribute("value");
            if(option.equalsIgnoreCase("15 - 50")){
                ageRange.click();
            }
        }

    }
}
