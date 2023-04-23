package com.nopcommerce.tests;



import org.testng.annotations.Test;

import com.nopcommerce.pageobject.loginpage;


public class TC_logintest extends BaseClass{
	
	
	  @Test
		public void varuoifylogin() {
			
			driver.get(url);
			logger.info("url opend");
			
			loginpage lp=new loginpage(driver);
			lp.login("admin@yourstore.com", "admin");
		}

   
}
