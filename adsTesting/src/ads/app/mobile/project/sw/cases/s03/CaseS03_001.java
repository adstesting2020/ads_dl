package ads.app.mobile.project.sw.cases.s03;

import ads.app.mobile.project.sw.pages.HomePage;
import ads.com.ADSCaseIFMobile;
import ads.com.BaseCase;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class CaseS03_001 extends BaseCase implements ADSCaseIFMobile {
	public void action(AppiumDriver driver, KindBean kb) {
		try {
			HomePage hpObj = new HomePage(driver);

			// 1-1
			hpObj.btn1_1Click("btn1_1Click.jpg");
			saveReportInfo("「電気のご契約」-「他社（関西電力以外）」ラジオボタンを選択する。", "btn1_1Click.jpg");

			// 1-2
			hpObj.btn1_2Click("btn1_2Click.jpg");
			saveReportInfo("「電気のご契約」-「関西電力」ラジオボタンを選択する。", "btn1_2Click.jpg");

			// 1-3
			hpObj.btn1_1Click("meiyong1.jpg");
			hpObj.btn2_1Click("btn2_1Click.jpg");
			saveReportInfo("「ガスのご契約」-「他社（関西電力以外）」ラジオボタンを選択する。", "btn2_1Click.jpg");

			// 1-4
			hpObj.btn2_2Click("btn2_2Click.jpg");
			saveReportInfo("「ガスのご契約」-「関西電力」ラジオボタンを選択する。", "btn2_2Click.jpg");

			// 1-5
			hpObj.btn2_1Click("meiyong2.jpg");
			hpObj.btn1_2Click("btn1_2AndBtn2_1.jpg");
			hpObj.clickH4_3("h4_3Click.jpg");
			saveReportInfo("「電気のご契約」-「関西電力」ラジオボタンを選択する。「ガスのご契約」-「他社（関西電力以外）」ラジオボタンを選択する。", "h4_3Click.jpg");

			// 1-6
			hpObj.btn3_1Click("btn3_1Click.jpg");
			saveReportInfo("「お客さま番号を入力する」ラジオボタンを選択する。", "btn3_1Click.jpg");

			// 1-10
			hpObj.setInput1("meiyong4.jpg", "01");
			hpObj.setInput2("meiyong5.jpg", "14");
			hpObj.setInput3("meiyong6.jpg", "5122");
			hpObj.setInput4("meiyong7.jpg", "130533");
			hpObj.clickConfirm("case1-10.jpg");
			saveReportInfo("「確定」ボタンを押下する。", "case1-10.jpg");

			// 输出报告
			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
