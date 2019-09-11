package cases.iphone6plus;

import common.TXCase;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.IOSHomePage;


public class Case001 extends TXCase{
	public void action(AppiumDriver driver) throws Exception {
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.currentContractConditions();
		new OutputReport().outputExls("1-1", Case001.DATALIST);
	}
}
