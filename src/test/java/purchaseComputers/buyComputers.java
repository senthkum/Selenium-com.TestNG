package purchaseComputers;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonFunctions.ReusableMothods;
import excelUtil.MapDataProvider;
import objectRep.Commonlinks;
import objectRep.LoginPage;
import webdriver.webDriver;

public class buyComputers
{		

	//	@Test(priority = 1)
	public void Launch() throws Exception
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.Launch();
	}
	

	@Test(dataProvider = "getDataValue")
	public void LoginPage(String UserName, String Password)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.Login(UserName, Password);
	}
	
//	@Test(priority = 3)
	public void SelectProduct(String categories, String product)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.SelectProduct(categories, product);
	}

//	@Test(priority = 3)
	public void SelectsubProduct(String subproduct)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.SelectsubProduct(subproduct);
	}

	
//	@Test(priority = 4)
	public void customerDetailsandAddToCart(String recpname, String recpemail)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.EnterUserDetails(recpname, recpemail);
	}

	public void ClickonShoppingLink()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.ClickonShoppingLink();
	}
	
	public void VerifyProductPrice(String product)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.VerifyProductPrice(product);		
	}	
	
	public void AcceptTermsandCondition()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.AcceptTermsandCondition();
	}
	
	public void BillingAddress(String address)
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.BillingAddress(address);
	}
	
	public void PaymentInformation()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.PaymentInformation();
	}
	
	public void ConfirmOrder()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.ConfirmOrder();
	}
	
	public void CaptureOrderNumber()
	{
		ReusableMothods comCode = new ReusableMothods();
		comCode.CaptureOrderNumber();
	}
		
}
