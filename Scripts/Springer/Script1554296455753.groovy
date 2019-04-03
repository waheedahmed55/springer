import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://link.springer.com/')
WebUI.maximizeWindow()
WebUI.delay(2)
//Search result should be display as per provided search input.
WebUI.setText(findTestObject('Object Repository/- Springer/SearchInputField'),'Geography')
WebUI.delay(2)
WebUI.doubleClick(findTestObject('Object Repository/- Springer/SearchInputField'))
WebUI.delay(2)
// Validate search result counts.
ResultTo = WebUI.getText(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/main'))
WebUI.delay(2)

//Validate search functionality with invalid data and verify message.
WebUI.setText(findTestObject('Object Repository/- Springer/SearchInputField'),'@@33444455@33')
WebUI.delay(2)
WebUI.doubleClick(findTestObject('Object Repository/- Springer/SearchInputField'))
WebUI.delay(2)

ResultInvalidData = WebUI.getText(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/main'))
WebUI.delay(2)
//Validate search functionality with data which doesn’t auto populate.
WebUI.setText(findTestObject('Object Repository/- Springer/SearchInputField'),'javapaper')
WebUI.delay(2)
WebUI.doubleClick(findTestObject('Object Repository/- Springer/SearchInputField'))
WebUI.delay(2)
ResultUnpopulateData = WebUI.getText(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/main'))
WebUI.delay(2)
//  Validate auto populate functionality with minimum and maximum character.
WebUI.setText(findTestObject('Object Repository/- Springer/SearchInputField'),'e')
WebUI.delay(2)
WebUI.doubleClick(findTestObject('Object Repository/- Springer/SearchInputField'))
WebUI.delay(2)
ResultMinimumData = WebUI.getText(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/main'))
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/- Springer/SearchInputField'),'The Desensitisation as A3 Adenosine Receptor Regulation: Physiopathological ImplicationsMaria Letizia Trincavelli, Osele Ciampi, Claudia MartiniPages 75-90')
WebUI.delay(2)
WebUI.doubleClick(findTestObject('Object Repository/- Springer/SearchInputField'))
WebUI.delay(2)
ResultMaximumData = WebUI.getText(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/main'))
WebUI.delay(2)
//Validate the search result page consistency even after doing login /logout from search result page.
WebUI.click(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/SignUPLogIn'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/- Springer/Page_Create Account - Springer/input_Email_IDToken1'))
WebUI.setText(findTestObject('Object Repository/- Springer/Page_Create Account - Springer/input_Password_IDToken2'))
WebUI.doubleClick(findTestObject('Object Repository/- Springer/Page_Create Account - Springer/button_Log in'))
WebUI.delay(3)
ResultInLogIn = WebUI.getText(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/main'))
WebUI.delay(3)
WebUI.doubleClick(findTestObject('Object Repository/- Springer/Page_Home - Springer/img_Ashok Yadav_flyout-caption-icon'))
WebUI.doubleClick(findTestObject('Object Repository/- Springer/Page_Home - Springer/a_Logout'))
ResultInLogOut = WebUI.getText(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/main'))
WebUI.delay(3)



//Validate the input data on search result page.
WebUI.setText(findTestObject('Object Repository/- Springer/SearchInputField'),'sesbania javanica')
WebUI.delay(2)
WebUI.doubleClick(findTestObject('Object Repository/- Springer/SearchInputField'))
WebUI.delay(2)
WebUI.doubleClick(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/a_Sesbania javanica'))
WebUI.delay(2)

RelativeData = WebUI.getText( findTestObject('Object Repository/- Springer/Page_Sesbania javanica  SpringerLink/LinkINTER'))

//Validate the search should be perform on hitting the enter key after providing input.
//WebUI.setText(findTestObject('Object Repository/- Springer/SearchInputField'),'english')
//WebUI.delay(2)
//WebUI.doubleClick(findTestObject('Object Repository/- Springer/SearchInputField'))
//WebUI.delay(2)
//Robot robot = new Robot();
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
//ResultEnterKey = WebUI.getText(findTestObject('Object Repository/- Springer/Page_Search Results - Springer/main'))
//WebUI.delay(2)

WebUI.closeBrowser()


