package cases.task07.mobile.s01;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;

public class CaseS01_013 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「関西電力の電気の　お客さま番号 または 「はぴeみる電」のID・パスワード を入力してください。」ラベルを確認する。");
		IOSHomePage s1 = new IOSHomePage(driver);
		

		new ReportCmd().outputExls(kb, CaseS01_013.DATALIST);
	}	
}
