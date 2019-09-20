package ads.app.web.task;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import ads.app.web.project.sw.cases.s02.*;
import ads.com.ADSTaskIF;
import ads.com.BaseCase;
import ads.com.Const;
import ads.com.KindBean;

public class Task003 extends BaseCase implements ADSTaskIF {
	private KindBean kb;

	public Task003(KindBean _kb) {
		this.kb = _kb;
	}

	private void test01() {
		open(Const.SWURL);
		sleep(2000);

		// S03-01&04 QsQ
		kb.setTestCaseId("S03-01&04");
		new CaseS03_001().action(kb);
		close();
	}

	private void test02() {
		open(Const.SWURL);
		sleep(2000);

		// S03-02&03&07 QsQ
		kb.setTestCaseId("S03-02&03&07");
		new CaseS03_002().action(kb);
		close();
	}

	private void test03() {
		open(Const.SWURL);
		sleep(2000);

		kb.setTestCaseId("S03-05&06&08-10");
		new CaseS03_003().action(kb);
		close();
	}

	public void run() {
		// S03-01&04 QsQ
		test01();

		// S03-02&03&07 QsQ
		test02();

		// S03-05&06&08-10 QsQ
		test03();
	}
}
