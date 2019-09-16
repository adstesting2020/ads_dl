package cases.task07.mobile.s02;

import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;

public class CaseS02_021 {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「番号」ラベルを確認する。");
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.kansaiElectricPower();
		s1.setOtherShrines2();
		s1.enterCustomerNumber();
		s1.enter(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS02_016.DATALIST);
	}
}
