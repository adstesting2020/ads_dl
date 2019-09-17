package cases.task07.mobile.s02;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

public class CaseS02_013 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「関西電力の電気の　お客さま番号 または 「はぴeみる電」のID・パスワード を入力してください。」ラベルを確認する。");
		HomePage s1 = new HomePage(driver);
		s1.customerId(dataBean.getMsg());
		new ReportCmd().outputExls(kb, CaseS02_013.DATALIST);
	}
}

