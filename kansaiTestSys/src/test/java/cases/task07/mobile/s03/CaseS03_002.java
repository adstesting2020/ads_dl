package cases.task07.mobile.s03;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;


public class CaseS03_002 extends TXCase{
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「電気のご契約」-「関西電力」ラジオボタンを選択する");
		IOSHomePage s3 = new IOSHomePage(driver);
		s3.setKansaiElectricPower(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS03_002.DATALIST);
	}
}
