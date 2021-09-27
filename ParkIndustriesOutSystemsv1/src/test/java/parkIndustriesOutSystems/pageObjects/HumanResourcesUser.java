package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class HumanResourcesUser {

	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public HumanResourcesUser(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Human Resources User Link Button
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'Human Resources User')]")
	@CacheLookup
	WebElement lbtnHumanResourcesUser;
	
	//Human Resources User's Requests Header
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement headerHumanResourcesUserRequests;
	
	//Human Resources User Text
	@FindBy(xpath="//span[contains(.,'Human Resources User')]")
	@CacheLookup   
	WebElement txtHumanResourcesUser;
	
	//List of Associates Search Bar
	@FindBy(xpath="//input[contains(@type,'search')]")
	@CacheLookup
	WebElement searchBar;

	//List of Associates Search Bar
	@FindBy(xpath="//input[@placeholder='Search by Associate Number, Name, Email']")
	@CacheLookup
	WebElement txtSearchBar;
	
	//Associate Number Column
	@FindBy(xpath="//th[contains(.,'Associate Number')]")
	@CacheLookup
	WebElement txtAssociateNumberColumn;
	
	//Name Column
	@FindBy(xpath="//th[contains(.,'Name')]")
	@CacheLookup
	WebElement txtNameColumn;
	
	//Name AJ Giroux
	@FindBy(xpath="//span[contains(.,'AJ Giroux')]")
	@CacheLookup
	WebElement txtNameAJGiroux;
	
	//Name Tony Herbst
	@FindBy(xpath="//span[contains(.,'Tony Herbst')]")
	@CacheLookup
	WebElement txtNameTonyHerbst;
	
	//Email Column
	@FindBy(xpath="//th[contains(.,'Email')]")
	@CacheLookup
	WebElement txtEmailColumn;
	
	//Email agiroux@parkindustries.com
	@FindBy(xpath="//span[contains(.,'agiroux@parkindustries.com')]")
	@CacheLookup
	WebElement txtEmail1;
	
	//Email tvalenta@parkindustries.com
	@FindBy(xpath="//span[contains(.,'tvalenta@parkindustries.com')]")
	@CacheLookup
	WebElement txtEmail2;
	
	//Job Title Column
	@FindBy(xpath="//th[contains(.,'Job Title')]")
	@CacheLookup
	WebElement txtJobTitleColumn;
	
	//Job Title Advanced Manufacturing Technology Manager
	@FindBy(xpath="//span[contains(.,'Advanced Manufacturing Technology Manager')]")
	@CacheLookup
	WebElement txtJobTitle1;
	
	//Job Title VP, Sales and Customer Experience
	@FindBy(xpath="//span[contains(.,'VP, Sales and Customer Experience')]")
	@CacheLookup
	WebElement txtJobTitle2;
	
	//Job Title Column
	@FindBy(xpath="//th[contains(.,'See Requests')]")
	@CacheLookup
	WebElement txtSeeRequestsColumn;
	
	//Search Bar Button
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[1]/table/tbody/tr[1]/td[5]/button")
	@CacheLookup
	WebElement btnSearchBar;
	
	//Search Bar Result
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/span")
	@CacheLookup
	WebElement searchBarResult;
	
	//Click Human Resources User Link Button
	public void clickHumanResourcesUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnHumanResourcesUser);
	}
	
	//Confirm Header "Human Resources User's Requests"
	public boolean verifyHeaderHRUR()
	{
		return func.verifyElementDisplayedWithText(headerHumanResourcesUserRequests, "Human Resources User's Requests");
	}
	
	//Human Resources User Text is displayed
	public boolean txtHumanResourcesUser()
	{
		return txtHumanResourcesUser.isDisplayed();
	}
	
	//Search Bar is displayed
	public boolean searchBarDisplayed()
	{
		return searchBar.isDisplayed();
	}
	
	//Search Bar Text is displayed
	public boolean txtSearchBarDisplayed()
	{
		return txtSearchBar.isDisplayed();
	}
	
	//Enter 163 in Search Bar 
	public void search163()
	{
		searchBar.click();
		searchBar.sendKeys("163");
	}
	
	//Clear Search Bar 
	public void clearSearchBar()
	{
		searchBar.clear();
	}
	
	//Associate Number Column Text is displayed
	public boolean txtAssociateNumberColumnDisplayed()
	{
		return txtAssociateNumberColumn.isDisplayed();
	}
	
	//Name Column Text is displayed
	public boolean txtNameColumnDisplayed()
	{
		return txtNameColumn.isDisplayed();
	}
	
	//Click Name Column
	public void clickNameColumn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtNameColumn);
	}
	
	//Name AJ Giroux Text is displayed
	public boolean txtNameAJGirouxDisplayed()
	{
		return txtNameAJGiroux.isDisplayed();
	}
	
	//Name Tony Herbst Text is displayed
	public boolean txtNameTonyHerbstDisplayed()
	{
		return txtNameTonyHerbst.isDisplayed();
	}
	
	//Email Column Text is displayed
	public boolean txtEmailColumnDisplayed()
	{
		return txtEmailColumn.isDisplayed();
	}
	
	//Click Email Column
	public void clickEmailColumn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtEmailColumn);
	}
	
	//Email 1 Text is displayed
	public boolean txtEmail1Displayed()
	{
		return txtEmail1.isDisplayed();
	}
	
	//Email 2 Text is displayed
	public boolean txtEmail2Displayed()
	{
		return txtEmail2.isDisplayed();
	}
	
	//Job Title Column Text is displayed
	public boolean txtJobTitleColumnDisplayed()
	{
		return txtJobTitleColumn.isDisplayed();
	}
	
	//Click Job Title Column
	public void clickJobTitleColumn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtJobTitleColumn);
	}
	
	//Job Title 1 Text is displayed
	public boolean txtJobTitle1Displayed()
	{
		return txtJobTitle1.isDisplayed();
	}
	
	//Job Title 2 Text is displayed
	public boolean txtJobTitle2Displayed()
	{
		return txtJobTitle2.isDisplayed();
	}
	
	//See Requests Column Text is displayed
	public boolean txtSeeRequestsColumnDisplayed()
	{
		return txtSeeRequestsColumn.isDisplayed();
	}
	
	//Click Search Bar
	public void clickSearchBar()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnSearchBar);
	}
	
	//Tony Herbst's Requests Text is displayed
	public boolean searchBarResultDisplayed()
	{
		return searchBarResult.isDisplayed();
	}
}
