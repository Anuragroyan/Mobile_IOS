package royanmobiletesting;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ToggleSwitch  extends BaseTest{
   
	@Test
	public void ToggleSwitchPress()  throws MalformedURLException, URISyntaxException, InterruptedException {
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Switches\"`]")).click();
//		driver.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
//		Thread.sleep(3000);
//		driver.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
//		Thread.sleep(3000);
//		driver.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
//		Thread.sleep(3000);
//		driver.findElement(AppiumBy.className("XCUIElementTypeSwitch")).click();
//		Thread.sleep(3000);
		List<WebElement> switches = driver.findElements(AppiumBy.className("XCUIElementTypeSwitch"));

		if (switches.size() >= 2) {
		    // Toggle the first switch
		    switches.get(0).click();
		    Thread.sleep(3000);

		    // Toggle the second switch
		    switches.get(1).click();
		    Thread.sleep(3000);

		    // Toggle the first switch again
		    switches.get(0).click();
		    Thread.sleep(3000);

		    // Toggle the second switch again
		    switches.get(1).click();
		    Thread.sleep(3000);
		} else {
		    System.out.println("Less than 2 switches found on the screen.");
		}
	}
	
}
