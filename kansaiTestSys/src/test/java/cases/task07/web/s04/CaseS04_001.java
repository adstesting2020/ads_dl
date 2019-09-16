package cases.task07.web.s04;

import common.TXCase;
import model.OutputReport;
import pages.web.ChromeHomePage;

public class CaseS04_001 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(String caseId) throws Exception {
		ChromeHomePage chp = new ChromeHomePage();
		chp.setUserId("test");
		chp.setPassword("test");
		chp.okBtnClick();
		new OutputReport().outputExls(caseId, CaseS04_001.DATALIST);
	}
}
