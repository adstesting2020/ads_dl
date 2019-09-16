package cases.task07.mobile.s03;

import common.TXCase;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.mobile.IOSHomePage;

public class CaseS03_001 extends TXCase {
	public void action(AppiumDriver driver, String caseId) throws Exception {
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.currentContractConditions();
		new OutputReport().outputExls(caseId, CaseS03_001.DATALIST);
	}
}
