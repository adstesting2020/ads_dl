package ads.app.mobile.project.sw.cases.s03;

import ads.app.mobile.bean.BaseMobileCaseIF;
import ads.app.mobile.bean.BaseMobileCase;
import ads.app.mobile.project.sw.pages.HomePage;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class CaseS03_001 extends BaseMobileCase implements BaseMobileCaseIF {
	AppiumDriver driver;

	public CaseS03_001(AppiumDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}

	public void action(KindBean kb) {
		HomePage hpObj = new HomePage(driver);

		// 1-1
		hpObj.btn1_1Click();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "btn1_1Click.jpg");

		// 1-2
		hpObj.btn1_2Click();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "btn1_2Click.jpg ");

		// 1-3
		hpObj.btn1_1Click();
		hpObj.btn2_1Click();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "btn2_1Click.jpg");

		// 1-4
		hpObj.btn2_2Click();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "btn2_2Click.jpg");

		// 1-5
		hpObj.btn2_1Click();
		hpObj.btn1_2Click();
		hpObj.clickH4_3();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "h4_3Click.jpg");

		// 1-6
		hpObj.btn3_1Click();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "btn3_1Click.jpg");

		// 1-10
		hpObj.setInput1("01");
		hpObj.setInput2("14");
		hpObj.setInput3("5122");
		hpObj.setInput4("130533");
		hpObj.clickConfirm();
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "case1-10.jpg");

		// 输出报告
		super.outputExls(kb);
	}
}
