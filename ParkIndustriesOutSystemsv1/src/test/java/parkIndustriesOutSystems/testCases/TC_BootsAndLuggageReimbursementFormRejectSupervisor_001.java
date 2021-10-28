package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.LoginPage;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.ParkSupervisorUser;

public class TC_BootsAndLuggageReimbursementFormRejectSupervisor_001 extends BaseClass {

	@Test (priority=0)
	public void  parkAssociateUserLogin() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
	
		pau.waitForPageLoaded();
		logger.info("Login Screen is displayed");
		
		pau.clickParkAssociateUser();
		logger.info("Logged in as: Park Associate User is displayed");
		logger.info("AssociateForms Portal is successfully opened");
	
		lp.txtParkAssociateUsersRequestsDisplayed();
		logger.info("Park Associate User's Requests Header is displayed");
	}
	
	@Test (priority=1)
	public void  clickBootsandLuggageReimbursement() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.clickBootsandLuggageReimbursement();
		logger.info("Boots and Luggage Reimbursement Form is displayed");
		
	}
	
	@Test (priority=2)
	public void  bootsLuggageRequestForm() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.newRequestClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.createdDisplayed();
		logger.info("\"Created\" tag is displayed");
		
		balrf.txtNewRequestByParkAssociateUserDisplayed();
		logger.info("\"New request by Park Associate User\" text is displayed");
		
		balrf.createdDisplayed();
		logger.info("\"Created\" text is displayed");
	}
	
	@Test (priority=3)
	public void  enterDetails() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.yearInput1();
		logger.info("2021 entered");
		
		balrf.selectLuggageType();
		logger.info("Luggage is selected");
		
		balrf.enterUSDRequest();
		logger.info("value of 1 is entered");
		
		logger.info("File Selection window opens");
		
		WebElement upload = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload.sendKeys(getFile());
		logger.info("File Selected");
		logger.info("File uploaded");
	}
	
	@Test (priority=4)
	public void  saveSubmit() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.saveSubmitClickable();
		logger.info("\"Form Submitted!\" message is displayed");
	}
	
	@Test (priority=5)
	public void  bootsLuggageConfirmation() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtStatusChanged1Displayed();
		logger.info("\"Status changed\" text is displayed");
		
		balrf.txtSubmittedDisplayed();
		logger.info("\"Submitted\" text is displayed");
		
		balrf.tagSubmittedDisplayed();
		logger.info("Submitted tag is displayed");
	}
	
	@Test (priority=6)
	public void  parkSupervisorLogin() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
		pau.waitForPageLoaded();
		pau.goToSampleLoginClickable();
		logger.info("AssociateForms form is displayed");
		
		lp.clickParkSupervisorUser();
		logger.info("\"Logged in as: Park Supervisor User\" message appears");
		logger.info("Associate Forms Portal Screen is displayed");
		
		boolean isPageHeader = psu.verifyHeaderTaskbox();
		if(isPageHeader == true) 
		{
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			logger.info("Taskbox Header is not displayed");
		}
	}
	
	@Test (priority=7)
	public void  parkSupervisorRejectionProcess1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.lbtnBootsLuggageReimbursementClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		balrf.txtStatusChanged1Displayed();
		logger.info("\"Status changed\" text is displayed");
		
	}
	
	@Test (priority=8)
	public void  parkSupervisorRejectionProcess2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnRejectClickable();
		boolean isPageHeader = balrf.verifyHeaderConfirmRejection();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Confirm Rejection header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Confirm Rejection header is not displayed");
		}
	}
	
	@Test (priority=9)
	public void  parkSupervisorRejectionProcess3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtAddCommentPSDisplayed();
		logger.info("\"Add Comment\" text is displayed");
		
		balrf.inputAddCommentPSDisplayed();
		logger.info("Add Comment field is displayed");
		
		balrf.btnCancelPSDisplayed();
		logger.info("Cancel Button is displayed");
		
		balrf.btnRejectPSDisplayed();
		logger.info("Reject Button is displayed");
		
		balrf.btnCancelPSClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
	}
	
	@Test (priority=10)
	public void  parkSupervisorRejectionProcess4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnRejectClickable();
		logger.info("Confirm Rejection form is displayed");
		
		balrf.enterRejected();
		logger.info("Rejected is entered");
	}
	
	@Test (priority=11)
	public void  parkSupervisorRejectionProcess5() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.btnRejectPSClickable();
		logger.info("\"parkindustries-tst.outsystemsenterprise.com says\" \"Are you sure you want to reject this request? This action cannot be undone.\" message is displayed");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept();	
        logger.info("\"Form Rejected\" message is displayed");
	
	}
	
	@Test (priority=12)
	public void  parkSupervisorRejectionProcess6() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.tagRejectedDisplayed();
		logger.info("Rejected tag is displayed");
		
		balrf.txtStatusChangedByParkSupervisorUserDisplayed();
		logger.info("\"Status changed by Park Supervisor User\" text is displayed");
		
		balrf.txtRejectedDisplayed();
		logger.info("\"Rejected\" text is displayed");
	}
	
}
