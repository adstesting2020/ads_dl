package cases.task07.mobile.s02;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;

public class CaseS02_008 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「ガスのご契約」ラベルのを確認する。");
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.gasContactlabel(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS02_008.DATALIST);
	}
}


