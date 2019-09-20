package ads.app.web.project.sw.cases.s02;

import ads.app.web.project.sw.pages.HomePage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class CaseS03_002 extends BaseCase implements ADSCaseIFWeb {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-11
	 */
	public void action(KindBean kb) {
		try {
			HomePage cpObj = new HomePage();
			cpObj.kansaiElectric1Click("kansaiElectric1002");
			Thread.sleep(1000);
			cpObj.otherShrines2Click("otherShrines2Click");
			cpObj.idPasswordElemClick("idPasswordClick002");
			saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "idPasswordClick002.png");
			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
