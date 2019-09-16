package cases.task07.web.s03;

import common.TXCase;
import dto.KindBean;
import model.OutputReport;
import pages.web.ChromeHomePage;

public class CaseS03_001 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(KindBean kb) throws Exception {
		ChromeHomePage chp = new ChromeHomePage();
		chp.setUserId("test");
		chp.setPassword("test");
		chp.okBtnClick();
		new OutputReport().outputExls(kb, CaseS03_001.DATALIST);
	}
}
