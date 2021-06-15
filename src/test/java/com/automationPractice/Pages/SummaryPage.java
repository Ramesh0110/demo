package com.automationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.Library.Base;

public class SummaryPage extends Base {

	private By PCO = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	private By email = By.xpath("//input[@id='email_create']");
	private By accountCreat = By.cssSelector("#SubmitCreate");
	private By title = By.cssSelector("#id_gender2");
	private By firstNm = By.cssSelector("#customer_firstname");
	private By lastNm = By.cssSelector("#customer_lastname");
	private By passWd = By.cssSelector("#passwd");
	private By address = By.cssSelector("#address1");
	private By city = By.cssSelector("#city");
	private By zip = By.cssSelector("#postcode");
	private By mobilPhone = By.xpath(("//input[@id='phone_mobile']"));
	private By alisadd = By.cssSelector("#address_alias");
	private By register = By.cssSelector("#submitAccount");
	
	
	
	
	
	
	
	
	
	
	public SummaryPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public WebElement proceedTOChkOut() {
		return driver.findElement(PCO);
	}

	

	public WebElement sendEmail() {
		return driver.findElement(email);
	}
	public WebElement accountCreatBtn() {
		return driver.findElement(accountCreat);
	}
	public WebElement selectTitle() {
		return driver.findElement(title);
	}
	public WebElement sendFirstName() {
		return driver.findElement(firstNm);
	}
	public WebElement secondLastName() {
		return driver.findElement(lastNm);
	}
	public WebElement sendPasword() {
		return driver.findElement(passWd);
	}
	public WebElement sendAddress() {
		return driver.findElement(address);
	}
	public WebElement sendCity() {
		return driver.findElement(city);
	}
	public WebElement selectStates() {
		WebElement state = driver.findElement(By.cssSelector("#id_state"));
		Select s = new Select(state);
		s.selectByVisibleText("New Hampshire");
		return state;
	}
	public WebElement sendZip() {
		return driver.findElement(zip);
	}
	public void selectCountry() {
		WebElement country = driver.findElement(By.cssSelector("#uniform-id_country"));
		Select se1 = new Select(country);
		se1.selectByVisibleText("United States");
		return;
	}
	public WebElement sendMobileNo() {
		return driver.findElement(mobilPhone);
	}
	public WebElement sendAliasAddrs() {
		return driver.findElement(alisadd);
	}
	public WebElement clickRegister() {
		return driver.findElement(register);
	}
	
	
	
	
	
	
	
	
	
	
}
