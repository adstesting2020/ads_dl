package ads.app.web.project.isms.cases.s01;

import ads.app.web.bean.BaseWebCaseIF;
import ads.app.web.bean.BaseWebCase;
import ads.app.web.project.isms.pages.LoginPage;

public class Case_001 extends BaseWebCase implements BaseWebCaseIF {
	public Case_001() {
		super();
	}

	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-11
	 */
	public void action(String caseId) {
		try {
			LoginPage chp = new LoginPage();

			chp.setUserId("test");
			chp.setPassword("test");
			chp.okBtnClick();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
