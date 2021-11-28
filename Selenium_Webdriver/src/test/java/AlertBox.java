import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AlertBox {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahulramesh.mate\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();

		d1.get("http://www.leafground.com/pages/Alert.html");
		
		d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		
		Alert a1=d1.switchTo().alert();
		
		String msg=a1.getText();
		
		a1.accept();
		
		System.out.println(msg);
	}

}