package CreateUserTCs;
import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;

public class CreateUserTC12 extends  BaseTestCase
{

	CreateUserPage UserObject;




	// TC12_Check the functionality of the save button. Create new user
	@Test
	public void TC12_CreateNewUser()
	{
		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.CreateNewUser_E2E();
	}


	
}
