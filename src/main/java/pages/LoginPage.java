package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By usernametextbox = By.id("Email");
	private By passwordtextbox = By.id("Password");
	private By loginbutton = By.xpath("//button[normalize-space()='Log in']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterusername(String usertext) {
		driver.findElement(usernametextbox).clear();
		driver.findElement(usernametextbox).sendKeys(usertext);
	}

	public void enterpassword(String userpassword) {
		driver.findElement(passwordtextbox).sendKeys(userpassword);;
	}

	public void login() {
		driver.findElement(loginbutton).click();;
	}

}
