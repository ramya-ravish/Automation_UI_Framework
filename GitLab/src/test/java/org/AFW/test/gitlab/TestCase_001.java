package org.AFW.test.gitlab;

import org.AFW.gitlab.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.gitlab.LoginPage;
import com.pages.gitlab.Register_tab;

public class TestCase_001 {

	@Test(priority=1)
	public void verify_login() {

		WebDriver signin = Browsers.startbrowser("chrome", "https://gitlab.com/users/sign_in");

		LoginPage log = PageFactory.initElements(signin, LoginPage.class);

		log.logindetails("admin123", "qwerty123mnb");

	}

	@Test
	public void verify_registeration() {

		WebDriver signup = Browsers.startbrowser("firefox", "https://gitlab.com/users/sign_in");

		Register_tab signup_1 = PageFactory.initElements(signup, Register_tab.class);

		signup_1.register_actions("admin", "rock", "adminrock123@gmail.com", "adminrock123@gmail.com", "mnbvcxz");
	}

}
