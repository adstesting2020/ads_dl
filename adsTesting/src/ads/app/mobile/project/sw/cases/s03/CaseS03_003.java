package ads.app.mobile.project.sw.cases.s03;

import ads.app.mobile.project.sw.pages.HomePage;
import ads.com.ADSCaseIFMobile;
import ads.com.BaseCase;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class CaseS03_003 extends BaseCase implements ADSCaseIFMobile {
	public void action(AppiumDriver driver, KindBean kb) {
		HomePage hpObj = new HomePage(driver);

		// 1-8
		hpObj.btn1_2Click("img00.jpg");
		hpObj.btn2_1Click("img01.jpg");
		hpObj.btn3_1Click("img02.jpg");
		hpObj.setInput1("img04.jpg", "01");
		hpObj.clickH4_4("img03.jpg");

		hpObj.clickIntroduction("case1-8.jpg");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "case1-8.jpg");

		// 1-9
		hpObj.clickClose("case1-9.jpg");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面", "case1-9.jpg");

		// 输出报告
		super.outputExls(kb);
	}
}
