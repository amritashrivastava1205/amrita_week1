package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM4 {
	private WebDriver driver; 
		
	public LoginPOM4(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"responsive\"]/li[8]/a")
	WebElement login;  
	
	@FindBy(xpath="//*[@id=\"user_login\"]")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"user_pass\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"tab1\"]/form/p[3]/input")
	private WebElement signin;
	
	@FindBy(xpath="//*[@id=\"responsive\"]")
	private WebElement Hiamritalink;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/div/ul/li[1]/a")
	private WebElement myprofile;
	
	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(xpath="//*[@id=\"agent_title\"]")
	private WebElement agenttitle;
	
		
	@FindBy(xpath="//*[@id=\"edit_user\"]")
	private WebElement savechanges;

	public void clicklogin() {
		// TODO Auto-generated method stub
			this.login.click();
	}
	
	public void sendusername(String login) {
	username.sendKeys("nigam_0218@rediffmail.com");
	}	
	public void sendpassword(String login) {
		this.password.clear();
		this.password.sendKeys("SjQjlJYAHDll");
	}
	public void clicksignin() {
		// TODO Auto-generated method stub
			this.signin.click();
	}
	@SuppressWarnings("null")
	public void mouseoverOnHiamritalink() {
		
	Actions action = null;
		action.moveToElement(this.Hiamritalink).click().build().perform();
	}	

	
	public void clickmyprofile() {
		this.myprofile.click();
	}
	


public void sendagenttitle(String login2) {
	// TODO Auto-generated method stub
	
	this.agenttitle.sendKeys("test1234");
	
	System.out.println("test1234");
}

public void sendphone(String login) {
	this.phone.clear();
	this.phone.sendKeys("1234567990");
	System.out.println("1234567990");
	}	

public void clicksavechanges() {
	this.savechanges.clear();
	this.savechanges.click();
}

}






		