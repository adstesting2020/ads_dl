package cases.task07.mobile.s03;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;


public class CaseS03_003 extends TXCase{
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage pageObj = new HomePage(driver);
		pageObj.setOtherShrines1("「ガスのご契約」-「他社（関西電力以外）」ラジオボタンを選択する");
		new ReportCmd().outputExls(kb, CaseS03_003.DATALIST);
	}
}
