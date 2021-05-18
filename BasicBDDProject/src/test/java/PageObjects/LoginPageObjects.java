package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement userName() {
		return driver.findElement(By.name("username"));
	}
	
	public WebElement passWord() {
		return driver.findElement(By.name("password"));
	}
	
	public WebElement submitButton() {
		return driver.findElement(By.xpath("//input[@type='submit']"));
	}
}
