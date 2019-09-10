package chrome;





import org.junit.Test;
import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;

import dto.DataBean;
import dto.KindBean;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import model.OutputReport;
import pages.LoginPage;
import util.BaseTest;
import util.TestngListener;

import static com.codeborne.selenide.Selenide.*;

import java.io.IOException;
import java.util.ArrayList;



public class TestChrome extends BaseTest{
	public TestChrome() {}
	
	private static ArrayList<DataBean> DATALIST = new ArrayList<DataBean>();
	
	public static void setDataInfo(String msg,String img) {
		DataBean d1 = new DataBean();

		d1.setMsg(msg);
		d1.setImgPath(img);

		DATALIST.add(d1);
	}


	
	@Test
    public void testChrome() throws InterruptedException, IOException {
		
		setUp();
		open("http://www.test-arts.cn/isms/");
		saveScreenshot("setUp");		
		LoginPage lp = new LoginPage();		
        lp.setUserId("test");
        lp.setPassword("test");
        lp.okBtnClick();             
        sleep(2000); 
        close();
      
        
		KindBean kb = new KindBean();

		kb.setTestCaseId("T001");
		kb.setKind1("スマホ");
		kb.setKind2("Android 7.0");
		kb.setBrower("Chrome");
		kb.setTestKind("Appium");


		new OutputReport().outputExls(kb, TestChrome.DATALIST);
        
    }
	

	
}
