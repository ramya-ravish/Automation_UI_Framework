package org.AFW.gitlab;

import org.openqa.selenium.WebElement;

public class Webelement_Actions {

	public static boolean isenable(WebElement element)
	{
		boolean val=false;
		
		try {
			
			val=element.isEnabled();
			
		} catch (Exception e) {

				e.printStackTrace();
		}
		
		return val;
	}

	public static boolean isSelect(WebElement element)
	{
		 boolean val=false;
		try {
			
			val=element.isSelected();
			
		} catch (Exception e) {
				
			e.printStackTrace();
		}
		
		return val;
	}
	
	
	
	public static boolean isdisplay(WebElement element)
	{
		boolean val=false;
		try{
			
			element.isDisplayed();
			
		}
		catch (Exception e) {
				e.printStackTrace();
		}
		return val;
		
	}
	
	public static void clickable(WebElement element)
	{
		
		try {
			
			element.click();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public static void clearthefield(WebElement element)
	{
		
		
		try {
			
			element.clear();
			
		} catch (Exception e) {
				
			e.printStackTrace();
			
		}
	}
	
	
	public static void sendtext(WebElement element,String txt)
	{
		try{
		element.sendKeys(txt);
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
}
