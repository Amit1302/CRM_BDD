package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;

public class LoginPage {
	public WebDriver driver;
	private HomePage homepage;
	
	private By username1 = By.id("login");
	private By password1 = By.id("password");
	private By login = By.xpath("//button[@type='submit']");
	private By reset_password_link = By.xpath("//a[text()='Reset Password'] ");
	private By try_it_free_button= By.xpath("//*[@id=\"top_menu\"]/ul[1]/li[3]/a");
	private By invalid_login_msg= By.xpath("//p[@role='alert']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void enter_username(String username)
	{
		driver.findElement(username1).sendKeys(username);
	}
	
	public void enter_pwd(String password)
	{
		driver.findElement(password1).sendKeys(password);
	}
	
	public void click_login()
	{
		 driver.findElement(login).click();
		 
	}
	
	
	public boolean resetPwdLink()
	{
		return driver.findElement(reset_password_link).isDisplayed();
	}
	
	public boolean tryitforFree()
	{
		return driver.findElement(try_it_free_button).isDisplayed();
	}
	public String invalidLoginMsg()
	{
		return driver.findElement(invalid_login_msg).getText();
	}
	
	public HomePage login(String un, String pwd)
	{
		driver.findElement(By.id("login")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new HomePage(driver);
		
	}
}