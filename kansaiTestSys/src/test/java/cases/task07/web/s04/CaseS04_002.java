package cases.task07.web.s04;

import common.TXCase;
import dto.KindBean;
import model.ReportCmd;
import pages.web.HomePage;

public class CaseS04_002 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(KindBean kb) throws Exception {
		HomePage chp = new HomePage();
		chp.setUserId("test");
		chp.setPassword("test");
		chp.okBtnClick();
		new ReportCmd().outputExls(kb, CaseS04_002.DATALIST);
	}
}
