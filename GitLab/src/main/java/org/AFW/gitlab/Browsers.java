package org.AFW.gitlab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static WebDriver driver;

	public static WebDriver startbrowser(String browsername, String Url) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:/Browser_drivers/chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:/Browser_drivers/geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		driver.get(Url);

		return driver;

	}
}
