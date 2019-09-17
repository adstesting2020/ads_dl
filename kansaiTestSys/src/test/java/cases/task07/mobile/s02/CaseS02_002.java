package cases.task07.mobile.s02;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_002 extends TXCase {
	/*
	 * @author:Liu.JW
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage hpObj = new HomePage(driver);
		hpObj.confirmS02002("「契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。」ラベルを確認する。");
		new ReportCmd().outputExls(kb, CaseS02_002.DATALIST);
	}
}
