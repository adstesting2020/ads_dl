package ads.app.mobile.task;

import ads.app.mobile.project.sw.cases.s02.*;
import ads.com.ADSTaskIF;
import ads.com.BaseCase;
import ads.com.Const;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class Task002 extends BaseCase implements ADSTaskIF {
	private AppiumDriver driver;
	private KindBean kb;

	public Task002(AppiumDriver _driver, KindBean _kb) {
		this.driver = _driver;
		this.kb = _kb;
	}

	public void run() {
		driver.get(Const.SWURL);
		sleep(2000);

		kb.setTestCaseId("S02-1-1");
		new CaseS02_001().action(driver, kb);
	}
}
