package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.VolunteerForm;

public class TC_VolunteerGrants_001 extends BaseClass {

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
	public void  hRFormsHomeHeader() throws InterruptedException, IOException 
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
	public void  clickVolunteerGrants() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		vf.volunteerGrantsClickable();
		logger.info("Volunteer Grants is clicked");
		
		boolean isPageHeader = vf.verifyHeaderVolunteerGrantForm();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Volunteer Grant Form Header is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Volunteer Grant Form Header is not displayed");
		}
	}
	
	@Test (priority=9)
	public void  locateColumnHeadersVolunteerGrant() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		
		boolean column = balrf.locateColumnHeadersVolunteerGrants();
		if(column == true)
		{
			logger.info("Displays column headers correctly");
			captureScreen(driver, "VolunteerGrantColumnHeaders");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
		
		vf.volunteerGrantsCaseNumber8Clicked();
		logger.info("Volunteer Grant Form Case Number 8 is clicked");
	}
	

	@Test (priority=8)
	public void  volunteerGrantRequest() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteerGrantRequest();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Volunteer Grant Request Header is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Volunteer Grant Request Header is not displayed");
		}
	}
	
	
	@Test (priority=9)
	public void  personalInformation() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderPersonalInformation();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Personal Information Header is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Personal Information Header is not displayed");
		}
	}
	
	@Test (priority=10)
	public void  personalInformationDetails() throws InterruptedException, IOException 
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
	
	@Test (priority=11)
	public void  addComments() throws InterruptedException, IOException 
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
		
		balrf.addCommentsPlaceholder();
		logger.info("Enter Comments Placeholder is displayed");
		
		balrf.saveDisplayed();
		logger.info("Save Button is displayed");
		
		balrf.btnSaveBgColour();
		logger.info("Save Text Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnSaveBgColour());
		captureScreen(driver, "SaveButton");
	}
	
	@Test (priority=12)
	public void  volunteerGrantFormDetails1() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderVolunteerGrantFormDetails();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Volunteer Grant Form Details Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Volunteer Grant Form Details is not displayed");
		}
		
		vf.rejectedTextDisplayed();
		logger.info("Rejected Text is displayed");
		
		vf.txtRejectedBgColor();
		logger.info("Save Text Background Color is displayed");
		System.out.println("Background Color is :" + vf.txtRejectedBgColor());
		
		vf.fiscalYearDisplayed();
		vf.fiscalYearResultDisplayed();
		logger.info("Fiscal Year is displayed");
		
		vf.grantAmountDisplayed();
		vf.grantAmountResultDisplayed();
		logger.info("Grant Amount is displayed");
	}
	
	@Test (priority=13)
	public void  volunteerGrantFormDetails2() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderGuidelinesVolunteerGrantForm();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Guidelines for Completing the Volunteer Grant Application Form is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Guidelines for Completing the Volunteer Grant Application Form is not displayed");
		}
		
		vf.guidelinesDropDownClickable();
		logger.info("Guidelines Drop Down is clicked");
		
		vf.guidelinesVGDisplayed();
		logger.info("Guidelines is displayed");
	}
	
	@Test (priority=14)
	public void  associateInformation() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderAssociateInformationVG();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Associate Information VG is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Associate Information VG is not displayed");
		}
		
		vf.personalTimeVolunteeredAtOrganizationDisplayed();
		vf.personalTimeVolunteeredAtOrganizationResultDisplayed();
		logger.info("Personal Time Volunteered At Organization is displayed");
		
		vf.activitiesPerformedWhileVolunteeringDisplayed();
		vf.activitiesPerformedWhileVolunteeringResultDisplayed();
		logger.info("Activities Performed While Volunteering is displayed");
		
		vf.addressDisplayed();
		vf.addressDisplayed();
		logger.info("Address is displayed");
		
		vf.associateCityDisplayed();
		vf.associateCityResultDisplayed();
		logger.info("Associate City is displayed");
		
		vf.associateStateDisplayed();
		vf.associateStateDisplayed();
		logger.info("Associate State is displayed");
		
		vf.associateZipDisplayed();
		vf.associateZipResultDisplayed();
		logger.info("Associate Zip is displayed");
	}
	
	@Test (priority=15)
	public void  nonProfitOrganizationInformation() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderNonProfitOrganizationInformation();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Non-Profit Organization Information is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Non-Profit Organization Information is not displayed");
		}
		
		vf.checkPayableToDisplayed();
		vf.checkPayableToResultDisplayed();
		logger.info("Check Payable is displayed");
		
		vf.organizationDirectorNameDisplayed();
		vf.organizationDirectorNameResultDisplayed();
		logger.info("Organization Director's Name is displayed");
		
		vf.agencyPhoneNumberDisplayed();
		vf.agencyPhoneNumberResultDisplayed();
		logger.info("Agency Phone Number is displayed");
		
		vf.taxExemptCodeNumberDisplayed();
		vf.taxExemptCodeNumberResultDisplayed();
		logger.info("Tax Exempt Code is displayed");
		
		vf.agencyAddressDisplayed();
		vf.agencyAddressResultDisplayed();
		logger.info("Agency Address is displayed");
		
		vf.agencyCityDisplayed();
		vf.agencyCityResultDisplayed();
		logger.info("Associate City is displayed");
		
		vf.agencyStateDisplayed();
		vf.agencyStateResultDisplayed();
		logger.info("Associate State is displayed");
		
		vf.agencyZipDisplayed();
		vf.agencyZipResultDisplayed();
		logger.info("Agency Zip is displayed");
		
		vf.releaseofInformationDisplayed();
		vf.releaseofInformationResultDisplayed();
		logger.info("Release of Information is displayed");
	}
	
	@Test (priority=16)
	public void  checkRequest() throws InterruptedException, IOException 
	{
		VolunteerForm vf= new VolunteerForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = vf.verifyHeaderCheckRequest();
		if(isPageHeader == true) 
		{
			//Assert.assertTrue(true);
			logger.info("Check Request is displayed");
		}
		else
		{
			//Assert.assertTrue(false);
			logger.info("Check Request is not displayed");
		}
		
		vf.addressCRDisplayed();
		vf.addressCRResultDisplayed();
		logger.info("Address CR is displayed");
		
		vf.payableToDisplayed();
		vf.payableToResultDisplayed();
		logger.info("Payable To is displayed");
		
		vf.gLAccountNumberDisplayed();
		vf.gLAccountNumberResultDisplayed();
		logger.info("G/L Account Number is displayed");
		
		vf.uSDAmountDisplayed();
		vf.uSDAmountResultDisplayed();
		logger.info("USD Amount is displayed");
	}
}
