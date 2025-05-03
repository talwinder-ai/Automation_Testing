package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy(id = "Email")
	WebElement usernametextbox;

	@FindBy(id = "Password")
	WebElement passwordtextbox;

	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement loginbutton;

//	private By usernametextbox = By.id("Email");
//	private By passwordtextbox = By.id("Password");
//	private By loginbutton = By.xpath("//button[normalize-space()='Log in']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterusername(String usertext) {

		usernametextbox.clear();
		usernametextbox.sendKeys(usertext);

//		driver.findElement(usernametextbox).clear();
//		driver.findElement(usernametextbox).sendKeys(usertext);
	}

	public void enterpassword(String userpassword) {

		passwordtextbox.clear();
		passwordtextbox.sendKeys(userpassword);

		// driver.findElement(passwordtextbox).sendKeys(userpassword);;
	}

	public void login() {
		loginbutton.click();

		// driver.findElement(loginbutton).click();;
	}

}
