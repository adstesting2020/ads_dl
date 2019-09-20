package ads.app.web.project.sw.cases.s01;

import ads.app.web.project.sw.pages.HomePage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class CaseS01_001 extends BaseCase implements ADSCaseIFWeb {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-19
	 */
	public void action(KindBean kb) {
		try {
			HomePage cpObj = new HomePage();
			cpObj.switchContractMsgElem("switchContractMsg");
			saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "switchContractMsg.png");

			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
