package com.nopcommerce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
	
	
	
	@FindBy(css=".email")
	WebElement user;
	
	
	@FindBy(css=".password")
	WebElement pass;
	
	
	@FindBy(css=".button-1")
	WebElement loginbtn;
	
	public void login(String username,String password) {
		user.sendKeys("admin@yourstore.com");
		user.sendKeys("admin");
		loginbtn.click();
		
	}
	
	
	
}
