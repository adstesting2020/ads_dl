package cases.task07.mobile.s02;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_004 extends TXCase {
	/*
	 * @author:Liu.JW
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage s1 = new HomePage(driver);
		s1.confirmS02004("「電気のご契約」ラベル横のアイコンを確認する。");
		new ReportCmd().outputExls(kb, CaseS02_004.DATALIST);
	}
}
