package ads.app.web.action;

import org.junit.Before;
import org.junit.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;

import ads.app.web.task.*;
import ads.com.Const;
import ads.com.KindBean;

public class TestWebAction {
	private KindBean kb;

	@Before
	public void setup() throws Exception {
		kb = new KindBean();

		kb.setWidth(Const.WEB_PICWIDTH);
		kb.setHeight(Const.WEB_PICHEIGHT);

		// 1 - Win7-IE
		// 2 - Win7-Chrome
		// 3 - Win10-IE
		// 4 - Win10-Chrome
		// 5 - Win10-Edge
		// 6 - Mac-Safari
		// 7 - Mac-Chrome
		kb.setTestFlg("7");

		switch (Integer.parseInt(kb.getTestFlg())) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			kb.setKind1("Win10");
			kb.setKind2("17.17134");
			kb.setBrower("Edge");
			kb.setTestKind("Selenide");

			System.setProperty("webdriver.edge.driver", "driver/MicrosoftWebDriver.exe");
			Configuration.timeout = 6000;
			Configuration.browser = "edge";
//	        Configuration.browserSize ="1920x1080";
			Configuration.startMaximized = true;
			ScreenShooter.captureSuccessfulTests = true;
			Configuration.reportsFolder = "IMG";
			break;
		case 6:
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
		case 7:
			kb.setKind1("Mac");
			kb.setKind2("76");
			kb.setBrower("Chrome");
			kb.setTestKind("Selenide");

			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
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
	public void testWeb() {
		try {
			new Task001(kb).run();
//			new Task002(kb).run();
//			new Task003(kb).run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
