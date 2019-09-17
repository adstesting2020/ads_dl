package cases.task07.mobile.s01;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

/*
 * @author:Qin.SQ
 * @date:2019-09-16
 * */
public class CaseS01_010 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {

		HomePage s1 = new HomePage(driver);
		s1.currentContractConditions("「ガスのご契約」ラベル横の必須マークを確認する。");
		new ReportCmd().outputExls(kb, CaseS01_010.DATALIST);
	}
}
