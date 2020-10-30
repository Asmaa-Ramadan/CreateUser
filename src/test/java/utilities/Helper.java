package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	// Method to take the ScreenShot when the TestCase is failed
	public static void CaptureScreenShot(WebDriver driver , String ScreenShotName)
	{
		Path destination = Paths.get("./ScreenShots",ScreenShotName+ ".png");
	
		try 
		{
		  //Files.createDirectory(destination.getParent());
			FileOutputStream Out= new FileOutputStream(destination.toString());
		Out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
		Out.close();
		}
		catch (IOException e) {
			e.printStackTrace();

			  System.out.println("Exception while taking the screenshot" + e.getMessage() );

		}
	}

}
