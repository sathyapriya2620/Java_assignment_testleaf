package week3.day1;

public class Button extends WebElement{

	
	public  void  submit()
	{
		System.out.println("the value is submitted");
	}
	public static void main(String[] args) {
Button b1=new Button();
b1.submit();
	}

}
