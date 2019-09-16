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
public class CaseS01_010 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「ガスのご契約」ラベル横の必須マークを確認する。");
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.currentContractConditions(dataBean.getMsg());
		new OutputReport().outputExls(kb, CaseS01_010.DATALIST);
	}
}
