package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get is used to access url 
		driver.get("https://www.facebook.com/");
		
		//enter the username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//enter the password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Click on login button using xpath
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//Click on Find your account and log in
		driver.findElement(By.xpath("//a[@href='https://facebook.com/login/identify/']")).click();
		
		//To get the title of the current web page
		System.out.println(driver.getTitle());

	}

}
