package ads.app.web.project.sw.cases.s01;

import ads.app.web.project.sw.pages.HomePage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class CaseS01_003 extends BaseCase implements ADSCaseIFWeb {

	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-19
	 */
	public void action(KindBean kb) {
		try {
			HomePage cpObj = new HomePage();
			cpObj.customerNumElemClick();
			cpObj.scheduleElem("01");
			Thread.sleep(1000);
			cpObj.placeElem("14");
			Thread.sleep(1000);
			cpObj.number1Elem("5122");
			Thread.sleep(1000);
			cpObj.number2Elem("130533", "number2");
			saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "number2.png");
			
			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
