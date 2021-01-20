package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tncs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arl-chinmai\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.get("http://tncs.fuegofurniture.com/us1/#/login");
		driver.findElement(By.xpath("//input[contains(@name,'emai')]")).sendKeys("demo1@fuegofurniture.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
	}

}
