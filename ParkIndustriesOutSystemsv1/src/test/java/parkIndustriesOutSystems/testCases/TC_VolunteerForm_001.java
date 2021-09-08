package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.VolunteerForm;

public class TC_VolunteerForm_001 extends BaseClass {

	@Test (priority=0)
	public void  parkAssociateUserLogin() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
	
		pau.waitForPageLoaded();
		logger.info("HRForms login page is successfully opened");
		
		pau.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
	
	}
	
	@Test (priority=1)
	public void  clickVolunteerForms() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.clickVolunteerForm();
		logger.info("Volunteer Form is clicked");
		
	}
	
	@Test (priority=2)
	public void  associateFormsHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderAssociateFormsPortal();
		if(isPageHeader == true) 
		{
			logger.info("Associate Forms Portal Header is displayed");
		}
		else
		{
			logger.info("Associate Forms Portal Header is not displayed");
		}
		
	}
	
	@Test (priority=3)
	public void  volunteerTrackingHeader() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteerTracking();
		if(isPageHeader == true) 
		{
			logger.info("Volunteer Tracking is displayed");
		}
		else
		{
			logger.info("Volunteer Tracking is not displayed");
		}
		
	}
	
	@Test (priority=4)
	public void  volunteerGrantsHeader() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteerGrants();
		if(isPageHeader == true) 
		{
			logger.info("Volunteer Grants is displayed");
		}
		else
		{
			logger.info("Volunteer Grants is not displayed");
		}
		
	}
	
	@Test (priority=5)
	public void  goToSampleLoginHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderGoToSampleLogin();
		if(isPageHeader == true) 
		{
			logger.info("Go To Sample Login Header is displayed");
		}
		else
		{
			logger.info("Go To Sample Login is not displayed");
		}
		
	}
	
	@Test (priority=6)
	public void  volunteerFormsDetails1() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.txtVolunteerFormMain();
		logger.info("Volunteer Form Main is displayed");
		
		balrf.txtSearchBar();
		logger.info("Search Bar is displayed");
	}
	
	@Test (priority=7)
	public void  requestListHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderRequestList();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Request List Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Request List Header is not displayed");
		}
		
	}
	
	@Test (priority=8)
	public void  volunteerFormHeader() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteerForms();
		if(isPageHeader == true) 
		{
			logger.info("Volunteer Form Header is displayed");
		}
		else
		{
			logger.info("Volunteer Form is Header not displayed");
		}
		
	}
	
	@Test (priority=9)
	public void  volunteerFormsDetails2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();		
		boolean column = balrf.locateColumnHeaders();
		if(column == true)
		{
			logger.info("Displays column headers correctly");
			captureScreen(driver, "VolunteerFormColumnHeaders");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
	}
	
	@Test (priority=10)
	public void  newRequest1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();		
		boolean newRequest = balrf.btnNewRequestDisplayed();
		if(newRequest == true)
		{
			logger.info("New Request is displayed correctly");
			captureScreen(driver, "NewRequest");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
		
		balrf.btnNewRequestBgColor();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnNewRequestBgColor());
		captureScreen(driver, "NewRequest");
		
		balrf.newRequestClickable();
		logger.info("New Request is clicked");
	}
	
	@Test (priority=11)
	public void  newRequest2() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteerTrackingRequest();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Volunteer Tracking Request Header is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Volunteer Tracking Request is not displayed");
		}
	}
	
	@Test (priority=12)
	public void  newRequest3() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();	
		
		boolean isPageHeader = vf.verifyHeaderAssociateInformation();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Associate Information Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Associate Information Header is not displayed");
		}
	}
	
	@Test (priority=13)
	public void  newRequest4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtEmployeeNumberDisplayed();
		logger.info("Employee Number Text is displayed");
		
		balrf.employeeNumberDisplayed();
		logger.info("Employee Number is displayed");
		
		balrf.txtAssociateNameDisplayed();
		logger.info("Associate Name Text is displayed");
		
		balrf.associateNameDisplayed();
		logger.info("Associate Name is displayed");
		
		balrf.txtDepartmentDisplayed();
		logger.info("Department Text is displayed");
		
		balrf.departmentDisplayed();
		logger.info("Department is displayed");
		
	}
	
	@Test (priority=14)
	public void  newRequest5() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyAddComment();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Add Comment Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Add Comment is not displayed");
		}
		
		balrf.addCommentDisplayed();
		logger.info("Enter Comments Field Text is displayed");
		
		balrf.saveDisplayed();
		logger.info("Save Button is displayed");
		
		balrf.btnSaveBgColour();
		logger.info("Save Text Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnSaveBgColour());
		captureScreen(driver, "SaveButton");
	}
	
	@Test (priority=15)
	public void  newRequest6() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.enterComments();
		logger.info("Comments are entered and save button is clicked");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept();	
		
		balrf.addCommentDisplayed();
		logger.info("Added Comments Timeline is displayed");
	}
	
	@Test (priority=16)
	public void  volunteerForm1() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteerTrackingFormDetails();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Volunteer Tracking Form Details is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Volunteer Tracking Form Details is not displayed");
		}
		
		balrf.createdDisplayed();
		logger.info("Created Button is displayed");
		
		balrf.btnCreatedBgColour();
		logger.info("Created Button Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnCreatedBgColour());
		captureScreen(driver, "CreatedButton");
	}
	
	@Test (priority=17)
	public void  volunteerForm2() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderGuidelinesforCompletingtheForm();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Guidelines for Completing the Form Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Guidelines for Completing the Form Header is not displayed");
		}
		
		vf.txtGuidelinesforCompletingtheForm();
		logger.info("Guidelines for Completing the Form Text is displayed");
	}
	
	@Test (priority=18)
	public void  volunteerForm3() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.addAgencyCommitteeClickable();
		logger.info("Add Agency Committee Button is clicked");
		
		vf.closeClickable();
		logger.info("Close Button is clicked");
		
		vf.backClickable();
		logger.info("Back Button is clicked");
		
		balrf.newRequestClickable();
		logger.info("New Request Button is clicked again");
	}
	
	@Test (priority=19)
	public void  volunteerForm4() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderFiscalYear();
		if(isPageHeader == true) 
		{
			logger.info("Fiscal Year Header is displayed");
		}
		else
		{
			logger.info("Fiscal Year Header is not displayed");
		}
		
		vf.fiscalYearInput();
		logger.info("Fiscal Year Header is entered");
	}
	
	@Test (priority=20)
	public void  volunteerForm5() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteeringQuarter();
		if(isPageHeader == true) 
		{
			logger.info("Volunteering Quarter Header is displayed");
		}
		else
		{
			logger.info("Volunteering Quarter is not displayed");
		}
		
		vf.volunteeringQuarterClickable();
		logger.info("Voluteering Quarter Drop Down Button is clicked");
		
		vf.locateVoluteeringQuarterOptions();
		logger.info("Volunteering Quarter Options is displayed");
		
		vf.volunteeringQuarterClickable();
		logger.info("Fourth Quarter Option is clicked");
	}
	
	@Test (priority=21)
	public void  volunteerForm6() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.addAgencyCommitteeClickable();
		logger.info("Add Agency Committe Button is clicked and displayed");
		
		boolean isPageHeader = vf.verifyHeaderAgencyOrParkIndustriesCommittee();
		if(isPageHeader == true) 
		{
			logger.info("Agency Or Park Industries Committee Header is displayed");
		}
		else
		{
			logger.info("Agency Or Park Industries Committee is not displayed");
		}
		
		vf.agencyOrParkIndustriesCommitteeInput();
		logger.info("Agency Or Park Industries Committee is entered");
	}
	
	@Test (priority=22)
	public void  volunteerForm7() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteeringActivity();
		if(isPageHeader == true) 
		{
			logger.info("Volunteering Activity Header is displayed");
		}
		else
		{
			logger.info("Volunteering Activity is not displayed");
		}
		
		vf.volunteeringActivityInput();
		logger.info("Volunteering Activity is entered");
	}
	
	@Test (priority=23)
	public void  volunteerForm8() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderDateStart();
		if(isPageHeader == true) 
		{
			logger.info("Date Start Header is displayed");
		}
		else
		{
			logger.info("Date Start is not displayed");
		}
		
		vf.dateStartInput();
		logger.info("Date Start is entered");
	}
	
	@Test (priority=24)
	public void  volunteerForm9() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderDateEnd();
		if(isPageHeader == true) 
		{
			logger.info("Date End Header is displayed");
		}
		else
		{
			logger.info("Date End is not displayed");
		}
		
		vf.dateEndInput();
		logger.info("Date End is entered");
	}
	
	@Test (priority=25)
	public void  volunteerForm10() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderCompanyTimeHours();
		if(isPageHeader == true) 
		{
			logger.info("Company Time Hours Header is displayed");
		}
		else
		{
			logger.info("Company Time Hours is not displayed");
		}
		
		vf.companyTimeHoursInput();
		logger.info("Company Time Hours is entered");
	}
	
	@Test (priority=26)
	public void  volunteerForm11() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderPersonalTimeHours();
		if(isPageHeader == true) 
		{
			logger.info("Personal Time Hours Header is displayed");
		}
		else
		{
			logger.info("Personal Time Hours is not displayed");
		}
		
		vf.personalTimeHoursInput();
		logger.info("Personal Time Hours is entered");
	}
	
	@Test (priority=27)
	public void  volunteerForm12() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.btnSaveClosetBgColour();
		logger.info("Save Submit Text Background Color is displayed");
		System.out.println("Background Color is :" + vf.btnSaveClosetBgColour());
		captureScreen(driver, "SaveSubmit");
		
		vf.saveCloseClickable();
		logger.info("Save and Close Button is clicked");
		
		boolean isPageHeader = vf.verifyHeaderAgencyCommittee();
		if(isPageHeader == true) 
		{
			logger.info("Agency Committee Header is displayed");
		}
		else
		{
			logger.info("Agency Committee is not displayed");
		}	
	}
	
	@Test (priority=28)
	public void  volunteerForm13() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderDates();
		if(isPageHeader == true) 
		{
			logger.info("Dates Header is displayed");
		}
		else
		{
			logger.info("Dates Header is not displayed");
		}
	}
	
	@Test (priority=29)
	public void  volunteerForm14() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderHours();
		if(isPageHeader == true) 
		{
			logger.info("Hours Header is displayed");
		}
		else
		{
			logger.info("Hours Header is not displayed");
		}
		
		vf.btnSaveSubmitBgColor();
		logger.info("Save Submit Text Background Color is displayed");
		System.out.println("Background Color is :" + vf.btnSaveSubmitBgColor());
		captureScreen(driver, "SaveSubmit");
		
		vf.saveSubmitClickable();
		logger.info("Save and Submit Button is clicked");
	}
	
	
}
