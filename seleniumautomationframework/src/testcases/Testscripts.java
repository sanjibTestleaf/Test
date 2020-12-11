package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseFramework.Baseclass;

public class Testscripts {

	//	public static void main(String Args[]){
	//
	//		String filepath = System.getProperty("user.dir")+"//src//config//config.properties";
	//		Baseclass.initialiseProp(filepath);
	//		Baseclass.readProperty("ApplicationURL");
	//		System.out.println(	"Property Read:"+Baseclass.readProperty("ApplicationURL"));
	//	}


	@Test // Test Method //
	public void readpropertyTest() {

		String filepath = System.getProperty("user.dir")+"//src//config//config.properties";
		Baseclass.initialiseProp(filepath);
		Baseclass.readProperty("ApplicationURL");
		System.out.println(	"Property Read:"+Baseclass.readProperty("ApplicationURL"));
		System.out.println("In Test");

	}

	//TestNG-Annotations

	// Run a Test case, login to a website, 
	// Pre-Requisite : Libraries, Selenium-Java language bnding/selenium/selenium sandalone server,chromeDriver

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("In before Test");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In before Method");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("In After Test");
	}
	@AfterMethod
	public void afterMethod() 
	{System.out.println("In After Method");}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("In beforeSuite ");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("In AfterSuite");
	}

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("In beforeclass ");
	}
	@AfterSuite
	public void afterclass()
	{
		System.out.println("In AfterClass");
	}
}
