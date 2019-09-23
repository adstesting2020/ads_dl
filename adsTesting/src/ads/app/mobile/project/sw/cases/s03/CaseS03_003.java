package ads.app.mobile.project.sw.cases.s03;

import ads.app.mobile.bean.BaseMobileCaseIF;
import ads.app.mobile.bean.BaseMobileCase;
import ads.app.mobile.project.sw.pages.HomePage;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class CaseS03_003 extends BaseMobileCase implements BaseMobileCaseIF {
	AppiumDriver driver;

	public CaseS03_003(AppiumDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}

	public void action(KindBean kb) {
		HomePage hpObj = new HomePage(driver);

		// 1-8
		hpObj.btn1_2Click();
		hpObj.btn2_1Click();
		hpObj.btn3_1Click();
		hpObj.setInput1("01");
		hpObj.clickH4_4();

		hpObj.clickIntroduction();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "case1-8.jpg");

		// 1-9
		hpObj.clickClose();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "case1-9.jpg");

		// 输出报告
		super.outputExls(kb);
	}
}
