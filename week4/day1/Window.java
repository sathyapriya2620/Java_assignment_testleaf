package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window {

	public static void main(String[] args) {
//Load the IRCTC webpage and click on the "FLIGHTS" link. 
		// Capture the title of the new window that opens (flights window - AirTicket). 
		//Close the parent tab (Train ticket booking) alone. 
		
		ChromeOptions option = new ChromeOptions();
		  option.addArguments("--guest"); // making this browser in guest mode 
		ChromeDriver driver=new ChromeDriver(option);
		
		// Add argument to open Chrome in Guest Mode
		option.addArguments("--disable-notifications");

		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//li[@class='menu-list header-icon-menu']/a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>childwind= new ArrayList<String>(windowHandles);
		driver.switchTo().window(childwind.get(1));
		String chilname=driver.getTitle();
		System.out.println(chilname);
		driver.close();
		driver.switchTo().window(childwind.get(0));
	String parentname=	driver.getTitle();
	System.out.println(parentname);
		
		
	}

}
