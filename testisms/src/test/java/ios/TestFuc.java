package ios;

import java.net.URL;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import caseList.Test001;
import common.SlideScreen;
import dto.DataBean;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class TestFuc {
	
	private static ArrayList<DataBean> DATALIST = new ArrayList<DataBean>();

	private AppiumDriver driver;

	@Before
	public void setup() throws Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "12.4");
		capabilities.setCapability("deviceName", "qqq");
		capabilities.setCapability("udid", "3e8187d8de743223d039740cacff6bd07d4cf4b1");
		capabilities.setCapability("browserName", "Safari");
		capabilities.setCapability("startIWDP", "true");
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testIOS() throws Exception {

		driver.get("http://www.test-arts.cn/isms/");
		Test001 test001 = new Test001();
		test001.test001(driver);
		
        
	}
	

}
