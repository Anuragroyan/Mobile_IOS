package royanmobiletesting;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ButtonPressed extends BaseTest {
    
	@Test
	public void BtnPressed() throws MalformedURLException, URISyntaxException {
		driver.findElement(AppiumBy.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther")).click();
		String Btn1 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"SYSTEM (TEXT)\"`][2]")).getText();
		Assert.assertEquals(Btn1, "SYSTEM (TEXT)");
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Button\"`][1]")).click();
		String Btn2 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"SYSTEM (CONTACT ADD)\"`][2]")).getText();
		Assert.assertEquals(Btn2, "SYSTEM (CONTACT ADD)");
		driver.findElement(AppiumBy.accessibilityId("add")).click();
		String Btn3 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"SYSTEM (DETAIL DISCLOSURE)\"`][2]")).getText();
		Assert.assertEquals(Btn3, "SYSTEM (DETAIL DISCLOSURE)");
		driver.findElement(AppiumBy.accessibilityId("More Info")).click();
		String Btn4 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"IMAGE\"`][2]")).getText();
		Assert.assertEquals(Btn4, "IMAGE");
		driver.findElement(AppiumBy.accessibilityId("X Button")).click();
		String Btn5 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"ATTRIBUTED TEXT\"`][2]")).getText();
		Assert.assertEquals(Btn5, "ATTRIBUTED TEXT");
		driver.findElement(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Button\"])[2]")).click();
		String Btn6 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"SYSTEM (SYMBOL)\"`][2]")).getText();
		Assert.assertEquals(Btn6, "SYSTEM (SYMBOL)");
		driver.findElement(AppiumBy.accessibilityId("Person")).click();
		String Btn7 = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"SYSTEM (TEXT + SYMBOL)\"`][2]")).getText();
		Assert.assertEquals(Btn7, "SYSTEM (TEXT + SYMBOL)");
		driver.findElement(AppiumBy.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[2]/XCUIElementTypeOther")).click();
	}
}
