package cases.task07.mobile.s01;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;

/*
 * @author:Qin.SQ
 * @date:2019-09-16
 * */
public class CaseS01_006 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {

		IOSHomePage s1 = new IOSHomePage(driver);
		s1.currentContractConditions("「他社（関西電力以外）」ラジオボタンを確認する。");
		new ReportCmd().outputExls(kb, CaseS01_006.DATALIST);
	}
}
