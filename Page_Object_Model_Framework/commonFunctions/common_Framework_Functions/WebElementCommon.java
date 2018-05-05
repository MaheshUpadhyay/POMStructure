package common_Framework_Functions;

import org.openqa.selenium.WebElement;

public class WebElementCommon {
	
	public static boolean enabled(WebElement ele){
		boolean enable = false;
		if(ele.isEnabled()){
			enable = true;
		}
		return enable;
	}
	
	public static boolean displayed(WebElement ele){
		boolean display = false;
		if(ele.isDisplayed()){
			display = true;
		}
		return display;
	}
	
	public static boolean selected(WebElement ele){
		boolean select = false;
		if(ele.isSelected()){
			select = true;
		}
		return select;
	}
}
