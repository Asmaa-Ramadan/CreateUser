package CreateUserTCs;

import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;


public class CreateUserTC1_TC2 extends BaseTestCase
{
	
     // TC1 : Check the existence of "Create new user" button under "users" section in the list view
	@Test (priority = 1)
	public void TC1_CheckCreateNewuser_Exists ()

	{
		CreateUserPage UserObj = new CreateUserPage (driver);

		// This is to Validate If Create user button exists to Create  a new User
		UserObj.Validate_CreateUserButton_Exsist();

	}

	
	// TC2 : This is to Validate If All other fields are existing
	@Test (priority = 2)
	public void TC2_CheckAllFields_Exisit ()

	{
		CreateUserPage UserObj = new CreateUserPage (driver);

		// This is to Validate If all fields of create user page are existing
		UserObj.Validate_AllFields_Exsist();
	

	}

}
