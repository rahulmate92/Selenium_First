
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
public class dropdown1 {
  @Test
  public void drop() {

      System.setProperty("webdriver.chrome.driver","C:\\Users\\rahulramesh.mate\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/home.html");

         driver.findElement(By.xpath("//img[contains(@src,'images/dropdown.png')]")).click();

         Select drop1=new Select(driver.findElement(By.xpath("//*[@id=\"dropdown1\"]")));

           drop1.selectByVisibleText("Selenium");

           Select drop2=new Select(driver.findElement(By.name("dropdown2")));

           drop2.selectByValue("3");

           Select drop3=new Select(driver.findElement(By.id("dropdown3")));

           drop3.selectByValue("2");

           Select drop4=new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select")));

           drop4.selectByVisibleText("Selenium");

           Select drop6=new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")));
           drop6.selectByValue("4");


           Select drop7=new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
           drop7.selectByValue("1");

           Boolean output= drop7.isMultiple();
           System.out.println(output);



  }
}