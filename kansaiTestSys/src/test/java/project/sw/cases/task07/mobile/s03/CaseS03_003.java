package project.sw.cases.task07.mobile.s03;

import dto.BaseCase;
import dto.ElementMobile;
import dto.KindBean;
import project.sw.pages.mobile.HomePage;
import io.appium.java_client.AppiumDriver;

public class CaseS03_003 extends BaseCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage hpObj = new HomePage(driver);
		
		//1-8
		hpObj.btn1_2Click("img00.jpg");
		hpObj.btn2_1Click("img01.jpg");
		hpObj.btn3_1Click("img02.jpg");
		hpObj.setInput1("img04.jpg", "01");
		hpObj.clickH4_4("img03.jpg");
		
		hpObj.clickIntroduction("case1-8.jpg");
		saveReportInfo("「？お客さま番号の確認方法」ボタンを押下する。", "case1-8.jpg");

		//1-9
		hpObj.clickClose("case1-9.jpg");
		saveReportInfo("「お客さま番号の確認方法」ダイアログを閉じる。", "case1-9.jpg");

		// 输出报告
		super.outputExls(kb);
	}
}
