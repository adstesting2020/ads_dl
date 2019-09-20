package project.sw.cases.task07.web.s02;

import dto.BaseCase;
import dto.KindBean;
import project.sw.pages.web.HomePage;

public class CaseS02_001 extends BaseCase {
	
	/*
	 * @author:Qin.SQ
	 * @date:2019-09-19
	 * */
	public void action(KindBean kb) throws Exception {
		HomePage cpObj = new HomePage();
		cpObj.switchContractMsgElem("switchContractMsg");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "switchContractMsg.png");
		cpObj.scrollToOtherShrines2("scrollToOtherShrines2");
		saveReportInfo("既契約確認・エリア判定・申込みメニュー画面。", "scrollToOtherShrines2.png");
		
		super.outputExls(kb);
	}
}
