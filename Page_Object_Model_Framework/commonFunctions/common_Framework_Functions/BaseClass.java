package common_Framework_Functions;

import org.testng.annotations.BeforeMethod;
//Adding for Sep 2019 batch
import java.io.IOException;
//I am adding login test to 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
  public static WebDriver driver = null;
  public static String CONFIG = "C:/Selenium/FebBatch/Page_Object_Model_Framework/TestData/SeleniumQTP.properties";
  GetPropertyValue properties = new GetPropertyValue();
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  String browserName = properties.getPropValues(CONFIG,"browser");
	  driver = LocalDriverFactory.createInstance(browserName);
	  driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
