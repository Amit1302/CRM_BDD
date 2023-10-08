package com.testrunners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	
	@BeforeMethod
	
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.odoo.com/web/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testing() throws InterruptedException 
	{
		driver.findElement(By.id("login")).sendKeys("dasamit1770@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Odoo@2023@2024");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div[2]/div/div[1]/div[1]/div[1]/label[2]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div[2]/div/div[1]/div[2]/div/div/button")).click();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.id("username"));
		name.clear();
		name.sendKeys("ok");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//String b=driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div/div[1]/h3")).getText();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div[1]/div[2]/div/div[1]/div[1]/div[1]/label[2]/div/div[2]")).click();
		//System.out.println(b);
		//driver.findElement(By.xpath("//a[text()='Reset Password'] ")).click();
		//System.out.println(button);
		//boolean b=driver.findElement(By.className("o_view_nocontent_smiling_face")).isDisplayed();
		//String error_msg=driver.findElement(By.xpath("//p[@role='alert']")).getText();
		
		
		
		
		
		
		//Thread.sleep(5000);
		
		
		
		
	}

}