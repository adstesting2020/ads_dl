package cases.task07.mobile.s02;

import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_023 {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「所」入力欄に\"14\"を入力する。");
		HomePage s1 = new HomePage(driver);
		s1.kansaiElectricPower();
		s1.setOtherShrines2();
		s1.enterCustomerNumber();
		s1.InputIntoSchedule();
		s1.InputIntoPlace();
		s1.InputIntoPhone();
		s1.enter2(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS02_016.DATALIST);
	}
}
