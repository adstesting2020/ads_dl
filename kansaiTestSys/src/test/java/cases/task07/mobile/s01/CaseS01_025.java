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

public class CaseS01_025 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「確定」ボタンを確認する。");
		HomePage s1 = new HomePage(driver);
		s1.clickElectricContractKansaiElectricPower();
		s1.clickGasContractOtherCompanies();
		s1.clickSelectCustomerNumber();
		s1.ConfirmConfirmLabel(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS01_025.DATALIST);
	}
}
