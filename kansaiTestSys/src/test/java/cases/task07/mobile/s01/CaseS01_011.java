package cases.task07.mobile.s01;
import common.TXCase;
import dto.DataBean;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

	public class CaseS01_011 extends TXCase {
		public void action(AppiumDriver driver, KindBean kb, DataBean dataBean) throws Exception {
			dataBean.setMsg("「他社（関西電力以外）」ラジオボタンを確認する。");
			HomePage s1 = new HomePage(driver);
			s1.radioButon(dataBean.getMsg());
			new ReportCmd().outputExls(kb, CaseS01_011.DATALIST);
		}
	}

