package cases.task07.mobile.s03;

import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.mobile.IOSHomePage;

public class CaseS03_006 extends TXCase{
	public void action(AppiumDriver driver, KindBean kb,DataBean dataBean) throws Exception {
		dataBean.setMsg("「お客さま番号を入力する」ラジオボタンを選択する。");
		IOSHomePage s3 = new IOSHomePage(driver);
		s3.setKansaiElectricPower(dataBean.getMsg());
		s3.setOtherShrines1(dataBean.getMsg());
		s3.setemployee(dataBean.getMsg());
		new OutputReport().outputExls(kb, CaseS03_006.DATALIST);

}
}