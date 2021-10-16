package seleniumQTP_Page_Tests;

import static org.testng.Assert.assertEquals;
//CRUD Operation
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import common_Framework_Functions.BaseClass;
import seleniumQTP_Page_Verifications.SeleniumQTP_RegistrationForm_Page1_Verification;
import seleniumQTP_Page_Verifications.SeleniumQTP_RegistrationForm_Page_Verification;

public class SeleniumQTP_RegistrationForm_Page_Test extends BaseClass{
  @Test
  public void registrationForm() {
	  SeleniumQTP_RegistrationForm_Page_Verification pageVF =
			  new SeleniumQTP_RegistrationForm_Page_Verification(driver);
	  SeleniumQTP_RegistrationForm_Page1_Verification page1V = 
			  pageVF.verifyRegistrationForm("user", "pass", "confPass");
	  assertEquals(page1V.verifyPage1GetTitle(), "Reg2");
  }
}
