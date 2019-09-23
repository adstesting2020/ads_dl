package ads.app.mobile.task;

import ads.app.mobile.bean.BaseMobileTaskIF;
import ads.app.mobile.project.sw.cases.s01.*;
import ads.com.BaseTask;
import ads.com.Const;
import io.appium.java_client.AppiumDriver;

public class Task001 extends BaseTask implements BaseMobileTaskIF {
	public void run(AppiumDriver driver) {
		driver.get(Const.SWURL);
		sleep(2000);

		new CaseS01_001(driver).action("S01-1-1");
	}
}
