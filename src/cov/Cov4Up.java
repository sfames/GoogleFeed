package cov;


//import static cov.BaseCOV.waitForLoaderToDisMiss;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import practice.Sendmail2;


//import static cov.BaseCOV.waitForLoaderToDisMiss;

public class Cov4Up {
	private static final String Select = null;
//	static Logger logger;
	static WebDriverWait wait;
	public static WebDriver  driver = null;
	public static final String Path_TestData = "D:\\Suresh Kadara\\Projects\\BannerBuzz\\";

	public static final String File_TestData = "Cov_crendentialsssss.xlsx";

	//-------Exelutils---------------------------------
	private static XSSFSheet ExcelWSheet;
	private static MissingCellPolicy xRow;
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "D:\\Suresh Kadara\\Projects\\BannerBuzz\\Automation\\Chrome Driver\\chromedriver.exe\\");
		
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//
//		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
//		capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
//
//		ChromeDriver driver = new ChromeDriver(capabilities);

		
		WebDriver driver=new ChromeDriver();
		wait=new WebDriverWait(driver,50 );
	//	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		logger = Logger.getLogger("Elements");
//		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();

	for(int i=2;i<=2;i++)
	{
		driver.get("https://www.coversandall.com/patio-furniture-covers/seating-covers/chair-covers/chair-cover-design-1-p");
		
//		logger.info("open the url");
//		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
//}
//		driver.findElement(By.xpath("//*[@id='newsletter_box_close']")).click();
//		logger.info("popup closed successfully");
		Thread.sleep(3000);
//		setExcelFile(Path_TestData + File_TestData,"Sheet1");
//		String domain = getCellData(i,0);		
//
//		Select dropdwn = new select();
		
		
		
		
		
		
		setExcelFile(Path_TestData + File_TestData,"Sheet1");
//		
//String paymentOption = "CreditCard";
	
	String paymentOption = getCellData(i,1);		

		if(paymentOption.equalsIgnoreCase("Yes"))
		{
		driver.findElement(By.xpath("(//*[text()='Sign In'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("test.cp3210@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.xpath("(//*[text()='Login'])[2]")).click();
		Thread.sleep(5000);
		}
// mousehover
		////wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='All Products']")));
//		Actions action = new Actions(driver);
//		 WebElement e1=driver.findElement(By.xpath("//*[@title='All Products']"));
//		    action.moveToElement(e1).build().perform();
//		    Thread.sleep(2000);

	//	if(paymentOption.equalsIgnoreCase("Yes"))
	//	{
//		    driver.findElement(By.xpath("(//a[@title='Chair Covers'])[2]")).click();
//		   waitForLoaderToDisMiss(driver);
	//	}
	//	else
	//	{
	//		driver.findElement(By.xpath("//a[contains(text(),'Chaise Covers')]")).click();
	//    Thread.sleep(5000);
	//	}
//		    WebElement quantity = driver.findElement(By.id("qty"));
//		   // driver.findElement(By.xpath("//button[@class='action-plus']")).click();
//		    quantity.click();
////		    //Thread.sleep(2000);
//		    quantity.clear();
////		   Thread.sleep(3000);
////		    
//		    quantity.sendKeys("2");
//		    quantity.sendKeys(Keys.TAB);
			//Thread.sleep(5000);
		
		//Itrating + symbol
		   
		   for(int q1=1;q1<7;q1++)
		   {
//			   JOptionPane.showConfirmDialog(null, null);
		   Thread.sleep(2000);
		   clickjavascriptelement(driver, driver.findElement(By.xpath("//*[@class='action-plus items-qty']")));
		   	
		   		try {
		   			driver.findElement(By.xpath("//*[@aria-labelledby='close-form-1']")).click();
		   			}
		   			catch(Exception e)
		   			{
			   
		   			}
		//   JOptionPane.showConfirmDialog(null, null);
		   }
			  
		
		  // waitForLoaderToDisMiss(driver);
		  Thread.sleep(2000);
		  
		    //Selecting Tie down & gromet option
//		    try {
//				WebElement el=driver.findElement(By.xpath("//select[@id='tie_down']"));
//				Thread.sleep(2000);
//				Select d=new Select(el);
//				d.selectByIndex(1);
//				}catch(Exception e) {
//					
//				}
//		    Thread.sleep(2000);
//		    
//		    try {
//				WebElement el=driver.findElement(By.xpath("//select[@id='grommets']"));
//				Thread.sleep(2000);
//				Select d=new Select(el);
//				d.selectByIndex(2);
//				}catch(Exception e) {
//					
//				}
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='product-addtocart-button']")));
		//	driver.findElement(By.xpath("//*[@id='product-addtocart-button']/span")).click();
			clickjavascriptelement(driver, driver.findElement(By.xpath("//button[@id='product-addtocart-button']")));
			//Applying Discount code
			  //waitForLoaderToDisMiss(driver);
			  Thread.sleep(5000);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='action primary checkout'])[2]"))); 
			 // JOptionPane.showConfirmDialog(null, null);
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//	driver.findElement(By.xpath("//div[@id='block-discount']/div/strong")).click();
		clickjavascriptelement(driver, driver.findElement(By.xpath("//div[@id='block-discount']/div/strong")));
			WebElement coupon = driver.findElement(By.id("coupon_code"));
			//coupon.clear();
			////div[@id='block-discount']/div/strong
			//(//*[@id='block-discount-heading'])[1]
			Thread.sleep(3000);
			coupon.click();

			coupon.sendKeys("CPCOUPONCOV");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@class='action apply primary']")).click();
			Thread.sleep(15000);
//			logger.info("coupon applied successfully");
			//driver.findElement(By.xpath("(//*[@class='action primary checkout'])[2]")).click();
			
				
			//JOptionPane.showConfirmDialog(null, null);
			//Thread.sleep(5000);
//			logger.info("coupon applied successfully");
			//waitForLoaderToDisMiss(driver);
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Proceed to Checkout')]")));
			clickjavascriptelement(driver, driver.findElement(By.xpath("//span[contains(text(),'Proceed to Checkout')]")));
			
			
//////			//checkbox
////			WebElement BSCheckbox = driver.findElement(By.xpath("//*[text()='Credit Card']"));
////		    boolean tcCheckboxIsSelected = BSCheckbox.isSelected();
////			BSCheckbox.click();
			Thread.sleep(3000);
//// ---- PAYMENT METHODs-----
//
			setExcelFile(Path_TestData + File_TestData,"Sheet1");
//				
//	String paymentOption = "CreditCard";
			
			String paymentOption1 = getCellData(i,2);		
			System.out.println("paymentOption1 "+paymentOption1);
			System.out.println("user "+paymentOption);
			if (paymentOption1.trim().equalsIgnoreCase("CreditCard"))
			{
				
		System.out.println("CreditCard option Selected");
		//shipping and billing address
		//Thread.sleep(5000);
		 waitForLoaderToDisMiss(driver);
			if(paymentOption.trim().equalsIgnoreCase("Yes"))
			{
				System.out.println("CC Yes");
			}
			else
			{
				Thread.sleep(5000);	
			WebElement emlid= driver.findElement(By.id("customer-email"));
			Thread.sleep(2000);
			emlid.sendKeys("rajesh.ray+12@commercepundit.com");
			Thread.sleep(3000);
			WebElement fname =driver.findElement(By.name("firstname"));
		    fname.clear();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	fname.sendKeys("cptestorderAutomation");
		    WebElement lname =driver.findElement(By.name("lastname"));
	    	lname.clear();
	    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			lname.sendKeys("donotprocessAutomation");
			WebElement st =driver.findElement(By.name("street[0]"));
			st.clear();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			st.sendKeys("3632 Caseys Cove");
			WebElement city =driver.findElement(By.name("city"));
			city.clear();
			city.sendKeys("Ellenwood");
			Select dropRegion = new Select(driver.findElement(By.name("region_id")));
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			dropRegion.selectByValue("19");
			Thread.sleep(3000);
			WebElement pcode =driver.findElement(By.name("postcode"));
			pcode.clear();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			pcode.sendKeys(" 30294");
			Thread.sleep(3000);
			WebElement mnum =driver.findElement(By.name("telephone"));
			mnum.clear();
			mnum.sendKeys("6352908683");
			}
		//Thread.sleep(10000);
			 waitForLoaderToDisMiss(driver);
		driver.findElement(By.xpath("//*[@class='button action continue primary']")).click();

//		driver.findElement(By.xpath("//*[normalize-space(text()) and normalize-space(.)='Payment Method:'][1]/following::label[1]")).click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(7000);
		 waitForLoaderToDisMiss(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement e=driver.findElement(By.xpath("//*[text()='Credit Card']"));
	
	    js.executeScript("arguments[0].click();", e);

	    	
	    WebElement crdrd = driver.findElement(By.xpath("(//input[@id='credit-card-number'])[1]"));
		crdrd.clear();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		setExcelFile(Path_TestData + File_TestData,"Sheet1");
	String CCno = getCellData(i,3);		
	System.out.println("CCno "+CCno);
	crdrd.sendKeys(CCno);

//		crdrd.sendKeys("4484610006074945");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='expiration'])[1]")).sendKeys("07/23");
//		Select s=new Select(driver.findElement(By.xpath("(//input[@id='credit-card-number'])[1]")));
//		//s.
//		//JOptionPane.showConfirmDialog(null, null);
//		s.selectByIndex(7);
//		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
//		Select s1=new Select(driver.findElement(By.xpath("//input[@id='credit-card-number']")));
//		//JOptionPane.showConfirmDialog(null, null);
//		s1.selectByIndex(1);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		WebElement s3=driver.findElement(By.xpath("(//*[@id='cvv'])[1]"));
		s3.clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		setExcelFile(Path_TestData + File_TestData,"Sheet1");
		String Cvv = getCellData(i,4);		
		System.out.println("Cvv "+Cvv);
		s3.sendKeys(Cvv);
		//s3.sendKeys("860");
		//JOptionPane.showConfirmDialog(null, "Verify captcha manually and click Yes button");
//		driver.findElement(By.xpath("(//*[@class='action action-toggle'])[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//*[@placeholder='Enter your comment...'])[1]")).sendKeys("test order by cp || Don't process it");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//*[text()='Place Order'])[1]")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button/span")).click();
//		 WebElement el2= driver.findElement(By.xpath("(//*[@class='action primary checkout'])[1]"));
//		 js.executeScript("arguments[0].scrollIntoView()", el2);
//		 driver.findElement(By.xpath("(//*[@class='action primary checkout'])[1]")).click();
		 if(paymentOption.trim().equalsIgnoreCase("Yes"))
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Do you have any comments regarding the order?'])[2]/following::span[2]")).click();
			
			}
			else
			{
				
		 clickjavascriptelement(driver,driver.findElement(By.xpath("(//span[text()='Do you have any comments regarding the order?'])[1]")));
		 Thread.sleep(2000);
		 
	// WebElement text= driver.findElement(By.name("comment-code"));
	// text.sendKeys("test order from cp by test automated script || Don't process it");
		 //sendKeys("test order from cp by test automated script || Don't process it,"));	
			Thread.sleep(2000);
			//JOptionPane.showConfirmDialog(null, null);
			clickjavascriptelement(driver,driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Do you have any comments regarding the order?'])[1]/following::span[3]")));
			waitForLoaderToDisMiss(driver);
			String Ordrid=driver.findElement(By.xpath("//div[@class='checkout-success']//span")).getText();
			System.out.println("order "+Ordrid);
			setExcelFile(Path_TestData + File_TestData, "Sheet1");
			//	System.out.println(Path_TestData + File_TestData);
				setCellData(Ordrid, i,6 );
				System.out.println("getdata  "+Ordrid);
							
				loginGmailaccount(Ordrid);
			
			}
		
		
	//	driver.findElement(By.xpath("//*[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button/span")).sendKeys(Keys.RETURN);
//		driver.findElement(By.xpath("(//*[text()='Place Order'])[1]")).click();
		setExcelFile(Path_TestData + File_TestData,"Sheet1");
//		
//String paymentOption = "CreditCard";
	
//	String paymentOptionpp = getCellData(1,2);		
//	System.out.println("paymentOptionpp "+paymentOptionpp);

			} 
			else if (paymentOption1.trim().equalsIgnoreCase("PayPal"))
			{
				if(paymentOption.trim().equalsIgnoreCase("Yes"))
				{
					System.out.println("Yes Paypal");
				}
				else
				{
					
				waitForLoaderToDisMiss(driver);
				//shipping and billing address
				//Thread.sleep(3000);
				WebElement emlid= driver.findElement(By.xpath("(//*[@id='customer-email'])[1]"));
				emlid.click();
				emlid.sendKeys("rajesh.ray+12@commercepundit.com");
				Thread.sleep(2000);
				WebElement fname =driver.findElement(By.name("firstname"));
			    fname.clear();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    	fname.sendKeys("cptestorderAutomation");
			    WebElement lname =driver.findElement(By.name("lastname"));
		    	lname.clear();
		    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				lname.sendKeys("DonotprocessAutomation");
				WebElement st =driver.findElement(By.name("street[0]"));
				st.clear();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				st.sendKeys("3632 Caseys Cove");
				WebElement city =driver.findElement(By.name("city"));
				city.clear();
				city.sendKeys("Ellenwood");
				Select dropRegion = new Select(driver.findElement(By.name("region_id")));
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				dropRegion.selectByValue("19");
				Thread.sleep(3000);
				WebElement pcode =driver.findElement(By.name("postcode"));
				pcode.clear();
				driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
				pcode.sendKeys(" 30294");
				Thread.sleep(3000);
				WebElement mnum =driver.findElement(By.name("telephone"));
				mnum.clear();
				mnum.sendKeys("6352908683");
				}
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@class='button action continue primary']")).click();
				waitForLoaderToDisMiss(driver);
				Thread.sleep(5000);
				JavascriptExecutor js=(JavascriptExecutor) driver;
				WebElement e2=driver.findElement(By.xpath("//span[text()='PayPal Express Checkout']"));
			    js.executeScript("arguments[0].click();", e2);
				Thread.sleep(3000);
				
//				if(paymentOption.trim().equalsIgnoreCase("Yes"))
//				{
//				
//					Thread.sleep(5000);
//					driver.findElement(By.xpath("(//*[text()='Do you have any comments regarding the order?'])[3]")).click();
//					Thread.sleep(3000);
//					driver.findElement(By.xpath("(//*[@placeholder='Enter your comment...'])[3]")).sendKeys("test order by cp || Don't process it");
//					
//				}
//				else
//				{
//					
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("(//*[text()='Do you have any comments regarding the order?'])[2]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("(//*[@placeholder='Enter your comment...'])[1]")).sendKeys("test order by cp || Don't process it");
//				}
				JOptionPane.showConfirmDialog(null, null);
				Thread.sleep(2000);
				clickjavascriptelement(driver,driver.findElement(By.xpath("(//span[text()='Continue to PayPal'])[2]")));
				//driver.findElement(By.xpath("//span[text()='Continue to PayPal']")).click();
				//Thread.sleep(10000);
				WebDriverWait wait = new WebDriverWait(driver, 100);
		
//				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='checkout-loader']/div/img")));
//				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='preloaderSpinner']/div/p[2]")));
//				Thread.sleep(5000);
////--------------------				
//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn full ng-binding']")));	
//				driver.findElement(By.xpath("//*[@class='btn full ng-binding']")).click();
//				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='preloaderSpinner']/div/p[2]")));
//				Thread.sleep(5000);
//-----------------------------				
				WebElement ui=driver.findElement(By.name("login_email"));
				ui.clear();
				setExcelFile(Path_TestData + File_TestData,"Sheet1");
			    String uid = getCellData(i,3);		
		     	System.out.println("uid "+uid);
		     	ui.sendKeys(uid);
		     	driver.findElement(By.xpath("//*[@id='btnNext']")).click();
		     	WebElement er=driver.findElement(By.name("login_password"));
				er.clear();
		     	setExcelFile(Path_TestData + File_TestData,"Sheet1");
			    String pwd = getCellData(i,4);		
		     	System.out.println("pwd "+pwd);
		     	er.sendKeys(pwd);
	    	    driver.findElement(By.xpath("//*[text()='Log In']")).click();
		     	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='preloaderSpinner']/div/p[2]")));
				Thread.sleep(10000);
				
			//	WebElement paypalbtn = driver.findElement(By.xpath("//*[text()='Pay Now']"));
			//	WebElement continupaytn = driver.findElement(By.xpath("//*[text()='Continue']"));
				WebElement paypalbtn = driver.findElement(By.xpath("(//*[text()='Continue to PayPal' or text()='Continue'])[2]"));
				if(paypalbtn.getText().equalsIgnoreCase("Pay Now"))
					
				{
					paypalbtn.click();
					System.out.println("no need to click on Paypal button");
					waitForLoaderToDisMiss(driver);
					String Ordrid=driver.findElement(By.xpath("//div[@class='checkout-success']//span")).getText();
					System.out.println("order "+Ordrid);
					setExcelFile(Path_TestData + File_TestData, "Sheet1");
					//	System.out.println(Path_TestData + File_TestData);
						setCellData(Ordrid, i,6 );
						System.out.println("getdata  "+Ordrid);
									
						loginGmailaccount(Ordrid);
				}
				else if(paypalbtn.getText().equalsIgnoreCase("Continue"))
				{
					
					System.out.println("Clicking on continue button");
					paypalbtn.click();
					System.out.println("Clicked on continue button successfully");
					Thread.sleep(10000);
					driver.findElement(By.xpath("//*[@id='confirmButtonTop']")).click();
					waitForLoaderToDisMiss(driver);
					String Ordrid=driver.findElement(By.xpath("//div[@class='checkout-success']//span")).getText();
					System.out.println("order "+Ordrid);
					setExcelFile(Path_TestData + File_TestData, "Sheet1");
					//	System.out.println(Path_TestData + File_TestData);
						setCellData(Ordrid, i,6 );
						System.out.println("getdata  "+Ordrid);
									
						loginGmailaccount(Ordrid);
				}
				
				
				else
				{
					System.out.println("neither paypal or continue is available");
				}
//				driver.findElement(By.xpath("//*[@class='btn full confirmButton continueButton']")).click();
				
			}
			else if (paymentOption1.equalsIgnoreCase("Amazonpay"))
			{
				
			Thread.sleep(5000);	
			driver.findElement(By.xpath("//*[@id='OffAmazonPaymentsWidgets0']")).click();
			Thread.sleep(5000);
			
			 String parent=driver.getWindowHandle();
			 String winHandleBefore = driver.getWindowHandle();
	         Set<String> handles =  driver.getWindowHandles();
	         for(String windowHandle  : handles)
	            {
	            if(!windowHandle.equals(parent))
	               {
	            	driver.switchTo().window(windowHandle);

			
			driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("commerce.pundit57@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("test900");
			 driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		            }
	            }
	     	Thread.sleep(5000);
	        for(String windowHandle  : handles)
            {
            if(windowHandle.equals(parent))
               {
            	driver.switchTo().window(windowHandle);
            	JavascriptExecutor js6=(JavascriptExecutor) driver; 
				WebElement e5=driver.findElement(By.xpath("//*[text()='Next']"));
				Thread.sleep(4000);
			    js6.executeScript("arguments[0].click();", e5);
			//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   Thread.sleep(10000);
//			   driver.switchTo().frame("OffAmazonPaymentsWidgets3IFrame");
//			   Thread.sleep(10000);
//			   driver.findElement(By.xpath("(//span[@class='card-number ng-binding'])[2]")).click();
//			    Thread.sleep(5000);
//			    driver.switchTo().window(windowHandle);
			    //driver.switchTo().parentFrame();
			    Thread.sleep(7000);
				driver.findElement(By.xpath("//*[text()='Do you have any comments regarding the order?']")).click();
				driver.findElement(By.name("comment-code")).sendKeys("test order from cp by test automated script || Don't process it,");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='Place Order']")).click();
	     
               }
            }
	   
	         
			}
			else if (paymentOption1.equalsIgnoreCase("Purchageorder"))
			{

				if(paymentOption.trim().equalsIgnoreCase("Yes"))
				{
					System.out.println("Yes Purchase order");
					
				}
				else
				{
							
//			
			System.out.println("POD flow");
			Thread.sleep(7000);
			 waitForLoaderToDisMiss(driver);
			WebElement emlid= driver.findElement(By.id("customer-email"));
			emlid.sendKeys("rajesh.ray+12@commercepundit.com");
			//Thread.sleep(3000);
			
			WebElement fname =driver.findElement(By.name("firstname"));
		    fname.clear();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    	fname.sendKeys("cptestorderAutomation");
		    WebElement lname =driver.findElement(By.name("lastname"));
	    	lname.clear();
	    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			lname.sendKeys("donotprocessAutomation");
			WebElement st =driver.findElement(By.name("street[0]"));
			st.clear();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			st.sendKeys("3632 Caseys Cove");
			WebElement city =driver.findElement(By.name("city"));
			city.clear();
			city.sendKeys("Ellenwood");
			Select dropRegion = new Select(driver.findElement(By.name("region_id")));
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			dropRegion.selectByValue("19");
			Thread.sleep(3000);
			WebElement pcode =driver.findElement(By.name("postcode"));
			pcode.clear();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			pcode.sendKeys(" 30294");
			Thread.sleep(3000);
			WebElement mnum =driver.findElement(By.name("telephone"));
			mnum.clear();
			mnum.sendKeys("6352908683");
				}
			//Thread.sleep(7000);
		    waitForLoaderToDisMiss(driver);
			driver.findElement(By.xpath("//*[@class='button action continue primary']")).click();
			Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			Thread.sleep(5000);
			WebElement e2=driver.findElement(By.xpath("//*[text()='Purchase Order']"));
		    js.executeScript("arguments[0].click();", e2);
//	    	
//		    Thread.sleep(3000);
//		    JavascriptExecutor js4 = (JavascriptExecutor)driver;
//		    WebElement elem =  driver.findElement(By.xpath("//*[@class='ajax-file-upload action primary action-small error-txt']"));
//		    js4.executeScript("window.scrollTo(" + elem.getLocation().x + "," +(elem.getLocation().y- 100) + ");");
//		    //driver.findElement(By.xpath("//*[@class='ajax-file-upload action primary action-small error-txt']")).click();
//		    Thread.sleep(5000);
		  //  elem.click();
		    waitForLoaderToDisMiss(driver);
		    driver.findElement(By.xpath("//input[@id='po_image_file']")).sendKeys("C:\\Users\\cp\\Desktop\\download.jpg");
		    Thread.sleep(3000);
//		    Actions actions=new Actions(driver);
//		    actions.moveToElement(driver.findElement(By.xpath("//*[@class='ajax-file-upload action primary action-small error-txt']"))).click().build().perform();
//		   //TimeUnit.SECONDS.sleep(30);
//		  Thread.sleep(3000);
//-File upload using Robot class/FW	
//			 StringSelection strSel = new StringSelection(
//					 "C:\\Users\\Maa\\Desktop\\UploadImage.png");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
//				
// 				//Create an object for robot class
//				Robot robot = new Robot();
//				//Control key in the keyboard
//				//Ctrl+V 
//				robot.keyPress(KeyEvent.VK_CONTROL);
//				robot.keyPress(KeyEvent.VK_V);
//				robot.keyRelease(KeyEvent.VK_CONTROL);
//				
//				Thread.sleep(3000);
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_ENTER);

		    
//------------------------------		    
		    WebDriverWait wait = new WebDriverWait(driver, 200);
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader']//img")));	
		   // Thread.sleep(15000);
//		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Place Order'])[3]/preceding::span[2]")).click();
////			driver.findElement(By.xpath("(//*[text()='Do you have any comments regarding the order?'])[3]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Place Order'])[3]/preceding::textarea[1]")).click();
////			driver.findElement(By.xpath("(//*[@placeholder='Enter your comment...'])[3]")).sendKeys("test order by cp || Don't process it");
//			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//*[text()='Place Order'])[2]")).click();
		    
			//driver.findElement(By.xpath("//*[@id='review-buttons-container']/div/button/span")).click();
		    clickjavascriptelement(driver,driver.findElement(By.xpath("//*[@id='review-buttons-container']/div/button/span")));
			 waitForLoaderToDisMiss(driver);
				String Ordrid=driver.findElement(By.xpath("//div[@class='checkout-success']//span")).getText();
				System.out.println("order "+Ordrid);
				setExcelFile(Path_TestData + File_TestData, "Sheet1");
				//	System.out.println(Path_TestData + File_TestData);
					setCellData(Ordrid, i,6 );
					System.out.println("getdata  "+Ordrid);
								
					loginGmailaccount(Ordrid);
				}
			
			else
			{
				System.out.println("no payment options");
				
			}
			
	}
	
	}
//				System.out.println("Paypal option Selected");
//			driver.findElement(By.xpath("//*[@id='checkout-payment-method-load']/div/div/div[3]/div[1]/label")).click();
//				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				
//				WebElement s5=driver.findElement(By.xpath("//*[@id='checkout-payment-method-load']/div/ul/li[3]/label/span"));
////				js.executeScript("arguments[0].scrollIntoView()", s5);
//				s5.click(); 
//				driver.findElement(By.name("order-comment")).sendKeys("test order by cp || Don't process it");
//				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				WebElement s4=driver.findElement(By.xpath("//*[@id='payment_section']/div[2]/ul/li[2]/div[2]/label/span"));
////				js.executeScript("arguments[0].scrollIntoView()", s4);
//				s4.click();
//				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				driver.findElement(By.xpath("//*[text()='Place Order']")).click();
//				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				driver.findElement(By.xpath("//*[@class='btn full ng-binding']")).click();
//				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				
//				WebElement ui=driver.findElement(By.name("login_email"));
//				ui.clear();
//				ui.sendKeys("nishant.shah@bannerbuzz.au");
//				
//				driver.findElement(By.name("login_password")).sendKeys("3(Parshvnath)#");
//				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				WebElement sl=driver.findElement(By.xpath("//*[@name='rememberMe']"));
//		//		js.executeScript("arguments[0].scrollIntoView()", sl);
//				
//				driver.findElement(By.xpath("//*[text()='Log In']")).click();
//				
//				
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				WebElement adc=driver.findElement(By.xpath("//*[text()='Add a debit or credit card']"));
////				js.executeScript("arguments[0].scrollIntoView()", adc);
//				driver.findElement(By.xpath("//*[text()='Continue']")).click();
//				//WebElement sh=driver.findElement(By.xpath("//*[text()='Make this my preferred shipping address']"));
//				//sh.click();
//				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				//driver.findElement(By.id("confirmButtonTop")).click();
//			}
//	    else
//	    {
//	    	System.out.println("Purchase order");
//	    }
		
	public static void waitForLoaderToDisMiss(WebDriver driver) {
		try {
		new WebDriverWait(driver, 50).until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='loading-mask' or @class='loader']"))));
		}catch (Exception e) {
			System.out.println("Loader does not exist");
		} 
	}

	public static void clickjavascriptelement(WebDriver driver, WebElement element){

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);


	}
	

	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{
		
		try{
	
			Row  = ExcelWSheet.getRow(RowNum);
	
			Cell = Row.getCell(ColNum, xRow.RETURN_BLANK_AS_NULL);

	
		if (Cell == null) {
	
			Cell = Row.createCell(ColNum);
	
			Cell.setCellValue(Result);
	
			} else {
	
				Cell.setCellValue(Result);
	
			}
	
	//Constant variables Test Data path and Test Data file name
	
				FileOutputStream fileOut = new FileOutputStream(Path_TestData + File_TestData);
	
				ExcelWBook.write(fileOut);
	
				fileOut.flush();
	
				fileOut.close();
	
			}catch(Exception e){
	
				throw (e);
	
		}
	
	}

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

			}catch (Exception e){

			return"";

			}

	}
	

	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file

		FileInputStream ExcelFile = new FileInputStream(Path);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e){

			throw (e);

		}

	}

	public static void selectvaluefromDropdown(String strlistfieldname,String strfieldvalue) throws Exception
	{
	    Thread.sleep(15000);
	    System.out.println(".//*[normalize-space(text()) and normalize-space(.)='"+strlistfieldname+"'][1]/following::div[3]");
		System.out.println(".//*[normalize-space(text()) and normalize-space(.)='"+strfieldvalue+"']");
	    driver.findElement(By.xpath(".//*[normalize-space(text()) and normalize-space(.)='"+strlistfieldname+"'][1]/following::div[3]")).click();
		Thread.sleep(5000);
	  	driver.findElement(By.xpath(".//*[normalize-space(text()) and normalize-space(.)='"+strfieldvalue+"']")).click();
	}

//	public  static void sendPlainTextEmail(String host, String port,
//            final String userName, final String password, String toAddress,
//            String subject, String message) throws AddressException,
//            MessagingException {
//
//        // sets SMTP server properties
//        Properties properties = new Properties();
//        properties.put("mail.smtp.host", host);
//        properties.put("mail.smtp.port", port);
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//// *** BEGIN CHANGE
//        properties.put("mail.smtp.user", userName);
//
//        // creates a new session, no Authenticator (will connect() later)
//        Session session = Session.getDefaultInstance(properties);
//// *** END CHANGE
//
//        // creates a new e-mail message
//        Message msg = new MimeMessage(session);
//
//        msg.setFrom(new InternetAddress(userName));
//        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
//        msg.setRecipients(Message.RecipientType.TO, toAddresses);
//        msg.setSubject(subject);
//        msg.setSentDate(new Date());
//        // set plain text message
//        msg.setText(message);
//
//// *** BEGIN CHANGE
//        // sends the e-mail
//        Transport t = session.getTransport("smtp");
//        t.connect(userName, password);
//        t.sendMessage(msg, msg.getAllRecipients());
//        t.close();
//// *** END CHANGE
//
//    }
//
//	
	public static void loginGmailaccount(String message1)
	{
        // SMTP server information

		String[] mailst = {"suresh.kadara@commercepundit.com"};
      
        
		for (int i=0;i<mailst.length;i++)
		{
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "";
        String password = "";

        // outgoing message information
        System.out.println("email "+mailst[i]);
        String mailTo= mailst[i];
        String subject = "This order ID : "+message1+" is generated by Automation Script";
        String message = "COV Order ID is "+message1;

//        Sendmail2 mailer = new Sendmail2();
//
//        try {
//            mailer.sendPlainTextEmail(host, port, mailFrom, password, mailTo,
//                    subject, message);
//            System.out.println("Email sent.");
//        } catch (Exception ex) {
//            System.out.println("Failed to sent email.");
//            ex.printStackTrace();
//        }
        }
	}
	
	
	
}



