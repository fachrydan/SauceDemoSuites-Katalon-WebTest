import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SauceDemoSpy/LoginSucces'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('SpySauceDemo/Page_Swag Labs/GetText_SwagLabs'))

WebUI.getText(findTestObject('SpySauceDemo/Page_Swag Labs/GetText_Footer SauceDemo'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/button_Add to cart'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/button_Back to products'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/div_Sauce Labs Bike Light'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/button_Add to cart_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/button_Back to products'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/a_2'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/button_Remove'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/SauceDemoAddRemoveCart/button_Remove_1'))

WebUI.click(findTestObject('SpySauceDemo/Cart/button_Continue Shopping'))

WebUI.delay(1)

WebUI.closeBrowser()

