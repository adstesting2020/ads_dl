package action;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;

import cases.task07.web.s04.*;
import common.Const;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class TestWebAction {
	private AppiumDriver driver;
	private KindBean kb;

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
		kb = new KindBean();

		kb.setWidth(Const.WEB_PICWIDTH);
		kb.setHeight(Const.WEB_PICHEIGHT);
		
		switch (Const.TESTKIND) {
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
			kb.setKind1("Mac");
			kb.setKind2("12.1.2");
			kb.setBrower("Safari");
			kb.setTestKind("Selenide");
			
			Configuration.timeout = 6000;
	        Configuration.browser = "Safari"; 
	        Configuration.startMaximized = true;
	        ScreenShooter.captureSuccessfulTests = true;
	        Configuration.reportsFolder = "IMG";
			break;
		case 15:
			kb.setKind1("Mac");
			kb.setKind2("76");
			kb.setBrower("Chrome");
			kb.setTestKind("Selenide");
			
			System.setProperty("webdriver.chrome.driver","driver/chromedriver");
	        Configuration.timeout = 6000;
	        Configuration.browser = "chrome";
//	        Configuration.browserSize ="1920x1080";
	        Configuration.startMaximized = true;
	        ScreenShooter.captureSuccessfulTests = true;
	        Configuration.reportsFolder = "IMG";
			break;
		}
	}

	@Test
	public void testIOS() throws Exception {
		open("http://www.test-arts.cn/isms/");
		kb.setTestCaseId("S04-1-1");
		new CaseS04_001().action(kb);
		close();

	}
}
