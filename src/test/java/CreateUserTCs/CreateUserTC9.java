package CreateUserTCs;
import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;

public class CreateUserTC9 extends  BaseTestCase
{

	CreateUserPage UserObject;



	
	//TC9 We will enhance this TC when there is an availability to click on user data link to enter newly created user
	// To be Enhancened
	// TC9 To enter same data from old user to new one
	@Test 
	public void TC9_CreateNewUser_WithDuplicateData()
	{
		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.Check_DuplicateData();
	}

}
