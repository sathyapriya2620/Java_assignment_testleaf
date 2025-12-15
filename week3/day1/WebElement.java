package week3.day1;

public class WebElement {
	
	
//	- Create a base class named WebElement with common methods such as click() and setText(String text).
	
	
	public void click()
	{
		System.out.println(" the click is performed");
	}
	public  void setText(String text)
	{
		System.out.println("the text is inserted");
	}
	
public static void main(String[] args) {
	
WebElement element=new WebElement();
element.click();
element.setText("sathya");
	}

}
