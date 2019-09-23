package ads.app.mobile.project.sw.cases.s01;

import ads.app.mobile.bean.BaseMobileCaseIF;
import ads.app.mobile.bean.BaseMobileCase;
import ads.app.mobile.project.sw.pages.HomePage;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class CaseS01_001 extends BaseMobileCase implements BaseMobileCaseIF {
	AppiumDriver driver;

	public CaseS01_001(AppiumDriver _driver) {
		super(_driver);
		this.driver = _driver;
	}

	public void action(String caseId) {
		HomePage hpObj = new HomePage(driver);

		hpObj.mainHeadClick();
		saveReportInfo("即契約確認・エリア判定・申込みメニュー画面", "mainHeadClick.jpg");

		hpObj.btn1_2Click();
		saveReportInfo("", "btn1_2Click.jpg");

		hpObj.btn2_1Click();
		saveReportInfo("", "btn2_1Click.jpg");

		hpObj.btn3_1Click();
		saveReportInfo("", "btn3_1Click.jpg");

		hpObj.setInput1("01");
		hpObj.setInput2("14");
		hpObj.setInput3("5122");
		hpObj.setInput4("130533");
		saveReportInfo("", "input4.jpg");

		hpObj.clickNITTEI();
		saveReportInfo("", "Nittei.jpg");

		// 输出报告
		super.outputExls(caseId);
	}
}
