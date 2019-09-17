package cases.task07.mobile.s02;

import cases.task07.mobile.s01.CaseS01_001;
import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_010 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「ガスのご契約」ラベル横の必須マークを確認する。");
		HomePage s1 = new HomePage(driver);
		s1.currentContractConditions(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS01_001.DATALIST);
	}
}

