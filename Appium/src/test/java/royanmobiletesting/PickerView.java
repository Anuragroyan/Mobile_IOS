package royanmobiletesting;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class PickerView extends BaseTest {
   
	@Test
	public void PickerViews() throws MalformedURLException, URISyntaxException, InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
		WebElement p1 =  driver.findElement(AppiumBy.accessibilityId("Red color component value"));
		// Locate the picker wheel (adjust index or XPath as needed)
		p1.sendKeys("45");
		Thread.sleep(5000);
		WebElement p2 =  driver.findElement(AppiumBy.accessibilityId("Green color component value"));
		// Locate the picker wheel (adjust index or XPath as needed)
		p2.sendKeys("225");
		Thread.sleep(5000);
		WebElement p3 =  driver.findElement(AppiumBy.accessibilityId("Blue color component value"));
		// Locate the picker wheel (adjust index or XPath as needed)
		p3.sendKeys("175");
		Thread.sleep(5000);
	}
	
}
