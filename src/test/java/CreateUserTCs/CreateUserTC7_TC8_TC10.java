package CreateUserTCs;
import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;

public class CreateUserTC7_TC8_TC10 extends  BaseTestCase
{

	CreateUserPage UserObject;

	
	// TC7_Country code , Check the Functionality of the country drop-down list
	@Test (priority = 1)
	public void CountryCodes ()
	{

		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.ChangeCountryFlag();
	}





	// TC10_Check the format of the Email address entered
	@Test (priority = 2)
	public void TC8_WrongStrings_Mail()
	{
		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.CheckWrongValues_Mail();
	}

	
	
	// TC8_Check entering any values other than numbers for the phone number field
	@Test (priority = 3)
	public void TC8_WrongStrings_MobileNumber()
	{
		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.CheckWrongValues_PhoneNumber();
	}


}
