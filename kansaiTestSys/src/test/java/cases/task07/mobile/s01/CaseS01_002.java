package cases.task07.mobile.s01;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.mobile.IOSHomePage;

public class CaseS01_002 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.switchContractMsg();
		new OutputReport().outputExls(kb, CaseS01_002.DATALIST);
	}
}
