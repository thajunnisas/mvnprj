package org.test;
import org.testing.*;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClasses extends BaseClass {

	//1.Non-parameterized constructor(page)
	public LoginPojoClasses() {
		
		PageFactory.initElements(driver,this);
	}
	//2.private webelement
	@CacheLookup
	@FindBy(id = "email")
	private WebElement txtUser;
	@CacheLookup
	@FindBy(name="pass")
	private WebElement txtPass;
	@CacheLookup
	private WebElement btnLogin;
	
	
	@CacheLookup
	@FindBys({     //ANNOTATIONS
		
		
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="//button[text()='Log in']"),
		@FindBy(name="login"),
		@FindBy(id="u_0_5_bA")
	})
	private WebElement findbysbtnLogin;
	
	
	private WebElement findallbtnLogin;
	

	//3.getters to access those web elements outside of the class
	
	public WebElement getFindallbtnLogin() {
		return findallbtnLogin;
	}
	
	public WebElement getFindbysbtnLogin() {
		return findbysbtnLogin;
	}
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
