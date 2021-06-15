package com.autpmationPractice.Test.Scripts;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.automationPractice.Library.Base;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.SummaryPage;

public class SmokeTest extends Base {
	Assertion a = new Assertion();
	final static Logger logger = Logger.getLogger(SmokeTest.class);
	@Test
	public void LandingPage_test() throws InterruptedException {

		String url = prop.getProperty("Url");
		driver.get(url);
		// Thread.sleep(3000);

		String actual = driver.getCurrentUrl();
		String expected = "http://automationpractice.com/index.php";
		a.assertEquals(actual, expected);
		logger.info(" landing page test is passed");
		HomePage hp = new HomePage(driver);
		hp.gotoGetsavingsNow().click();
		hp.gotoDresses().click();
		hp.sortBy();
		hp.selectSize().click();
		hp.selectColorblue().click();
		hp.selectColorylw().click();
		// Thread.sleep(3000);
		
//		WebDriverWait wait = new WebDriverWait(driver, 80); // initializing wait object using webdriverwait class
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]")));
//		wait.until(ExpectedConditions.presenceOfElementLocated
//				(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]")));
//		
//		Thread.sleep(5000);
//		hp.addDressToCart().click();
		hp.clickHomeBtn().click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; // it is used to scrolldown 
		js.executeScript("window.scrollBy(0,1200)");
		//hp.selectPrintedDress().click();
		hp.moreBtn().click();
		hp.selectQuntity().clear();
		//hp.selectQuntity().click();
		hp.selectQuntity().sendKeys("2");
		JavascriptExecutor js1 = (JavascriptExecutor) driver; // it is used to scrolldown 
		js1.executeScript("window.scrollBy(0,500)");
		hp.selectSizeBtn();
		hp.chooseColor().click();
		hp.AddToCartBtn().click();
		hp.proceedTOCheckOut().click();
		Thread.sleep(2000);
		
		
		SummaryPage sp = new SummaryPage(driver);
		sp.proceedTOChkOut().click();
		String emil = prop.getProperty("email");
		sp.sendEmail().sendKeys(emil);
		sp.accountCreatBtn().click();
		Thread.sleep(3000);
		sp.selectTitle().click();
		sp.sendFirstName().sendKeys("maya");
		sp.secondLastName().sendKeys("priya");
		sp.sendPasword().sendKeys("abc123");
		sp.sendAddress().sendKeys(" 23 stoneRd,03367,tj max");
		sp.sendCity().sendKeys("Manch");
		Thread.sleep(5000);
		sp.selectStates();
		Thread.sleep(5000);
		sp.sendZip().sendKeys("0410");
		Thread.sleep(5000);
		sp.selectCountry();
		Thread.sleep(5000);
		sp.sendMobileNo().click();
		sp.sendMobileNo().sendKeys("0160398765");
		Thread.sleep(5000);
		sp.sendAliasAddrs().sendKeys("54 concrd");
		Thread.sleep(10000);
		sp.clickRegister().click();
		Thread.sleep(10000);
	}
}
