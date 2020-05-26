package com.pages.gitlab;

import org.AFW.gitlab.Webelement_Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='user_login']")
	WebElement username;

	@FindBy(how = How.XPATH, using = "//*[@id='user_password']")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id='user_remember_me']")
	WebElement rmbr_me;

	@FindBy(how = How.XPATH, using = "(//*[@name='commit'])[1]")
	WebElement submit_btn;

	public void logindetails(String uname, String pass) {

		Webelement_Actions.isdisplay(username);

		Webelement_Actions.sendtext(username, uname);

		boolean isdisplayed2 = Webelement_Actions.isdisplay(password);

		System.out.println(isdisplayed2);

		Webelement_Actions.sendtext(password, pass);

		Webelement_Actions.clickable(rmbr_me);
		
		Webelement_Actions.clickable(submit_btn);

	}

}
