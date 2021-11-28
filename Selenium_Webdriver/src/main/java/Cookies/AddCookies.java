package Cookies;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class AddCookies {



		@Test
		public void login() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rahulramesh.mate\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d1;
			d1 = new ChromeDriver();



			d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");



			d1.findElement(By.id("ap_email")).sendKeys("Prasad");



			d1.findElement(By.id("continue")).click();



			Cookie nm = new Cookie("Cookies", "976876876");



			d1.manage().addCookie(nm);



			Set<Cookie> cookiesList = d1.manage().getCookies();
			for (Cookie getcookies : cookiesList) {
				System.out.println(getcookies);
			}

		}
}