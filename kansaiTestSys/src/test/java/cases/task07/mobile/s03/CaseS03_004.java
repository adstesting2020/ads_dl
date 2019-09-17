package cases.task07.mobile.s03;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS03_004 extends TXCase{
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage pageObj = new HomePage(driver);
		pageObj.setKansaiElectricPower1("「ガスのご契約」-「関西電力」ラジオボタンを選択する");
		new ReportCmd().outputExls(kb, CaseS03_004.DATALIST);
	}
}
