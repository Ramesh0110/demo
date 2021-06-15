package com.automationPractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.automationPractice.Library.Base;

public class HomePage extends Base {

	//public WebDriver driver;

	private By getSave = By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[1]");
	// private By sortBy = By.xpath("//select[@id='selectProductSort']");
	private By size = By.xpath("//input[@id='layered_id_attribute_group_1']");
	private By colorblue = By.xpath("//input[@id='layered_id_attribute_group_14']");
	private By yellowclr = By.xpath("//input[@id='layered_id_attribute_group_16']");
	private By addCart = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]");
	private By homebtn = By.xpath("//a[@class='home']");
	private By quantity = By.cssSelector("#quantity_wanted");
	// private By quantity = By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]");

	private By color = By.xpath("//a[@id='color_16']");
	private By addToCart = By.cssSelector("#add_to_cart");
	private By proccedToCkOut = By.xpath("//a[@title='Proceed to checkout']");
	
	
	

	public HomePage(WebDriver driver) { // constructor
		this.driver = driver;
	}

	public WebElement gotoGetsavingsNow() {
		return driver.findElement(getSave);

	}

	public WebElement gotoDresses() throws InterruptedException {
		WebElement dress = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"));
		WebElement summerDress = driver
				.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(dress).build().perform();
		Thread.sleep(3000);
		action.moveToElement(summerDress).build().perform();
		return summerDress;
	}

	public WebElement sortBy() {
		WebElement sortBy = driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		Select sortdrpdn = new Select(sortBy);
		sortdrpdn.selectByIndex(2);
		return sortBy;
	}

	public WebElement selectSize() {
		return driver.findElement(size);
	}

	public WebElement selectColorblue() {
		return driver.findElement(colorblue);
	}

	public WebElement selectColorylw() {
		return driver.findElement(yellowclr);
	}

	public WebElement addDressToCart() {
		return driver.findElement(addCart);
	}

	public WebElement clickHomeBtn() {
		return driver.findElement(homebtn);
	}

	public WebElement moreBtn() {
		WebElement moveD = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[6]/div/div[1]/div/a[1]/img"));
		WebElement morebt = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[2]/span"));
		Actions act = new Actions(driver);
		act.moveToElement(moveD).build().perform();
		act.moveToElement(morebt).build().perform();
		return morebt;
	}

	public WebElement selectQuntity() {
		return driver.findElement(quantity);
	}

	public WebElement selectSizeBtn() {
		WebElement sizeBtn = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select se = new Select(sizeBtn);
		se.selectByValue("1");
		return sizeBtn;

	}

	public WebElement chooseColor() {
		return driver.findElement(color);
	}
	
	public WebElement AddToCartBtn() {
		return driver.findElement(addToCart);
	}
	
	public WebElement proceedTOCheckOut() {
		return driver.findElement(proccedToCkOut);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

} // closing tag
