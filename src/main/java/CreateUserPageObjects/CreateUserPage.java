package CreateUserPageObjects;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BasePageObject.BasePageObject;

public class CreateUserPage extends BasePageObject
{

	public CreateUserPage(WebDriver driver) 
	{
		super(driver);
	}

	RandomTxts mytxtx = new RandomTxts();

	@FindBy (className = "global-sidebar_sidebar__navbar-item--name__XdUOQ")
	WebElement CreateUserIcon;


	@FindBy (id  ="user-form_first-name")
	WebElement FName;


	@FindBy (id  ="user-form_second-name")
	WebElement LName;


	@FindBy (id  ="user-form_email")
	WebElement Mail;

	@FindBy (id  ="user-form_phone-Num")
	WebElement MobileNumber;


	@FindBy (id  ="user-form_submit-btn")
	WebElement Submit;

	@FindBy (id = "user-form_reset-btn")
	WebElement Reset;


	@FindBy (xpath = "//*[@id=\"user-form\"]/div/div[1]/div/div/div")
	WebElement FNameErrorValidation;


	@FindBy (className = "phone-number_validation-msg__GD_IU")
	WebElement MobileNumberValidation;


	@FindBy (className = "PhoneInputCountrySelect")
	WebElement CountryCode;

	@FindBy (xpath = "//*[@id=\"user-form\"]/div/div[2]/div/div/div")
	WebElement LNameErrorValidation;

	@FindBy (xpath = "//*[@id=\"user-form\"]/div/div[3]/div/div/div")
	WebElement MailErrorValidation;


	@FindBy (className = "PhoneInputCountrySelect")
	WebElement CountryFlag;



	@FindBy (className = "user-details_user-details__default-icon__yqnps")
	WebElement UserProfile;



	@FindBy (className = "user-details_basic-info__email__3Rd74")
	WebElement UserMail;



	@FindBy (className = "user-details_basic-info__phone__15Byj")
	WebElement UserPhone;



	@FindBy (className = "user-details_basic-info__user-name__1ATgF")
	WebElement Username;

	@FindBy (id = "react-tabs-0")
	WebElement OrdersTab;


	@FindBy (id = "react-tabs-2")
	WebElement AddressTab;


	@FindBy (id = "react-tabs-4")
	WebElement BalanceLogTab;

	@FindBy (className = "modal-body")
	WebElement AlertBody;

	@FindBy ( id = "modal_confirm-btn")
	WebElement AlertConfirm_btn;


	@FindBy ( id = "modal_close-btn")
	WebElement AlertCancel_btn;


	String ExpectedValidationMsg = "Please enter the name with min. 2 characters and max. 20 characters.";
	String ExpectedMobileMsg = "Please enter a valid phone number.";
	String ExpectedMailMsg = "Please enter a valid email address";

	//String User_FirstName = "Test" + new Random().nextInt(100);

	//	String User_FirstName = "Test" + new Random().toString();
	//
	//	String User_lastName = "Auto" + new Random().toString();
	String User_FirstName ="MyTest45";
	String User_lastName = "auto678";
	String User_Mail = mytxtx.generateRandomString() + "@gmail.com";
	String User_Phone= "116757"+ mytxtx.getRandomNumber() + mytxtx.getRandomNumber();





	// This is to Validate If Create User Button exists
	// TC1
	public void Validate_CreateUserButton_Exsist ()

	{

		Assert.assertEquals(true, CreateUserIcon.isDisplayed(), "Create User Icon is NOT displayed");


	}




	// This is to Validate If All other fields are existing
	// TC2
	public void Validate_AllFields_Exsist()
	{

		Assert.assertEquals(true, FName.isDisplayed(), "First Name Field is NOT displayed");

		Assert.assertEquals(true, LName.isDisplayed(), "Last Name is Field NOT displayed");

		Assert.assertEquals(true, Mail.isDisplayed(), "Adress Field is NOT displayed");

		Assert.assertEquals(true, MobileNumber.isDisplayed(), "Mobile Number Field is NOT displayed");

		Assert.assertEquals(true, Submit.isDisplayed(), "Submit Button is NOT displayed");


		//Here we set any value in nay field so that we can catch the element "reset" and validate it
		SetElementtxt(FName, "Asmaa");
		Assert.assertEquals(true, Reset.isDisplayed(), "Reset Button is NOT displayed");

	}





	// TC4 , To validate when First Name is empty 
	public void ValidateWhenFName_Empty()
	{

		// This is to validate when FName is empty
		SetElementtxt(LName, "My LName");
		SetElementtxt(Mail, "1t@gmail.com");
		SetElementtxt(MobileNumber, "1152986677");
		ClickButton(Submit);

		// This is to get the Value of the First Name which is empty
		String FNamevalue =FName.getAttribute("value");

		//This is to grab the text of the error validation in First name
		String FNameEmptyValidation ;
		FNameEmptyValidation = FNameErrorValidation.getText();

		// This condition is to make sure that the error validation is belongs to the First Name value
		if (FNamevalue.isEmpty()) 
		{

			// Assert Actual against the expected
			//Actual is the String FNameEmptyValidation , the expected is the message 
			Assert.assertEquals(FNameEmptyValidation, "This field can’t be empty!", "There is no Validation here!");
			System.out.println("First Name is Empty!, Passes.");

		} else 
		{
			System.out.println(FNameEmptyValidation);
			Assert.fail();

		}
	}




	// TC4 , To validate when Last Name is empty 
	public void ValidateWhenLName_Empty()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// This is to validate when LName is empty
		SetElementtxt(FName, "Test");
		LName.clear();
		LName.sendKeys(Keys.SPACE, Keys.BACK_SPACE);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Mail.clear();
		SetElementtxt(Mail, "MyTest@gmail.com");
		MobileNumber.clear();
		SetElementtxt(MobileNumber, "20 1152983328");
		ClickButton(Submit);

		// This is to get the Value of the Last Name which is empty
		String LNamevalue =LName.getAttribute("value");

		//This is to grab the text of the error validation in First name
		String LNameEmptyValidation ;
		LNameEmptyValidation = LNameErrorValidation.getText();

		// This condition is to make sure that the error validation is belongs to the Last Name value
		if (LNamevalue.isEmpty()) 
		{

			// Assert Actual against the expected
			//Actual is the String LNameEmptyValidation , the expected is the message 
			Assert.assertEquals(LNameEmptyValidation, "This field can’t be empty!", "There is no Validation here!");
			System.out.println("Last Name is Empty!, Passes.");

		} else 
		{
			System.out.println(LNameEmptyValidation);
			Assert.fail();

		}
	}



	// TC4 , To validate when Mail is empty 	
	public void ValidateWhenMail_Empty()
	{

		FName.clear();
		SetElementtxt(FName, "My FName");
		LName.clear();
		SetElementtxt(LName, "My Last Name");
		Mail.clear();
		Mail.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		Mail.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		Mail.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		Mail.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		MobileNumber.clear();
		MobileNumber.sendKeys(Keys.SPACE, Keys.CLEAR);
		SetElementtxt(MobileNumber, "20 1152983309");
		ClickButton(Submit);

		// This is to get the Value of the Mail which is empty
		String Mailvalue =Mail.getAttribute("value");

		//This is to grab the text of the error validation in mail
		String MailEmptyValidation ;
		MailEmptyValidation = MailErrorValidation.getText();

		// This condition is to make sure that the error validation is belongs to the Mail value
		if (Mailvalue.isEmpty()) 
		{

			// Assert Actual against the expected
			//Actual is the String MailEmptyValidation , the expected is the message 
			Assert.assertEquals(MailEmptyValidation, "This field can’t be empty!", "There is no Validation here!");
			System.out.println("Mail is Empty!, Passes.");

		} else 
		{
			System.out.println(MailEmptyValidation);
			Assert.fail();

		}
	}




	// TC4 , To validate when Mobile is empty 
	public void ValidateWhenMobileNumber_Empty() 
	{

		String EmptyValidation = "This field can’t be empty!";
		FName.clear();
		SetElementtxt(FName, "Asmaa");
		LName.clear();
		SetElementtxt(LName, "Ramadan");
		Mail.clear();
		SetElementtxt(Mail, "mytest@gmail.com");
		// This is to delete the default value of Mobile number " Country code" because it's not deleted
		//	Using the method clear
		MobileNumber.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		MobileNumber.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		MobileNumber.sendKeys(Keys.SPACE, Keys.BACK_SPACE);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ClickButton(Submit);

		// This is to get the Value of the Mobile number which is empty
		String MobileNumberValue =MobileNumber.getAttribute("value");

		System.out.println(MobileNumberValue);
		//This is to grab the text of the error validation in Mobile
		String MobileEmptyValidation ;
		MobileEmptyValidation = MobileNumberValidation.getText();
		System.out.println(MobileEmptyValidation);

		// This condition is to make sure that the error validation is belongs to the Mobile number value
		if (MobileNumberValue.isEmpty()) 
		{

			// Assert Actual against the expected
			//Actual is the String MobileEmptyValidation , the expected is the message 
			Assert.assertEquals(MobileEmptyValidation, EmptyValidation);

			System.out.println("Mobile is Empty!, Passes.");


		} 
		else 
		{
			System.out.println(MobileEmptyValidation);
			Assert.assertEquals(MobileEmptyValidation, EmptyValidation);
			Assert.fail();

		}
	}




	// TC5& TC6 : Check char. limit validation for all fields

	public void CheckLimitValidation_AllFields ()
	{
		String FirstNameInput = "1";
		String LastNameInput ="21";
		String MailAddressInput = "TestChars@gmail.com";
		String MobileNumberInput= "+20 2 345" ;
		String FNameMaxCharError;
		String LNameMaxCharError;
		String MobileNumberNotVaild;

		SetElementtxt(FName, FirstNameInput);
		SetElementtxt(LName, LastNameInput);
		SetElementtxt(Mail, MailAddressInput);
		MobileNumber.clear();
		SetElementtxt(MobileNumber,MobileNumberInput );
		ClickButton(Submit);


		String FNamevalue =FName.getAttribute("value");


		String LNamevalue =LName.getAttribute("value");


		String MobileNumberValue =MobileNumber.getAttribute("value");

		FNameMaxCharError = FNameErrorValidation.getText();


		if ( !(FNamevalue.isEmpty()) && FNamevalue.equals(FirstNameInput))
		{


			//This is to grab the text of the error validation in Mobile Number
			// This is to assert on the Mobile validation error
			Assert.assertEquals(FNameMaxCharError, ExpectedValidationMsg);
			Assert.assertEquals(FNameMaxCharError, ExpectedValidationMsg);
			//	Assert.assertTrue(FNameErrorValidation.isDisplayed(), "First name Max chars validation is giving an error");

		} 
		else 
		{
			System.out.println("First name Max chars validation is giving an error");

			Assert.assertEquals(FNameMaxCharError, ExpectedValidationMsg);

			Assert.fail("The Shown message is not "+ ExpectedValidationMsg);
			Assert.fail();


		}



		//This is to grab the text of the error validation in Mobile Number
		LNameMaxCharError = LNameErrorValidation.getText();


		if ( !(LNamevalue.isEmpty()) && LNamevalue.equals(LastNameInput))
		{


			// This is to assert on the Mobile validation error
			Assert.assertEquals(LNameMaxCharError, ExpectedValidationMsg);

		} 
		else 
		{
			Assert.assertEquals(LNameMaxCharError, ExpectedValidationMsg);
			Assert.fail("The Shown message is not "+ ExpectedValidationMsg);
			Assert.fail();
		}




		//This is to grab the text of the error validation in Mobile Number
		MobileNumberNotVaild = MobileNumberValidation.getText();

		if ( !(MobileNumberValue.isEmpty()) && MobileNumberValue.equals(MobileNumberInput))
		{


			// This is to assert on the Mobile validation error
			Assert.assertEquals(MobileNumberNotVaild, ExpectedMobileMsg);


		} 
		else 
		{
			Assert.assertEquals(MobileNumberNotVaild, ExpectedMobileMsg);
			Assert.fail("The Shown message is not "+ ExpectedMobileMsg);

			Assert.fail();


		}

	}


	// TC7 :
	// TC7_Country code , Check the Functionality of the country drop-down list

	public void ChangeCountryFlag ()
	{
		ClickButton(CountryFlag);
		select = new Select(CountryFlag);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		select.selectByIndex(20);
		select.selectByIndex(30);
		select.selectByIndex(40);
		select.selectByIndex(50);
		select.selectByIndex(60);
		select.selectByIndex(70);
		select.selectByIndex(66);
	}



	// TC10_Check the format of the Email address entered

	public void CheckWrongValues_Mail ()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Mail.click();
		SetElementtxt(Mail, "test&%$");
		ClickButton(Submit);
		String ActualMailValidationError = MailErrorValidation.getText();
		System.out.println(ActualMailValidationError);
		// Assert Actual against the expected
		//Actual is the String ActualMobileValidationError , the expected is the message :ExpectedMobileMsg
		Assert.assertEquals(ActualMailValidationError, ExpectedMailMsg);
	}


	// TC8 to check when entering any values other than numbers for the phone number field

	public void CheckWrongValues_PhoneNumber ()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MobileNumber.click();
		SetElementtxt(MobileNumber, "test&%$");
		ClickButton(Submit);
		String ActualMobileValidationError = MobileNumberValidation.getText();
		System.out.println(ActualMobileValidationError);
		// Assert Actual against the expected
		//Actual is the String ActualMobileValidationError , the expected is the message :ExpectedMobileMsg
		Assert.assertEquals(ActualMobileValidationError, ExpectedMobileMsg);
	}



	// TC12 : Check the functionality of the save button, Create new user
	public void CreateNewUser_E2E ()
	{
		//SetElementtxt(FName, msr.generateRandomString());
		FName.sendKeys(mytxtx.generateRandomString());
		//SetElementtxt(LName, User_lastName);
		LName.sendKeys(mytxtx.generateRandomString());
		SetElementtxt(Mail, User_Mail);
		SetElementtxt(MobileNumber, User_Phone);
		ClickButton(Submit);

		//String ExpectedUserName = User_FirstName + User_lastName;
		//String ExpectedUserName1 = User_FirstName.concat(" ");
		//String ExpectedUserName = ExpectedUserName1.concat(User_lastName);
		//String 	ExpectedUserName1 ;
		//String ExpectedUserName2;
		String ExpectedUserName ;
		
		String SignedFName;
		String signedLName;
		SignedFName=FName.getAttribute("value");
		System.out.println(SignedFName);
		signedLName=LName.getAttribute("value");
		System.out.println(signedLName);
		ExpectedUserName = SignedFName.concat(" ") + signedLName;
		//ExpectedUserName2 = signedLName;
	    
		String ExpectedNumber1 = "+20";
		String ExpectedNumber = ExpectedNumber1.concat(User_Phone);
		Assert.assertTrue(UserProfile.isDisplayed());
		Assert.assertEquals(Username.getText().toLowerCase(), ExpectedUserName.toLowerCase());
		Assert.assertEquals(UserMail.getText(),User_Mail.toLowerCase());
		Assert.assertEquals(UserPhone.getText(), ExpectedNumber);
		Assert.assertTrue(OrdersTab.isDisplayed());
		Assert.assertTrue(AddressTab.isDisplayed());
		Assert.assertTrue(BalanceLogTab.isDisplayed());

	}


	/*
	TC9 We will enhance this TC when there is an availability to click on user data link to enter newly created user
     To be Enhancened
	 TC9 To enter same data from old user to new one
	 After Enhancements we shall assert on Validation of previously entered data "Already exists value" validation
	 Thus we will keep this Method to add validation next
	 */
	public void Check_DuplicateData ()
	{
		CreateNewUser_E2E();

	}

	// TC13 : Check the functionality of the Reset button
	public void ResetButton_Method () throws InterruptedException
	{
		SetElementtxt(FName, User_FirstName);
		ClickButton(Reset);
		Thread.sleep(2000);
		Assert.assertTrue(AlertBody.isDisplayed());
		ClickButton(AlertCancel_btn);
		FName.getAttribute("value");
		Assert.assertNotNull(FName.getAttribute("value"), "Value of first Name is cleared!");
		ClickButton(Reset);
		Thread.sleep(2000);
		ClickButton(AlertConfirm_btn);
		Assert.assertEquals(FName.getAttribute("value"), "");





	}

}
