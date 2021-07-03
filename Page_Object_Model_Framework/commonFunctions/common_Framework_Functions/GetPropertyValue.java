package common_Framework_Functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

//End to End API automation for Knowledgeware
public class GetPropertyValue {
	String result = "";
	InputStream inputStream;
	//added for CRUD operation
	public String getPropValues(String File, String keyToSearch) throws IOException {
 
		try {
			Properties prop = new Properties();
			String propFileName = "SeleniumQTP.properties";
			inputStream = new FileInputStream(File);
			
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			
			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				if(key.equals(keyToSearch)){
					result = value;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
}
