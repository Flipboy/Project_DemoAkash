package org.login;

import org.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LpFacebook extends BasePage {

	public LpFacebook() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "email")
	WebElement txtuser;
	
	@FindBy(id="pass")
	WebElement txtpass;
	
	@FindBy(name = "login")
	WebElement btnlogin;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
}
