package BasePageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePageObject {

	protected WebDriver driver;

	// To execute javascript scrolling
	public JavascriptExecutor jse ;

	// To use dropdown list of changing currency in every page
	public Select select;

	// Creating the constructor
	public BasePageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);


	}

	protected static void ClickButton ( WebElement Button)
	{
		Button.click();
	}

	protected static void SetElementtxt (WebElement Element , String value)
	{

		Element.sendKeys(value);
	}



	// To Scroll at the bottom in Home
	public void ScrollToBottom ()
	{
		jse.executeScript("scrollBy(0,2500)");

	}



}
