package cases.task07.mobile.s03;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;

public class CaseS03_006 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		IOSHomePage pageObj = new IOSHomePage(driver);

		String msg = "「お客さま番号を入力する」ラジオボタンを選択する。";
		
		pageObj.setKansaiElectricPower(msg);
		pageObj.setOtherShrines1(msg);
		pageObj.setemployee(msg);

		new ReportCmd().outputExls(kb, CaseS03_006.DATALIST);
	}
}