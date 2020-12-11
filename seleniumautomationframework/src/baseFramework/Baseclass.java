package baseFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Parent class//
public class Baseclass {

	//webDriver driver;
	//code for properties File
	static File file;
	static Properties prop;
	static FileInputStream fip;

	public static void initialiseProp(String filepath) {

		file =new File(filepath);
		try {
			fip = new FileInputStream(file);
			prop = new Properties();
			prop.load(fip);

		}catch(FileNotFoundException e) {
			System.out.println("FileNotFound Exception in initialiseProp"+e.getMessage());

		} catch (IOException e) {
			System.out.println("FileNotFound Exception in initialiseProp"+e.getMessage());

		}
	}
	/*completed the initialization the Property file*/

	public static String readProperty(String property){
		return prop.getProperty(property);


	}






}
