package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.messages.types.Duration;

public class lead_assignment {

	public static void main(String[] args) throws InterruptedException { 
		ChromeOptions option = new ChromeOptions();
		  option.addArguments("--guest"); // making this browser in guest mode 
		ChromeDriver driver=new ChromeDriver(option);
		String s="http://leaftaps.com/opentaps/control/main";
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(s);
		driver.manage().window().maximize();
		//username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//submit
		driver.findElement(By.className("decorativeSubmit")).click();
	//	driver.switchTo().alert().accept();
		//to click on crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on lead taps
		//Leads
		driver.findElement(By.linkText("Leads")).click();
		//Click "Find leads."
//Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on the "Phone" tab.
		//x-tab-strip-text 
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//phoneNumber//Enter the phone number.
		driver.findElement(By.name("phoneNumber")).sendKeys("12345");
		//Click the "Find leads" button.

		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the lead ID of the first resulting lead.

		//driver.findElement(By.linkText("10404")).click();
		
		//Capture the lead ID of the first resulting lead.
		WebElement print=driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10057'][1]"));
		Thread.sleep(3000);
		print.click();
		//Click the "Delete" button.
//href="javascript:document.deleteLeadForm.submit()
		//a[@href='javascript:document.deleteLeadForm.submit()']
		driver.findElement(By.xpath("//a[@href='javascript:document.deleteLeadForm.submit()'][1]"));
		
		//Thread.sleep(1000);
	

		
	}

}
