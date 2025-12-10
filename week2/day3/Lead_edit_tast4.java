package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Lead_edit_tast4 {

	public static void main(String[] args)throws InterruptedException  {

		
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
		
			//to click on crm/sfa
			driver.findElement(By.linkText("CRM/SFA")).click();
			//click on lead tab
			driver.findElement(By.linkText("Leads")).click();
			
			//Create Lead
			driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the CompanyName Field Using Xpath.
			
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("microsoft");
		//- Enter the FirstName Field Using Xpath.
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("zaarakhan");
          // Enter the LastName Field Using Xpath.
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("zaarakhan");
		//- Enter the FirstName (Local) Field Using Xpath.
//createLeadForm_firstNameLocal
driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("zaara");

//Enter the Department Field Using any Locator of Your Choice.
//createLeadForm_departmentName
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("cse");

//Enter the Description Field Using any Locator of your choice.
driver.findElement(By.id("createLeadForm_description")).sendKeys("welcome to selenium course");

//Enter your email in the E-mail address Field using the locator of your choice.
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathya123@gmail.com");

//Select State/Province as NewYork Using Visible Text.
WebElement state =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select state1=new Select(state);
state1.selectByVisibleText("New York");

// Click on the Create Button.
driver.findElement(By.name("submitButton")).click();

//- Click on the edit button.
//href="updateLeadForm?partyId=12111
//WebElement edit=driver.findElement(By.xpath("(//a[@href='updateLeadForm?partyId=12111'])[1]"));
WebElement edit=driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]"));
Thread.sleep(2000);
edit.click();

//- Clear the Description Field.
WebElement delete1=driver.findElement(By.id("updateLeadForm_description"));
Thread.sleep(1000);
delete1.clear();

//- Fill the Important Note Field with Any text.

driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("welcome to selenium course");

//- Click on the update button.
//
driver.findElement(By.xpath("//input[@value='Update'] ")).click();
// Get the Title of the Resultin
System.out.println(driver.getTitle());
driver.close();


	}
	
	

}
