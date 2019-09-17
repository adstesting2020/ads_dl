package cases.task07.mobile.s03;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;

public class CaseS03_005 extends TXCase{
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		String msg = "「電気のご契約」-「関西電力」ラジオボタンを選択する。\r\n「ガスのご契約」-「他社（関西電力以外）」ラジオボタンを選択する。";
		
		IOSHomePage pageObj = new IOSHomePage(driver);
		pageObj.setKansaiElectricPower(msg);
		pageObj.setOtherShrines1(msg);
		
		new ReportCmd().outputExls(kb, CaseS03_005.DATALIST);
	}

}
