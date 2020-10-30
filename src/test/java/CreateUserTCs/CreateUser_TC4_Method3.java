package CreateUserTCs;
import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;

public class CreateUser_TC4_Method3 extends BaseTestCase
{


	CreateUserPage UserObject;



	@Test (priority = 1)
	public void ValidaeWhenMail_Empty ()
	{

		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.ValidateWhenMail_Empty();
	

	}

}
