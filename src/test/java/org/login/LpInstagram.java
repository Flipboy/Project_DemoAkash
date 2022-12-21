package org.login;

import org.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LpInstagram extends BasePage{

	public LpInstagram() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement txtid;
	
	@FindBy(name = "password")
	WebElement txtpass;
	
	@FindBy(xpath = "//div[text()='Log in']")
	WebElement btnLogin;

	public WebElement getTxtid() {
		return txtid;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
