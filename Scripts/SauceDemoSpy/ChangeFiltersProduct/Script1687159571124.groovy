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

WebUI.click(findTestObject('Object Repository/RecordSauceDemo/ChangeFilters/span_Name (A to Z)Name (A to Z)Name (Z to A_3f2346'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RecordSauceDemo/ChangeFilters/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'), 
    'za', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RecordSauceDemo/ChangeFilters/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'), 
    'lohi', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RecordSauceDemo/ChangeFilters/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'), 
    'hilo', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RecordSauceDemo/ChangeFilters/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'), 
    'az', true)

WebUI.closeBrowser()

