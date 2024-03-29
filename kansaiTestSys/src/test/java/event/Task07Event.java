package event;

import project.sw.cases.task07.web.s01.*;
import project.sw.cases.task07.web.s03.*;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import dto.BaseCase;
import dto.KindBean;

public class Task07Event extends BaseCase {

	private KindBean kb;

	public Task07Event(KindBean _kb) {
		this.kb = _kb;
	}

	private void test03() throws InterruptedException, Exception {
		open("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		kb.setTestCaseId("S03-05&06&08-10");
		new CaseS03_003().action(kb);
		close();
	}

	private void test02() throws InterruptedException, Exception {
		open("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		// S03-02&03&07 QsQ
		kb.setTestCaseId("S03-02&03&07");
		new CaseS03_002().action(kb);
		close();
	}

	private void test01() throws InterruptedException, Exception {
		open("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		// S03-01&04 QsQ
		kb.setTestCaseId("S03-01&04");
		new CaseS03_001().action(kb);
		close();
	}
	
	public void testTask07() throws Exception {
		open("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		// S01-01-25 QsQ
		kb.setTestCaseId("S01-01-12");
		new CaseS01_001().action(kb);

		// S01-13-15 QsQ
		kb.setTestCaseId("S01-13-15");
		new CaseS01_002().action(kb);

		// S01-16-25 QsQ
		kb.setTestCaseId("S01-16-25");
		new CaseS01_003().action(kb);

//		// S02-01-25 QsQ
//		kb.setTestCaseId("S02-01-12");
//		new CaseS01_001().action(kb);
//
//		// S02-13-15 QsQ
//		kb.setTestCaseId("S02-13-15");
//		new CaseS01_002().action(kb);
//
//		// S02-16-25 QsQ
//		kb.setTestCaseId("S02-16-25");
//		new CaseS01_003().action(kb);
		
		//
//		test01();
//		
//		//
//		test02();
//			
//		//
//		test03();

	}
}
