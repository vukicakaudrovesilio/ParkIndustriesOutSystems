package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;

public class TC_BootsAndLuggageReimbursementForm_002 extends BaseClass {

	@Test (priority=0)
	public void  parkAssociateUserLogin() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
	
		pau.waitForPageLoaded();
		pau.clickParkAssociateUser();

		balrf.clickBootsandLuggageReimbursement();
		balrf.newRequestClickable();
	
	}
	
	@Test (priority=1)
	public void  receiptFields9() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();	
		balrf.yearInput1();
		logger.info("2021 is displayed");
		
	}
	
	@Test (priority=2)
	public void  receiptFields10() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.selectLuggageType();
		logger.info("Luggage is selected");
	}
	
	@Test (priority=3)
	public void  receiptFields11() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.enterUSDRequest();
		logger.info("value of 5 is entered");
	}
	
	@Test (priority=4)
	public void  receiptFields12() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		logger.info("File Selection window opens");
		
		WebElement upload2 = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload2.sendKeys(getFile());
		logger.info("File is selected and uploaded successfully");
	}
	
	
	@Test (priority=5)
	public void  requestSummary2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();	
		balrf.txtLuggageDisplyed();
		logger.info("\"Luggage\" text is displayed");
		
		balrf.txtTotalRequestDisplyed();
		logger.info("\"Total requested: $5.00\" text is displayed");
		
		balrf.txtTotalApprovedDisplyed();
		logger.info("\"Total approved: $0.00 (Review Pending)\" text is displayed");

		balrf.txtCalendarYearReimbursementAllowedDisplyed();
		logger.info("\"Calendar Year Reimbursement Allowed\" text is displayed");
		
		balrf.txtAllowanceDisplyed();
		logger.info("\"$200.00 (Remaining: $30.00) text is displayed");
		
		balrf.tickDisplyed();
		logger.info("\"Tick\" is displayed");
		
		balrf.tickDisplyed();
		logger.info("\"Amount requested is under the remaining allowed amount.\" text is displayed");
	}
	
	@Test (priority=6)
	public void  saveSubmit() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.saveSubmitDisplayed();
		logger.info("Save and Submit button is displayed");
		
		balrf.btnSaveSubmitBgColour();
		logger.info("Save and Submit Button Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnSaveSubmitBgColour());
		captureScreen(driver, "SaveSubmitButton");
		
		balrf.saveSubmitClickable();
		logger.info("User is taken to Reimbursement Form Details form");
		logger.info("\"Form submitted\" message is displayed");
		
	}
	
	@Test (priority=7)
	public void  statusUpdate() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnSubmittedDisplyed();
		logger.info("Created Tag is updated to Submitted");
		
		balrf.txtAwaitingSupervisorDisplyed();
		logger.info("\"Awaiting Supervisor Review - For any questions please contact your Supervisor or the HR Team\" text is displayed");
		
		balrf.txtDateSubmittedDisplyed();
		logger.info("\"Date Submitted\" text is displayed");
		logger.info("\"MM/DD/YYYY\" Date is displayed");
		
		balrf.txtStatusChangedDisplyed();
		logger.info("\"Status changed\" text is displayed");

		balrf.txtSubmittedDisplyed();
		logger.info("\"Submitted\" text is displayed");
		
	}
	
}
