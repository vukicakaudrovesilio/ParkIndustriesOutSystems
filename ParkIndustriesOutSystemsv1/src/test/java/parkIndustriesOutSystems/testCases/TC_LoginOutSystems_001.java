package parkIndustriesOutSystems.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import parkIndustriesOutSystems.pageObjects.LoginPage;

public class TC_LoginOutSystems_001 extends BaseClass {
	
	@Test (priority=0)
	public void  loginPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
	
		lp.implicitwait();
		logger.info("AssociateForms is successfully opened");
		
		boolean isPageHeader = lp.verifyHeader();
		if(isPageHeader == true) 
		{
			logger.info("AssociateForms Header is displayed");
		}
		else
		{
			logger.info("AssociateForms Header is not displayed");
		}
		
		lp.txtLoginAsSampleUserDisplayed();
		logger.info("Login as Sample User text is displayed");
		captureScreen(driver, "LoginScreen");
		
		lp.parkAssociateUserDisplayed();
		logger.info("Park Associate User is displayed");
		logger.info("Above Text is displayed as a link");
		
		lp.lbtnParkAssociateUserBgColour();
		logger.info("Park Associate User Backgorund Color is displayed");
		System.out.println("Link Color is :" + lp.lbtnParkAssociateUserBgColour());
		
		lp.parkSupervisorUserDisplayed();
		logger.info("Park Supervisor User is displayed");
		logger.info("Above Text is displayed as a link");
		
		lp.lbtnParkSupervisorUserBgColour();
		logger.info("Park Supervisor User Backgorund Color is displayed");
		System.out.println("Link Color is :" + lp.lbtnParkSupervisorUserBgColour());
		
		lp.humanResourcesUserDisplayed();
		logger.info("Human Resources User is displayed");
		logger.info("Above Text is displayed as a link");
		
		lp.lbtnHRUserBgColour();
		logger.info("Human Resources User Backgorund Color is displayed");
		System.out.println("Link Color is :" + lp.lbtnHRUserBgColour());
		
		lp.accountingUserDisplayed();
		logger.info("Accounting User is displayed");
		logger.info("Above Text is displayed as a link");
		
		lp.lbtnAccountingUserBgColour();
		logger.info("Accounting User Backgorund Color is displayed");
		System.out.println("Link Color is :" + lp.lbtnAccountingUserBgColour());
	
	}
	
	@Test (priority=1)
	public void  hrPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.implicitwait();
		lp.clickParkAssociateUser();
		logger.info("Park Associate User is clicked");
		
		lp.clickSampleLogin();
		logger.info("Sample Login is clicked");
	
	}
	
	@Test (priority=2)
	public void  logoutPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.implicitwait();
		lp.btnLogoutDisplayed();
		logger.info("Logout Sample User Text and Button is displayed");
		
		lp.btnLogoutBgColour();
		logger.info("Logout Sample User Text Backgorund Color is displayed");
		System.out.println("Background Color is :" + lp.btnLogoutBgColour());
		captureScreen(driver, "Logout");
		
		lp.clickLogout();
		logger.info("Logout Sample User Button is clicked");
		lp.implicitwait();
		captureScreen(driver, "Logout is not shown");
		logger.info("Logout Message is displayed");
	}
	
	@Test (priority=3)
	public void  parkAssociateUserPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.implicitwait();
		driver.get(baseURL); 
		logger.info("Login Screen is displayed");
		
		lp.clickParkAssociateUser();
		logger.info("Logged in as: Park Associate User message is displayed");
		logger.info("Associate Forms Portal Screen is displayed");
		
		lp.txtParkAssociateUsersRequestsDisplayed();
		logger.info("Park Associate User's Requests Header is displayed");
		
		lp.clickParkAssociateUserLogout();
		logger.info("User is taken to Sign In Form");
	}
	
	@Test (priority=4)
	public void  parkSupervisorUserPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.implicitwait();
		driver.get(baseURL); 
		logger.info("Login Screen is displayed");
		
		lp.clickParkSupervisorUser();
		logger.info("Logged in as: Park Supervisor User message is displayed");
		logger.info("Associate Forms Portal Screen is displayed");
		
		lp.clickMyRequest();
		lp.txtParkSupervisorUsersRequestsDisplayed();
		logger.info("Park Supervisor User's Requests Header is displayed");
		
		lp.clickParkAssociateUserLogout();
		logger.info("User is taken to Sign In Form");
	}
	
	@Test (priority=5)
	public void  humanResourcesUserPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.implicitwait();
		driver.get(baseURL); 
		logger.info("Login Screen is displayed");
		
		lp.clickHRUser();
		logger.info("Logged in as: Human Resources User message is displayed");
		logger.info("Associate Forms Portal Screen is displayed");
		
		lp.clickMyRequest();
		lp.txtHumanResourcesUsersRequestsDisplayed();
		logger.info("Human Resources User's Requests Header is displayed");
		
		lp.clickParkAssociateUserLogout();
		logger.info("User is taken to Sign In Form");
	}
	
	@Test (priority=6)
	public void  accountingUserPage() throws InterruptedException, IOException 
	{
		LoginPage lp= new LoginPage(driver);
		
		lp.implicitwait();
		driver.get(baseURL); 
		logger.info("Login Screen is displayed");
		
		lp.clickAccountingUser();
		logger.info("Logged in as: Accounting User message is displayed");
		logger.info("Associate Forms Portal Screen is displayed");
		
		lp.clickMyRequest();
		lp.txtAccountingUsersRequestsDisplayed();
		logger.info("Accounting User's Requests Header is displayed");
		
		lp.clickParkAssociateUserLogout();
		logger.info("User is taken to Sign In Form");
	}
	
	
}
