package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	
	private By usernameTextField = By.xpath("//input[@id='Email']");
	private By passwordTextField = By.id("Password");
	private By checkBox = By.xpath("//input[@id='RememberMe']");
	private By loginButton = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(usernameTextField).clear();
		driver.findElement(usernameTextField).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordTextField).clear();
		driver.findElement(passwordTextField).sendKeys(password);
	}
	
	public void checkCheckbox(){
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox));
		
		//driver.findElement(checkBox).clear();
		try {
			//driver.findElement(checkBox).clear();
			driver.findElement(checkBox).click();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Checkbox element is not visible or found");
		}
		
	}
	
	public void enterLoginButton(){
		driver.findElement(loginButton).click();
		}
}
