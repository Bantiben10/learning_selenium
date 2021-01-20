package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arl-chinmai\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")));
		dropdown.selectByVisibleText("INR");;
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
