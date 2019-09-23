package ads.app.web.task;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import ads.app.web.bean.BaseWebTaskIF;
import ads.app.web.project.sw.cases.s03.*;
import ads.com.BaseTask;
import ads.com.Const;
import ads.com.KindBean;

public class Task003 extends BaseTask implements BaseWebTaskIF {
	private void test01(KindBean kb) {
		open(Const.SWURL);
		sleep(10000);

		// S03-01&04 QsQ
		kb.setTestCaseId("S03-01&04");
		new CaseS03_001().action(kb);
		close();
	}

	private void test02(KindBean kb) {
		open(Const.SWURL);
		sleep(10000);

		// S03-02&03&07 QsQ
		kb.setTestCaseId("S03-02&03&07");
		new CaseS03_002().action(kb);
		close();
	}

	private void test03(KindBean kb) {
		open(Const.SWURL);
		sleep(10000);

		// S03-05&06&08-10 QsQ
		kb.setTestCaseId("S03-05&06&08-10");
		new CaseS03_003().action(kb);
		close();
	}

	public void run(KindBean kb) {
		// S03-01&04 QsQ
		test01(kb);

		// S03-02&03&07 QsQ
		test02(kb);

		// S03-05&06&08-10 QsQ
		test03(kb);
	}
}
