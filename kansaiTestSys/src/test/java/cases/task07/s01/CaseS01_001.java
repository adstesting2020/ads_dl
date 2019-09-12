package cases.task07.s01;

import common.TXCase;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.IOSHomePage;

public class CaseS01_001 extends TXCase {
	public void action(AppiumDriver driver, String caseId) throws Exception {
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.currentContractConditions();
		new OutputReport().outputExls(caseId, CaseS01_001.DATALIST);
	}
}
