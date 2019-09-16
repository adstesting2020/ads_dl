package cases.task07.mobile.s01;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;


/*
 * @author:Qin.SQ
 * @date:2019-09-16
 * */

public class CaseS01_023 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「日程」入力欄に'01'を入力する。");
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.clickElectricContractKansaiElectricPower();
		s1.clickGasContractOtherCompanies();
		s1.clickSelectCustomerNumber();
		s1.InputIntoPlace(dataBean.getMsg(),"14");
		new ReportCmd().outputExls(kb, CaseS01_023.DATALIST);
	}
}
