package royanmobiletesting;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ImagePicker extends BaseTest{
    
	@Test
	public void ImagePickered() throws MalformedURLException, URISyntaxException {
		driver.findElement(AppiumBy.accessibilityId("Image View")).click();
		driver.findElement(AppiumBy.accessibilityId("Animated")).click();
	}
}
