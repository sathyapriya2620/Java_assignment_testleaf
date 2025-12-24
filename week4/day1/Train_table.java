package week4.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*- Launch the erail URL.
 - Enter "MAS" as the "From" station.
 - Enter "MDU" as the "To" station. - Uncheck the "Sort on Date" checkbox. 
- Retrieve the train names from the web table.
 - Verify if there are any duplicate train names in the web table. 
 */

public class Train_table {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		  option.addArguments("--guest"); // making this browser in guest mode 
		ChromeDriver driver=new ChromeDriver(option);
		
		// Add argument to open Chrome in Guest Mode
		option.addArguments("--disable-notifications");

		driver.get("https://erail.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Enter "MAS" as the "From" station.---------------------->
		WebElement from= driver.findElement(By.id("txtStationFrom"));
		from.click();
				from.clear();
		from.sendKeys("MAS");
		Thread.sleep(1000);
		//sendKeys("MAS");
		
		// Enter "MDU" as the "To" station.-------------------->
		WebElement to=driver.findElement(By.id("txtStationTo"));
				to.clear();
			to.sendKeys("MDU");
			Thread.sleep(1000);
		
		//Uncheck the "Sort on Date" checkbox.--------------->
		driver.findElement(By.id("chkSelectDateOnly")).click();
		//driver.quit();
		
		// Retrieve the train names from the web table.--------------->
		
		//DataTable TrainList TrainListHeader stickyTrainListHeader
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='divTrainsList']//tr//td[2]"));
		System.out.println(elements.size());
		Set<WebElement>duplicate=new HashSet<WebElement>(elements);
		
		for(WebElement ele:duplicate)
		{
			
			String train_name=ele.getText(); 
			      System.out.println(train_name);
			
			
			
		}
		//System.out.print(duplicate);
		
		
		
		
	}

}
