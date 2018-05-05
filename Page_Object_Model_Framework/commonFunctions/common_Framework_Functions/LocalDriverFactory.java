package common_Framework_Functions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocalDriverFactory {
	//FiReFoX Mozilla
	static WebDriver createInstance(String browserName) {
        WebDriver driver = null;
        if (browserName.toLowerCase().contains("firefox")) {
        	System.out.println("launching firefox browser"); 
    		System.setProperty("webdriver.gecko.driver", 
    				"C:/Selenium/FebBatch/SeleniumWebDriverThree/Driver/geckodriver.exe");
    		DesiredCapabilities capabilities=
    				DesiredCapabilities.firefox();
    		capabilities.setCapability("marionette", true);
    		driver = new FirefoxDriver();
    		
            return driver;
        }
        if (browserName.toLowerCase().contains("ie")) {
        	System.out.println("launching IE browser"); 
    		System.setProperty("webdriver.ie.driver", 
    				"C:/Selenium/FebBatch/SeleniumWebDriverThree/Driver/IEDriverServer.exe");
    		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
    		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
    		driver = new InternetExplorerDriver(capabilities);
    		return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
        	System.out.println("launching Chrome browser"); 
    		System.setProperty("webdriver.chrome.driver", 
    				"C:/Selenium/FebBatch/SeleniumWebDriverThree/Driver/chromedriver.exe");
    		driver = new ChromeDriver();
    		return driver;
        }
        return driver;
    }
}
