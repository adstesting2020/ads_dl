package cases.task07.mobile.s03;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;


public class CaseS03_003 extends TXCase{
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		IOSHomePage pageObj = new IOSHomePage(driver);
		pageObj.setOtherShrines1("「ガスのご契約」-「他社（関西電力以外）」ラジオボタンを選択する");
		new ReportCmd().outputExls(kb, CaseS03_003.DATALIST);
	}
}
