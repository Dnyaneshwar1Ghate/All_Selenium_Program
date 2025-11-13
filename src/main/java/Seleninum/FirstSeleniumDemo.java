package Seleninum;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumDemo {
	
	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String tital=driver.getTitle();
		String act=driver.getTitle();
		String curent="DEMOQA";
		
		if(tital.equals(curent))
		{
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("test case not pass");
		}
		
		
		
		
	}

}
