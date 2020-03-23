package javatraining;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Original\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		String s=driver.getTitle();
		System.out.println(s);
		
		driver.close();
	}

}
