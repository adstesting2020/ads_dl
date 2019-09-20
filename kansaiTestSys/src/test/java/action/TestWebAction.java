package action;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;

import common.Const;
import dto.KindBean;
import event.Task07Event;
import event.TaskWeb;
import project.sw.cases.task07.web.s03.CaseS03_001;
import project.sw.cases.task07.web.s03.CaseS03_002;
import project.sw.cases.task07.web.s03.CaseS03_003;

public class TestWebAction {
	private KindBean kb;

//	  1 - Win7-IE 
//	  2 - Win7-Chrome 
//	  3 - Win10-IE 
//	  4 - Win10-Chrome 
//	  5 - Win10-Edge 
//	  6 - Mac-Safari 
//	  7 - Mac-Chrome
	@Before
	public void setup() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		kb = new KindBean();

		kb.setWidth(Const.WEB_PICWIDTH);
		kb.setHeight(Const.WEB_PICHEIGHT);
		
		//
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
			
			System.setProperty("webdriver.edge.driver","driver/MicrosoftWebDriver.exe");
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
		new TaskWeb(kb).runTask();
	}
}
