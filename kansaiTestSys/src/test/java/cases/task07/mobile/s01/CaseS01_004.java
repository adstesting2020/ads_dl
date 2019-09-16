package cases.task07.mobile.s01;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.mobile.TestMobile;

public class CaseS01_004 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		TestMobile chp = new TestMobile(driver);
		chp.setUserId("test");
		chp.setPassword("test");
		chp.okBtnClick();
		new OutputReport().outputExls(kb, CaseS01_004.DATALIST);
	}
}
