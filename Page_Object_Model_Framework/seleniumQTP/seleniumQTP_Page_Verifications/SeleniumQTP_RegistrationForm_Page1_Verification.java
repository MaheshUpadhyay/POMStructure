package seleniumQTP_Page_Verifications;

import org.openqa.selenium.WebDriver;

public class SeleniumQTP_RegistrationForm_Page1_Verification {
	WebDriver driver = null;
	/*
	 * Constructor to get driver
	 */
	public SeleniumQTP_RegistrationForm_Page1_Verification(WebDriver driver){
		this.driver = driver;
	}
	
	public String verifyPage1GetTitle(){
		return driver.getTitle();
	}
}
