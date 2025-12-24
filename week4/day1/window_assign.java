package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window_assign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
 * Enter the username and password.
- Click on the Login button.
- Click on the CRM/SFA link.
- 
- Click on Merge Contacts.
- Click on the widget of the "From Contact".
- Click on the first resulting contact.
- Click on the widget of the "To Contact".
- Click on the second resulting contact.
- Click on the Merge button.
- Accept the alert.
- Verify the title of the page.
 */
		
		ChromeOptions option = new ChromeOptions();
		  option.addArguments("--guest"); // making this browser in guest mode 
		ChromeDriver driver=new ChromeDriver(option);
		
		// Add argument to open Chrome in Guest Mode
		option.addArguments("--disable-notifications");

		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

				//Enter the username as ‘demosalesmanager’
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

				//Enter the password as 'crmsfa'
				driver.findElement(By.id("password")).sendKeys("crmsfa");

			
				//Click on the Login button.
				driver.findElement(By.className("decorativeSubmit")).click();
				  
				  //Click on the CRM/SFA link
				  driver.findElement(By.partialLinkText("CRM/SFA")).click();
				  //Click on the Contacts button.
				  driver.findElement(By.xpath("(//a[normalize-space()='Contacts'])[1]")).click();
				  //Click on Merge Contacts.
				  //(//a[normalize-space()='Merge Contacts'])[1]
				  driver.findElement(By.xpath("(//a[normalize-space()='Merge Contacts'])[1]")).click();
				  //Click on the widget of the "From Contact
				 WebElement widget= driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]"));
						 widget.click();
						
						 
		
						 //----------------------------->
						 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
						 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		//to handle parent use only driver.getwindowhandle();				 
						 String parentWindow = driver.getWindowHandle(); // to print the address of parent window.
						 System.out.println(parentWindow);

//-------------------------------->// Switch to child window<------------------------------------>
						Set<String> windows = driver.getWindowHandles();
						for (String window : windows) {
						    if (!window.equals(parentWindow)) {
						        driver.switchTo().window(window);
						    }
						}
				  
				  System.out.println(windows);
				   String childnode = driver.getTitle();//gettitle of childnode
				  System.out.println(childnode);
				 
				//------------------------------------------------------------>
				//  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

				  WebElement cell = wait.until(
				      ExpectedConditions.elementToBeClickable(
				          By.xpath("(//table[contains(@class,'x-grid3-row-table')]//tr[1]//td[1]//a)[1]")
				      )
				  );
				  cell.click();
				  
				  //------------------------------------------------->
				  driver.switchTo().window(parentWindow);
				  System.out.println(driver.getTitle());
				  
				  //--------------------------------->//// Click To Contact widget//------------>
				  WebElement widget2= driver.findElement(By.xpath("((//img[@src='/images/fieldlookup.gif']))[2]"));
					 widget2.click();
					 
					//----------------------------------------------------------->wait
					 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
					 
					// ---------------------------------------------------------------------
					 //switching to child window
					 Set<String> windowHandles2 = driver.getWindowHandles();
					 
					 for(String windows2:windowHandles2)
					 {
						 if(!windows2.equals(parentWindow))
						 {
							 driver.switchTo().window(windows2);
						 }
					 }
					 
					 
					 
				// ----------------------------------------------------------------->
				 WebElement cell1 = wait.until(
					      ExpectedConditions.elementToBeClickable(
					          By.xpath("//a[text()='DemoLBCust']")
					      )
					  );
					  cell1.click();
					  
					  driver.switchTo().window(parentWindow);
					  System.out.println(driver.getTitle());
				  
					  
					  driver.findElement(By.className("buttonDangerous")).click();//clicking on merge button
					  driver.switchTo().alert().accept();//alert handled
					  
					  driver.close();
					  
					  
					  
	}

	
	

}
