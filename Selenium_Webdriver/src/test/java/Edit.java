import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahulramesh.mate\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr;
		dr=new ChromeDriver();

		dr.get("http://www.leafground.com/home.html");
		
		dr.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
		//Enter your email address
		dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rahulmatebag@gmail.com");
		//Append a text and press keyboard tab
		dr.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("Append the keys");
		//Get default text entered
		dr.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).sendKeys("Test");
		//Clear the text
		dr.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).sendKeys("Test123");
		Thread.sleep(2000);
		dr.close();
	}
}
