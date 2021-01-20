package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mozilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set firefox browser driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arl-chinmai\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//launch google.com url
		driver.get("http://google.com");
		//get title of the page
		System.out.println(driver.getTitle());
		
		//check and print correct url
		
		System.out.println(driver.getCurrentUrl());
	}

}
