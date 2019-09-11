package cases.iphone6plus;

import common.TXCase;
import io.appium.java_client.AppiumDriver;
import model.OutputReport;
import pages.IOSHomePage;

public class Case003 extends TXCase {
	public void action(AppiumDriver driver) throws Exception {
		IOSHomePage s1 = new IOSHomePage(driver);
		s1.electricityContract();
		new OutputReport().outputExls("1-3", Case003.DATALIST);
	}
}
