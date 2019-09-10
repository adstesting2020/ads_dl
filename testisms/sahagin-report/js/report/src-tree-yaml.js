/**
 * @type {string}
 */
sahagin.srcTreeYamlStr = (function(){/*
rootClassTable:
  classes:
  - methodKeys: [ios.TestFuc.testIOS-void]
    key: ios.TestFuc
    qname: ios.TestFuc
  - methodKeys: [android.TestAndroid.testAndroid-void]
    key: android.TestAndroid
    qname: android.TestAndroid
formatVersion: 0.9.2
rootMethodTable:
  methods:
  - name: testIOS
    classKey: ios.TestFuc
    codeBody:
    - endLine: 51
      startLine: 51
      code:
        args:
        - {original: '"http://www.test-arts.cn/isms/"', type: string, value: 'http://www.test-arts.cn/isms/'}
        methodKey: org.openqa.selenium.WebDriver.get
        childInvoke: true
        original: driver.get("http://www.test-arts.cn/isms/");
        type: method
        thisInstance: {original: driver, type: unknown}
    - endLine: 54
      startLine: 54
      code: {original: LoginPage lp=new LoginPage(driver);, type: unknown}
    - endLine: 55
      startLine: 55
      code: {original: HomePage hp=new HomePage(driver);, type: unknown}
    - endLine: 57
      startLine: 57
      code:
        args:
        - {original: '"test"', type: string, value: test}
        methodKey: pages.LoginPage.setUserId-String
        original: lp.setUserId("test");
        type: method
        thisInstance: {name: lp, original: lp, type: localVar}
    - endLine: 58
      startLine: 58
      code:
        args:
        - {original: '"test"', type: string, value: test}
        methodKey: pages.LoginPage.setPassword-String
        original: lp.setPassword("test");
        type: method
        thisInstance: {name: lp, original: lp, type: localVar}
    - endLine: 59
      startLine: 59
      code:
        methodKey: pages.LoginPage.okBtnClick-void
        original: lp.okBtnClick();
        type: method
        thisInstance: {name: lp, original: lp, type: localVar}
    - endLine: 60
      startLine: 60
      code:
        methodKey: pages.HomePage.showHistoryBtnClick-void
        original: hp.showHistoryBtnClick();
        type: method
        thisInstance: {name: hp, original: hp, type: localVar}
    - endLine: 61
      startLine: 61
      code:
        methodKey: pages.HomePage.analysBtnClick-void
        original: hp.analysBtnClick();
        type: method
        thisInstance: {name: hp, original: hp, type: localVar}
    - endLine: 62
      startLine: 62
      code:
        methodKey: pages.HomePage.historyBtnClick-void
        original: hp.historyBtnClick();
        type: method
        thisInstance: {name: hp, original: hp, type: localVar}
    key: ios.TestFuc.testIOS-void
  - name: testAndroid
    classKey: android.TestAndroid
    codeBody:
    - endLine: 42
      startLine: 42
      code:
        args:
        - {original: '"http://www.test-arts.cn/isms/"', type: string, value: 'http://www.test-arts.cn/isms/'}
        methodKey: org.openqa.selenium.WebDriver.get
        childInvoke: true
        original: driver.get("http://www.test-arts.cn/isms/");
        type: method
        thisInstance: {original: driver, type: unknown}
    - endLine: 43
      startLine: 43
      code: {original: LoginPage lp=new LoginPage(driver);, type: unknown}
    - endLine: 44
      startLine: 44
      code: {original: HomePage hp=new HomePage(driver);, type: unknown}
    - endLine: 45
      startLine: 45
      code:
        args:
        - {original: '"test"', type: string, value: test}
        methodKey: pages.LoginPage.setUserId-String
        original: lp.setUserId("test");
        type: method
        thisInstance: {name: lp, original: lp, type: localVar}
    - endLine: 46
      startLine: 46
      code:
        args:
        - {original: '"test"', type: string, value: test}
        methodKey: pages.LoginPage.setPassword-String
        original: lp.setPassword("test");
        type: method
        thisInstance: {name: lp, original: lp, type: localVar}
    - endLine: 47
      startLine: 47
      code:
        methodKey: pages.LoginPage.okBtnClick-void
        original: lp.okBtnClick();
        type: method
        thisInstance: {name: lp, original: lp, type: localVar}
    - endLine: 48
      startLine: 48
      code:
        methodKey: pages.HomePage.showHistoryBtnClick-void
        original: hp.showHistoryBtnClick();
        type: method
        thisInstance: {name: hp, original: hp, type: localVar}
    - endLine: 49
      startLine: 49
      code:
        methodKey: pages.HomePage.analysBtnClick-void
        original: hp.analysBtnClick();
        type: method
        thisInstance: {name: hp, original: hp, type: localVar}
    - endLine: 50
      startLine: 50
      code:
        methodKey: pages.HomePage.historyBtnClick-void
        original: hp.historyBtnClick();
        type: method
        thisInstance: {name: hp, original: hp, type: localVar}
    key: android.TestAndroid.testAndroid-void
subMethodTable:
  methods:
  - name: studyBtnClick
    testDoc: click study button
    classKey: pages.HomePage
    codeBody:
    - endLine: 19
      startLine: 19
      code:
        methodKey: org.openqa.selenium.WebElement.click
        original: driver.findElementById("studyBtn_00").click();
        type: method
        thisInstance:
          args:
          - {original: '"studyBtn_00"', type: string, value: studyBtn_00}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementById
          childInvoke: true
          original: driver.findElementById("studyBtn_00")
          type: method
          thisInstance: {original: driver, type: unknown}
    - endLine: 20
      startLine: 20
      code: {original: Thread.sleep(2000);, type: unknown}
    key: pages.HomePage.studyBtnClick-void
  - name: showHistoryBtnClick
    testDoc: click showHistory button
    classKey: pages.HomePage
    codeBody:
    - endLine: 25
      startLine: 25
      code:
        methodKey: org.openqa.selenium.WebElement.click
        original: driver.findElementById("showHistoryBtn").click();
        type: method
        thisInstance:
          args:
          - {original: '"showHistoryBtn"', type: string, value: showHistoryBtn}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementById
          childInvoke: true
          original: driver.findElementById("showHistoryBtn")
          type: method
          thisInstance: {original: driver, type: unknown}
    - endLine: 26
      startLine: 26
      code: {original: Thread.sleep(2000);, type: unknown}
    key: pages.HomePage.showHistoryBtnClick-void
  - name: analysBtnClick
    testDoc: click analys button
    classKey: pages.HomePage
    codeBody:
    - endLine: 31
      startLine: 31
      code:
        methodKey: org.openqa.selenium.WebElement.click
        original: driver.findElementById("analysBtn0").click();
        type: method
        thisInstance:
          args:
          - {original: '"analysBtn0"', type: string, value: analysBtn0}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementById
          childInvoke: true
          original: driver.findElementById("analysBtn0")
          type: method
          thisInstance: {original: driver, type: unknown}
    - endLine: 32
      startLine: 32
      code: {original: Thread.sleep(2000);, type: unknown}
    key: pages.HomePage.analysBtnClick-void
  - name: historyBtnClick
    testDoc: click history button
    classKey: pages.HomePage
    codeBody:
    - endLine: 37
      startLine: 37
      code:
        methodKey: org.openqa.selenium.WebElement.click
        original: driver.findElementById("historyBtn0").click();
        type: method
        thisInstance:
          args:
          - {original: '"historyBtn0"', type: string, value: historyBtn0}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementById
          childInvoke: true
          original: driver.findElementById("historyBtn0")
          type: method
          thisInstance: {original: driver, type: unknown}
    - endLine: 38
      startLine: 38
      code: {original: Thread.sleep(2000);, type: unknown}
    key: pages.HomePage.historyBtnClick-void
  - name: dataBtnClick
    testDoc: 情報セキュリティ　2016年度版
    classKey: pages.DataSecurity
    codeBody:
    - endLine: 22
      startLine: 22
      code:
        methodKey: org.openqa.selenium.WebElement.click
        original: driver.findElementByLinkText("情報セキュリティ　2016年度版").click();
        type: method
        thisInstance:
          args:
          - {original: '"情報セキュリティ　2016年度版"', type: string, value: 情報セキュリティ　2016年度版}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText
          childInvoke: true
          original: driver.findElementByLinkText("情報セキュリティ　2016年度版")
          type: method
          thisInstance: {original: driver, type: unknown}
    - endLine: 23
      startLine: 23
      code: {original: Thread.sleep(5000);, type: unknown}
    key: pages.DataSecurity.dataBtnClick-void
  - name: iosNextBtnClick
    testDoc: 次へios
    classKey: pages.DataSecurity
    codeBody:
    - endLine: 30
      startLine: 30
      code:
        original: List<WebElement> list=driver.findElementsByClassName("XCUIElementTypeButton");
        type: varAssign
        value:
          args:
          - {original: '"XCUIElementTypeButton"', type: string, value: XCUIElementTypeButton}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementsByClassName
          childInvoke: true
          original: driver.findElementsByClassName("XCUIElementTypeButton")
          type: method
          thisInstance: {original: driver, type: unknown}
        var: {name: list, original: list, type: localVar}
    - endLine: 31
      startLine: 31
      code: {original: System.out.println(list.size());, type: unknown}
    - endLine: 32
      startLine: 32
      code:
        methodKey: org.openqa.selenium.WebElement.click
        original: list.get(0).click();
        type: method
        thisInstance:
          args:
          - {original: '0', type: unknown}
          methodKey: java.util.List.get
          original: list.get(0)
          type: method
          thisInstance: {name: list, original: list, type: localVar}
    key: pages.DataSecurity.iosNextBtnClick-void
  - name: androidNextBtnClick
    testDoc: 次へandroid
    classKey: pages.DataSecurity
    codeBody:
    - endLine: 40
      startLine: 40
      code:
        methodKey: org.openqa.selenium.WebElement.click
        original: driver.findElementByXPath("//android.widget.FrameLayout[@resource-id='com.android.chrome:id/compositor_view_holder']/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[2]").click();
        type: method
        thisInstance:
          args:
          - {original: '"//android.widget.FrameLayout[@resource-id=''com.android.chrome:id/compositor_view_holder'']/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[2]"',
            type: string, value: '//android.widget.FrameLayout[@resource-id=''com.android.chrome:id/compositor_view_holder'']/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[2]'}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath
          childInvoke: true
          original: driver.findElementByXPath("//android.widget.FrameLayout[@resource-id='com.android.chrome:id/compositor_view_holder']/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[2]")
          type: method
          thisInstance: {original: driver, type: unknown}
    key: pages.DataSecurity.androidNextBtnClick-void
  - name: setUserId
    testDoc: set ID
    classKey: pages.LoginPage
    argVariables: [value]
    codeBody:
    - endLine: 20
      startLine: 20
      code:
        args:
        - {original: value, type: arg, argIndex: 0}
        methodKey: org.openqa.selenium.WebElement.sendKeys
        original: driver.findElementById("j_username").sendKeys(value);
        type: method
        thisInstance:
          args:
          - {original: '"j_username"', type: string, value: j_username}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementById
          childInvoke: true
          original: driver.findElementById("j_username")
          type: method
          thisInstance: {original: driver, type: unknown}
    key: pages.LoginPage.setUserId-String
  - name: setPassword
    testDoc: set PSW
    classKey: pages.LoginPage
    argVariables: [value]
    codeBody:
    - endLine: 25
      startLine: 25
      code:
        args:
        - {original: value, type: arg, argIndex: 0}
        methodKey: org.openqa.selenium.WebElement.sendKeys
        original: driver.findElementById("j_password").sendKeys(value);
        type: method
        thisInstance:
          args:
          - {original: '"j_password"', type: string, value: j_password}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementById
          childInvoke: true
          original: driver.findElementById("j_password")
          type: method
          thisInstance: {original: driver, type: unknown}
    key: pages.LoginPage.setPassword-String
  - name: okBtnClick
    testDoc: click ok button
    classKey: pages.LoginPage
    codeBody:
    - endLine: 30
      startLine: 30
      code:
        methodKey: org.openqa.selenium.WebElement.click
        original: driver.findElementById("loginBtn").click();
        type: method
        thisInstance:
          args:
          - {original: '"loginBtn"', type: string, value: loginBtn}
          methodKey: org.openqa.selenium.remote.RemoteWebDriver.findElementById
          childInvoke: true
          original: driver.findElementById("loginBtn")
          type: method
          thisInstance: {original: driver, type: unknown}
    - endLine: 31
      startLine: 31
      code: {original: Thread.sleep(2000);, type: unknown}
    key: pages.LoginPage.okBtnClick-void
  - {name: assert, testDoc: 'check that {0}', capture: none, classKey: javaSystem,
    key: javaSystem.assert}
  - {name: equals, testDoc: '''{0}'' equals to ''{1}''', capture: none, classKey: javaSystem,
    key: javaSystem.equals}
  - {name: notEquals, testDoc: '''{0}'' does not equal to ''{1}''', capture: none,
    classKey: javaSystem, key: javaSystem.notEquals}
  - {name: assertEquals, testDoc: '', classKey: junit.framework.Assert, key: 'junit.framework.Assert.assertEquals-double,double'}
  - {name: assertEquals, testDoc: '', classKey: junit.framework.Assert, key: 'junit.framework.Assert.assertEquals-long,long'}
  - {name: assertEquals, testDoc: '', classKey: junit.framework.Assert, key: 'junit.framework.Assert.assertEquals-Object,Object'}
  - {name: assertEquals, testDoc: '', classKey: junit.framework.Assert, key: 'junit.framework.Assert.assertEquals-Object[],Object[]'}
  - {name: is, testDoc: 'equals to ''{0}''', capture: none, classKey: org.hamcrest.core.Is,
    key: org.hamcrest.core.Is.is-Object}
  - {name: is, testDoc: '{0}', capture: none, classKey: org.hamcrest.core.Is, key: org.hamcrest.core.Is.is-org.hamcrest.Matcher}
  - {name: not, testDoc: 'does not equal to ''{0}''', capture: none, classKey: org.hamcrest.core.IsNot,
    key: org.hamcrest.core.IsNot.not-Object}
  - {name: not, testDoc: 'does not equal to ''{0}''', capture: none, classKey: org.hamcrest.core.IsNot,
    key: org.hamcrest.core.IsNot.not-org.hamcrest.Matcher}
  - {name: is, testDoc: 'equals to ''{0}''', capture: none, classKey: org.hamcrest.CoreMatchers,
    key: org.hamcrest.CoreMatchers.is-Object}
  - {name: is, testDoc: '{0}', capture: none, classKey: org.hamcrest.CoreMatchers,
    key: org.hamcrest.CoreMatchers.is-org.hamcrest.Matcher}
  - {name: not, testDoc: 'does not equal to ''{0}''', capture: none, classKey: org.hamcrest.CoreMatchers,
    key: org.hamcrest.CoreMatchers.not-Object}
  - {name: not, testDoc: 'does not equal to ''{0}''', capture: none, classKey: org.hamcrest.CoreMatchers,
    key: org.hamcrest.CoreMatchers.not-org.hamcrest.Matcher}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.junit.Assert,
    key: 'org.junit.Assert.assertEquals-double,double'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.junit.Assert,
    key: 'org.junit.Assert.assertEquals-long,long'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.junit.Assert,
    key: 'org.junit.Assert.assertEquals-Object,Object'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.junit.Assert,
    key: 'org.junit.Assert.assertEquals-Object[],Object[]'}
  - {name: assertThat, testDoc: 'check that ''{0}'' {1}', classKey: org.junit.Assert,
    key: 'org.junit.Assert.assertThat-Object,org.hamcrest.Matcher'}
  - {name: assertThat, testDoc: 'check that ''{1}'' {2}', classKey: org.junit.Assert,
    key: 'org.junit.Assert.assertThat-String,Object,org.hamcrest.Matcher'}
  - {name: assertThat, testDoc: 'check that ''{0}'' {1}', classKey: org.hamcrest.MatcherAssert,
    key: 'org.hamcrest.MatcherAssert.assertThat-Object,org.hamcrest.Matcher'}
  - {name: assertThat, testDoc: 'check that ''{1}'' {2}', classKey: org.hamcrest.MatcherAssert,
    key: 'org.hamcrest.MatcherAssert.assertThat-String,Object,org.hamcrest.Matcher'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.testng.Assert,
    key: 'org.testng.Assert.assertEquals-boolean,boolean'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.testng.Assert,
    key: 'org.testng.Assert.assertEquals-int,int'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.testng.Assert,
    key: 'org.testng.Assert.assertEquals-long,long'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.testng.Assert,
    key: 'org.testng.Assert.assertEquals-Object,Object'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.testng.Assert,
    key: 'org.testng.Assert.assertEquals-Object[],Object[]'}
  - {name: assertEquals, testDoc: 'check that ''{0}'' equals to ''{1}''', classKey: org.testng.Assert,
    key: 'org.testng.Assert.assertEquals-String,String'}
  - {name: get, testDoc: '''{0}''th element of ''{this}''', capture: none, classKey: java.util.List,
    key: java.util.List.get}
  - {name: className, testDoc: 'class name = {0}', capture: none, classKey: org.openqa.selenium.By,
    key: org.openqa.selenium.By.className}
  - {name: cssSelector, testDoc: 'css = {0}', capture: none, classKey: org.openqa.selenium.By,
    key: org.openqa.selenium.By.cssSelector}
  - {name: id, testDoc: 'id = {0}', capture: none, classKey: org.openqa.selenium.By,
    key: org.openqa.selenium.By.id}
  - {name: linkText, testDoc: 'text = {0}', capture: none, classKey: org.openqa.selenium.By,
    key: org.openqa.selenium.By.linkText}
  - {name: name, testDoc: 'name = {0}', capture: none, classKey: org.openqa.selenium.By,
    key: org.openqa.selenium.By.name}
  - {name: partialLinkText, testDoc: 'text = {0}(partial match)', capture: none, classKey: org.openqa.selenium.By,
    key: org.openqa.selenium.By.partialLinkText}
  - {name: tagName, testDoc: 'tag name = {0}', capture: none, classKey: org.openqa.selenium.By,
    key: org.openqa.selenium.By.tagName}
  - {name: xpath, testDoc: 'xpath = {0}', capture: none, classKey: org.openqa.selenium.By,
    key: org.openqa.selenium.By.xpath}
  - {name: findElementByClassName, testDoc: 'element ''class name = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName}
  - {name: findElementByCssSelector, testDoc: 'element ''css = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector}
  - {name: findElementById, testDoc: 'element ''id = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementById}
  - {name: findElementByLinkText, testDoc: 'element ''text = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText}
  - {name: findElementByName, testDoc: 'element ''name = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementByName}
  - {name: findElementByPartialLinkText, testDoc: 'element ''text = {0}(partial match)''',
    classKey: org.openqa.selenium.remote.RemoteWebDriver, key: org.openqa.selenium.remote.RemoteWebDriver.findElementByPartialLinkText}
  - {name: findElementByTagName, testDoc: 'element ''tag name = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementByTagName}
  - {name: findElementByXPath, testDoc: 'element ''xpath = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath}
  - {name: findElementsByClassName, testDoc: 'all elements for ''class name = {0}''',
    classKey: org.openqa.selenium.remote.RemoteWebDriver, key: org.openqa.selenium.remote.RemoteWebDriver.findElementsByClassName}
  - {name: findElementsByCssSelector, testDoc: 'all elements for ''css = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementsByCssSelector}
  - {name: findElementsById, testDoc: 'all elements for ''id = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementsById}
  - {name: findElementsByLinkText, testDoc: 'all elements for ''text = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementsByLinkText}
  - {name: findElementsByName, testDoc: 'all elements for ''name = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementsByName}
  - {name: findElementsByPartialLinkText, testDoc: 'all elements for ''text = {0}(partial
      match)''', classKey: org.openqa.selenium.remote.RemoteWebDriver, key: org.openqa.selenium.remote.RemoteWebDriver.findElementsByPartialLinkText}
  - {name: findElementsByTagName, testDoc: 'all elements for ''tag name = {0}''',
    classKey: org.openqa.selenium.remote.RemoteWebDriver, key: org.openqa.selenium.remote.RemoteWebDriver.findElementsByTagName}
  - {name: findElementsByXPath, testDoc: 'all elements for ''xpath = {0}''', classKey: org.openqa.selenium.remote.RemoteWebDriver,
    key: org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath}
  - {name: getOrientation, testDoc: the screen orientation, classKey: org.openqa.selenium.Rotatable,
    key: org.openqa.selenium.Rotatable.getOrientation}
  - {name: rotate, testDoc: 'rotate the screen to {0}', classKey: org.openqa.selenium.Rotatable,
    key: org.openqa.selenium.Rotatable.rotate}
  - {name: Select, testDoc: 'pull-down for {0}', classKey: org.openqa.selenium.support.ui.Select,
    key: org.openqa.selenium.support.ui.Select.Select}
  - {name: selectByIndex, testDoc: 'select ''{0}''th item of {this}', classKey: org.openqa.selenium.support.ui.Select,
    key: org.openqa.selenium.support.ui.Select.selectByIndex}
  - {name: selectByValue, testDoc: 'select ''value = {0}'' item of {this}', classKey: org.openqa.selenium.support.ui.Select,
    key: org.openqa.selenium.support.ui.Select.selectByValue}
  - {name: selectByVisibleText, testDoc: 'select ''text = {0}'' item of {this}', classKey: org.openqa.selenium.support.ui.Select,
    key: org.openqa.selenium.support.ui.Select.selectByVisibleText}
  - {name: close, testDoc: close the current window, classKey: org.openqa.selenium.WebDriver,
    key: org.openqa.selenium.WebDriver.close}
  - {name: findElement, testDoc: 'element ''{0}''', classKey: org.openqa.selenium.WebDriver,
    key: org.openqa.selenium.WebDriver.findElement}
  - {name: findElements, testDoc: 'all elements for ''{0}''', classKey: org.openqa.selenium.WebDriver,
    key: org.openqa.selenium.WebDriver.findElements}
  - {name: get, testDoc: 'go to the page ''{0}''', classKey: org.openqa.selenium.WebDriver,
    key: org.openqa.selenium.WebDriver.get}
  - {name: getCurrentUrl, testDoc: the current URL, classKey: org.openqa.selenium.WebDriver,
    key: org.openqa.selenium.WebDriver.getCurrentUrl}
  - {name: getTitle, testDoc: the page title, classKey: org.openqa.selenium.WebDriver,
    key: org.openqa.selenium.WebDriver.getTitle}
  - {name: quit, testDoc: terminate the browser, classKey: org.openqa.selenium.WebDriver,
    key: org.openqa.selenium.WebDriver.quit}
  - {name: back, testDoc: go back to the previous page, classKey: org.openqa.selenium.WebDriver$Navigation,
    key: org.openqa.selenium.WebDriver$Navigation.back}
  - {name: forward, testDoc: go forward to the next page, classKey: org.openqa.selenium.WebDriver$Navigation,
    key: org.openqa.selenium.WebDriver$Navigation.forward}
  - {name: refresh, testDoc: reload the page, classKey: org.openqa.selenium.WebDriver$Navigation,
    key: org.openqa.selenium.WebDriver$Navigation.refresh}
  - {name: to, testDoc: 'go to the page ''{0}''', classKey: org.openqa.selenium.WebDriver$Navigation,
    key: org.openqa.selenium.WebDriver$Navigation.to}
  - {name: clear, testDoc: 'clear the text of {this}', classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.clear}
  - {name: click, testDoc: 'click {this}', classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.click}
  - {name: getAttribute, testDoc: 'the ''{0}'' attribute of {this}', classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.getAttribute}
  - {name: getText, testDoc: 'the text of {this}', classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.getText}
  - {name: isDisplayed, testDoc: 'is {this} displayed', classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.isDisplayed}
  - {name: isEnabled, testDoc: 'is {this} enabled', classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.isEnabled}
  - {name: isSelected, testDoc: 'is {this} selected', classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.isSelected}
  - {name: sendKeys, testDoc: 'send keys ''{0}'' to {this}', classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.sendKeys}
  - {name: submit, testDoc: submit the form data, classKey: org.openqa.selenium.WebElement,
    key: org.openqa.selenium.WebElement.submit}
  - {name: findElementByAndroidUIAutomator, testDoc: 'element ''Android UiAutomator
      = {0}''', classKey: io.appium.java_client.android.AndroidDriver, key: io.appium.java_client.android.AndroidDriver.findElementByAndroidUIAutomator}
  - {name: findElementsByAndroidUIAutomator, testDoc: 'all elements for ''Android
      UiAutomator = {0}''', classKey: io.appium.java_client.android.AndroidDriver,
    key: io.appium.java_client.android.AndroidDriver.findElementsByAndroidUIAutomator}
  - {name: isLocked, testDoc: is the screen locked, classKey: io.appium.java_client.android.AndroidDriver,
    key: io.appium.java_client.android.AndroidDriver.isLocked}
  - {name: findElementByAccessibilityId, testDoc: 'element ''accessibility ID = {0}''',
    classKey: io.appium.java_client.AppiumDriver, key: io.appium.java_client.AppiumDriver.findElementByAccessibilityId}
  - {name: findElementsByAccessibilityId, testDoc: 'all elements for ''accessibility
      ID = {0}''', classKey: io.appium.java_client.AppiumDriver, key: io.appium.java_client.AppiumDriver.findElementsByAccessibilityId}
  - {name: hideKeyboard, testDoc: hide the keyboard, classKey: io.appium.java_client.AppiumDriver,
    key: io.appium.java_client.AppiumDriver.hideKeyboard}
  - {name: lockScreen, testDoc: 'lock the screen for {0} seconds', classKey: io.appium.java_client.AppiumDriver,
    key: io.appium.java_client.AppiumDriver.lockScreen}
  - {name: pinch, testDoc: 'zoom out (x:{0}, y:{1}) by pinch-in', classKey: io.appium.java_client.AppiumDriver,
    key: 'io.appium.java_client.AppiumDriver.pinch-int,int'}
  - {name: pinch, testDoc: 'zoom out {0} by pinch-in', classKey: io.appium.java_client.AppiumDriver,
    key: io.appium.java_client.AppiumDriver.pinch-org.openqa.selenium.WebElement}
  - {name: swipe, testDoc: 'swipe from (x:{0}, y:{1}) to (x:{2}, y:{3}) in {4} milliseconds',
    classKey: io.appium.java_client.AppiumDriver, key: io.appium.java_client.AppiumDriver.swipe}
  - {name: tap, testDoc: 'tap (x:{1}, y:{2}) with　{0} fingers for {3} milliseconds',
    classKey: io.appium.java_client.AppiumDriver, key: 'io.appium.java_client.AppiumDriver.tap-int,int,int,int'}
  - {name: tap, testDoc: 'tap {1} with {0} fingers for {2} milliseconds', classKey: io.appium.java_client.AppiumDriver,
    key: 'io.appium.java_client.AppiumDriver.tap-int,org.openqa.selenium.WebElement,int'}
  - {name: zoom, testDoc: 'zoom in (x:{0}, y:{1}) by pinch-out', classKey: io.appium.java_client.AppiumDriver,
    key: 'io.appium.java_client.AppiumDriver.zoom-int,int'}
  - {name: zoom, testDoc: 'zoom in {0} by pinch-out', classKey: io.appium.java_client.AppiumDriver,
    key: io.appium.java_client.AppiumDriver.zoom-org.openqa.selenium.WebElement}
  - {name: findElementByIosUIAutomation, testDoc: 'element ''iOS UIAutomation = {0}''',
    classKey: io.appium.java_client.ios.IOSDriver, key: io.appium.java_client.ios.IOSDriver.findElementByIosUIAutomation}
  - {name: findElementsByIosUIAutomation, testDoc: 'all elements for ''iOS UIAutomation
      = {0}''', classKey: io.appium.java_client.ios.IOSDriver, key: io.appium.java_client.ios.IOSDriver.findElementsByIosUIAutomation}
  - {name: shake, testDoc: shake the device, classKey: io.appium.java_client.ios.IOSDriver,
    key: io.appium.java_client.ios.IOSDriver.shake}
  - {name: AccessibilityId, testDoc: 'accessibility ID = {0}', capture: none, classKey: io.appium.java_client.MobileBy,
    key: io.appium.java_client.MobileBy.AccessibilityId}
  - {name: AndroidUIAutomator, testDoc: 'Android UiAutomator = {0}', capture: none,
    classKey: io.appium.java_client.MobileBy, key: io.appium.java_client.MobileBy.AndroidUIAutomator}
  - {name: IosUIAutomation, testDoc: 'iOS UIAutomation = {0}', capture: none, classKey: io.appium.java_client.MobileBy,
    key: io.appium.java_client.MobileBy.IosUIAutomation}
  - {name: with, testDoc: 'set text ''{0}'' to {this}', classKey: org.fluentlenium.core.action.FillConstructor,
    key: org.fluentlenium.core.action.FillConstructor.with}
  - {name: clear, testDoc: 'clear the text of {this}', classKey: org.fluentlenium.core.domain.FluentList,
    key: org.fluentlenium.core.domain.FluentList.clear}
  - {name: click, testDoc: 'click {this}', classKey: org.fluentlenium.core.domain.FluentList,
    key: org.fluentlenium.core.domain.FluentList.click}
  - {name: getAttribute, testDoc: 'the ''{0}'' attribute of {this}', classKey: org.fluentlenium.core.domain.FluentList,
    key: org.fluentlenium.core.domain.FluentList.getAttribute}
  - {name: getText, testDoc: 'the text of {this}', classKey: org.fluentlenium.core.domain.FluentList,
    key: org.fluentlenium.core.domain.FluentList.getText}
  - {name: getValue, testDoc: 'the value of {this}', classKey: org.fluentlenium.core.domain.FluentList,
    key: org.fluentlenium.core.domain.FluentList.getValue}
  - {name: clear, testDoc: 'clear the text of {this}', classKey: org.fluentlenium.core.domain.FluentWebElement,
    key: org.fluentlenium.core.domain.FluentWebElement.clear}
  - {name: click, testDoc: 'click {this}', classKey: org.fluentlenium.core.domain.FluentWebElement,
    key: org.fluentlenium.core.domain.FluentWebElement.click}
  - {name: getAttribute, testDoc: 'the ''{0}'' attribute of {this}', classKey: org.fluentlenium.core.domain.FluentWebElement,
    key: org.fluentlenium.core.domain.FluentWebElement.getAttribute}
  - {name: getText, testDoc: 'the text of {this}', classKey: org.fluentlenium.core.domain.FluentWebElement,
    key: org.fluentlenium.core.domain.FluentWebElement.getText}
  - {name: getValue, testDoc: 'the value of {this}', classKey: org.fluentlenium.core.domain.FluentWebElement,
    key: org.fluentlenium.core.domain.FluentWebElement.getValue}
  - {name: isDisplayed, testDoc: 'is {this} displayed', classKey: org.fluentlenium.core.domain.FluentWebElement,
    key: org.fluentlenium.core.domain.FluentWebElement.isDisplayed}
  - {name: isEnabled, testDoc: 'is {this} enabled', classKey: org.fluentlenium.core.domain.FluentWebElement,
    key: org.fluentlenium.core.domain.FluentWebElement.isEnabled}
  - {name: isSelected, testDoc: 'is {this} selected', classKey: org.fluentlenium.core.domain.FluentWebElement,
    key: org.fluentlenium.core.domain.FluentWebElement.isSelected}
  - {name: withClass, testDoc: 'class = {0}', capture: none, classKey: org.fluentlenium.core.filter.FilterConstructor,
    key: org.fluentlenium.core.filter.FilterConstructor.withClass-String}
  - {name: withName, testDoc: 'name = {0}', capture: none, classKey: org.fluentlenium.core.filter.FilterConstructor,
    key: org.fluentlenium.core.filter.FilterConstructor.withName-String}
  - {name: withText, testDoc: 'text = {0}', capture: none, classKey: org.fluentlenium.core.filter.FilterConstructor,
    key: org.fluentlenium.core.filter.FilterConstructor.withText-String}
  - {name: $, testDoc: 'element ''{0}{if:1} ({1}){end}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 1, key: 'org.fluentlenium.core.Fluent.$-String,org.fluentlenium.core.filter.Filter[]'}
  - {name: $, testDoc: '''{1}''th element of ''{0}{if:2} ({2}){end}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 2, key: 'org.fluentlenium.core.Fluent.$-String,java.lang.Integer,org.fluentlenium.core.filter.Filter[]'}
  - {name: clear, testDoc: 'clear the text of element ''{0}{if:1} ({1}){end}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 1, key: org.fluentlenium.core.Fluent.clear}
  - {name: click, testDoc: 'click element ''{0}{if:1} ({1}){end}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 1, key: org.fluentlenium.core.Fluent.click}
  - {name: executeScript, testDoc: 'execute JavaScript ''{0}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 1, key: org.fluentlenium.core.Fluent.executeScript}
  - {name: fill, testDoc: 'element ''{0}{if:1} ({1}){end}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 1, key: org.fluentlenium.core.Fluent.fill}
  - {name: find, testDoc: 'element ''{0}{if:1} ({1}){end}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 1, key: 'org.fluentlenium.core.Fluent.find-String,org.fluentlenium.core.filter.Filter[]'}
  - {name: find, testDoc: '''{1}''th element of ''{0}{if:2} ({2}){end}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 2, key: 'org.fluentlenium.core.Fluent.find-String,java.lang.Integer,org.fluentlenium.core.filter.Filter[]'}
  - {name: findFirst, testDoc: 'first element of ''{0}{if:1} ({1}){end}''', classKey: org.fluentlenium.core.Fluent,
    varLengthArgIndex: 1, key: 'org.fluentlenium.core.Fluent.findFirst-String,org.fluentlenium.core.filter.Filter[]'}
  - {name: goTo, testDoc: 'go to the page ''{0}''', classKey: org.fluentlenium.core.Fluent,
    key: org.fluentlenium.core.Fluent.goTo-String}
  - {name: goTo, testDoc: 'go to the page ''{0}''', classKey: org.fluentlenium.core.Fluent,
    key: org.fluentlenium.core.Fluent.goTo-org.fluentlenium.core.FluentPage}
  - {name: takeScreenShot, testDoc: 'save screen capture to ''{0}''', classKey: org.fluentlenium.core.Fluent,
    key: org.fluentlenium.core.Fluent.takeScreenShot-String}
  - {name: title, testDoc: 'page title of {this}', classKey: org.fluentlenium.core.Fluent,
    key: org.fluentlenium.core.Fluent.title}
  - {name: go, testDoc: 'go to the page ''{this}''', classKey: org.fluentlenium.core.FluentPage,
    key: org.fluentlenium.core.FluentPage.go}
  - {name: isAt, testDoc: 'check that the current page is ''{this}''', classKey: org.fluentlenium.core.FluentPage,
    key: org.fluentlenium.core.FluentPage.isAt}
subClassTable:
  classes:
  - testDoc: home page
    methodKeys: [pages.HomePage.studyBtnClick-void, pages.HomePage.showHistoryBtnClick-void,
      pages.HomePage.analysBtnClick-void, pages.HomePage.historyBtnClick-void]
    type: page
    key: pages.HomePage
    qname: pages.HomePage
  - testDoc: dataSecurity page
    methodKeys: [pages.DataSecurity.dataBtnClick-void, pages.DataSecurity.iosNextBtnClick-void,
      pages.DataSecurity.androidNextBtnClick-void]
    type: page
    key: pages.DataSecurity
    qname: pages.DataSecurity
  - testDoc: login page
    methodKeys: [pages.LoginPage.setUserId-String, pages.LoginPage.setPassword-String,
      pages.LoginPage.okBtnClick-void]
    type: page
    key: pages.LoginPage
    qname: pages.LoginPage
  - {key: javaSystem, qname: javaSystem}
  - {key: junit.framework.Assert, qname: junit.framework.Assert}
  - {key: org.hamcrest.core.Is, qname: org.hamcrest.core.Is}
  - {key: org.hamcrest.core.IsNot, qname: org.hamcrest.core.IsNot}
  - {key: org.hamcrest.CoreMatchers, qname: org.hamcrest.CoreMatchers}
  - {key: org.junit.Assert, qname: org.junit.Assert}
  - {key: org.hamcrest.MatcherAssert, qname: org.hamcrest.MatcherAssert}
  - {key: org.testng.Assert, qname: org.testng.Assert}
  - {key: java.util.List, qname: java.util.List}
  - {key: org.openqa.selenium.By, qname: org.openqa.selenium.By}
  - {key: org.openqa.selenium.remote.RemoteWebDriver, qname: org.openqa.selenium.remote.RemoteWebDriver}
  - {key: org.openqa.selenium.Rotatable, qname: org.openqa.selenium.Rotatable}
  - {key: org.openqa.selenium.support.ui.Select, qname: org.openqa.selenium.support.ui.Select}
  - {key: org.openqa.selenium.WebDriver, qname: org.openqa.selenium.WebDriver}
  - {key: org.openqa.selenium.WebDriver$Navigation, qname: org.openqa.selenium.WebDriver$Navigation}
  - {key: org.openqa.selenium.WebElement, qname: org.openqa.selenium.WebElement}
  - {key: io.appium.java_client.android.AndroidDriver, qname: io.appium.java_client.android.AndroidDriver}
  - {key: io.appium.java_client.AppiumDriver, qname: io.appium.java_client.AppiumDriver}
  - {key: io.appium.java_client.ios.IOSDriver, qname: io.appium.java_client.ios.IOSDriver}
  - {key: io.appium.java_client.MobileBy, qname: io.appium.java_client.MobileBy}
  - {key: org.fluentlenium.core.action.FillConstructor, qname: org.fluentlenium.core.action.FillConstructor}
  - {key: org.fluentlenium.core.domain.FluentList, qname: org.fluentlenium.core.domain.FluentList}
  - {key: org.fluentlenium.core.domain.FluentWebElement, qname: org.fluentlenium.core.domain.FluentWebElement}
  - {key: org.fluentlenium.core.filter.FilterConstructor, qname: org.fluentlenium.core.filter.FilterConstructor}
  - {key: org.fluentlenium.core.Fluent, qname: org.fluentlenium.core.Fluent}
  - {key: org.fluentlenium.core.FluentPage, qname: org.fluentlenium.core.FluentPage}

*/}).toString().match(/[^]*\/\*([^]*)\*\/\}$/)[1];