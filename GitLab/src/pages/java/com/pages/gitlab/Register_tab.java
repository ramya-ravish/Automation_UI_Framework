package com.pages.gitlab;

import org.AFW.gitlab.Webelement_Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Register_tab {

	WebDriver driver;

	public Register_tab(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@href='#register-pane']")
	WebElement register_tab;

	@FindBy(how = How.XPATH, using = "//*[@id='new_user_name']")
	WebElement fname;

	@FindBy(how = How.XPATH, using = "//*[@id='new_user_username']")
	WebElement uname;

	@FindBy(how = How.XPATH, using = "//*[@id='new_user_email']")
	WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id='new_user_email_confirmation']")
	WebElement email_cnform;

	@FindBy(how = How.XPATH, using = "//*[@id='new_user_password']")
	WebElement password_reg;

	@FindBy(how = How.XPATH, using = "//*[@id='new_user_email_opted_in']")
	WebElement update_btn;

	@FindBy(how = How.XPATH, using = "//*[@class='btn-register btn']")
	WebElement register_btn;

	public void register_actions(String f_name, String u_name, String e_mail, String email_cnfrm, String pass_reg) {

		Webelement_Actions.clickable(register_tab);

		Webelement_Actions.isdisplay(fname);

		Webelement_Actions.clearthefield(fname);

		Webelement_Actions.sendtext(fname, f_name);

		Webelement_Actions.isdisplay(uname);

		Webelement_Actions.clearthefield(uname);

		Webelement_Actions.sendtext(uname, u_name);

		Webelement_Actions.isdisplay(email);

		Webelement_Actions.clearthefield(email);

		Webelement_Actions.sendtext(email, e_mail);

		Webelement_Actions.isdisplay(email_cnform);

		Webelement_Actions.clearthefield(email_cnform);

		Webelement_Actions.sendtext(email_cnform, email_cnfrm);

		Webelement_Actions.isdisplay(password_reg);

		Webelement_Actions.clearthefield(password_reg);

		Webelement_Actions.sendtext(password_reg, pass_reg);

		Webelement_Actions.clickable(update_btn);

		Webelement_Actions.clickable(register_btn);

	}
}
