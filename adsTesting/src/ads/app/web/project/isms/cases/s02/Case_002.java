package ads.app.web.project.isms.cases.s02;

import ads.app.web.project.isms.pages.LoginPage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class Case_002 extends BaseCase implements ADSCaseIFWeb {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-11
	 */
	public void action(KindBean kb) {
		try {
			LoginPage pageObj = new LoginPage();

			pageObj.setUserId("test");
			pageObj.setPassword("test");
			pageObj.okBtnClick();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
