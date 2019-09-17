package cases.task07.mobile.s03;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;

public class CaseS03_001 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-11
	 */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		IOSHomePage pageObj = new IOSHomePage(driver);
		pageObj.setOtherShrines("「電気のご契約」-「他社（関西電力以外）」ラジオボタンを選択する。");
		new ReportCmd().outputExls(kb, CaseS03_001.DATALIST);
	}
}
