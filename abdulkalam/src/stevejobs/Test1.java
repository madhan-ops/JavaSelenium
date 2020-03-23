package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Madhan\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("I am a Winner",Keys.TAB);
		
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
