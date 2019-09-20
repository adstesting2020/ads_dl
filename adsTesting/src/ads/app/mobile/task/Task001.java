package ads.app.mobile.task;

import ads.app.mobile.project.sw.cases.s01.*;
import ads.com.ADSTaskIF;
import ads.com.BaseCase;
import ads.com.Const;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class Task001 extends BaseCase implements ADSTaskIF {
	private AppiumDriver driver;
	private KindBean kb;

	public Task001(AppiumDriver _driver, KindBean _kb) {
		this.driver = _driver;
		this.kb = _kb;
	}

	public void run() {
		driver.get(Const.SWURL);
		sleep(2000);

		kb.setTestCaseId("S01-1-1");
		new CaseS01_001().action(driver, kb);
	}
}
