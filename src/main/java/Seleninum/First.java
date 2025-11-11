package Seleninum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	
	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.demoqa.com");
		
	}

}
