package cases.task07.mobile.s02;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_022 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage pageObj = new HomePage(driver);
		pageObj.kansaiElectricPower();
		pageObj.setOtherShrines2();
		pageObj.enterCustomerNumber();
		pageObj.InputIntoSchedule();
		pageObj.InputIntoPlace();
		pageObj.InputIntoPhone();
		pageObj.enter2("「日程」入力欄に\"01\"を入力する。");
		new ReportCmd().outputExls(kb, CaseS02_022.DATALIST);
	}
}
