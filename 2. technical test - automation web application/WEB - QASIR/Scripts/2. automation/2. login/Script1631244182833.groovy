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

int row_ke = Integer.parseInt(findTestData('login').getValue('running row ke-', 1))

login = findTestData('login').getValue('Nomor/Email', row_ke)

if (login.equals('nomor')) {
    WebUI.setText(findTestObject('login/1. input no hp'), findTestData('login').getValue('No HP', row_ke))

    WebUI.setText(findTestObject('login/2. password'), GlobalVariable.password //WebUI.click(findTestObject('login/5. tab email'))
        )
} else {
    WebUI.executeJavaScript('document.querySelector("#trigger-tab-email").click()', [])

    WebUI.setText(findTestObject('login/6. input email'), findTestData('login').getValue('Email', row_ke))

    WebUI.setText(findTestObject('login/2. password'), GlobalVariable.password)
}

WebUI.click(findTestObject('login/3. btn masuk'))

WebUI.waitForElementPresent(findTestObject('login/4. beranda'), 10)

