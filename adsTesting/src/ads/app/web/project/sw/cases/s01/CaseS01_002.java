package ads.app.web.project.sw.cases.s01;

import ads.app.web.project.sw.pages.HomePage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class CaseS01_002 extends BaseCase implements ADSCaseIFWeb {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-19
	 */
	public void action(KindBean kb) {
		try {
			HomePage cpObj = new HomePage();
			
			cpObj.kansaiElectric1Click("kansaiElectri");
			cpObj.otherShrines2Click("otherShrines");
			saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "otherShrines.png");
			
			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
