package commonFunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import objectRep.PaymentMethod;
import webdriver.webDriver;

public class ReusableFunction extends webDriver {

	public ReusableFunction(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void clickonLink(String CategoriesName) {
		boolean strflag = false;
		List<WebElement> strTagName = driver.findElements(By.tagName("ul"));
		for (WebElement LoopTagName : strTagName) {
			if (LoopTagName.getAttribute("class").contains("list")) {
				List<WebElement> strSubTagName = driver.findElements(By.tagName("li"));
				for (WebElement LoopInnerTagName : strSubTagName) {
					if (LoopInnerTagName.getText().toLowerCase().contentEquals(CategoriesName.toLowerCase())) {
						WebElement clickOn = LoopInnerTagName.findElement(By.tagName("a"));
						clickOn.click();
						strflag = true;
						break;
					}
				}

			}
			if (strflag == true) {
				break;
			}
		}

	}

	public void modeofPayment(String mode) {
		PaymentMethod PM = new PaymentMethod(driver);

		for (int i = 0; i < PM.Billing().size(); i++) {
			String strHeader = PM.Billing().get(i).getText();
			switch(strHeader) {
			case "Billing Address":
				PM.BAContinue().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				break;

			case "Shipping Address":
				PM.SAContinue().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				break;

			case "Shipping Method":
				PM.SMContinue().click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				break;
			case "Payment Method":
				if (mode.equalsIgnoreCase("COD")) {
					PM.PMContinue().click();
					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					break;
				}
			default:
				break;
			}

		}

	}
	
	public void CloseBrowser()
	{
		driver.close();
		driver.quit();
	}
}
