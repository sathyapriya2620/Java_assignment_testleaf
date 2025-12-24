package week4.day1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class finance_table {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions option = new ChromeOptions();
		  option.addArguments("--guest"); // making this browser in guest mode 
		ChromeDriver driver=new ChromeDriver(option);
		
		// Add argument to open Chrome in Guest Mode
		option.addArguments("--disable-notifications");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://finance.yahoo.com/markets/");
		
		driver.findElement(By.xpath("//a[@title='Crypto']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//table[contains(@class,'yf-1uayyp1') and contains(@class,'bd')]//tr//td[2]"));
		Thread.sleep(5000);
		
				//+ "[contains(@class,'yf-1uayyp1') and contains(@class,'bd')]//tr//td[2]"));
		System.out.println(elements.size());
		Thread.sleep(5000);
		for(WebElement s1: elements)
		{
		String value=s1.getText();
			System.out.println(value);
		}
		
		
	}

}
