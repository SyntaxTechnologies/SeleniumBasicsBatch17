package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
HW1:
Navigate to http://35.175.58.98/basic-checkbox-demo.php.
Check the if Checkbox1 is enabled
If Checkbox1 is disabled:
Click on the "enable checkboxes" button.
Verify that Checkbox1 is now enabled.
Click on Checkbox1.
Confirm that Checkbox1 is selected.
 */
public class Hw3 {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get(" http://35.175.58.98/basic-checkbox-demo.php");
//        maximize the window
        driver.manage().window().maximize();
//        Check the if Checkbox1 is enabled
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for(WebElement checkBox:checkBoxes){
            String option = checkBox.getAttribute("value");
            if(option.equals("Checkbox-2")){
                boolean state = checkBox.isEnabled();
                System.out.println(state);
//                If Checkbox1 is disabled:
                if(!state){
                    //                Click on the "enable checkboxes" button.
                    WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                    enableBtn.click();
//                    Verify that Checkbox1 is now enabled.
                    boolean status2 = checkBox.isEnabled();
                    if(status2){
//                    Click on Checkbox1.
                        checkBox.click();
//                        Confirm that Checkbox1 is selected.
                        boolean isSelectedStatus = checkBox.isSelected();
                        System.out.println(isSelectedStatus);
                    }
                }
            }
        }
    }
}
