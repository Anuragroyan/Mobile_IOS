package royanmobiletesting;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;



public class IOSBasics extends BaseTest {
   
	@Test
	public void IOSBasic() throws MalformedURLException, URISyntaxException {
		
		//Xpath, classname, IOS, iosClassCHain, IOSPredicateString, accessibility-id, id
		driver.findElement(AppiumBy.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Text Entry\"`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"CenterPageView\"`]/XCUIElementTypeOther[1]")).sendKeys("welcome to ios world!");
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
//		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
	}
}
