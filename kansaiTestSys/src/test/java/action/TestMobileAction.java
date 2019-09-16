package action;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;

import cases.task07.mobile.s01.*;
import common.Const;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class TestMobileAction {
	private AppiumDriver driver;

//	  1 - Android 5.0 
//	  2 - Android 6.0 
//	  3 - Android 7.0 
//	  4 - Android 8.0 
//	  5 - Android 9.0 
//	  6 - iPhone7Plus 
//	  7 - iPhone8 
//	  8 - iPhoneX 
//	  9 - Win7-IE 
//	  10 - Win7-Chrome 
//	  11 - Win10-IE 
//	  12 - Win10-Chrome 
//	  13 - Win10-Edge 
//	  14 - Mac-Safari 
//	  15 - Mac-Chrome
	@Before
	public void setup() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		switch (Const.TESTKIND) {
		case 1:
			break;
		case 2:
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "72V7N16C20002047");
			capabilities.setCapability("browserName", "Chrome");
			capabilities.setCapability("newCommandTimeout", 400);
//	        capabilities.setCapability("unicodeKeyboard", "true");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
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
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			Configuration.timeout = 6000;
	        Configuration.browser = "Safari"; 
	        Configuration.startMaximized = true;
	        ScreenShooter.captureSuccessfulTests = true;
	        Configuration.reportsFolder = "IMG";
			break;
		case 15:
			System.setProperty("webdriver.chrome.driver","bin/chromedriver");
	        Configuration.timeout = 6000;
	        Configuration.browser = "chrome";
//	        Configuration.browserSize ="1920x1080";
	        Configuration.startMaximized = true;
	        ScreenShooter.captureSuccessfulTests = true;
	        Configuration.reportsFolder = "IMG";
			break;
		}
	}

//	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testIOS() throws Exception {
		driver.get("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(100000);

//		// S01-1-1
//		new CaseS01_001().action(driver, "S01-1-1");
//
//		// S01-1-2
//		new CaseS01_002().action(driver, "S01-1-2");

		// S01-1-3
		new CaseS01_003().action(driver, "S01-1-3");
		


	}
}
