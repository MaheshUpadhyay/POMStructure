package seleniumQTP_Page_Verifications;

import org.openqa.selenium.WebDriver;

import seleniumQTP_Page_Actions.SeleniumQTP_RegistrationForm_Page_Action;

public class SeleniumQTP_RegistrationForm_Page_Verification {

	WebDriver driver = null;
	SeleniumQTP_RegistrationForm_Page_Action pageAF = null;
	SeleniumQTP_RegistrationForm_Page1_Verification page1AV = null;
	
	/*
	 * Constructor which set's current driver to
	 * this class driver
	 * @Param : WebDriver
	 * @Return : None
	 */
	public SeleniumQTP_RegistrationForm_Page_Verification(WebDriver driver){
		this.driver = driver;
		pageAF = new SeleniumQTP_RegistrationForm_Page_Action(driver);
	}
	
	/*
	 * verification of user name entered
	 * @Param : String
	 * @Return : None
	 */
	public void verifyUserNameEnter(String userName){
		pageAF.enterUserName(userName);
	}
	
	/*
	 * verification of password entered
	 * @Param : String
	 * @Return : None
	 */
	public void verifyPasswordEnter(String password){
		pageAF.enterPassword(password);
	}
	
	/*
	 * verification of confirm password entered
	 * @Param : String
	 * @Return : None
	 */
	public void verifyConfPasswordEnter(String confPass){
		pageAF.enterConfPassword(confPass);
	}
	
	/*
	 * verification of submit clicked
	 * @Param : None
	 * @Return : None
	 */
	public void verifySubmitClicked(){
		pageAF.clickSubmit();
	}
	
	/*
	 * common verification which will verify
	 * whether registration form fill up
	 * @Param : String, UserName
	 * @Param : String, Password
	 * @Param : String, Confirm Password
	 * @Return : None
	 */
	public SeleniumQTP_RegistrationForm_Page1_Verification
			verifyRegistrationForm(String user, String pass,
			String confPass){
		
		try {
			verifyUserNameEnter(user);
			verifyPasswordEnter(pass);
			verifyConfPasswordEnter(confPass);
			verifySubmitClicked();
			page1AV = new SeleniumQTP_RegistrationForm_Page1_Verification(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return page1AV;
	}
}
