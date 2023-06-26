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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/input_Username_username (1)'), 'fachrama')

WebUI.setEncryptedText(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/input_Password_password (1)'), '52UoxDc1/DNW8KgZEyrIOw==')

WebUI.click(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/a_My Info (1)'))

WebUI.click(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/img_Fachryyy Dan_employee-image'))

WebUI.click(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/i_Change Profile Picture_oxd-icon bi-plus'))

WebUI.click(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/i_Dashboard_oxd-icon bi-caret-down-fill oxd_d2fd49'))

WebUI.click(findTestObject('Object Repository/TestAgain/Page_OrangeHRM/a_Logout (1)'))

WebUI.closeBrowser()

