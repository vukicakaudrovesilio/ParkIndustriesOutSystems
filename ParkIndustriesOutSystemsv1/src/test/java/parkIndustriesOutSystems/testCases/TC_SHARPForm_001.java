package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.BootsAndLuggageReimbursementForm;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.SHARPForm;

public class TC_SHARPForm_001 extends BaseClass {

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
	public void  clickSHARPForms() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.clickSHARPForm();
		logger.info("SHARP Form is clicked");
		
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
	public void  sharpHeader() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = sf.verifyHeaderSHARP();
		if(isPageHeader == true) 
		{
			logger.info("SHARP Header is displayed");
		}
		else
		{
			logger.info("SHARP Header is not displayed");
		}
		
	}
	
	@Test (priority=4)
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
	
	@Test (priority=5)
	public void  sharpFormsDetails1() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.txtSHARPFormMain();
		logger.info("SHARP Form Main is displayed");
		
		balrf.txtSearchBar();
		logger.info("Search Bar is displayed");
	}
	
	@Test (priority=6)
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
	
	@Test (priority=7)
	public void  sharpFormHeader() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = sf.verifyHeaderSHARPForm();
		if(isPageHeader == true) 
		{
			logger.info("SHARP Form Header is displayed");
		}
		else
		{
			logger.info("SHARP Form Header is not displayed");
		}
		
	}
	
	@Test (priority=8)
	public void  sharpFormsDetails2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();		
		boolean column = balrf.locateColumnHeadersVolunteerGrants();
		if(column == true)
		{
			logger.info("Displays column headers correctly");
			captureScreen(driver, "SHARPColumnHeaders");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
	}
	
	@Test (priority=9)
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
	
	@Test (priority=10)
	public void  newRequest2() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = sf.verifyHeaderSHARPRequest();
		if(isPageHeader == true) 
		{
			logger.info("SHARP Request Header is displayed");
		}
		else
		{
			logger.info("SHARP Request Header is not displayed");
		}
	}
	
	@Test (priority=11)
	public void  newRequest3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();	
		
		boolean isPageHeader = balrf.verifyHeaderPersonalInfo();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Personal Info Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Personal Info is not displayed");
		}
	}
	
	@Test (priority=12)
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
	
	@Test (priority=13)
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
	
	@Test (priority=14)
	public void  newRequest6() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.enterComments();
		logger.info("Comments are entered and save button is clicked");
		
		balrf.addCommentDisplayed();
		logger.info("Added Comments Timeline is displayed");
	}
	
	@Test (priority=15)
	public void  sharpFormDetails1() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = sf.verifyHeaderSHARPFormDetails();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("SHARP Form Details Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("SHARP Form Details Header is not displayed");
		}
		
		balrf.createdDisplayed();
		logger.info("Created Button is displayed");
		
		balrf.btnCreatedBgColour();
		logger.info("Created Button Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnCreatedBgColour());
		captureScreen(driver, "CreatedButton");
	}
	
	@Test (priority=16)
	public void  sharpFormDetails2() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = sf.verifyHeaderProgramOverview();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("SHARP Form Program Overview Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("SHARP Form Program Overview Header is not displayed");
		}
	}
	
	@Test (priority=17)
	public void  sharpFormDetails3() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = sf.verifyHeaderPROGRAMOVERVIEW();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("SHARP Form PROGRAM OVERVIEW Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("SHARP Form PROGRAM OVERVIEW Header is not displayed");
		}
		
		sf.txtPROGRAMOVERVIEWDisplyed();
		logger.info("PROGRAM OVERVIEW is displayed");
	}
	
	@Test (priority=17)
	public void  sharpFormDetails4() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.txtKindergartenDisplyed();
		logger.info("Kindergarten Column is displayed");
		
		sf.txtCollegeDisplyed();
		logger.info("College Column is displayed");
		
		sf.txtHighHonorsDisplyed();
		logger.info("High Honors Column is displayed");
		
		sf.txtSuperiorMarksDisplyed();
		logger.info("Superior Marks Column is displayed");
		
		sf.txtExcellentMarksDisplyed();
		logger.info("Excellent Marks Column is displayed");
		
		sf.txtImprovementInGPADisplyed();
		logger.info("Improvement In GPA Column is displayed");
		
		sf.txtKindergartenPrice1Displyed();
		logger.info("$40.00 Column for Kindergarten is displayed");
		
		sf.txtKindergartenPrice2Displyed();
		logger.info("$25.00 Column for Kindergarten is displayed");
		
		sf.txtKindergartenPrice3Displyed();
		logger.info("$20.00 Column for Kindergarten is displayed");
		
		sf.txtKindergartenPrice4Displyed();
		logger.info("$20.00 Column for Kindergarten is displayed");
		
		sf.txtKindergartenPrice5Displyed();
		logger.info("$15.00 Column for Kindergarten is displayed");
		
		sf.txtCollegePrice1Displyed();
		logger.info("$100.00 Column for College is displayed");
		
		sf.txtCollegePrice2Displyed();
		logger.info("$75.00 Column for College is displayed");
		
		sf.txtCollegePrice3Displyed();
		logger.info("$50.00 Column for College is displayed");
		
		sf.txtCollegePrice4Displyed();
		logger.info("$50.00 Column for College is displayed");

		sf.txtCollegePrice5Displyed();
		logger.info("$40.00 Column for College is displayed");
		
		sf.txtIncludingMarksDisplyed();
		logger.info("Including Marks is displayed");
	}
	
	@Test (priority=18)
	public void  sharpFormDetails5() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = sf.verifyHeaderPROGRAMDETAILS();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("SHARP Form PROGRAM DETAILS Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("SHARP Form PROGRAM DETAILS Header is not displayed");
		}
		
		sf.txtPROGRAMDETAILSDisplyed();
		logger.info("PROGRAM DETAILS TEXT is displayed");
	}
	
	@Test (priority=19)
	public void  sharpFormDetails6() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.deleteRequestDisplayed();
		logger.info("Delete Request is displayed");
		
		balrf.deleteRequestClickable();
		logger.info("Delete is clicked");
		
		//Switching to Alert        
        Alert alert = driver.switchTo().alert();
        //Accepting alert		
        alert.accept();	
		
		balrf.newRequestClickable();
		logger.info("New Request Button is clicked again");
	}
	
	@Test (priority=20)
	public void  sharpFormDetails7() throws InterruptedException, IOException 
	{
		SHARPForm sf= new SHARPForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		sf.txtStudentNameDisplyed();
		logger.info("Student Name field is displayed");
		
		sf.txtStudentAddressDisplyed();
		logger.info("Student Address field is displayed");
		
		sf.clickYearInSchoolDropDown();
		logger.info("Year In School dropdown is clicked and displayed");
		
		sf.locateYearInSchoolOptions();
		logger.info("Year In School Options is displayed");
		
		sf.clickAwardDropDown();
		logger.info("Award dropdown is clicked and displayed");
		
		sf.locateAwardOptions();
		logger.info("Award Options is displayed");
		
		sf.clickAwardPeriodDropDown();
		logger.info("Award Period dropdown is clicked and displayed");
		
		sf.locateAwardPeriodOptions();
		logger.info("Award Period Options is displayed");
		
		sf.clickRelationshipDropDown();
		logger.info("Relationship dropdown is clicked and displayed");
		
		sf.locateRelationshipOptions();
		logger.info("Relationship Options is displayed");
		
		sf.inputSchoolDisplyed();
		logger.info("School field is displayed");
		
		
	}
	
	
}
    
                                