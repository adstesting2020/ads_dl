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
public class CaseS01_004 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage pageObj = new HomePage(driver);
		
		//
		pageObj.currentContractConditions("「電気のご契約」ラベル横のアイコンを確認する。");
		
		new ReportCmd().outputExls(kb, CaseS01_004.DATALIST);
	}
}
