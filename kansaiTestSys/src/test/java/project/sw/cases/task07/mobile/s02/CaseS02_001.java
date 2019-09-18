package project.sw.cases.task07.mobile.s02;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import project.sw.pages.mobile.HomePage;

public class CaseS02_001 extends TXCase {
	/*
	 * @author:Liu.JW
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage hpObj = new HomePage(driver);
		hpObj.confirmS02001("「現在のご契約状況」ラベルを確認する。");
		new ReportCmd().outputExls(kb, CaseS02_001.DATALIST);
	}
}
