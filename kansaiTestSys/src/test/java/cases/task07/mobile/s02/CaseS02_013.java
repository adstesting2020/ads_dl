package cases.task07.mobile.s02;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_013 extends TXCase {
	/*
	 * @author:Li.jy
	 * @date:2019-09-16
	 * */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage pageObj = new HomePage(driver);
		pageObj.customerId("「関西電力の電気の　お客さま番号 または 「はぴeみる電」のID・パスワード を入力してください。」ラベルを確認する。");
		new ReportCmd().outputExls(kb, CaseS02_013.DATALIST);
	}
}

