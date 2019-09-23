package ads.app.mobile.action;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import ads.app.mobile.task.*;
import ads.com.Const;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class TestMobileAction {
	private AppiumDriver driver;

	@Before
	public void setup() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		switch (Const.RUNFLG) {
		case Const.ANDROID_5:
			break;
		case Const.ANDROID_6:
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "72V7N16C20002047");
			capabilities.setCapability("browserName", "Chrome");
			capabilities.setCapability("newCommandTimeout", 400);
			capabilities.setCapability("unicodeKeyboard", "true");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		case Const.ANDROID_7:
			break;
		case Const.ANDROID_8:
			break;
		case Const.ANDROID_9:
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "X5LG97f5bb7f");
			capabilities.setCapability("browserName", "Chrome");
			capabilities.setCapability("newCommandTimeout", 600);
			capabilities.setCapability("recreateChromeDriverSessions", true);
//	        capabilities.setCapability("unicodeKeyboard", "true");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		case Const.IPHONE_7PLUS:
			capabilities.setCapability("automationName", "XCUITest");
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "12.4");
			capabilities.setCapability("deviceName", "qqq");
			capabilities.setCapability("udid", "3e8187d8de743223d039740cacff6bd07d4cf4b1");
			capabilities.setCapability("browserName", "Safari");
			capabilities.setCapability("startIWDP", "true");
			capabilities.setCapability("newCommandTimeout", 200);

			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		case Const.IPHONE_8:
			capabilities.setCapability("automationName", "XCUITest");
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "12.4");
			capabilities.setCapability("deviceName", "qqq");
			capabilities.setCapability("udid", "3e8187d8de743223d039740cacff6bd07d4cf4b1");
			capabilities.setCapability("browserName", "Safari");
			capabilities.setCapability("startIWDP", "true");
			capabilities.setCapability("newCommandTimeout", 200);

			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		case Const.IPHONE_X:
			capabilities.setCapability("automationName", "XCUITest");
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "12.4");
			capabilities.setCapability("deviceName", "qqq");
			capabilities.setCapability("udid", "3e8187d8de743223d039740cacff6bd07d4cf4b1");
			capabilities.setCapability("browserName", "Safari");
			capabilities.setCapability("startIWDP", "true");
			capabilities.setCapability("newCommandTimeout", 200);

			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		}
	}

//	@After
//	public void tearDown() throws Exception {
//		driver.quit();
//	}

	@Test
	public void testMobile() {
		try {
			new Task001().run(driver);
//			new Task002().run(driver);
//			new Task003().run(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
