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
			
			sleep(1000);
			
			cpObj.placeElem("14");
			
			sleep(1000);
			
			cpObj.number1Elem("5122");
			
			sleep(1000);
			
			cpObj.number2Elem("130533", "number2");
			saveReportInfo("鏃㈠绱勭⒑瑾嶃兓銈ㄣ儶銈㈠垽瀹氥兓鐢宠炯銇裤儭銉嬨儱銉肩敾闈€��", "number2.png");
			
			super.outputExls(kb);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
