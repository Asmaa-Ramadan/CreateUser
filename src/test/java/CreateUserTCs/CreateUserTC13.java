package CreateUserTCs;
import org.testng.annotations.Test;

import BaseTC.BaseTestCase;
import CreateUserPageObjects.CreateUserPage;

public class CreateUserTC13 extends  BaseTestCase
{

	CreateUserPage UserObject;





	// TC13 : Check the functionality of the Reset button
	@Test
	public void TC13_ResetButton() throws InterruptedException
	{
		CreateUserPage UserObj= new  CreateUserPage (driver);
		UserObj.ResetButton_Method();
	}


}
