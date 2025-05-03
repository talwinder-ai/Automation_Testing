package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTests extends BaseTest {

	
	@Test
	public void checkcredentials() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername("admin@yourstore.com");
		loginpage.enterpassword("admin");
		loginpage.login();
		System.out.println("Title of this page is "+ driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Just a moment...");
	}

}
