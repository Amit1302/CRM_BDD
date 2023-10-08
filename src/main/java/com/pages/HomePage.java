package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

	

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By DataBase= By.xpath("//h3[text()='Databases']");
	private By search_box= By.xpath("//input[@type='text' and @class='form-control']");
	private By create_btn= By.xpath("//a[text()='Create']");
	private By eCommerce_btn= By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div[2]/div/div[1]/div[1]/div[1]/label[2]/div/div[2]");
	private By continue_btn= By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div[2]/div/div[1]/div[2]/div/div/button");
	private By name= By.id("username");
	private By email= By.id("email");
	private By website_name= By.id("company-name");
	private By phone_number= By.id("phone");
	private By startnow_btn= By.xpath("//button[@type='submit']");
	private By error= By.xpath("//p[text()='Your domain must be at least 4 characters long']");
	
	
	
	
	public String data_base()
	{
		return driver.findElement(DataBase).getText();
	}
	
	public void search_box()
	{
		driver.findElement(search_box).sendKeys("ok");
	}
	
	public void create()
	{
		driver.findElement(create_btn).click();
	}
	
	public void Ecommerce()
	{
		driver.findElement(eCommerce_btn).click();
	}
	
	public void cn()
	{
		driver.findElement(continue_btn).click();
	}
	
	public void fill_the_form(String user_name, String emailId, String website, String number) {
		WebElement name1=driver.findElement(name);
		name1.clear();
		name1.sendKeys(user_name);
		WebElement email1=driver.findElement(email);
		email1.clear();
		email1.sendKeys(emailId);
		WebElement website1=driver.findElement(website_name);
		website1.clear();
		website1.sendKeys(website);
		WebElement number1=driver.findElement(phone_number);
		number1.clear();
		number1.sendKeys(number);
		
	}
	
	public void start_now()
	{
		driver.findElement(startnow_btn).click();
		
	}
	
	public String error_msg()
	{
		return driver.findElement(error).getText();
	}
	
	

}
