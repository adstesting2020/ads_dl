package ads.app.mobile.bean;

import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public interface BaseMobileTaskIF {
	public void run(AppiumDriver driver, KindBean kb);
}
