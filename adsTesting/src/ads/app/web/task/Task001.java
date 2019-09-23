package ads.app.web.task;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

import ads.app.web.bean.BaseWebTaskIF;
import ads.app.web.project.sw.cases.s01.*;
import ads.com.BaseTask;
import ads.com.Const;

public class Task001 extends BaseTask implements BaseWebTaskIF {
	public void run() {
		open(Const.SWURL);

		// 等待输入用户名和密码
		sleep(10000);

		// S01-01-12 QsQ
		new CaseS01_001().action("S01-01-12");

		// S01-13-15 QsQ
		new CaseS01_002().action("S01-13-15");

		// S01-16-25 QsQ
		new CaseS01_003().action("S01-16-25");

		close();
	}
}
