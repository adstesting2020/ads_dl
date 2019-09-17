package cases.task07.mobile.s02;

import cases.task07.mobile.s01.CaseS01_001;
import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_006 extends TXCase {
	/*
	 * @author:Li.jy
	 * @date:2019-09-16
	 * */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage hpObj = new HomePage(driver);
		hpObj.currentContractConditions("「他社（関西電力以外）」ラジオボタンを確認する。");
		new ReportCmd().outputExls(kb, CaseS01_001.DATALIST);
	}
}
