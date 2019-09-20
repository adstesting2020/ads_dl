package ads.app.web.project.sw.cases.s02;

import ads.app.web.project.sw.pages.HomePage;
import ads.com.ADSCaseIFWeb;
import ads.com.BaseCase;
import ads.com.KindBean;

public class CaseS03_003 extends BaseCase implements ADSCaseIFWeb {
	/*
	 * @author:Qin.SQ
	 * 
	 * @date:2019-09-11
	 */
	public void action(KindBean kb) {
		try {
			HomePage cpObj = new HomePage();
			cpObj.kansaiElectric1Click("kansaiElectric1");
			Thread.sleep(1000);
			cpObj.otherShrines2Click("otherShrines2Click");
			Thread.sleep(1000);
			cpObj.customerNumElemClick();
			Thread.sleep(1000);
			cpObj.customerCodeElemClick("customerCodeClick");
			Thread.sleep(1000);
			cpObj.closeElemClick("closeElemClick");
			saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "closeElemClick.png");
			cpObj.scheduleElem("01");
			Thread.sleep(1000);
			cpObj.placeElem("14");
			Thread.sleep(1000);
			cpObj.number1Elem("5122");
			Thread.sleep(1000);
			cpObj.number2Elem("130533", "number3");
			saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "number3.png");
			cpObj.confirmElemClick("confirmElemClick");
			saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "confirmElemClick.png");
			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
