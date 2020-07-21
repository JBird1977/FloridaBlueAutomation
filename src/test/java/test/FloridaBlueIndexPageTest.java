package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FloridaBlueIndexPageObjects;

public class FloridaBlueIndexPageTest
{
	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		floridaBlueButtonTest();
	}
	
	public static void floridaBlueButtonTest() throws InterruptedException
	
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath = "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		FloridaBlueIndexPageObjects indexPageObjects = new FloridaBlueIndexPageObjects(driver); 
		driver.get("https://www.floridablue.com");
		
//    	indexPageObjects.clickFindADoctorButton();
//		indexPageObjects.clickFindAFloridaBlueCenterButton();

//		indexPageObjects.clickFindAPlanButton();
//		indexPageObjects.clickFindAPlanIndividualAndFamiliesButton();
		indexPageObjects.clickLoginButton();
		

		System.out.println("Test Completed Successfully");
	}
}
