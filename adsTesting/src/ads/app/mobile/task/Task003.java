package ads.app.mobile.task;

import ads.app.mobile.bean.BaseMobileTaskIF;
import ads.app.mobile.project.sw.cases.s03.*;
import ads.com.BaseTask;
import ads.com.Const;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class Task003 extends BaseTask implements BaseMobileTaskIF {
	// 1-1 -> 1-6 & 1-10
	private void task0301(AppiumDriver driver, KindBean kb) {
		driver.get(Const.SWURL);
		sleep(2000);

		new CaseS03_001(driver).action("S03-1-1");
	}

	// 1-7
	private void task0302(AppiumDriver driver, KindBean kb) {
		driver.get(Const.SWURL);
		sleep(2000);

		new CaseS03_002(driver).action("S03-1-2");
	}

	// 1-8 & 1-9
	private void task0303(AppiumDriver driver, KindBean kb) {
		driver.get(Const.SWURL);
		sleep(2000);

		new CaseS03_003(driver).action("S03-1-3");
	}

	public void run(AppiumDriver driver) {
		KindBean kb = Const.getRunKindBean();

		task0301(driver, kb);
		task0302(driver, kb);
		task0303(driver, kb);
	}
}
