package project.sw.cases.task07.web.s03;

import common.TXCase;
import dto.KindBean;
import model.ReportCmd;
import project.sw.pages.web.HomePage;

public class CaseS03_001 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(KindBean kb) throws Exception {
		HomePage chp = new HomePage();
		chp.setUserId("test");
		chp.setPassword("test");
		chp.okBtnClick();
		new ReportCmd().outputExls(kb, CaseS03_001.DATALIST);
	}
}
