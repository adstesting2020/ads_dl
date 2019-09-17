package cases.task07.mobile.s01;
import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.HomePage;

	public class CaseS01_011 extends TXCase {
		public void action(AppiumDriver driver, KindBean kb) throws Exception {
			HomePage hpObj = new HomePage(driver);
			hpObj.radioButon("「他社（関西電力以外）」ラジオボタンを確認する。");
			new ReportCmd().outputExls(kb, CaseS01_011.DATALIST);
		}
	}

