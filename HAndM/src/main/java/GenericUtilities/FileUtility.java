package GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {

	public String file(String Key) throws Throwable
	{
		FileInputStream f = new FileInputStream("./src/test/resources/CommonData.properties");
		Properties prop = new Properties();
		prop.load(f);
		String value = prop.getProperty(Key);
		return value;
	}
}
