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

public class TC_BootsAndLuggageReimbursementForm_001 extends BaseClass {

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
	public void  associateReimbursementFormHeader1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementForm();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Boots & Luggage Reimbursement Form Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Boots & Luggage Reimbursement Form is not displayed");
		}
		
	}
	
	@Test (priority=3)
	public void  bootsLuggageReimbursementHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.txtBootsLuggageReimbursementMain();
		if(isPageHeader == true) 
		{
			logger.info("Boots & Luggage Reimbursement is displayed on the top left");
		}
		else
		{
			logger.info("Boots & Luggage Reimbursement is not displayed on the top left");
		}
		
	}
	
	@Test (priority=4)
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
	
	@Test (priority=5)
	public void  associateFormsPortal() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
		pau.waitForPageLoaded();
		pau.associateFormsPortalClickable();
		logger.info("User is taken to Associate Forms Portal Form");
		
		boolean isPageHeader = lp.txtParkAssociateUsersRequestsDisplayed();
		if(isPageHeader == true) 
		{
			logger.info("Park Associate User's Requests Header is displayed");
		}
		else
		{
			logger.info("Park Associate User's Requests Header is not displayed");
		}
		
	}
	
	@Test (priority=6)
	public void  associateReimbursementFormHeader2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.clickBootsandLuggageReimbursement();
		logger.info("Boots and Luggage Reimbursement Form is displayed");
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementForm();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Boots & Luggage Reimbursement Form Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Boots & Luggage Reimbursement Form is not displayed");
		}
		
	}
	
	
	
	@Test (priority=7)
	public void  goToSampleLoginHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
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
		
		pau.goToSampleLoginClickable();
		logger.info("User is taken to AssociateForms Form");
		
		pau.locateLoginasSampleUser();
		logger.info("Login as Sample User is displayed");
		
		pau.clickParkAssociateUser();
		logger.info("Logged in as: Park Associate User is displayed");
		logger.info("AssociateForms Portal is successfully opened");
		
		lp.txtParkAssociateUsersRequestsDisplayed();
		logger.info("Park Associate User's Requests Header is displayed");
		
	}
	
	@Test (priority=8)
	public void  goToForms2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.clickBootsandLuggageReimbursement();
		logger.info("Boots & Luggage Reimbursement form is displayed");
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderRequestList();
		if(isPageHeader == true) 
		{
			logger.info("“Request List” header is displayed on the top left");
		}
		else
		{
			logger.info("“Request List” header is not displayed on the top left");
		}
		
	}
	
	@Test (priority=9)
	public void  bootsLuggageReimbursementDetails1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtSearchBar();
		logger.info("Search bar is displayed to the right of “Request List” header");
		
		balrf.txtSearchByCaseNumberDisplayed();
		logger.info("Placeholder text Search by Case# is displayed");
		
		balrf.searchNesh();
		balrf.txtSearchNoResultsDisplyed();
		logger.info("No items to show text is displayed");
		balrf.clearSearch();
		
		balrf.searchCaseNumber35();
		balrf.txtSearchCaseNumber35Displyed();
		logger.info("Case # 35 is displayed");
		balrf.clearSearch();
		logger.info("All results are displayed");
		
		balrf.clickBootsandLuggageReimbursement();
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
			logger.info("New Request Button is displayed correctly");
			captureScreen(driver, "NewRequest");
		}
		else
		{
			logger.info("New Request Button is not displayed");
		}
		
		balrf.btnNewRequestBgColor();
		logger.info("New Request Text Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnNewRequestBgColor());
		captureScreen(driver, "NewRequest");
		
	}
	
	@Test (priority=11)
	public void  associateReimbursementFormHeader3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementForm();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Boots & Luggage Reimbursement Form Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Boots & Luggage Reimbursement Form is not displayed");
		}
		
	}
	
	/*
	 * @Test (priority=12) public void formsColumnCaseNumber() throws
	 * InterruptedException, IOException { BootsAndLuggageReimbursementForm balrf=
	 * new BootsAndLuggageReimbursementForm(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); balrf.caseNumberClickable();
	 * logger.info("“Case #” column is displayed");
	 * logger.info("Case # column is sorted"); balrf.caseNumber4Displayed();
	 * logger.info("Case # 4 is displayed in first row");
	 * 
	 * balrf.caseNumberClickable(); logger.info("“Case #” column is displayed");
	 * logger.info("Case # column is sorted");
	 * logger.info("Case # 4 is not displayed in first row"); }
	 * 
	 * @Test (priority=13) public void formsColumnAssociate() throws
	 * InterruptedException, IOException { BootsAndLuggageReimbursementForm balrf=
	 * new BootsAndLuggageReimbursementForm(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); balrf.associateClickable();
	 * logger.info("“Associate” column is displayed");
	 * logger.info("Associate column is sorted");
	 * balrf.parkAssociateUserDisplayed();
	 * logger.info("Park Associate User is displayed in first row");
	 * 
	 * balrf.associateClickable(); logger.info("“Associate” column is displayed");
	 * logger.info("Associate column is sorted");
	 * balrf.parkAssociateUserDisplayed();
	 * logger.info("Park Associate User is displayed in first row"); }
	 * 
	 * @Test (priority=14) public void formsColumnAssociateNumber() throws
	 * InterruptedException, IOException { BootsAndLuggageReimbursementForm balrf=
	 * new BootsAndLuggageReimbursementForm(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); balrf.associateNumberClickable();
	 * logger.info("“Associate #” column is displayed");
	 * logger.info("Associate # column is sorted");
	 * balrf.associateNumber8888888Displayed();
	 * logger.info("8888888 is displayed in first row");
	 * 
	 * balrf.associateClickable(); logger.info("“Associate #” column is displayed");
	 * logger.info("Associate # column is sorted");
	 * balrf.associateNumber8888888Displayed();
	 * logger.info("8888888 is displayed in first row"); }
	 * 
	 * @Test (priority=15) public void formsColumnDepartment() throws
	 * InterruptedException, IOException { BootsAndLuggageReimbursementForm balrf=
	 * new BootsAndLuggageReimbursementForm(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); balrf.departmentClickable();
	 * logger.info("“Department” column is displayed");
	 * logger.info("Department column is sorted");
	 * balrf.associateNumber8888888Displayed();
	 * logger.info("SS Customer Service FS FS is displayed in first row");
	 * 
	 * balrf.departmentClickable(); logger.info("“Department” column is displayed");
	 * logger.info("Department column is sorted");
	 * balrf.associateNumber8888888Displayed();
	 * logger.info("SS Customer Service FS FS is displayed in first row"); }
	 * 
	 * @Test (priority=16) public void formsColumnStatus() throws
	 * InterruptedException, IOException { BootsAndLuggageReimbursementForm balrf=
	 * new BootsAndLuggageReimbursementForm(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); balrf.statusClickable();
	 * logger.info("“Status” column is displayed");
	 * logger.info("Status column is sorted"); balrf.statusApprovedByHRDisplyed();
	 * logger.info("Created is displayed in first row");
	 * 
	 * balrf.statusClickable(); logger.info("“Status” column is displayed");
	 * logger.info("Status column is sorted"); balrf.statusSubmittedDisplyed();
	 * logger.info("Submitted is displayed in first row"); }
	 * 
	 * @Test (priority=17) public void formsColumnDateSubmitted() throws
	 * InterruptedException, IOException { BootsAndLuggageReimbursementForm balrf=
	 * new BootsAndLuggageReimbursementForm(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); balrf.dateSubmittedClickable();
	 * logger.info("“Date Submitted” column is displayed");
	 * logger.info("Date Submitted column is sorted");
	 * balrf.txtDate04222021Displyed();
	 * logger.info("04/22/2021 is displayed in first row");
	 * 
	 * balrf.dateSubmittedClickable();
	 * logger.info("“Date Submitted” column is displayed");
	 * logger.info("Date Submitted column is sorted");
	 * balrf.dateSubmitted09092021Displyed();
	 * logger.info("09/09/2021 is displayed in first row"); }
	 * 
	 * @Test (priority=18) public void formsColumnYear() throws
	 * InterruptedException, IOException { BootsAndLuggageReimbursementForm balrf=
	 * new BootsAndLuggageReimbursementForm(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); balrf.yearClickable();
	 * logger.info("“Year” column is displayed");
	 * logger.info("Year column is sorted"); balrf.yearSorted1Displyed();
	 * logger.info("\"-\" is displayed in first row");
	 * 
	 * balrf.yearClickable(); logger.info("“Year” column is displayed");
	 * logger.info("Year column is sorted"); balrf.yearSorted2Displyed();
	 * logger.info("2021 is displayed in first row"); }
	 */
	
	@Test (priority=19)
	public void  pageMovement() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		//ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		balrf.pageSliderDisplayed();
		logger.info("Page Number Slider is displayed at the bottom right of the form");
		
		balrf.totalItemsDisplayed();
		logger.info("\"1 to 10 of 47 items\" is displayed at the bottom left of the form");
		
		balrf.pageSliderClickable();
		balrf.totalItemsDisplayed();
		logger.info("\"11 to 20 of 47 items\" is displayed at the bottom left of the form");
		
	}
	
	@Test (priority=20)
	public void  bootsLuggageRequestForm1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.newRequestClickable();
		logger.info("Boots & Luggage Reimbursement Request form is displayed");
		
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementRequest();
		if(isPageHeader == true) 
		{
			logger.info("Boots & Luggage Reimbursement Request Header is displayed");
		}
		else
		{
			logger.info("Boots & Luggage Reimbursement Request is not displayed");
		}
	}
	
	@Test (priority=21)
	public void  personalInfoHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();	
		
		boolean isPageHeader = balrf.verifyHeaderPersonalInfo();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("“Personal Info” header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("“Personal Info” header is not displayed");
		}
	}
	
	@Test (priority=22)
	public void  personalInfoDetails() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.txtEmployeeNumberDisplayed();
		logger.info("“Employee Number” text is displayed");
		
		balrf.employeeNumberDisplayed();
		logger.info("\"8888888\" is displayed as Employee Number");
		
		balrf.txtAssociateNameDisplayed();
		logger.info("“Associate Name” text is displayed");
		
		balrf.associateNameDisplayed();
		logger.info("\"Park Associate User\" is displayed as Associate Name");
		
		balrf.txtDepartmentDisplayed();
		logger.info("“Department” text is displayed");
		
		balrf.departmentDisplayed();
		logger.info("\"SS Customer Service FS FS\" is displayed as Department");
	}
	
	@Test (priority=23)
	public void  addCommentHeader() throws InterruptedException, IOException 
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
		logger.info("“Enter your comments here…” placeholder text is displayed");
		
		balrf.saveDisplayed();
		logger.info("Save Button is displayed");
		
		balrf.btnSaveBgColour();
		logger.info("Save Text Background Color is displayed");
		System.out.println("Background Color is :" + balrf.btnSaveBgColour());
		captureScreen(driver, "SaveButton");
	}
	
	@Test (priority=24)
	public void  enterCommentDetails() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.enterComments();
		logger.info("Text is entered");
		
		balrf.saveClickable();
		logger.info("\"Comment added\" message is displayed");
		
		balrf.addCommentDisplayed();
		logger.info("Timeline is updated below the Save button");
		
		balrf.txtParkAssociateUserCommentsDisplayed();
		logger.info("\"Park Associate User\" text is displayed");
		
		balrf.txtCommentDisplayed();
		logger.info("\"Comment\" text is displayed");
		
		balrf.txtTestDisplayed();
		logger.info("\"test\" text is displayed");
	}
	
	@Test (priority=25)
	public void  bootsLuggageReimbursementForm1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderReimbursementFormDetails();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Reimbursement Form Details Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Reimbursement Form Details Header is not displayed");
		}
		
		balrf.createdDisplayed();
		logger.info("\"Created\" tag is displayed");
		
		balrf.btnCreatedBgColour();
		logger.info("Tag background is of color #2652AF");
		System.out.println("Background Color is :" + balrf.btnCreatedBgColour());
		captureScreen(driver, "CreatedButton");
	}
	
	@Test (priority=26)
	public void  deleteRequest() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.deleteRequestDisplayed();
		logger.info("\"Created\" tag is displayed");
		
		balrf.txtCaseNumberDisplayed();
		logger.info("\"Case #\" text is displayed next to Created Tag");
		
		balrf.deleteRequestDisplayed();
		logger.info("\"Delete Request\" link is displayed to the right");
		
		balrf.btnCreatedBgColour();
		logger.info("link color is of #EE3224");
		System.out.println("Delete Request Link Color is :" + balrf.btnCreatedBgColour());
		captureScreen(driver, "DeleteRequest");
		
		balrf.deleteRequestClickable();
		logger.info("Message pop-up appears");
		
		//Switching to Alert        
        Alert alert1 = driver.switchTo().alert();
        //Accepting alert		
        alert1.dismiss();	
        logger.info("User is taken back to \"Boots & Luggage Reimbursement Request\" header form");
		
        balrf.deleteRequestClickable();
		logger.info("Message pop-up appears");
		
		//Switching to Alert        
        Alert alert2 = driver.switchTo().alert();
        //Accepting alert		
        alert2.accept();	
        logger.info("User is taken back to \"Request List\" header form");
		
	}
	
	@Test (priority=27)
	public void  newRequest() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.newRequestClickable();
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementRequest();
		if(isPageHeader == true) 
		{
			logger.info("Boots & Luggage Reimbursement Request form is displayed");
		}
		else
		{
			logger.info("Boots & Luggage Reimbursement Request form is not displayed");
		}
	}
	
	@Test (priority=28)
	public void  bootsLuggagePolicy() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementPolicy();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("“Boots & Luggage Reimbursement Policy” header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("“Boots & Luggage Reimbursement Policy” header is not displayed");
		}
		
		balrf.bootsLuggageReimbursementPolicyDisplayed();
		logger.info("“Park Industries provides safety Personal Protective Equipment (PPE) to all associates as required by OSHA 1910 requirements. Shop associates, installers and field service associates must wear ANSI approved (OSHA Z41 or Z41.1 approved) steel-toe footwear.” text is displayed");
		
	}
	
	@Test (priority=29)
	public void  calenderYearReimbursementAllowedHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderCalendarYearReimbursementAllowed();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("“Calendar Year Reimbursement Allowed” header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("“Calendar Year Reimbursement Allowed” header is not displayed");
		}
		
	}
	
	@Test (priority=30)
	public void  bootsHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBoots();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("“Boots:” header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("“Boots:” header is not displayed");
		}
		
		balrf.bootsPolicyDisplayed();
		logger.info("“• $400.00 annually: Large Machine, Plasma/Flame, Paint, Blast, Maintenance, Installation and Field Service • $200.00 annually: All other departments” text is displayed");
		
		balrf.policyNoteDisplayed();
		logger.info("“***Park does not reimburse for orthotics.” Text is displayed");
	}
	
	@Test (priority=31)
	public void  luggageHeader() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderLuggage();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("“Boots:” header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("“Boots:” header is not displayed");
		}
		
		balrf.luggagePolicyDisplayed();
		logger.info("“• $200.00 annually for Installers and Field Service only” text is displayed");
	
	}
	

	@Test (priority=32)
	public void  yearFields() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.yearDisplayed();
		logger.info("“Year” text is displayed");
		
		balrf.yearInputDisplayed();
		logger.info("Year field is displayed");
		
	}
	
	@Test (priority=33)
	public void  receiptFields1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderReceipt();
		if(isPageHeader == true) 
		{
			logger.info("“Receipts” text is displayed");
		}
		else
		{
			logger.info("“Receipts” text is not displayed");
		}
		
		balrf.addReceiptDisplayed();
		logger.info("\"Add New Receipt\" text is displayed");
		
	}
	
	@Test (priority=34)
	public void  receiptFields2() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.receiptTypeDisplayed();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("“Receipt Type” text is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("“Receipt Type” text is not displayed");
		}
		
		balrf.ddReceiptTypeDisplayed();
		logger.info("“Receipt Type” field is displayed");
		
		balrf.bootsLuggageOptionsDisplayed();
		logger.info(" “Boots” and “Luggage” options are displayed");
		
	}
	
	@Test (priority=35)
	public void  receiptFields3() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.uSDRequestedDisplayed();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("“USD Requested” text is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("“USD Requested” text is not displayed");
		}
		
		balrf.uSDRequestedInputDisplayed();
		logger.info("“USD Requested” field is displayed");
		
		balrf.addReceiptDisplayed();
		logger.info("Add Receipt button is displayed");
	}
	
	@Test (priority=36)
	public void  requestSummary1() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderRequestSummary();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("“Request Summary” header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("“Request Summary” header is not displayed");
		}
		
		balrf.txtRequestSummaryDisplayed();
		logger.info("\"(The request is currently empty)\" text is displayed");
		
		balrf.addReceiptDisplayed();
		logger.info("Add Receipt button is displayed");
		
		balrf.backClickable();
		logger.info("Back Button is displayed");
		logger.info("User is taken to Request List Form");
		
		balrf.newRequestClickable();
	}
	
	@Test (priority=37)
	public void  receiptFields4() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = balrf.verifyHeaderBootsLuggageReimbursementRequest();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Boots & Luggage Reimbursement Request form is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Boots & Luggage Reimbursement Request form is not displayed");
		}
		
		balrf.yearInput1();
		logger.info("2021 is displayed");
		
		balrf.selectLuggageType();
		logger.info("Luggage is selected");
		
		balrf.enterUSDRequest();
		logger.info("value of 5 is entered");
		
		//balrf.btnAddReceiptClickable();
		logger.info("File Selection window opens");
		
		WebElement upload = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
		upload.sendKeys("C:\\LuggageReceipt.jpg");
		logger.info("File is selected and uploaded successfully");
		
	}
	
	@Test (priority=38)
	public void  receiptFields5() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.editPenDisplyed();
		logger.info("Edit Pen Icon is displayed");
		
		balrf.trashCanDisplyed();
		logger.info("Trashcan Symbol is displayed");
		
		balrf.editPenClickable();
		balrf.floppyDiskDisplyed();
		logger.info("Floppy Disk icon is displayed");
		
		balrf.antiClockwiseArrowCircleDisplyed();
		logger.info("AntiClockwise Arrow Circle Icon is displayed");
		
		balrf.txtReceiptTypeEdit();
		logger.info("Receipt Type field becomes editable");
		
		balrf.txtUSDRequestedEdit();
		logger.info("USD Requested field becomes editable");
		
	}
	
	@Test (priority=39)
	public void  receiptFields6() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.floppyDiskClickable();
		logger.info("\"Receipt updated\" message is displayed");
		
	}
	
	@Test (priority=40)
	public void  receiptFields7() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.editPenClickable();
		balrf.floppyDiskDisplyed();
		logger.info("Floppy Disk icon is displayed");
		
		balrf.antiClockwiseArrowCircleDisplyed();
		logger.info("AntiClockwise Arrow Circle Icon is displayed");
		
		balrf.txtReceiptTypeEdit();
		logger.info("Receipt Type field becomes editable");
		
		balrf.txtUSDRequestedEdit();
		logger.info("USD Requested field becomes editable");
	}
	
	@Test (priority=41)
	public void  receiptFields8() throws InterruptedException, IOException 
	{
		BootsAndLuggageReimbursementForm balrf= new BootsAndLuggageReimbursementForm(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		balrf.trashCanClickable();
		logger.info("\"Deleting receipt\" message is displayed");
		logger.info("\"Receipt deleted.\" message is displayed");
	}
	
}
