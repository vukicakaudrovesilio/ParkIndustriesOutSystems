  package parkIndustriesOutSystems.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import parkIndustriesOutSystems.common.WebElementFunctions;

public class ParkAssociateUser {
	
	WebDriver ldriver;
	WebElementFunctions func = new WebElementFunctions();
	
	public ParkAssociateUser(WebDriver rdriver) //a constructor; ldriver = local driver, rdriver = remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	//Park Associate User Link Button
	@FindBy(xpath="//span[@class='OSFillParent'][contains(.,'Park Associate User')]")
	@CacheLookup
	WebElement lbtnParkAssociateUser;
	
	//Park Associate User's Requests Header
	@FindBy(xpath="//div[@id='b1-b1-Title']")
	@CacheLookup
	WebElement headerParkAssociateUserRequests;
	
	//My Requests Header
	@FindBy(xpath="//a[contains(.,'My Requests')]")
	@CacheLookup   
	WebElement headerMyRequests;
	
	//Forms Header
	@FindBy(xpath="//span[@class='padding-bottom-base'][contains(.,'Forms')]")
	@CacheLookup
	WebElement headerForms;

	//Go To Sample Login Header
	@FindBy(xpath="//a[@class='margin-left-base'][contains(.,'Go To Sample Login')]")
	@CacheLookup
	WebElement headerGoToSampleLogin;
	
	//Park Theme Image on Park Associate User
	@FindBy(xpath="//img[contains(@class,'app-logo')]")
	@CacheLookup
	WebElement imgParkHR;
	
	//Park Associate User Text
	@FindBy(xpath="(//span[contains(.,'Park Associate User')])[1]")
	@CacheLookup
	WebElement txtParkAssociateUser;
	
	//Clear Button
	@FindBy(xpath="//button[contains(.,'Clear')]")
	@CacheLookup
	WebElement btnClear;
	
	//Park Associate User Search Box
	@FindBy(xpath="//input[@placeholder='Search']")
	@CacheLookup
	WebElement txtSearchBox;
	
	//Park Associate User Search Box Option 1
	@FindBy(xpath="//div[@data-value='a6e3d096-f2d5-4e7b-be56-d2fdabe3db0a']")
	@CacheLookup
	WebElement txtSearchOption1;
	
	//Park Associate User Search Box Option 2
	@FindBy(xpath="//div[@data-value='a6e3d096-f2d5-4e7b-be56-d2fdabe3db0a']")
	@CacheLookup
	WebElement txtSearchOption2;
	
	//Park Associate User Search Box Option 3
	@FindBy(xpath="//div[@data-value='8c16952c-c4b9-4c3f-a6c6-c532dfec8e9d']")
	@CacheLookup
	WebElement txtSearchOption3;
		
	//Park Associate User Search Box Option 4
	@FindBy(xpath="//div[@data-value='eb8d2a29-a65f-45ea-a0c0-061f74770006']")
	@CacheLookup
	WebElement txtSearchOption4;
		
	//Park Associate User Search Box Option 5
	@FindBy(xpath="//div[@data-value='8464ea29-973d-417c-bcb0-bfe953ed7cc5']")
	@CacheLookup
	WebElement txtSearchOption5;
		
	//Park Associate User Search Box Option 6
	@FindBy(xpath="//div[@data-value='fcc1d1a3-927a-4b5d-ac91-e9478f923395']")
	@CacheLookup
	WebElement txtSearchOption6;
	
	//Park Associate User All Items
	@FindBy(xpath="//span[contains(.,'All Items')]")
	@CacheLookup
	WebElement headerAllItems;
	
	//Park Associate User Pending Items
	@FindBy(xpath="//span[contains(.,'Pending Items')]")
	@CacheLookup
	WebElement headerPendingItems;
	
	//Park Associate User Active Items
	@FindBy(xpath="//span[@class='font-size-base text-neutral-8'][contains(.,'Active Items')]")
	@CacheLookup
	WebElement headerActiveItems;
	
	//Park Associate User Closed Items
	@FindBy(xpath="//span[@class='font-size-base text-neutral-8'][contains(.,'Closed Items')]")
	@CacheLookup
	WebElement headerClosedItems;
	
	//Park Associate User Done Items
	@FindBy(xpath="//span[contains(.,'Done Items')]")
	@CacheLookup
	WebElement headerDoneItems;
	
	//Park Associate User Filter Text
	@FindBy(xpath="(//div[contains(.,'Filter By')])[14]")
	@CacheLookup   
	WebElement txtFilter;
	
	//Park Associate User Filter Button
	@FindBy(xpath="//select[contains(@class,'dropdown-display dropdown')]")
	@CacheLookup   
	WebElement btnFilter;
	
	//Park Associate User Filter Option All
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[2]/select/option[2]")
	@CacheLookup
	WebElement btnFilterAll;
	
	//Park Associate User Filter Option Created
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[2]/select/option[3]")
	@CacheLookup
	WebElement btnFilterCreated;
	
	//Park Associate User Filter Option Completed
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[2]/select/option[4]")
	@CacheLookup
	WebElement btnFilterCompleted;
		
	//Park Associate User Filter Option Rejected
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[2]/select/option[5]")
	@CacheLookup
	WebElement btnFilterRejected;
		
	//Park Associate User Filter Option Pending
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div[1]/div[2]/select/option[6]")
	@CacheLookup
	WebElement btnFilterPending;
	
	//Park Associate Case ID Column
	@FindBy(xpath="//th[@class='sortable'][contains(.,'Case #')]")
	@CacheLookup
	WebElement txtCaseID;
		
	//Park Associate User Form Name Column
	@FindBy(xpath="//th[contains(.,'Form Name')]")
	@CacheLookup
	WebElement txtFormName;
		
	//Park Associate User Requester Column 
	@FindBy(xpath="//th[contains(.,'Requester')]")
	@CacheLookup
	WebElement txtRequester;
		
	//Park Associate User Status Column
	@FindBy(xpath="//th[contains(.,'Status')]")
	@CacheLookup
	WebElement txtStatus;
	
	//Park Associate User Created On Column
	@FindBy(xpath="//th[contains(.,'Created On')]")
	@CacheLookup
	WebElement txtCreatedOn;
	
	//Park Associate User My Requests Title
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter active'][contains(.,'My Requests')]")
	@CacheLookup
	WebElement pageMyRequestsTitle;
	
	//Park Associate User Forms "Boots and Luggage Reimbursement"
	@FindBy(xpath="//a[contains(.,'Boots & Luggage Reimbursement')]")
	@CacheLookup
	WebElement bootsandluggageReimbursement;
	
	//Park Associate User Forms "Volunteer Forms"
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter'][contains(.,'Volunteer Forms')]")
	@CacheLookup
	WebElement volunteerForms;
		
	//Park Associate User Forms "SHARP Forms"
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter'][contains(.,'SHARP Form')]")
	@CacheLookup
	WebElement sharpForms;
		
	//Park Associate User Forms "Tuition Reimbursement Forms"
	@FindBy(xpath="//a[@class='ThemeGrid_MarginGutter'][contains(.,'Tuition Reimbursement Forms')]")
	@CacheLookup
	WebElement tuitionReimbursementForms;
	
	//Login as Sample User
	@FindBy(xpath="//span[contains(.,'Login as Sample User')]")
	@CacheLookup
	WebElement txtLoginasSampleUser;
	
	//Login as Sample User
	@FindBy(xpath="//i[contains(@class,'icon fa fa-sign-out fa-1x')]")
	@CacheLookup
	WebElement iconParkAssociateUser;

	//Login as Sample User
	@FindBy(xpath="//span[@class='heading1'][contains(.,'Sign In')]")
	@CacheLookup
	WebElement txtHRFormsSignIn;
	
	//Go To Form Text
	@FindBy(xpath="//div[@class='ph card card-content'][contains(.,'Go to Form:SHARPVolunteer FormsBoots & Luggage ReimbursementTuition Reimbursement')]")
	@CacheLookup
	WebElement txtGoToForm;
	
	//SHARP Form Link Button
	@FindBy(xpath="//button[contains(.,'SHARP')]")
	@CacheLookup
	WebElement lbtnSHARP;
	
	//SHARP Form Header
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div[1]/div")
	@CacheLookup
	WebElement headerSHARP;
	
	//Volunteer Form Link Button
	@FindBy(xpath="//button[contains(.,'Volunteer Forms')]")
	@CacheLookup
	WebElement lbtnVolunteer;
	
	//Volunteer Form Header
	@FindBy(xpath="//div[@class='heading3 text-align-center'][contains(.,'Volunteer Tracking Form')]")
	@CacheLookup
	WebElement headerVolunteer;
		
	//Boots and Luggage Reimbursement Form Link Button
	@FindBy(xpath="//button[contains(.,'Boots & Luggage Reimbursement')]")
	@CacheLookup
	WebElement lbtnBootsLuggage;
	
	//Boots and Luggage Reimbursement Form Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Boots & Luggage Reimbursement Form')]")
	@CacheLookup
	WebElement headerBootsLuggage;
		
	//Tuition Form Link Button
	@FindBy(xpath="//button[contains(.,'Tuition Reimbursement')]")
	@CacheLookup
	WebElement lbtnTuition;
	
	//Tuition Form Header
	@FindBy(xpath="//span[@class='heading3'][contains(.,'Associate Initial Request for Tuition Reimbursement')]")
	@CacheLookup
	WebElement headerTuition;
	
	//Associate Form Link Button
	@FindBy(xpath="//a[contains(.,'Associate Forms Portal')]")
	@CacheLookup
	WebElement lbtnAssociateFormsPortal;
	
	//Case Number 1 
	@FindBy(xpath="//html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/tbody/tr[1]/td[1]/span")
	@CacheLookup
	WebElement txtCaseNumber1;
	
	//Status Approved By HR
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/tbody/tr[1]/td[4]/div/div/div/span")
	@CacheLookup
	WebElement txtStatusApprovedByHR;
	
	//Status Submitted
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div/div/div[3]/div/div[2]/table/tbody/tr[1]/td[4]/div/div/div/span")
	@CacheLookup
	WebElement txtStatusSubmitted;
	
	//pageSlider
	@FindBy(xpath="//div[contains(@aria-label,'Pagination')]")
	@CacheLookup
	WebElement pageSlider;
	
	//Total Number of Items Available in Park Associate User
	@FindBy(xpath="//*[@id=\"b9-PaginationRecords\"]")
	@CacheLookup
	WebElement txtTotalItems;
	
	//Next Number of Items Available in Park Associate User Button
	@FindBy(xpath="//i[contains(@class,'icon fa fa-angle-right fa-1x')]")
	@CacheLookup
	WebElement btnNextItems;
	
	//Click Park Associate User Link Button
	public void clickParkAssociateUser()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnParkAssociateUser);
	}
	
	//Confirm Header "Park Associate User's Requests"
	public boolean verifyHeaderPAUR()
	{
		return func.verifyElementDisplayedWithText(headerParkAssociateUserRequests, "Park Associate User's Requests");
	}
	
	//Confirm Header "My Requests"
	public boolean verifyHeaderMyRequests()
	{
		return func.verifyElementDisplayedWithText(headerMyRequests, "My Requests");
	}
	
	//Confirm Header "Forms"
	public boolean verifyHeaderForms()
	{
		return func.verifyElementDisplayedWithText(headerForms, "Forms");
	}
	
	//Confirm Header "Go To Sample Login"
	public boolean verifyHeaderGoToSampleLogin()
	{
		return func.verifyElementDisplayedWithText(headerGoToSampleLogin, "Go To Sample Login");
	}
	
	//Park Theme Logo is displayed
	public boolean imgParkHRDisplayed()
	{
		return imgParkHR.isDisplayed();
	}
	
	//Park  Associate User Text is displayed
	public boolean txtParkAssociateUser()
	{
		return txtParkAssociateUser.isDisplayed();
	}
	
	//Clear Button is displayed
	public boolean btnClearDisplayed()
	{
		return btnClear.isDisplayed();
	}
	
	//Clear Button Background Color
	public String btnClearBgColor()
	{
		String bgColour = Color.fromString(btnClear.getCssValue("background-color")).asHex();
		return bgColour;
	}
	
	//Clear Button is clickable and displayed
	public void clearClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnClear);
	}
	
	//Search Bar Input is clickable and displayed
	public void searchBarClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", txtSearchBox);
	}
	
	//Park Associate Search Bar is displayed
	public boolean searchbar()
	{
		return txtSearchBox.isDisplayed();
	}
	
	//Select Values in Search Bar 
	public void selectValuesSearchBar()
	{
		 txtSearchBox.click();
		 txtSearchOption1.click();
		 txtSearchOption2.click();
		 txtSearchOption3.click();
		 txtSearchOption4.click();
		 txtSearchOption5.click();
		 txtSearchOption6.click();
	}
	
	//Select Values in Search Bar 
	public void displayValuesSearchBar()
	{
		 txtSearchOption1.isDisplayed();
		 txtSearchOption2.isDisplayed();
		 txtSearchOption3.isDisplayed();
		 txtSearchOption4.isDisplayed();
		 txtSearchOption5.isDisplayed();
		 txtSearchOption6.isDisplayed();
	}
	
	//Select Values in Search Bar 
	public void selectSHARPSearchBar()
	{
		 txtSearchBox.click();
		 txtSearchOption4.click();
	}
	
	//Confirm Header "All Items"
	public boolean verifyHeaderAllItems()
	{
		return func.verifyElementDisplayedWithText(headerAllItems, "All Items");
	}
	
	//Confirm Header "Pending Items"
	public boolean verifyHeaderPendingItems()
	{
		return func.verifyElementDisplayedWithText(headerPendingItems, "Pending Items");
	}
	
	//Confirm Header "Active Items"
	public boolean verifyHeaderActiveItems()
	{
		return func.verifyElementDisplayedWithText(headerActiveItems, "Active Items");
	}
	
	//Confirm Header "Closed Items"
	public boolean verifyHeaderClosedItems()
	{
		return func.verifyElementDisplayedWithText(headerClosedItems, "Closed Items");
	}
	
	//Confirm Header "Done Items"
	public boolean verifyHeaderDoneItems()
	{
		return func.verifyElementDisplayedWithText(headerDoneItems, "Done Items");
	}
	
	//Filter Text is displayed
	public boolean txtFilterDisplayed()
	{
		return txtFilter.isDisplayed();
	}
	
	//Filter Drop Down is displayed
	public boolean btnFilterDisplayed()
	{
		return btnFilter.isDisplayed();
	}
	
	//Filter is clickable and displayed
	public void filterClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnFilter);
	}
	
	//Filter Button Options
	public boolean locateFilterOptions()
	{
		if(btnFilterAll.isDisplayed() && btnFilterCreated.isDisplayed() && btnFilterCompleted.isDisplayed() && btnFilterRejected.isDisplayed() && btnFilterPending.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Filter Created Button is clicked
	public void btnFilterCreatedClicked()
	{
		btnFilterCreated.click();
	}
	
	//Filter Pending Button is clicked
	public void btnFilterPendingClicked()
	{
		btnFilterPending.click();
	}
	
	//Filter All Button is clicked
	public void btnFilterAllClicked()
	{
		btnFilterAll.click();
	}
	
	//Column Headers for Case iD, Form Name, Requester and Status
	public boolean locateColumnHeaders()
	{
		if(txtCaseID.isDisplayed() && txtFormName.isDisplayed() && txtRequester.isDisplayed() && txtStatus.isDisplayed() && txtCreatedOn.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Column Case # is clicked
	public void btnCaseNumberClicked()
	{
		txtCaseID.click();
	}
	
	//Column Case Number 1 is displayed
	public boolean txtCaseNumber1Displayed()
	{
		return txtCaseNumber1.isDisplayed();
	}
	
	//Column Status is clicked
	public void btnStatusClicked()
	{
		txtStatus.click();
	}
	
	//Status Approved By HR is displayed
	public boolean txtStatusApprovedByHRDisplayed()
	{
		return txtStatusApprovedByHR.isDisplayed();
	}
	
	//Status Submitted is displayed
	public boolean txtStatusSubmittedDisplayed()
	{
		return txtStatusSubmitted.isDisplayed();
	}
	
	//My Requests is clickable and displayed
	public void myRequestsClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", headerMyRequests);
	}
		
	//Confirm Title "My Requests"
	public boolean locateMyRequests()
	{	
		if(pageMyRequestsTitle.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Forms is clickable and displayed
	public void formsClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", headerForms);
	}
	
	//Drop down for Forms, "Boots and Luggage Reimbursement", "Volunteer Forms", "SHARP Forms" and "Tuition Reimbursement Forms"
	public boolean locateDropDownForms()
	{
		if(bootsandluggageReimbursement.isDisplayed() && volunteerForms.isDisplayed() && sharpForms.isDisplayed() && tuitionReimbursementForms.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Go To Sample Login is clickable and displayed
	public void goToSampleLoginClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", headerGoToSampleLogin);
	}
	
	//Confirm Title "Login as Sample User"
	public boolean locateLoginasSampleUser()
	{	
		if(txtLoginasSampleUser.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Park Associate User Icon is clickable and displayed
	public void iconParkAssociateUserClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", iconParkAssociateUser);
	}
	
	//Confirm Title "Sign In"
	public boolean hrFormsSignIn()
	{	
		if(txtHRFormsSignIn.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Go To Form is displayed
	public boolean txtGoToFormDisplayed()
	{
		return txtGoToForm.isDisplayed();
	}
	
	//SHARP Form is displayed
	public boolean lbtnSHARPDisplayed()
	{
		return lbtnSHARP.isDisplayed();
	}
	
	//SHARP Form is clickable and displayed
	public void sharpFormClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnSHARP);
	}
	
	//Confirm Header "SCHOLASTIC HONORS AND RECOGNITION PROGRAM (SHARP)"
	public boolean verifyHeaderSHARP()
	{
		return func.verifyElementDisplayedWithText(headerSHARP, "SCHOLASTIC HONORS AND RECOGNITION PROGRAM (SHARP)");
	}
	
	//Volunteer Form is displayed
	public boolean lbtnVolunteerDisplayed()
	{
		return lbtnVolunteer.isDisplayed();
	}
	
	//Volunteer Form is clickable and displayed
	public void volunteerFormClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnVolunteer);
	}
	
	//Confirm Header "Volunteer Tracking Form"
	public boolean verifyHeaderVolunteer()
	{
		return func.verifyElementDisplayedWithText(headerVolunteer, "Volunteer Tracking Form");
	}
	
	//Boots and Luggage Form is displayed
	public boolean lbtnBootsLuggageDisplayed()
	{
		return lbtnBootsLuggage.isDisplayed();
	}
	
	//Boots and Luggage Form is clickable and displayed
	public void bootsLuggageFormClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnBootsLuggage);
	}
	
	//Confirm Header "Boots & Luggage Reimbursement Form"
	public boolean verifyHeaderBootsLuggage()
	{
		return func.verifyElementDisplayedWithText(headerBootsLuggage, "Boots & Luggage Reimbursement Form");
	}
	
	//Tuition Form is displayed
	public boolean lbtnTuitionDisplayed()
	{
		return lbtnTuition.isDisplayed();
	}
	
	//Tuition Form is clickable and displayed
	public void tuitionFormClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnTuition);
	}
	
	//Confirm Header "Associate Initial Request for Tuition Reimbursement"
	public boolean verifyHeaderTuition()
	{
		return func.verifyElementDisplayedWithText(headerTuition, "Associate Initial Request for Tuition Reimbursement");
	}
	
	//Associate Forms Portal is clickable and displayed
	public void associateFormsPortalClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", lbtnAssociateFormsPortal);
	}
	
	public boolean pageSliderDisplayed()
	{
		return pageSlider.isDisplayed();
	}
	
	public boolean totalItemsDisplayed()
	{
		return txtTotalItems.isDisplayed();
	}
	
	//Associate Forms Portal is clickable and displayed
	public void pageSliderClickable()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", btnNextItems);
	}
	
	public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(ldriver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}
