package ads.app.web.project.sw.cases.s03;

import ads.app.web.project.sw.pages.HomePage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class CaseS03_001 extends BaseCase implements ADSCaseIFWeb {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-23
	 */
	public void action(KindBean kb) {
		HomePage cpObj = new HomePage();
		
		//点击「電気のご契約」-「他社（関西電力以外）」
		cpObj.otherShrines1Click("otherShrines001");
		sleep(1000);
		
		//点击「ガスのご契約」-「関西電力」并截图
		cpObj.kansaiElectric2Click("kansaiElectric2Click001");		
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "kansaiElectric2Click001.png");
		sleep(1000);
		
		super.outputExls(kb);
	}
}