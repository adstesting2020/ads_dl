package model;

import cases.task07.mobile.s01.*;
import cases.task07.mobile.s02.CaseS02_006;
import cases.task07.mobile.s02.CaseS02_007;
import cases.task07.mobile.s02.CaseS02_008;
import cases.task07.mobile.s02.CaseS02_009;
import cases.task07.mobile.s02.CaseS02_010;
import cases.task07.mobile.s02.CaseS02_011;
import cases.task07.mobile.s02.CaseS02_012;
import cases.task07.mobile.s02.CaseS02_013;
import cases.task07.mobile.s02.CaseS02_014;
import cases.task07.mobile.s02.CaseS02_015;
import cases.task07.mobile.s02.CaseS02_016;
import cases.task07.mobile.s02.CaseS02_017;
import cases.task07.mobile.s02.CaseS02_018;
import cases.task07.mobile.s02.CaseS02_019;
import cases.task07.mobile.s02.CaseS02_020;
import cases.task07.mobile.s02.CaseS02_021;
import cases.task07.mobile.s02.CaseS02_022;
import cases.task07.mobile.s02.CaseS02_023;
import cases.task07.mobile.s02.CaseS02_024;
import cases.task07.mobile.s02.CaseS02_025;
import cases.task07.mobile.s03.*;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;

public class Task07Cmd {
	private AppiumDriver driver;
	private KindBean kb;

	public Task07Cmd(AppiumDriver _driver, KindBean _kb) {
		this.driver = _driver;
		this.kb = _kb;
	}

	public void testTask07() throws Exception {
		// S01-1-1 QsQ
		kb.setTestCaseId("S01-1-1");
		new CaseS01_001().action(driver, kb);

		// S01-1-2 QsQ
		kb.setTestCaseId("S01-1-2");
		new CaseS01_002().action(driver, kb);

		// S01-1-3 QsQ
		kb.setTestCaseId("S01-1-3");
		new CaseS01_004().action(driver, kb);

		// S01-1-4 QsQ
		kb.setTestCaseId("S01-1-4");
		new CaseS01_004().action(driver, kb);

		// S01-1-5 QsQ
		kb.setTestCaseId("S01-1-5");
		new CaseS01_004().action(driver, kb);

		// S01-1-6 QsQ
		kb.setTestCaseId("S01-1-6");
		new CaseS01_001().action(driver, kb);

		// S01-1-7 QsQ
		kb.setTestCaseId("S01-1-7");
		new CaseS01_002().action(driver, kb);

		// S01-1-8 QsQ
		kb.setTestCaseId("S01-1-8");
		new CaseS01_004().action(driver, kb);

		// S01-1-9 QsQ
		kb.setTestCaseId("S01-1-9");
		new CaseS01_004().action(driver, kb);

		// S01-1-10 QsQ
		kb.setTestCaseId("S01-1-10");
		new CaseS01_004().action(driver, kb);
		
		// S02-1-7 LjY
		kb.setTestCaseId("S02-1-6");
		new CaseS02_006().action(driver, kb);

		// S02-1-7 LjY
		kb.setTestCaseId("S02-1-7");
		new CaseS02_007().action(driver, kb);

		// S02-1-8 LjY
		kb.setTestCaseId("S02-1-8");
		new CaseS02_008().action(driver, kb);
		
		// S02-1-9 LjY
		kb.setTestCaseId("S02-1-9");
		new CaseS02_009().action(driver, kb);

		// S02-1-10 LjY
		kb.setTestCaseId("S02-1-10");
		new CaseS02_010().action(driver, kb);

		// S02-1-11 LjY
		kb.setTestCaseId("S02-1-11");
		new CaseS02_011().action(driver, kb);
		
		// S02-1-12 LjY
		kb.setTestCaseId("S02-1-12");
		new CaseS02_012().action(driver, kb);
		
		// S02-1-13 LjY
		kb.setTestCaseId("S02-1-13");
		new CaseS02_013().action(driver, kb);

		// S02-1-14 LjY
		kb.setTestCaseId("S02-1-14");
		new CaseS02_014().action(driver, kb);

		// S02-1-15 LjY
		kb.setTestCaseId("S02-1-15");
		new CaseS02_015().action(driver, kb);
		
		// S02-1-16 ZhN
		kb.setTestCaseId("S02-1-16");
		new CaseS02_016().action(driver, kb);

		// S02-1-17 ZhN
		kb.setTestCaseId("S02-1-17");
		new CaseS02_017().action(driver, kb);
		
		// S02-1-18 ZhN
		kb.setTestCaseId("S02-1-18");
		new CaseS02_018().action(driver, kb);
		
		// S02-1-19 ZhN
		kb.setTestCaseId("S02-1-19");
		new CaseS02_019().action(driver, kb);
		
		// S02-1-20 ZhN
		kb.setTestCaseId("S02-1-20");
		new CaseS02_020().action(driver, kb);

		// S02-1-21 ZhN
		kb.setTestCaseId("S02-1-21");
		new CaseS02_021().action(driver, kb);

		// S02-1-22 ZhN
		kb.setTestCaseId("S02-1-22");
		new CaseS02_022().action(driver, kb);

		// S02-1-23 ZhN
		kb.setTestCaseId("S02-1-23");
		new CaseS02_023().action(driver, kb);
		
		// S02-1-24 ZhN
		kb.setTestCaseId("S02-1-24");
		new CaseS02_024().action(driver, kb);

		// S02-1-25 ZhN
		kb.setTestCaseId("S02-1-25");
		new CaseS02_025().action(driver, kb);
		
		// S03-1-1 YsN
		kb.setTestCaseId("S03-1-1");
		new CaseS03_001().action(driver, kb);

		// S03-1-2 YsN
		kb.setTestCaseId("S03-1-2");
		new CaseS03_002().action(driver, kb);

		// S03-1-3 YsN
		kb.setTestCaseId("S03-1-3");
		new CaseS03_003().action(driver, kb);

		// S03-1-4 YsN
		kb.setTestCaseId("S03-1-4");
		new CaseS03_004().action(driver, kb);

		// S03-1-5 YsN
		kb.setTestCaseId("S03-1-5");
		new CaseS03_005().action(driver, kb);

		// S03-1-6 YsN
		kb.setTestCaseId("S03-1-6");
		new CaseS03_006().action(driver, kb);

	}
}
