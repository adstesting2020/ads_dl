package ads.app.web.project.sw.cases.s02;

import ads.app.web.project.sw.pages.HomePage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class CaseS03_001 extends BaseCase implements ADSCaseIFWeb {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-11
	 */
	public void action(KindBean kb) {
		try {
			HomePage cpObj = new HomePage();
			cpObj.otherShrines1Click("otherShrines001");
			Thread.sleep(1000);
			cpObj.kansaiElectric2Click("kansaiElectric2Click001");
			saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "kansaiElectric2Click001.png");
			Thread.sleep(1000);
			
			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
