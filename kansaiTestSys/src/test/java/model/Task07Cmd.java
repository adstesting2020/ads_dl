package model;

import cases.task07.mobile.s01.*;
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
