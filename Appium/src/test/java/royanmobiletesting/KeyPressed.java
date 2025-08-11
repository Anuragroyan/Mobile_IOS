package royanmobiletesting;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class KeyPressed extends BaseTest {
    
	@Test
	public void KeyPressBtn() throws MalformedURLException, URISyntaxException {
		driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Alert Views\"]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Simple\"`]")).click();
		String label1 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"A Short Title Is Best\"`]")).getText();
		Assert.assertEquals(label1, "A Short Title Is Best");
		String Msg1 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"A message should be a short, complete sentence.\"`]")).getText();
		Assert.assertEquals(Msg1, "A message should be a short, complete sentence.");
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
		String label2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"A Short Title Is Best\"]")).getText();
		Assert.assertEquals(label2, "A Short Title Is Best");
		String msg2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"A message should be a short, complete sentence.\"]")).getText();
		Assert.assertEquals(msg2, "A message should be a short, complete sentence.");
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
		driver.findElement(AppiumBy.accessibilityId("Other")).click();
		String label3 = driver.findElement(AppiumBy.iOSNsPredicateString("name == \"A Short Title Is Best\" AND label == \"A Short Title Is Best\" AND value == \"A Short Title Is Best\"")).getText();
		Assert.assertEquals(label3, "A Short Title Is Best");
		String msg3 = driver.findElement(AppiumBy.accessibilityId("A message should be a short, complete sentence.")).getText();
		Assert.assertEquals(msg3,"A message should be a short, complete sentence.");
		driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Choice One\"]")).click();
		driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Choice Two\"]")).click();
		driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Cancel\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("Secure Text Entry")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Secure Text Entry\"`]")).sendKeys("welcome123");
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
		String title = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"ACTION SHEET STYLE\"`][2]")).getText();
		Assert.assertEquals(title, "ACTION SHEET STYLE");
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Confirm / Cancel\"`]")).click();
		String msg = driver.findElement(AppiumBy.accessibilityId("A message should be a short, complete sentence.")).getText();
		Assert.assertEquals(msg, "A message should be a short, complete sentence.");
		driver.findElement(AppiumBy.accessibilityId("Confirm")).click();
		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
	}
	
}
