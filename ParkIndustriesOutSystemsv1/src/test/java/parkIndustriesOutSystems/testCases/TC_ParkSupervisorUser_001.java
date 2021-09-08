package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import parkIndustriesOutSystems.pageObjects.ParkAssociateUser;
import parkIndustriesOutSystems.pageObjects.ParkSupervisorUser;

public class TC_ParkSupervisorUser_001 extends BaseClass {

	@Test (priority=0)
	public void  parkSupervisorUserLogin() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
	
		pau.waitForPageLoaded();
		logger.info("AssociateForms login page is successfully opened");
		
		psu.clickParkSupervisorUser();
		logger.info("Park Supervisor User is clicked");
		
	}
	
	@Test (priority=1)
	public void  parkSupervisorUserHeader() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		pau.myRequestsClickable();
		logger.info("My Requests is clicked");
		
		boolean isPageHeader = psu.verifyHeaderPSUR();
		if(isPageHeader == true) 
		{
			logger.info("Park Supervisor User Header is displayed");
			captureScreen(driver, "ParkSupervisorUser");
		}
		else
		{
			logger.info("Park Supervisor User Header is not displayed");
		}
	}
	
	@Test (priority=2)
	public void  taskboxHeader() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
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
	
	@Test (priority=3)
	public void  associatesHeader() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		boolean isPageHeader = psu.verifyHeaderAssociates();
		if(isPageHeader == true) 
		{
			logger.info("Associates Header is displayed");
		}
		else
		{
			logger.info("Associates Header is not displayed");
		}
		
	}
	
	@Test (priority=4)
	public void  myRequestsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
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
		
	}
	
	@Test (priority=5)
	public void formsHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderForms();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Forms Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Forms is not displayed");
		}
		
	}
	
	@Test (priority=6)
	public void  goToSampleLoginHeader() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		boolean isPageHeader = pau.verifyHeaderGoToSampleLogin();
		if(isPageHeader) 
		{
			Assert.assertTrue(true);
			logger.info("Go To Sample Login Header is displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Go To SampleLogin is not displayed");
		}
		
	}
	
	@Test (priority=7)
	public void  parkSupervisorUserDetails1() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.imgParkHRDisplayed();
		logger.info("AssociateForms Logo is displayed");
		
		psu.txtParkSupervisorUser();
		logger.info("Park Supervisor User Text is displayed");
		
		pau.btnClearDisplayed();
		logger.info("Clear Button is displayed");
		
		pau.btnClearBgColor();
		logger.info("Clear Text Background Color is displayed");
		System.out.println("Background Color is :" + pau.btnClearBgColor());
		captureScreen(driver, "ClearButton");
		
		pau.searchbar();
		logger.info("Search Bar is displayed");
		
		pau.selectValuesSearchBar();
		logger.info("Search Options is selected");
		
		pau.clearClickable();
		logger.info("Clear Button is clicked");
	}
	
	@Test (priority=8)
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
	
	@Test (priority=9)
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
	
	@Test (priority=10)
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
	
	@Test (priority=11)
	public void  parkSupervisorUserDetails2() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.btnFilterDisplayed();
		logger.info("Filter Button is displayed");
		
		pau.filterClickable();
		logger.info("Filter Button is clicked");
		
		boolean column1 = pau.locateFilterOptions();
		if(column1 == true)
		{
			logger.info("Displays filter options correctly");
			captureScreen(driver, "FilterOptions");
		}
		else
		{
			logger.info("Filter Options is not displayed correctly");
		}
		
		boolean column2 = pau.locateColumnHeaders();
		if(column2 == true)
		{
			logger.info("Displays column headers correctly");
			captureScreen(driver, "ColumnHeaders");
		}
		else
		{
			logger.info("Column headers are not displayed correctly");
		}
	}
	
	@Test (priority=12)
	public void  parkSupervisorTaskbox() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		psu.taskboxClickable();
		logger.info("Taskbox is clicked");
		
		boolean isPageHeader = psu.locateTaskboxTitle(); 
		if(isPageHeader == true) 
		{
			 logger.info("Taskbox is displayed correctly");
			 captureScreen(driver, "Taskbox");
		} 
		else 
		{
			 logger.info("Taskbox is missing"); 
		}
		
	}
	
	@Test (priority=13)
	public void  exportFunctions() throws InterruptedException, IOException 
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
		
		psu.chkboxChooseADateRangeClickable();
		logger.info("Choose A Date Range Checkbox is clicked");
		
		psu.txtFromDateDisplayed();
		logger.info("From Date Text is displayed");
		
		psu.selectFromDateDisplayed();
		logger.info("From Date Field is displayed");
		
		psu.txtToDateDisplayed();
		logger.info("To Date Text is displayed");
		
		psu.selectToDateDisplayed();
		logger.info("To Date Field is displayed");
		
		psu.btnExportToExcelDisplayed();
		logger.info("Export To Excel is displayed");
		
		psu.btnCloseDisplayed();
		logger.info("Close is displayed");
		
		psu.btnCloseClickable();
		logger.info("Close is clicked");
	}
	
	
	@Test (priority=14)
	public void  parkSupervisorUserRequests() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		pau.myRequestsClickable();
		logger.info("My Requests is clicked");
		
		boolean isPageHeader = pau.locateMyRequests(); 
		if(isPageHeader) 
		{
			 Assert.assertTrue(true);
			 logger.info("My Requests is displayed correctly");
			 captureScreen(driver, "MyRequests");
		} 
		else 
		{
			 Assert.assertTrue(true);
			 logger.info("My Requests is missing"); 
		}
		
	}
	
	@Test (priority=15)
	public void  parkSupervisorForms() throws InterruptedException, IOException 
	{
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		
		pau.formsClickable();
		logger.info("Forms is clicked");
		
		boolean isPageHeader = pau.locateDropDownForms(); 
		if(isPageHeader == true) 
		{
			 logger.info("Forms dropdown is displayed correctly"); 
		} 
		else 
		{
			 logger.info("Forms dropdown is missing"); 
		}
	}
	
	@Test (priority=16)
	public void  hrFormsSignIn() throws InterruptedException, IOException 
	{
		ParkSupervisorUser psu= new ParkSupervisorUser(driver);
		ParkAssociateUser pau= new ParkAssociateUser(driver);
		
		pau.waitForPageLoaded();
		
		pau.goToSampleLoginClickable();
		logger.info("Go To Sample Login is clicked");
		
		pau.locateLoginasSampleUser();
		logger.info("Login as Sample User is displayed");
		
		psu.clickParkSupervisorUser();
		logger.info("Park Supervisor User is clicked");
		
		pau.iconParkAssociateUserClickable();
		logger.info("Park Supervisor User Icon is clicked");
		
		pau.hrFormsSignIn();
		logger.info("Associates Forms Sign In Page is displayed");
		captureScreen(driver, "AssociatesFormsSignIn");
	}
	
}