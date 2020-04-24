package purchaseBooks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Importing all the Object Repo
import commonFunctions.ReusableFunction;
import commonFunctions.ReusableMothods;
import excelUtil.MapDataProvider;
import objectRep.BillingAddress;
import objectRep.CheckOut;
import objectRep.Commonlinks;
import objectRep.LoginPage;
import objectRep.PaymentInformation;
import objectRep.ProductDetails;
import webdriver.webDriver;

public class AddBook {
	
	
	@Test(priority = 1)
	public void InvokeBrowser() throws IOException {
		ReusableMothods comCode = new ReusableMothods();
		comCode.Launch();
	}

	@Test(priority = 2)
	public void LoginPage(String UserName, String Password) throws IOException 
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.Login(UserName, Password);

	}

	@Test(priority = 3)
	public void SelectProduct(String categories, String product)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.SelectProduct(categories, product);
	}

	@Test(priority = 4)
	public void customerDetailsandAddToCart(String recpname, String recpemail)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.EnterUserDetails(recpname, recpemail);
	}

	@Test(priority =5)
	public void ClickonShoppingLink()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.ClickonShoppingLink();
	}
	
	@Test(priority = 6)
	public void VerifyProductPrice(String product)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.VerifyProductPrice(product);		
	}	
	
	@Test(priority = 7)
	public void AcceptTermsandCondition()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.AcceptTermsandCondition();
	}
	
	@Test(priority = 8)
	public void BillingAddress(String address)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.BillingAddress(address);
	}
	
	@Test(priority = 9)
	public void PaymentInformation()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.PaymentInformation();
	}
	
	@Test(priority = 10)
	public void ConfirmOrder()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.ConfirmOrder();
	}
	
	@Test(priority = 11)
	public void CaptureOrderNumber()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.CaptureOrderNumber();
	}

	@AfterClass
	public void TearDown()
	{
	}
	
}
