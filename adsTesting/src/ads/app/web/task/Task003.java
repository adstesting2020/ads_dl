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
		new CaseS03_001().action("S03-01&04");
		close();
	}

	private void test02(KindBean kb) {
		open(Const.SWURL);
		sleep(10000);

		// S03-02&03&07 QsQ
		new CaseS03_002().action("S03-02&03&07");
		close();
	}

	private void test03(KindBean kb) {
		open(Const.SWURL);
		sleep(10000);

		// S03-05&06&08-10 QsQ
		new CaseS03_003().action("S03-05&06&08-10");
		close();
	}

	public void run() {
		KindBean kb = Const.getRunKindBean();
		
		// S03-01&04 QsQ
		test01(kb);

		// S03-02&03&07 QsQ
		test02(kb);

		// S03-05&06&08-10 QsQ
		test03(kb);
	}
}
