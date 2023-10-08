package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class tableSimple extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/table-data-download-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//        get the whole table
//        ******************table level access*****************
        WebElement allTable = driver.findElement(By.xpath("//table[@id='example']"));
        String tableContent = allTable.getText();
//        System.out.println(tableContent);

//        **********row level access**********************
//only print rows with software engineer in them as positon
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for(WebElement row:rows){
            String text = row.getText();
            if(text.contains("Software Engineer")) {
//                System.out.println(text);
            }
        }

//        **************column level access*****************

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        for(WebElement column :columns){
           String text = column.getText();
            System.out.println(text);
        }

//        ********************Task **********************************
//        ****************** print the row with position Software engineer without using contain method*******

//        locate hte column that contains postion
        List<WebElement> positions = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
         int i=0;
//        iterate
        for(WebElement position:positions){
            String text = position.getText();

            if(text.equals("Software Engineer")){

                System.out.println("the row that contains software engineer is"+i);
                WebElement row = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+(i+1)+"]"));
                System.out.println(row.getText());
            }
           i=i+1;
        }

    }
}
