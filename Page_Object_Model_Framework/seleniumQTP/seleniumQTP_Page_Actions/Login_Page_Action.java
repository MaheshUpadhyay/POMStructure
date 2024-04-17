package seleniumQTP_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common_Framework_Functions.WebButton;
import common_Framework_Functions.WebElementCommon;
import common_Framework_Functions.WebTextBox;
import seleniumQTP_Page_Locators.SeleniumQTP_RegisterForm_Page_Locator;
//MyLogin Feature
public class SeleniumQTP_RegistrationForm_Page_Action {
	
	WebDriver driver = null;
	WebElement ele = null;
	SeleniumQTP_RegisterForm_Page_Locator pageLF = null;
	
	/*
	 * Constructor for holding instance
	 * @Param : WebDriver
	 * @Return : None
	 */
	public SeleniumQTP_RegistrationForm_Page_Action(WebDriver driver){
		this.driver = driver;
		pageLF = new SeleniumQTP_RegisterForm_Page_Locator(driver);
	}
	
	/*
	 * We want to check, username is enabled/displayed
	 * if enabled/displayed, we need to set value 
	 * to the user name field.
	 * @Param : String, text to set in text box
	 * @Return : None
	 */
	public void enterUserName(String userName){
		ele = pageLF.getUserName();
		if(ele!=null){
			if(WebElementCommon.enabled(ele)){
				WebTextBox.sendInput(ele, userName);
			}
		}
	}
	
	/*
	 * We want to check, password is enabled/displayed
	 * if enabled/displayed, we need to set value 
	 * to the password field.
	 * @Param : String, text to set in text box
	 * @Return : None
	 */
	public void enterPassword(String password){
		ele = pageLF.getPassword();
		if(ele!=null){
			if(WebElementCommon.enabled(ele)){
				WebTextBox.sendInput(ele, password);
			}
		}
	}
	
	/*
	 * We want to check, confirm password is enabled/displayed
	 * if enabled/displayed, we need to set value 
	 * to the confirm password field.
	 * @Param : String, text to set in text box
	 * @Return : None
	 */
	public void enterConfPassword(String confPass){
		ele = pageLF.getConfPassword();
		if(ele!=null){
			if(WebElementCommon.enabled(ele)){
				WebTextBox.sendInput(ele, confPass);
			}
		}
	}
	
	/*
	 * We want to check, submit button is enabled/displayed
	 * if enabled/displayed, we need to click 
	 * to the submit button.
	 * @Param : None
	 * @Return : None
	 */
	public void clickSubmit(){
		ele = pageLF.getSubmit();
		if(ele!=null){
			if(WebElementCommon.enabled(ele)){
				WebButton.click(ele);
			}
		}
	}
}
