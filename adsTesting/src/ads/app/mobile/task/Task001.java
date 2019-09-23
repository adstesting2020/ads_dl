package ads.app.mobile.task;

import ads.app.mobile.bean.ADSMobileTaskIF;
import ads.app.mobile.project.sw.cases.s01.*;
import ads.com.BaseTask;
import ads.com.Const;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class Task001 extends BaseTask implements ADSMobileTaskIF {
	public void run(AppiumDriver driver, KindBean kb) {
		driver.get(Const.SWURL);
		sleep(2000);

		kb.setTestCaseId("S01-1-1");
		new CaseS01_001(driver).action(kb);
	}
}
