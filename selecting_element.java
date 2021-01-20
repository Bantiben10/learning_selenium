package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selecting_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set chrome browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arl-chinmai\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launch google.com url
		driver.get("http://google.com");
		//get title of the page
		System.out.println(driver.getTitle());
		
		//checck and print correct url
		//System.out.println(driver.getCurrentUrl());
		
		// check page source
		//System.out.println(driver.getPageSource());
		
		// launch yahoo url
		
		//driver.get("http://yahoo.com");
		
		//print tittle
		//System.out.println(driver.getTitle());
		//click navigate back button
		
		//driver.navigate().back();
		
		//click navigate forward button
		//driver.navigate().forward();
		
		//close chrome
		//driver.close();
		
		//close all chrome window
		
		//driver.quit();
		
		//go to facebook.com
		driver.get("http://tncs.fuegofurniture.com/us1/#/login");
		
		// find element by id                              // write in email box box
		//driver.findElement(By.id("email")).sendKeys("chinmaya.ben10@gmail.com");
		//find element by class
		//driver.findElement(By.className("inputtext")).sendKeys("cannon");
		
		//find element by name
		//driver.findElement(By.name("pass")).sendKeys("cannonbolt");
		// find element by link text                          clicking
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]")).getText());
		
		//driver.quit();
		
			
		
		
		
	}

}
