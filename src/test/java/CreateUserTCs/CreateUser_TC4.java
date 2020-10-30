package CreateUserTCs;
import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;

public class CreateUser_TC4 extends BaseTestCase
{


	CreateUserPage UserObject;

	
	// TC4 : Check validation for empty fields
	
	@Test (priority = 1)
	public void ValidaeWhenFName_Empty ()
	{

		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.ValidateWhenFName_Empty();
		

	}


//
//	// TC4 : Check validation for empty fields
//	@Test (priority = 2)
//	public void ValidaeWhenLName_Empty ()
//	{
//
//		CreateUserPage UserObj= new  CreateUserPage (driver);
//		UserObj.ValidateWhenLName_Empty();
//		
//	}
//
//
//
//	@Test (priority = 3)
//	public void ValidaeWhenMail_Empty ()
//	{
//
//		CreateUserPage UserObj= new  CreateUserPage (driver);
//		UserObj.ValidateWhenMail_Empty();
//	
//
//	}
//
//
//
//
//	@Test (priority = 4)
//	public void ValidaeWhenMobileNumber_Empty () 
//	{
//
//		CreateUserPage UserObj= new  CreateUserPage (driver);
//		UserObj.ValidateWhenMobileNumber_Empty();
//		CLoseDriver();
//	}
	
}
