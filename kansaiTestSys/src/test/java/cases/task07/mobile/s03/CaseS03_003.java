package cases.task07.mobile.s03;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;


public class CaseS03_003 extends TXCase{
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「ガスのご契約」-「他社（関西電力以外）」ラジオボタンを選択する");
		IOSHomePage s3 = new IOSHomePage(driver);
		s3.setOtherShrines1(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS03_003.DATALIST);
	}
}
