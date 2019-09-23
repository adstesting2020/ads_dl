package ads.app.mobile.task;

import ads.app.mobile.project.sw.cases.s03.*;
import ads.com.ADSTaskIF;
import ads.com.BaseCase;
import ads.com.Const;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class Task003 extends BaseCase implements ADSTaskIF {
	private AppiumDriver driver;
	private KindBean kb;

	public Task003(AppiumDriver _driver, KindBean _kb) {
		this.driver = _driver;
		this.kb = _kb;
	}

	// 1-1 -> 1-6 & 1-10
	private void task0301() {
		driver.get(Const.SWURL);
		sleep(2000);

		kb.setTestCaseId("S03-1-1");
		new CaseS03_001().action(driver, kb);
	}
	
	// 1-7
	private void task0302() {
		driver.get(Const.SWURL);
		sleep(2000);

		kb.setTestCaseId("S03-1-2");
		new CaseS03_002().action(driver, kb);
	}

	// 1-8 & 1-9
	private void task0303() {
		driver.get(Const.SWURL);
		sleep(2000);

		kb.setTestCaseId("S03-1-3");
		new CaseS03_003().action(driver, kb);
	}

	public void run() {
		task0301();
		task0302();
		task0303();
	}
}
