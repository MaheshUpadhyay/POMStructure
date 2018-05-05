package common_Framework_Functions;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	
	/*
	 * this method is to send input to the Text box
	 * @Param : WebElement
	 * @Param : String, Input to be send
	 * @Return : None
	 */
	public static void sendInput(WebElement ele, String input){
		ele.sendKeys(input);
	}
	
	/*
	 * This method is use to take text from text box
	 * @Param : WebElement
	 * @Return : String
	 */
	public static String getText(WebElement ele){
		return ele.getText();
	}
	
	/*
	 * This method is use to clear text from text box
	 * @Param : WebElement
	 * @Return : None
	 */
	public static void clearText(WebElement ele){
		ele.clear();
	}
}
