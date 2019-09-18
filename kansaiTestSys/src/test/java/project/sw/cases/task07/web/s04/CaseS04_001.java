package project.sw.cases.task07.web.s04;

import dto.BaseCase;
import dto.KindBean;
import project.sw.pages.web.HomePage;

public class CaseS04_001 extends BaseCase {
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-11
	 * */
	public void action(KindBean kb) throws Exception {
		HomePage pageObj = new HomePage();
		
		pageObj.setUserId("test");
		pageObj.setPassword("test");
		pageObj.okBtnClick();
		
//		new ReportCmd().outputExls(kb, CaseS04_001.DATALIST);
	}
}
