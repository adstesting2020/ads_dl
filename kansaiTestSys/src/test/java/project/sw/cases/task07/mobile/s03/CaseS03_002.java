package project.sw.cases.task07.mobile.s03;

import dto.BaseCase;
import dto.ElementMobile;
import dto.KindBean;
import project.sw.pages.mobile.HomePage;
import io.appium.java_client.AppiumDriver;

public class CaseS03_002 extends BaseCase {

	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage hpObj = new HomePage(driver);
		
		//1-7
		hpObj.btn1_2Click("img1.jpg");
		hpObj.btn2_1Click("img2.jpg");
		hpObj.btn3_2Click("img3.jpg");

		saveReportInfo("「「はぴeみる電」のID・パスワードを入力する」ラジオボタンを選択する。", "img3.jpg");
		// 输出报告
		super.outputExls(kb);
	}
}
