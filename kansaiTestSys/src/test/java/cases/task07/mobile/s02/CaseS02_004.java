package cases.task07.mobile.s02;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_004 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「電気のご契約」ラベル横のアイコンを確認する。");
		HomePage s1 = new HomePage(driver);
		s1.confirmS02004(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS02_004.DATALIST);
	}
}
