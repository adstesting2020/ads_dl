package cases.task07.mobile.s02;

import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.mobile.IOSHomePage;

public class CaseS02_022 {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「日程」入力欄に\"01\"を入力する。");
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.kansaiElectricPower();
		s1.setOtherShrines2();
		s1.enterCustomerNumber();
		s1.InputIntoSchedule();
		s1.InputIntoPlace();
		s1.InputIntoPhone();
		s1.enter2(dataBean.getMsg());
		new OutputReport().outputExls(kb, CaseS02_016.DATALIST);
	}
}
