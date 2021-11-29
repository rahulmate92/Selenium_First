import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahulramesh.mate\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();

		d1.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		Select drop1=new Select(d1.findElement(By.id("dropdown1")));
		drop1.selectByValue("2");
		
       Select drop2=new Select(d1.findElement(By.name("dropdown2")));
       
       drop2.selectByValue("3");
       
       Select drop3=new Select(d1.findElement(By.name("dropdown3")));
       
       drop3.selectByValue("1");  
       
       Select drop4=new Select(d1.findElement(By.id("dropdown4")));
		drop4.selectByValue("1");
	}
}