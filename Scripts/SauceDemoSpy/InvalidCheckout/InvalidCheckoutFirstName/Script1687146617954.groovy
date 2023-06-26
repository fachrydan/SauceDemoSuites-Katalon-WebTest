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

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/CheckoutSucces/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/CheckoutSucces/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/CheckoutSucces/a_1'))

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/CheckoutSucces/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/RecordSauceDemo/CheckoutSucces/input_Checkout_firstName'), '')

WebUI.setText(findTestObject('Object Repository/RecordSauceDemo/CheckoutSucces/input_Checkout_lastName'), '')

WebUI.setText(findTestObject('Object Repository/RecordSauceDemo/CheckoutSucces/input_Checkout_postalCode'), '')

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/CheckoutSucces/input_Cancel_continue'))

WebUI.getText(findTestObject('SpySauceDemo/Checkout/Alert_Error First NameReq'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

