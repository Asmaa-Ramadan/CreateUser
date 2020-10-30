package CreateUserTCs;
import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;

public class CreateUserTC5_TC6 extends  BaseTestCase
{

	CreateUserPage UserObject;
	
	// TC5& TC6 : Check char. limit validation for all fields
	@Test
	public void LimitValidation_AllFields ()
	{
		
		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.CheckLimitValidation_AllFields();
	}
}
