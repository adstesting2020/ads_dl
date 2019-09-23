package ads.app.web.task;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import ads.app.web.bean.BaseWebTaskIF;
import ads.app.web.project.sw.cases.s01.*;
import ads.app.web.project.sw.cases.s02.*;
import ads.com.BaseTask;
import ads.com.Const;

public class Task002 extends BaseTask implements BaseWebTaskIF {
	public void run() {
		open(Const.SWURL);

		sleep(2000);

		// S02-01-12 QsQ
		new CaseS02_001().action("S02-01-12");

		// S02-13-15 QsQ
		new CaseS01_002().action("S02-13-15");

		// S02-16-25 QsQ
		new CaseS01_003().action("S02-16-25");

		close();
	}
}
