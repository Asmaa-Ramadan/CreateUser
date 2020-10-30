package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps
{

	
	
	@Given("^Open Chrome and fill the required data$")				
    public void Open_Chrome_and_fill_the_required_data() throws Throwable							
    {		
        System.out.println("This Step open the Firefox and launch the application.");					
    }		

    @When("^Enter First name and last name and Email Adress and Mobile number$")					
    public void Enter_First_name_and_last_name_and_Email_Adress_and_Mobile_number() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^New user is created$")					
    public void New_user_is_created() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }		

}
