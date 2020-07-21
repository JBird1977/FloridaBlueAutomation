package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FloridaBlueIndexPage
{
	private static WebElement element = null;
	static WebDriver driver = null;
	static WebDriverWait wait=new WebDriverWait(driver, 20);
	
	public static WebElement find_a_plan_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Find a Plan')]")));
		element = driver.findElement(By.xpath("//button[contains(text(),'Find a Plan')]"));
		return element;
	}
	
	public static WebElement find_a_doctor_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ribbon-col-2']//a[contains(text(),'Find a Doctor')]")));
		element = driver.findElement(By.xpath("//div[@id='ribbon-col-2']//a[contains(text(),'Find a Doctor')]"));
		return element;
	}
	
	public static WebElement find_a_florida_blue_center_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html//body//div//nav//header//div//div//div//nav//section//ul//li//a[contains(text(),'Find a Florida Blue Center')]")));
		element = driver.findElement(By.xpath("//html//body//div//nav//header//div//div//div//nav//section//ul//li//a[contains(text(),'Find a Florida Blue Center')]"));
		return element;
	}	
	
	public static WebElement find_a_plan_individual_and_families_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body//div[@id='ribbon-col-2']//li//li[1]//a[1]")));
		element = driver.findElement(By.xpath("//body//div[@id='ribbon-col-2']//li//li[1]//a[1]"));
		return element;
	}
	
	public static WebElement find_a_plan_medicare_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav//nav//li//li[2]//a[1]))")));
		element = driver.findElement(By.xpath("//nav//nav//li//li[2]//a[1]))"));
		return element;
	}
	
	public static WebElement find_a_plan_businesses_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav//nav//li//li[3]//a[1]")));
		element = driver.findElement(By.xpath("//nav//nav//li//li[3]//a[1]"));
		return element;
	}
	
	public static WebElement login_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Log in')]")));
		element = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		return element;
	}
	
	public static WebElement username_field(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='memberLoginUsername']")));
		element = driver.findElement(By.xpath("//input[@id='memberLoginUsername']"));
		return element;
	}
	
	public static WebElement password_field(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='memberLoginPassword']")));
		element = driver.findElement(By.xpath("//input[@id='memberLoginPassword']"));
		return element;
	}
	
	public static WebElement go_button(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='submit-validate']")));
		element = driver.findElement(By.xpath("//a[@id='submit-validate']"));
		return element;
	}
	
}
