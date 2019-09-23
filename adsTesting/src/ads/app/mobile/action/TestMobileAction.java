package ads.app.mobile.action;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import ads.app.mobile.task.*;
import ads.com.Const;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class TestMobileAction {
	private AppiumDriver driver;
	private KindBean kb;

	@Before
	public void setup() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		kb = new KindBean();

		kb.setWidth(Const.MOBILE_PICWIDTH);
		kb.setHeight(Const.MOBILE_PICHEIGHT);

		// 1 - Android 5.0
		// 2 - Android 6.0
		// 3 - Android 7.0
		// 4 - Android 8.0
		// 5 - Android 9.0
		// 6 - iPhone7Plus
		// 7 - iPhone8
		// 8 - iPhoneX
		kb.setTestFlg("2");

		switch (Integer.parseInt(kb.getTestFlg())) {
		case 1:
			kb.setKind1("スマホ");
			kb.setKind2("Android 5.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");
			break;
		case 2:
			kb.setKind1("スマホ");
			kb.setKind2("Android 6.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");

			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "72V7N16C20002047");
			capabilities.setCapability("browserName", "Chrome");
			capabilities.setCapability("newCommandTimeout", 400);
			capabilities.setCapability("unicodeKeyboard", "true");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			kb.setKind1("スマホ");
			kb.setKind2("Android 9.0");
			kb.setBrower("Chrome");
			kb.setTestKind("Appium");

			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "X5LG97f5bb7f");
			capabilities.setCapability("browserName", "Chrome");
			capabilities.setCapability("newCommandTimeout", 600);
			capabilities.setCapability("recreateChromeDriverSessions", true);
//	        capabilities.setCapability("unicodeKeyboard", "true");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		case 6:
			kb.setKind1("スマホ");
			kb.setKind2("iOS 12.4");
			kb.setBrower("Safari");
			kb.setTestKind("Appium");

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
		case 7:
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
		case 8:
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
			new Task001().run(driver, kb);
//			new Task002().run(driver, kb);
//			new Task003().run(driver, kb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
