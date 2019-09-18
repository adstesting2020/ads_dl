package event;

import project.sw.cases.task07.mobile.s01.*;
import dto.KindBean;
import io.appium.java_client.AppiumDriver;
import project.sw.cases.task07.mobile.s01.CaseS01_001;

public class Task07Event {
	private AppiumDriver driver;
	private KindBean kb;

	public Task07Event(AppiumDriver _driver, KindBean _kb) {
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

	}
}
