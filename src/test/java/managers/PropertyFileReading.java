package managers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {
	
	public static String getKey(String propFile, String key) throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/propertyFiles/"+propFile+".properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty(key));
		return prop.getProperty(key);
	}
	
	

}
