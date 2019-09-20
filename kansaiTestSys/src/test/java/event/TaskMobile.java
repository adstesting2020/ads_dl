package event;

import dto.KindBean;
import io.appium.java_client.AppiumDriver;

import project.sw.cases.task07.mobile.s01.*;
import project.sw.cases.task07.mobile.s02.*;
import project.sw.cases.task07.mobile.s03.*;



import dto.BaseCase;
import dto.KindBean;

public class TaskMobile extends BaseCase {
	private AppiumDriver driver;
	private KindBean kb;

	public TaskMobile(AppiumDriver _driver, KindBean _kb) {
		this.driver = _driver;
		this.kb = _kb;
	}
	
	private void task0301() throws InterruptedException, Exception {
		driver.get("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		kb.setTestCaseId("S03-1-1");
		new CaseS03_001().action(driver, kb);
	}
	
	private void task0302() throws InterruptedException, Exception {
		driver.get("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		kb.setTestCaseId("S03-1-2");
		new CaseS03_002().action(driver, kb);
	}
	private void task0303() throws InterruptedException, Exception {
		driver.get("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		kb.setTestCaseId("S03-1-3");
		new CaseS03_003().action(driver, kb);
	}
	
	
	public void runTask01() throws InterruptedException, Exception {
		driver.get("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		kb.setTestCaseId("S01-1-1");
		new CaseS01_001().action(driver, kb);
	}
	
	public void runTask02() throws InterruptedException, Exception {
		driver.get("https://keiyaku.kepco.jp/switch/switch_01");
		Thread.sleep(2000);
		kb.setTestCaseId("S02-1-1");
		new CaseS02_001().action(driver, kb);
	}
	
	public void runTask03() throws InterruptedException, Exception {
		task0301();
		task0302();
		task0303();
		
	}
	
	
}
