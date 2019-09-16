package cases.task07.web.s04;

import common.TXCase;
import model.OutputReport;
import pages.web.ChromeHomePage;

public class CaseS04_002 extends TXCase {
	public void action(String caseId) throws Exception {
		ChromeHomePage chp = new ChromeHomePage();
		chp.setUserId("test");
		chp.setPassword("test");
		chp.okBtnClick();
		new OutputReport().outputExls(caseId, CaseS04_002.DATALIST);
	}
}
