package cases.task07.mobile.s01;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.mobile.IOSHomePage;

/*
 * @author:Qin.SQ
 * @date:2019-09-16
 * */
public class CaseS01_001 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「現在のご契約状況」ラベルを確認する。");
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.currentContractConditions(dataBean.getMsg());
		new OutputReport().outputExls(kb, CaseS01_001.DATALIST);
	}
}