package purchaseBooks;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webdriver.webDriver;

public class ModifyBooks extends webDriver {
    public static Logger log = LogManager.getLogger(ModifyBooks.class.getName());
		
	@BeforeTest
	public void InvokeBrowser() throws IOException
	{
		initializeDriver();
        log.info("invoke the browser");
		getUrl();
		log.info("Enteing the url");
	}
	
	@Test
	public void VerifyModifyBooks() throws IOException	
	{	

	}

	@AfterTest
	public void CloseBrowser()
	{
		driver.quit();
		driver = null;
	}
}
