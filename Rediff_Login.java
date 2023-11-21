package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Login {
public  static  String url, username, password,actualPageTitle, excptedPageTitle;
public static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		url="https://www.rediff.com/";
		username="vivek.joglekar";
		password="vivek123";
		// Step 1
WebDriverManager.firefoxdriver().setup();
//  Step 2 open firefox browser
driver= new FirefoxDriver();
//  Step 3 get website url
driver.get(url);
Thread.sleep(10000);
driver.manage().window().maximize();
// click SIgn in  link
//driver.findElement(By.linkText("Sign in")).click();  //  OR
driver.findElement(By.partialLinkText("Sign")).click();
Thread.sleep(10000);
//  enter username inside username editbox
driver.findElement(By.id("login1")).sendKeys(username);
Thread.sleep(10000);
driver.findElement(By.id("password")).sendKeys(password);
Thread.sleep(10000);
//  click on Sign in button
driver.findElement(By.name("proceed")).click();
Thread.sleep(10000);
excptedPageTitle="Rediffmail";
actualPageTitle=driver.getTitle();
System.out.println("  actual page title is --->"+ actualPageTitle);
if(actualPageTitle.equals(excptedPageTitle))
{
	System.out.println(" test case is Fail");
}else
{
	System.out.println(" test case is Pass");
}


//quit browser
driver.quit();
		
		
		
		
	}

}
