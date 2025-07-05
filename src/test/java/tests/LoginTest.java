package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ScreenshotUtils;


public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() throws IOException, InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		
		//WebElement element = driver.findElement(By.xpath("//div[@class='form-fields']"));
		
		
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.checkCheckbox();
		loginPage.enterLoginButton();
		Thread.sleep(5000);
		
		try {
			ScreenshotUtils.takeScreenshot(driver, "testValidLogin");
		} catch (Exception e) {
			
			System.out.println("Screenshot error: " + e.getMessage());
		}
		System.out.println("Title of the page is :" +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		
		
		
	}

}
