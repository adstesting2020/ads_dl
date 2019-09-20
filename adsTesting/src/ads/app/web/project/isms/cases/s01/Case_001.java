package ads.app.web.project.isms.cases.s01;

import ads.app.web.project.isms.pages.LoginPage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class Case_001 extends BaseCase implements ADSCaseIFWeb {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-11
	 */
	public void action(KindBean kb) {
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
