package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FloridaBlueIndexPageObjects
{

	WebDriver driver = null;
	
	By find_a_plan_button = By.xpath("//button[contains(text(),'Find a Plan')]");

	By find_a_doctor_button = By.xpath("//div[@id='ribbon-col-2']//a[contains(text(),'Find a Doctor')]");
	
	By find_a_florida_blue_center_button = By.xpath("//html//body//div//nav//header//div//div//div//nav//section//ul//li//a[contains(text(),'Find a Florida Blue Center')]");
	
	By find_a_plan_individual_and_families_button = By.xpath("//html//body//div//nav//header//div//div//div//nav//section//ul//li//a[contains(text(),'Find a Florida Blue Center')]");
			
	By find_a_plan_medicare_button  = By.xpath("//nav//nav//li//li[2]//a[1]");
	
	By find_a_plan_businesses_button = By.xpath("//nav//nav//li//li[3]//a[1]");
	
	By login_button = By.xpath("//button[contains(text(),'Log in')]");
	
	By username_field = By.xpath("//input[@id='memberLoginUsername']");
	
	By password_field = By.xpath("//input[@id='memberLoginPassword']");
	
	By go_button = By.xpath("//a[@id='submit-validate']");
	
	
	public FloridaBlueIndexPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickFindAPlanButton()
	{
		driver.findElement(find_a_plan_button).click();
	}
	
	public void clickFindADoctorButton()
	{
		driver.findElement(find_a_doctor_button).click();	
	}
	
	public void clickFindAFloridaBlueCenterButton()
	{
		driver.findElement(find_a_florida_blue_center_button).click();
	}
	
	public void clickFindAPlanIndividualAndFamiliesButton()
	{
		driver.findElement(find_a_plan_individual_and_families_button).click();
	}
	
	public void clickFindAPlanMedicareButton()
	{
		driver.findElement(find_a_plan_medicare_button).click();
	}
	
	public void clickFindAPlanBusinessesButton()
	{
		driver.findElement(find_a_plan_businesses_button).click();
	}
	
	public void clickLoginButton()
	{
		driver.findElement(login_button).click();
	}
	
	public void typeIntoUserNameField(String inputText)
	{
		driver.findElement(username_field).sendKeys(inputText);
	}
	
	public void typeIntoPasswordField(String inputText)
	{
		driver.findElement(password_field).sendKeys(inputText);
	}
	
	public void clickGoButton()
	{
		driver.findElement(go_button).click();
	}
	
	
}
