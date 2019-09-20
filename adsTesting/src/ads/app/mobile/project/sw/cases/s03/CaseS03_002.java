package ads.app.mobile.project.sw.cases.s03;

import ads.app.mobile.project.sw.pages.HomePage;
import ads.com.ADSCaseIFMobile;
import ads.com.BaseCase;
import ads.com.KindBean;
import io.appium.java_client.AppiumDriver;

public class CaseS03_002 extends BaseCase implements ADSCaseIFMobile {
	public void action(AppiumDriver driver, KindBean kb) {
		try {
			HomePage hpObj = new HomePage(driver);

			// 1-7
			hpObj.btn1_2Click("img1.jpg");
			hpObj.btn2_1Click("img2.jpg");
			hpObj.btn3_2Click("img3.jpg");

			saveReportInfo("「「はぴeみる電」のID・パスワードを入力する」ラジオボタンを選択する。", "img3.jpg");
			// 输出报告
			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
