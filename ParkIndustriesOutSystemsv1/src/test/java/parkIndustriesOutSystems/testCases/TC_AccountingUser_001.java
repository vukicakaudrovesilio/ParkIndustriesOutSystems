package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.AccountingUser;
import parkIndustriesOutSystems.pageObjects.HumanResourcesUser;
import parkIndustriesOutSystems.pageObjects.LoginPage;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.ParkSupervisorUser;

public class TC_AccountingUser_001 extends BaseClass {

	@Test (priority=0)
	public void  accountingUserLogin() throws InterruptedException, IOException 
	{
		AccountingUser au= new AccountingUser(driver);
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
	
		pau.waitForPageLoaded();
		logger.info("AssociateForms login page is successfully opened");
		
		au.clickAccountingUser();
		logger.info("Logged in as: Accounting User is displayed");
		logger.info("AssociateForms Portal is successfully opened");
		
		boolean isPageHeader = psu.verifyHeaderTaskbox();
		if(isPageHeader == true) 
		{
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			logger.info("Taskbox Header is not displayed");
		}
		
		lp.clickParkAssociateUserLogout();
		logger.info("User is taken to Sign In Form");
		
	}
	
	@Test (priority=1)
	public void  accountingUser() throws InterruptedException, IOException 
	{
		HumanResourcesUser hru= new HumanResourcesUser(driver);
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		driver.get(baseURL);
		
		pau.waitForPageLoaded();
		logger.info("Login Screen is displayed");
		
		hru.clickHumanResourcesUser();
		logger.info("Logged in as: Human Resources User is displayed");
		logger.info("AssociateForms Portal is successfully opened");
		
		pau.waitForPageLoaded();
		boolean isPageHeader = psu.verifyHeaderTaskbox();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Taskbox Header is not displayed");
		}
		
	}
	
	@Test (priority=2)
	public void  myRequestsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
		boolean isPageHeader = pau.verifyHeaderMyRequests();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("My Requests Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("My Requests is not displayed");
		}
		
		pau.myRequestsClickable();	
		lp.txtAccountingUsersRequestsDisplayed();
		logger.info("Accounting User's Requests Header is displayed");
		
	}
	
	@Test (priority=3)
	public void formsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader1 = pau.verifyHeaderForms();
		if(isPageHeader1) 
		{
			Assert.assertTrue(true);
			logger.info("Forms Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Forms is not displayed");
		}
		
		pau.formsClickable();
		boolean isPageHeader2 = pau.locateDropDownForms(); 
		if(isPageHeader2 == true) 
		{
			 logger.info("Boots and Luggage Reimburesement Dropdown is displayed"); 
			 logger.info("Volunteer Forms Dropdown is displayed");
			 logger.info("SHARP Form Dropdown is displayed");
			 logger.info("Tuition Reimburesement Dropdown is displayed");
		} 
		else 
		{
			 logger.info("Forms dropdown is missing"); 
		}
		
	}

	@Test (priority=4)
	public void  goToSampleLoginHeader() throws InterruptedException, IOException 
	{
		HumanResourcesUser hru= new HumanResourcesUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderGoToSampleLogin();
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
		
		hru.clickHumanResourcesUser();
		logger.info("Logged in as: Human Resources User is displayed");
		logger.info("AssociateForms Portal is successfully opened");
		
		hru.txtHumanResourcesUser();
		logger.info("“Human Resources User” is displayed on the top right");
	}
	
	@Test (priority=5)
	public void  goToForm1() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.myRequestsClickable();
		
		pau.txtGoToFormDisplayed();
		logger.info("Go To Form: is displayed");
		
		pau.lbtnSHARPDisplayed();
		logger.info("SHARP Form Button is displayed");
		
		pau.sharpFormClickable();
		logger.info("SHARP Form is displayed");
		
		boolean isPageHeader = pau.verifyHeaderSHARP();
		if(isPageHeader == true) 
		{
			logger.info("SCHOLASTIC HONORS AND RECOGNITION PROGRAM (SHARP) is displayed");
		}
		else
		{
			logger.info("SCHOLASTIC HONORS AND RECOGNITION PROGRAM (SHARP) is not displayed");
		}
		
		pau.associateFormsPortalClickable();
		logger.info("User is taken to Associate Forms Portal Form");
	}
	
	@Test (priority=6)
	public void  goToForm2() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.myRequestsClickable();
		
		pau.lbtnVolunteerDisplayed();
		logger.info("Volunteer Form Button is displayed");
		
		pau.volunteerFormClickable();
		logger.info("Volunteer Form is displayed");
		
		boolean isPageHeader = pau.verifyHeaderVolunteer();
		if(isPageHeader == true) 
		{
			logger.info("Volunteer Tracking Form Header is displayed");
		}
		else
		{
			logger.info("Volunteer Tracking Form Header is not displayed");
		}
		
		pau.associateFormsPortalClickable();
		logger.info("User is taken to Associate Forms Portal Form");
	}
	
	@Test (priority=7)
	public void  goToForm3() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.myRequestsClickable();
		
		pau.lbtnBootsLuggageDisplayed();
		logger.info("Boots and Luggage Form Button is displayed");
		
		pau.bootsLuggageFormClickable();
		logger.info("Boots and Luggage Form is displayed");
		
		boolean isPageHeader = pau.verifyHeaderBootsLuggage();
		if(isPageHeader == true) 
		{
			logger.info("Boots & Luggage Reimbursement Form Header is displayed");
		}
		else
		{
			logger.info("Boots & Luggage Reimbursement Form Header is not displayed");
		}
		
		pau.associateFormsPortalClickable();
		logger.info("User is taken to Associate Forms Portal Form");
	}
	
	@Test (priority=8)
	public void  goToForm4() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.myRequestsClickable();
		
		pau.lbtnTuitionDisplayed();
		logger.info("Tuition Form Button is displayed");
		
		pau.tuitionFormClickable();
		logger.info("Tuition Form is displayed");
		
		boolean isPageHeader1 = pau.verifyHeaderTuition();
		if(isPageHeader1 == true) 
		{
			logger.info("Associate Initial Request for Tuition Reimbursement Form Header is displayed");
		}
		else
		{
			logger.info("Associate Initial Request for Tuition Reimbursement Form Header is not displayed");
		}
		
		pau.associateFormsPortalClickable();
		logger.info("User is taken to Associate Forms Portal Form");
		
		boolean isPageHeader2 = psu.verifyHeaderTaskbox();
		if(isPageHeader2) 
		{
			Assert.assertTrue(true);
			logger.info("Taskbox Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Taskbox Header is not displayed");
		}
	}
	
	@Test (priority=9)
	public void  searchBar() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.searchbar();
		logger.info("Search bar is displayed to the right of “Park Associate User’s Requests” header");
		
		pau.btnClearDisplayed();
		logger.info("Clear Button is displayed next to Search Bar");
		
		pau.btnClearBgColor();
		logger.info("Clear Button Background Color is displayed");
		System.out.println("Background Color is :" + pau.btnClearBgColor());
		
		pau.selectValuesSearchBar();
		logger.info("Search Options is selected");
		
		logger.info("Associate Reimbursement is displayed");
		logger.info("Final Tuition Reimbursement is displayed");
		logger.info("Initial Tuition Reimbursement is displayed");
		logger.info("SHARP is displayed");
		logger.info("Volunteer Grant is displayed");
		logger.info("Volunteer Tracking is displayed");
		
		pau.clearClickable();
		logger.info("All selected options are cleared");
		logger.info("Form Name column displays all forms");
		
	}
	
	@Test (priority=10)
	public void  allItemsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderAllItems();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("All Items Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("All Items is not displayed");
		}
		
	}
	
	@Test (priority=11)
	public void  pendingItemsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderPendingItems();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Pending Items Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Pending Items is not displayed");
		}
		
	}
	
	@Test (priority=12)
	public void  doneItemsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderDoneItems();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Done Items Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Done Items is not displayed");
		}
		
	} 
	
	@Test (priority=13)
	public void  exportFunctions1() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		psu.btnExportExcelDisplayed();
		logger.info("Export Excel Button is displayed");
		
		psu.btnExportExcelBgColor();
		logger.info("Export Excel Text Background Color is displayed");
		System.out.println("Background Color is :" + psu.btnExportExcelBgColor());
		captureScreen(driver, "ExportExcelButton");
		
	    psu.btnExportToExcel1Clickable(); 
	    logger.info("File is exported");
		
	}
	
	@Test (priority=14)
	public void  exportFunctions2() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		psu.btnExportOptionsDisplayed();
		logger.info("Export Options Button is displayed");
		
		psu.btnExportOptionsClickable();
		logger.info("Export Options Button is clicked");
		
		psu.txtExportOptionsTextDisplayed();
		logger.info("Export Options Text is displayed");
		
		psu.txtChooseADateRangeDisplayed();
		logger.info("Choose A Date Range is displayed");
		
		psu.chkboxChooseADateRangeDisplayed();
		logger.info("Choose A Date Range Checkbox is displayed");
		
	}
	
	@Test (priority=15)
	public void  exportFunctions3() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		psu.chkboxChooseADateRangeClickable();
		logger.info("Choose A Date Range Checkbox is clicked");
		
		psu.txtFromDateDisplayed();
		logger.info("From Date Text is displayed");
		
		psu.selectFromDateDisplayed();
		logger.info("From Date Field is displayed");
		
		
		WebElement dateBox1 = driver.findElement(By.xpath("//input[@id='Input_InitialDate']"));
		dateBox1.sendKeys("04082021");
		
		psu.txtToDateDisplayed();
		logger.info("To Date Text is displayed");
		
		psu.selectToDateDisplayed();
		logger.info("To Date Field is displayed");
		
		WebElement dateBox2 = driver.findElement(By.xpath("//input[@id='Input_End']"));
		dateBox2.sendKeys("04122021");
		
	}
	
	@Test (priority=16)
	public void  exportFunctions4() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		psu.btnExportToExcel2Clickable();
		logger.info("File is exported");
		
		psu.btnExportToExcelDisplayed();
		logger.info("Export To Excel is displayed");
	
	}
	
	@Test (priority=17)
	public void  exportFunctions5() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		psu.chkboxChooseADateRangeClickable();
		logger.info("\"From:\" text is not displayed");
		logger.info("From date field is not displayed");
		logger.info("\"To:\" text is not displayed");
		logger.info("To Date field is not displayed");
		
		psu.txtFilterByPickUpDisplayed();
		logger.info("\"Filter By \"Pick Up\"\" text is displayed");
		
		psu.chkboxFilterByPickUpDisplayed();
		logger.info("Checkbox button is displayed");
	}
	
	@Test (priority=18)
	public void  exportFunctions6() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		psu.chkboxFilterByPickUpClickable();
		logger.info("Checkbox is ticked");
		
		psu.btnExportToExcel2Clickable();
		logger.info("File is exported");
		
		psu.btnCloseClickable();
		logger.info("User is returned to Taskbox header form");
		
	}
	
	@Test (priority=19)
	public void  activityList() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader1 = psu.verifyHeaderActivityList();
		if(isPageHeader1 == true) 
		{
			logger.info("“Activity List” header is displayed");
		}
		else
		{
			logger.info("“Activity List” header is not displayed");
		}
		
		boolean isPageHeader2 = psu.locateActivityListColumnHeaders();
		if(isPageHeader2 == true) 
		{
			logger.info("“Case #” column is displayed");
			logger.info("“Form Name” column is displayed");
			logger.info("“Requester” column is displayed");
			logger.info("“Status” column is displayed");
			logger.info("“Activity” column is displayed");
			logger.info("“Created On” column is displayed");
			logger.info("“Assignment” column is displayed");
		}
		else
		{
			logger.info("“Activity List Column” headers are not displayed");
		}
		
	}
	
	/*
	 * @Test (priority=20) public void caseNumberColumnSorting() throws
	 * InterruptedException, IOException { ParkSupervisorUser psu= new
	 * ParkSupervisorUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); psu.txtCaseIDClickable();
	 * logger.info("Case # column is sorted"); psu.txtCase9Displayed();
	 * logger.info("Case # 9 is displayed in first row");
	 * 
	 * psu.txtCaseIDClickable(); logger.info("“Case #” column is sorted");
	 * psu.txtCase152Displayed();
	 * logger.info("Case # 152 is displayed in first row");
	 * 
	 * }
	 * 
	 * @Test (priority=21) public void requesterColumnSorting() throws
	 * InterruptedException, IOException { ParkSupervisorUser psu= new
	 * ParkSupervisorUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); psu.txtRequesterClickable();
	 * logger.info("Requester column is sorted");
	 * psu.txtRequesterJessicaDisplayed();
	 * logger.info("\"Jessica Brenny\" is displayed in first row");
	 * 
	 * psu.txtRequesterClickable(); logger.info("Requester column is sorted");
	 * psu.txtRequesterSarahDisplayed();
	 * logger.info("\"Sarah Lampert\" is displayed in first row");
	 * 
	 * }
	 * 
	 * @Test (priority=22) public void statusColumnSorting() throws
	 * InterruptedException, IOException { ParkSupervisorUser psu= new
	 * ParkSupervisorUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); psu.txtStatusClickable();
	 * logger.info("Status column is sorted");
	 * psu.txtStatusApprovedBySupervisorDisplayed();
	 * logger.info("Approved By Supervisor is displayed in first row");
	 * 
	 * psu.txtStatusClickable(); logger.info("Status column is sorted");
	 * psu.txtStatusSubmittedDisplayed();
	 * logger.info("Submitted is displayed in first row");
	 * 
	 * }
	 * 
	 * @Test (priority=23) public void createdOnColumnSorting() throws
	 * InterruptedException, IOException { ParkSupervisorUser psu= new
	 * ParkSupervisorUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); psu.txtCreatedOnClickable();
	 * logger.info("Created On column is sorted");
	 * psu.txtCreatedOn04302021Displayed();
	 * logger.info("04/30/2021 is displayed in first row");
	 * 
	 * psu.txtCreatedOnClickable(); logger.info("Created On column is sorted");
	 * psu.txtCreatedOn09202021Displayed();
	 * logger.info("09/20/2021 is displayed in first row");
	 * 
	 * }
	 * 
	 * @Test (priority=24) public void assignmentColumnSorting() throws
	 * InterruptedException, IOException { ParkSupervisorUser psu= new
	 * ParkSupervisorUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); psu.txtAssignmentClickable();
	 * logger.info("Assignment column is sorted"); psu.txtAssignmentDashDisplayed();
	 * logger.info("- is displayed in first row");
	 * 
	 * psu.txtAssignmentClickable(); logger.info("Assignment column is sorted");
	 * psu.txtAssignmentAssignedToMeDisplayed();
	 * logger.info("Assigned to me is displayed in first row");
	 * 
	 * }
	 */
	
	@Test (priority=20)
	public void  associates() throws InterruptedException, IOException 
	{
		HumanResourcesUser hru= new HumanResourcesUser(driver);
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		psu.associatesClickable();
		logger.info("\"List of All Associates\" form is displayed");

		hru.searchBarDisplayed();
		logger.info("Search bar is displayed to the right of List of All Associates header");
		
		hru.txtSearchBarDisplayed();
		logger.info("Search Bar placeholder displays \"Search by Associate Number, Name, Email\"");
		
		
	}
	
	@Test (priority=21)
	public void  associates2() throws InterruptedException, IOException 
	{
		HumanResourcesUser hru= new HumanResourcesUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		hru.search163();
		logger.info("Associate Number column displays 163");
		
		hru.clearSearchBar();
		logger.info("Form refreshes to \"List of All Associates\" display");
	}
	
	/*
	 * @Test (priority=26) public void associatesColumns1() throws
	 * InterruptedException, IOException { HumanResourcesUser hru= new
	 * HumanResourcesUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); hru.txtAssociateNumberColumnDisplayed();
	 * logger.info("\"Associate Number\" column is displayed");
	 * 
	 * hru.txtNameColumnDisplayed(); logger.info("\"Name\" column is displayed");
	 * hru.clickNameColumn(); logger.info("Name column is sorted");
	 * hru.txtNameAJGirouxDisplayed();
	 * logger.info("\"Aj Giroux\" is displayed in Name column");
	 * 
	 * hru.clickNameColumn(); logger.info("Name column is sorted");
	 * hru.txtNameTonyHerbstDisplayed();
	 * logger.info("\"Tony Herbst\" is displayed in Name column"); }
	 * 
	 * @Test (priority=27) public void associatesColumns2() throws
	 * InterruptedException, IOException { HumanResourcesUser hru= new
	 * HumanResourcesUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); hru.txtEmailColumnDisplayed();
	 * logger.info("\"Email\" column is displayed"); hru.clickEmailColumn();
	 * logger.info("Email column is sorted"); hru.txtEmail1Displayed();
	 * logger.info("\"agiroux@parkindustries.com\" is displayed in Email column");
	 * 
	 * hru.clickEmailColumn(); logger.info("Email column is sorted");
	 * hru.txtEmail2Displayed();
	 * logger.info("\"tvalenta@parkindustries.com\" is displayed in Email column");
	 * }
	 * 
	 * @Test (priority=28) public void associatesColumns3() throws
	 * InterruptedException, IOException { HumanResourcesUser hru= new
	 * HumanResourcesUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); hru.txtJobTitleColumnDisplayed();
	 * logger.info("\"Job Title\" column is displayed"); hru.clickJobTitleColumn();
	 * logger.info("Job Title column is sorted"); hru.txtJobTitle1Displayed();
	 * logger.
	 * info("\"Advanced Manufacturing Technology Manager\" is displayed in Job Title column"
	 * );
	 * 
	 * hru.clickJobTitleColumn(); logger.info("Job Title column is sorted");
	 * hru.txtJobTitle2Displayed(); logger.
	 * info("\"VP, Sales and Customer Experience\" is displayed in Job Title column"
	 * ); }
	 * 
	 * @Test (priority=29) public void associatesColumns4() throws
	 * InterruptedException, IOException { HumanResourcesUser hru= new
	 * HumanResourcesUser(driver); ParkAssociateUser pau= new
	 * ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); hru.txtSeeRequestsColumnDisplayed();
	 * logger.info("See Requests\" column is displayed"); hru.clickSearchBar();
	 * logger.info("Search Button is displayed"); hru.searchBarResultDisplayed();
	 * logger.info("\"Tony Herbst's Requests\" form is displayed"); }
	 */
	
	@Test (priority=22)
	public void  filter() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
		pau.myRequestsClickable();
		lp.txtParkSupervisorUsersRequestsDisplayed();
		logger.info("Park Supervisor User's Requests Header is displayed");
		
		pau.txtFilterDisplayed();
		logger.info("“Filter By” text is displayed");
		
		pau.btnFilterDisplayed();
		logger.info("\"Filter By\" dropdown box is displayed");
		
		pau.filterClickable();
		logger.info("Filter Button is clicked");
		
		boolean column = pau.locateFilterOptions();
		if(column == true)
		{
			logger.info("Displays filter options All, Create, Completed, Rejected and Pending correctly");
			captureScreen(driver, "FilterOptions");
		}
		else
		{
			logger.info("Filter Options is not displayed correctly");
		}
		
		pau.btnFilterPendingClicked();
		logger.info("Status column displays \"Reimbursement Pending\" selection only");
		
		pau.btnFilterCreatedClicked();
		logger.info("Status column displays \"Created\" selection in the first row");

	}
	
	@Test (priority=23)
	public void  pageMovement() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.pageSliderDisplayed();
		logger.info("Page Number Slider is displayed at the bottom right of the form");
		
		pau.totalItemsDisplayed();
		logger.info("\"1 to 3 of 3 items\" is displayed at the bottom left of the form");
		
	}
	
}
