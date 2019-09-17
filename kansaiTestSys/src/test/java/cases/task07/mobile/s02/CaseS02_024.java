package cases.task07.mobile.s02;

import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_024 {
	/*
	 * @author:Zhu.hn
	 * @date:2019-09-16
	 * */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage pageObj = new HomePage(driver);
		pageObj.kansaiElectricPower();
		pageObj.setOtherShrines2();
		pageObj.enterCustomerNumber();
		pageObj.InputIntoSchedule();
		pageObj.InputIntoPlace();
		pageObj.InputIntoPhone();
		pageObj.enter2("「番号」入力欄に\"5122\"-\"130533\"を入力する。");
		new ReportCmd().outputExls(kb, CaseS02_022.DATALIST);
	}
}
