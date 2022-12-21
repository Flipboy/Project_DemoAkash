package org.login;

import org.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LpAdactin extends BasePage {

	public LpAdactin() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement txtId;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	WebElement btnlogin;

	public WebElement getTxtId() {
		return txtId;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
}
