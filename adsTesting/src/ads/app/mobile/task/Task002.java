package ads.app.mobile.task;

import ads.app.mobile.bean.BaseMobileTaskIF;
import ads.app.mobile.project.sw.cases.s02.*;
import ads.com.BaseTask;
import ads.com.Const;
import io.appium.java_client.AppiumDriver;

public class Task002 extends BaseTask implements BaseMobileTaskIF {
	public void run(AppiumDriver driver) {
		driver.get(Const.SWURL);
		sleep(2000);

		new CaseS02_001(driver).action("S02-1-1");
	}
}
