package ads.app.web.task;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import ads.app.web.bean.BaseWebTaskIF;
import ads.app.web.project.sw.cases.s01.*;
import ads.app.web.project.sw.cases.s02.*;
import ads.com.BaseTask;
import ads.com.Const;
import ads.com.KindBean;

public class Task002 extends BaseTask implements BaseWebTaskIF {
	public void run() {
		open(Const.SWURL);

		sleep(2000);

		KindBean kb = Const.getRunKindBean();

		// S02-01-12 QsQ
		kb.setTestCaseId("S02-01-12");
		new CaseS02_001().action(kb);

		// S02-13-15 QsQ
		kb.setTestCaseId("S02-13-15");
		new CaseS01_002().action(kb);

		// S02-16-25 QsQ
		kb.setTestCaseId("S02-16-25");
		new CaseS01_003().action(kb);

		close();
	}
}
