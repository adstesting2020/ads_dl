package ads.app.web.task;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import ads.app.web.bean.BaseWebTaskIF;
import ads.app.web.project.sw.cases.s01.*;
import ads.com.BaseTask;
import ads.com.Const;
import ads.com.KindBean;

public class Task001 extends BaseTask implements BaseWebTaskIF {
	public void run() {
		open(Const.SWURL);

		sleep(10000);

		KindBean kb = Const.getRunKindBean();

		// S01-01-12 QsQ
		kb.setTestCaseId("S01-01-12");
		new CaseS01_001().action(kb);

		// S01-13-15 QsQ
		kb.setTestCaseId("S01-13-15");
		new CaseS01_002().action(kb);

		// S01-16-25 QsQ
		kb.setTestCaseId("S01-16-25");
		new CaseS01_003().action(kb);

		close();
	}
}
