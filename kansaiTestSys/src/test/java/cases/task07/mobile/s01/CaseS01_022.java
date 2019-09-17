package cases.task07.mobile.s01;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

/*
 * @author:Liu.JW
 * @date:2019-09-16
 * */

public class CaseS01_022 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage hpObj = new HomePage(driver);
		hpObj.clickElectricContractKansaiElectricPower();
		hpObj.clickGasContractOtherCompanies();
		hpObj.clickSelectCustomerNumber();
		hpObj.InputIntoSchedule("「日程」入力欄に'01'を入力する。", "01");
		new ReportCmd().outputExls(kb, CaseS01_022.DATALIST);
	}
}
