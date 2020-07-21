package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FloridaBlueIndexPage;
import pages.FloridaBlueIndexPageObjects;

public class FloridaBlueLoginTest
{
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest()
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath = "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void FloridaBlueLoginTest()
	{
		String InvalidLoginConditionsUrl = "https://dms.bcbsfl.com/bcbs_login/unauthorized.jsp";
		FloridaBlueIndexPageObjects indexPageObjects = new FloridaBlueIndexPageObjects(driver); 
		driver.get("https://www.floridablue.com");
		indexPageObjects.clickLoginButton();
		indexPageObjects.typeIntoUserNameField("$#@!");
		indexPageObjects.typeIntoPasswordField("12345");
		indexPageObjects.clickGoButton();
		Assert.assertEquals(driver.getCurrentUrl(), InvalidLoginConditionsUrl);
		String actualText = driver.findElement(By.xpath("//form[@name=\"frmUnauthorized\"]/table/tbody/tr/td")).getText();
		String expectedText = "Your account does not have access to this page. Please call the customer service number on your ID card. If you would like to return to My Blue Service click here";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
