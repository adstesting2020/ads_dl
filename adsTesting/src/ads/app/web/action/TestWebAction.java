package ads.app.web.action;

import org.junit.Before;
import org.junit.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import ads.app.web.task.*;
import ads.com.Const;

public class TestWebAction {
	@Before
	public void setup() throws Exception {
		Configuration.timeout = 6000;
		Configuration.startMaximized = true;
		ScreenShooter.captureSuccessfulTests = true;
		Configuration.reportsFolder = "IMG";
		
		switch (Const.RUNFLG) {
		case Const.WINDOWS7_IE:
			break;
		case Const.WINDOWS7_CHROME:
			break;
		case Const.WINDOWS10_IE:
			break;
		case Const.WINDOWS10_CHROME:
			break;
		case Const.WINDOWS10_EDGE:
			System.setProperty("webdriver.edge.driver", "driver/MicrosoftWebDriver.exe");
			Configuration.browser = "edge";
			break;
		case Const.MAC_SAFARI:
			Configuration.browser = "Safari";
			break;
		case Const.MAC_CHROME:
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			Configuration.browser = "chrome";
			break;
		}
	}

	@Test
	public void testWeb() {
		try {
			new Task001().run();
//			new Task002().run();
//			new Task003().run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
