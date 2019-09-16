package cases.task07.web.s04;

import common.TXCase;
import dto.KindBean;
import model.ReportCmd;
import pages.web.ChromeHomePage;

public class CaseS04_001 extends TXCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(KindBean kb) throws Exception {
		ChromeHomePage pageObj = new ChromeHomePage();
		
		pageObj.setUserId("test");
		pageObj.setPassword("test");
		pageObj.okBtnClick();
		
		new ReportCmd().outputExls(kb, CaseS04_001.DATALIST);
	}
}
