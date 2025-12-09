package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class website {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		  option.addArguments("--guest"); // making this browser in guest mode 
		ChromeDriver driver=new ChromeDriver(option);
		String s="http://leaftaps.com/opentaps/control/main";
		//driver.manage().window().maximize();
		driver.get(s);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	//	driver.switchTo().alert().accept();
		//button// after logging the account
		driver.findElement(By.id("label")).click();
		//ext-gen614
		
		driver.findElement(By.linkText("Accounts")).click();
		//accountName
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sathya2");
		//officeSiteName
		driver.findElement(By.id("officeSiteName")).sendKeys("testleaf");
		driver.findElement(By.name("description")).sendKeys("i am automation testers");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		//smallSubmit
	driver.findElement(By.className("smallSubmit")).click();//create account to submit
		
	String str1=driver.getTitle();
		System.out.println(str1);
		//Thread.sleep(3000);
	driver.close();
	}
	
	
	

}
