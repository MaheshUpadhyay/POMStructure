package common_Framework_Functions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDropdown {
	
	public static void selectDropDownByIndex(WebElement ele, int index){
		Select byIndex = new Select(ele);
		byIndex.selectByIndex(index);
	}
	
	public static void selectDropDownByValue(WebElement ele, String value){
		Select byValue = new Select(ele);
		byValue.selectByValue(value);
	}
	
	public static void selectDropDownText(WebElement ele, String text){
		Select byText = new Select(ele);
		byText.selectByVisibleText(text);
	}
	
	public static void selectAlert(){
		Alert a = new Alert(arg0)
				a.accept();
		a.dismiss();
	}
}
