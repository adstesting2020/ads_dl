package cases.task07.mobile.s01;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.mobile.IOSHomePage;


public class CaseS01_012 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「関西電力」ラジオボタンを確認する。");
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.radioButon(dataBean.getMsg());
		new OutputReport().outputExls(kb, CaseS01_012.DATALIST);
	}
}
