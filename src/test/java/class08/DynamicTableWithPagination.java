package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class DynamicTableWithPagination extends CommonMethods {
    public static void main(String[] args) {

        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//        find the username
        WebElement usrName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usrName.sendKeys("Admin");
//        find the password
        WebElement paswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        paswrd.sendKeys("Hum@nhrm123");

//        find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
//        click on PIM
        WebElement PIM = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIM.click();

//       ------------ tables    task---------------------
//select the check box for
// the employee that has an id of  357842



        boolean notfound=true;
//        continue to excute the while loop until not found is set to false
        while(notfound){
            //        get the column id in the list
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

//        iterate
            for (int i = 0; i < idColumn.size(); i++) {

                String id = idColumn.get(i).getText();
//            compare if that is my desired id
                if (id.equals("61061921")) {
//                click on the checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    notfound=false;
                    break;
                }
            }
         if(notfound) {
             WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
             nextBtn.click();
         }
        }



    }

}
