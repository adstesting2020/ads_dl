package ads.app.mobile.project.sw.cases.s03;

import ads.app.mobile.bean.BaseMobileCaseIF;
import ads.app.mobile.bean.BaseMobileCase;
import ads.app.mobile.project.sw.pages.HomePage;
import io.appium.java_client.AppiumDriver;

public class CaseS03_002 extends BaseMobileCase implements BaseMobileCaseIF {
	AppiumDriver driver;

	public CaseS03_002(AppiumDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}

	public void action(String caseId) {
		HomePage hpObj = new HomePage(driver);

		// 1-7
		hpObj.btn1_2Click();
		hpObj.btn2_1Click();
		hpObj.btn3_2Click();

		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "img3.jpg");
		// 输出报告
		super.outputExls(caseId);
	}
}
