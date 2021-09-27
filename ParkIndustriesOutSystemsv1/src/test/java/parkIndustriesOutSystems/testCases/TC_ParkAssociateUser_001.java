package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.LoginPage;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;

public class TC_ParkAssociateUser_001 extends BaseClass {

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
		
		lp.clickParkAssociateUserLogout();
		logger.info("User is taken to Sign In Form");
	}
	
	@Test (priority=1)
	public void  parkAssociateUserHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		driver.get(baseURL);
		
		pau.waitForPageLoaded();
		logger.info("Login Screen is displayed");
		
		pau.clickParkAssociateUser();
		logger.info("Logged in as: Park Associate User is displayed");
		logger.info("AssociateForms Portal is successfully opened");

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
		lp.txtParkAssociateUsersRequestsDisplayed();
		logger.info("Park Associate User's Requests Header is displayed");
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
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderGoToSampleLogin();
		if(isPageHeader==true) 
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
	}
	
	@Test (priority=5)
	public void  parkAssociateUserDetails1() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderPAUR();
		if(isPageHeader == true) 
		{
			logger.info("Park Associate User Header is displayed");
			captureScreen(driver, "ParkAssociateUser");
		}
		else
		{
			logger.info("Park Associate User Header is not displayed");
		}
		
	}
	
	@Test (priority=6)
	public void  goToForm1() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
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
	
	@Test (priority=7)
	public void  goToForm2() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
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
	
	@Test (priority=8)
	public void  goToForm3() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
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
	
	@Test (priority=9)
	public void  goToForm4() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		LoginPage lp= new LoginPage(driver);
		
		pau.lbtnTuitionDisplayed();
		logger.info("Tuition Form Button is displayed");
		
		pau.bootsLuggageFormClickable();
		logger.info("Tuition Form is displayed");
		
		boolean isPageHeader = pau.verifyHeaderBootsLuggage();
		if(isPageHeader == true) 
		{
			logger.info("Associate Initial Request for Tuition Reimbursement Form Header is displayed");
		}
		else
		{
			logger.info("Associate Initial Request for Tuition Reimbursement Form Header is not displayed");
		}
		
		pau.associateFormsPortalClickable();
		logger.info("User is taken to Associate Forms Portal Form");
		
		lp.txtParkAssociateUsersRequestsDisplayed();
		logger.info("Park Associate User's Requests Header is displayed");
	}
	
	@Test (priority=10)
	public void  searchBar1() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
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
		
		pau.waitForPageLoaded();
		pau.clearClickable();
		
	}
	
	@Test (priority=11)
	public void  searchBar2() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		pau.searchBarClickable();
		pau.selectSHARPSearchBar();
		logger.info("Search Bar displays SHARP Selection");
		logger.info("Form Name column displays SHARP selection only");
		pau.clearClickable();
	}
	
	@Test (priority=12)
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
	
	@Test (priority=13)
	public void  activeItemsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderActiveItems();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Active Items Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Active Items is not displayed");
		}
		
	}
	
	@Test (priority=14)
	public void  closedItemsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderClosedItems();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Closed Items Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Closed Items is not displayed");
		}
		
	} 
	
	@Test (priority=15)
	public void  filter() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.btnFilterDisplayed();
		logger.info("Filter Button is displayed");
		
		pau.filterClickable();
		logger.info("Filter Button is clicked");
		
		boolean column1 = pau.locateFilterOptions();
		if(column1 == true)
		{
			logger.info("Displays filter options All, Create, Completed, Rejected and Pending correctly");
			captureScreen(driver, "FilterOptions");
		}
		else
		{
			logger.info("Filter Options is not displayed correctly");
		}
		
		pau.btnFilterCreatedClicked();
		logger.info("Status Column displays Created Selections");
		
		pau.btnFilterAllClicked();
		logger.info("Status Column displays All Selection only");
		
		boolean column2 = pau.locateColumnHeaders();
		if(column2 == true)
		{
			logger.info("Case # column is displayed");
			logger.info("Form Name column is displayed");
			logger.info("Requester column is displayed");
			logger.info("Status column is displayed");
			logger.info("Created On column is displayed");
			captureScreen(driver, "ColumnHeaders");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
	}
	
	/*
	 * @Test (priority=15) public void columnTesting1() throws InterruptedException,
	 * IOException { ParkAssociateUser pau= new ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); pau.btnCaseNumberClicked(); pau.waitForPageLoaded();
	 * logger.info("Case # is sorted");
	 * 
	 * pau.waitForPageLoaded(); pau.txtCaseNumber1Displayed();
	 * logger.info("Case # 1 is displayed in first row");
	 * 
	 * pau.btnCaseNumberClicked(); pau.waitForPageLoaded();
	 * logger.info("Case # 1 is not displayed in first row");
	 * 
	 * }
	 * 
	 * @Test (priority=16) public void columnTesting2() throws InterruptedException,
	 * IOException { ParkAssociateUser pau= new ParkAssociateUser(driver);
	 * 
	 * pau.waitForPageLoaded(); pau.btnStatusClicked(); pau.waitForPageLoaded();
	 * logger.info("Status is sorted"); pau.txtStatusApprovedByHRDisplayed();
	 * logger.info("Approved By HR is displayed in first row");
	 * 
	 * pau.waitForPageLoaded(); pau.btnStatusClicked();
	 * logger.info("Status is sorted"); pau.btnStatusClicked();
	 * logger.info("Submitted is displayed in first row"); }
	 */
	
	@Test (priority=17)
	public void  pageMovement() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.pageSliderDisplayed();
		logger.info("Page Number Slider is displayed at the bottom right of the form");
		
		pau.totalItemsDisplayed();
		logger.info("\"1 to 10 of 187 items\" is displayed at the bottom left of the form");
		
		pau.pageSliderClickable();
		pau.totalItemsDisplayed();
		logger.info("\"11 to 20 of 187 items\" is displayed at the bottom left of the form");
		
	}
}
