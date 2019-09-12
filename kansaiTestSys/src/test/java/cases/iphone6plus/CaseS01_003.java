package cases.iphone6plus;

import common.TXCase;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.IOSHomePage;

public class CaseS01_003 extends TXCase {
	public void action(AppiumDriver driver, String caseId) throws Exception {
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.electricityContract();
		new OutputReport().outputExls(caseId, CaseS01_003.DATALIST);
	}
}
