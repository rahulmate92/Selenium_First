package UiAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class DragDrop {

          WebDriver driver;

          @Test
          public void TextBox() {

        	  System.setProperty("webdriver.chrome.driver","C:\\Users\\rahulramesh.mate\\Downloads\\chromedriver_win32\\chromedriver.exe");
        	  driver = new ChromeDriver();

        	  driver.get("http://www.leafground.com/pages/drop.html");

        	  WebElement draggable=driver.findElement(By.id("draggable"));
        	  WebElement droppable=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        	  Actions act1=new Actions(driver);

        	  act1.dragAndDrop(draggable, droppable).build().perform();


          }
}