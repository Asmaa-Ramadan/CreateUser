package CreateUserTCs;
import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;

public class CreateUser_TC4_Method4 extends BaseTestCase
{


	CreateUserPage UserObject;



	@Test (priority = 1)
	public void ValidaeWhenMobileNumber_Empty () 
	{

		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.ValidateWhenMobileNumber_Empty();
	}
}
