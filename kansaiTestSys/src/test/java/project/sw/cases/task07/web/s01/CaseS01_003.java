package project.sw.cases.task07.web.s01;

import dto.BaseCase;
import dto.KindBean;
import project.sw.pages.web.HomePage;

public class CaseS01_003 extends BaseCase {
	
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-19
	 * */
	public void action(KindBean kb) throws Exception {
		HomePage cpObj = new HomePage();
		cpObj.customerNumElemClick();
		cpObj.scheduleElem("01");
		Thread.sleep(1000);
		cpObj.placeElem("14");
		Thread.sleep(1000);
		cpObj.number1Elem("5122");
		Thread.sleep(1000);
		cpObj.number2Elem("130533","number2");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "number2.png");
		super.outputExls(kb);
	}
}
