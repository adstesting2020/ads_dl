package cases.task07.mobile.s01;

import common.TXCase;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import model.ReportCmd;
import pages.mobile.IOSHomePage;

public class CaseS01_014 extends TXCase {
	public void action(AppiumDriver driver, KindBean kb) throws Exception {
		IOSHomePage s1 = new IOSHomePage(driver);

		new ReportCmd().outputExls(kb, CaseS01_014.DATALIST);
	}
}
