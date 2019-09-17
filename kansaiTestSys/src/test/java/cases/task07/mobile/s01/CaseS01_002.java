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
public class CaseS01_002 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		HomePage s1 = new HomePage(driver);
		s1.currentContractConditions("「契約変更を希望されるご住所の、現在の電気とガスのご契約先を選択してください。」ラベルを確認する。");
		new ReportCmd().outputExls(kb, CaseS01_002.DATALIST);
	}
}
