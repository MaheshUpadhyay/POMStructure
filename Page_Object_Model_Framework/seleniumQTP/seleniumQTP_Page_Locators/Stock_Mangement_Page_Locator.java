package seleniumQTP_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Amey is doing implementation
public class SeleniumQTP_RegisterForm_Page_Locator {
	//I am trying GitHub Process
	WebDriver driver = null;

public WebElement getUserName(){
		return userName;
	}
	
	@FindBy(name = "password")
	private WebElement password;
	
	/*
	 * Access password with action class for further action
	 * @Param : None
	 * @Return : WebElement
	 */
	public WebElement getPassword(){
		return password;
	}
	
	@FindBy(name = "confirmpassword")
	private WebElement confPassword;
	

	
	/*
	 * Constructor to set current driver to this class driver
	 * @Param : WebDriver
	 * @Return : Page Object
	 */
	public SeleniumQTP_RegisterForm_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	//I have added all the locators
	@FindBy(name = "name")
	private WebElement userName;
	
	/*
	 * Access userName with action class for further action
	 * @Param : None
	 * @Return : WebElement
	 */
	public WebElement getUserName(){
		return userName;
	}
	
	@FindBy(name = "password")
	private WebElement password;
	
	/*
	 * Access password with action class for further action
	 * @Param : None
	 * @Return : WebElement
	 */
	public WebElement getPassword(){
		return password;
	}
	
	@FindBy(name = "confirmpassword")
	private WebElement confPassword;
	
	/*
	 * Access confirm password with action class for further action
	 * @Param : None
	 * @Return : WebElement
	 */
	public WebElement getConfPassword(){
		return confPassword;
	}
	
	@FindBy(name = "insert")
	private WebElement submitBtn;
	
	/*
	 * Access submit button with action class for further action
	 * @Param : None
	 * @Return : WebElement
	 */
	public WebElement getSubmit(){
		return submitBtn;
	}
}
