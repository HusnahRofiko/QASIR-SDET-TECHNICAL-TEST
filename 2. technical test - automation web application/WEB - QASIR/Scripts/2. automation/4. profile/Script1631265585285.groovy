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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.Keys as Keys

row_ke = findTestData('profile')

for (int n = 1; n <= row_ke.getRowNumbers(); n++) {
    nama_depan = findTestData('profile').getValue('nama depan', n)

    nama_belakang = findTestData('profile').getValue('nama belakang', n)

    no_hp = findTestData('profile').getValue('no hp', n)

    email = findTestData('profile').getValue('email', n)

    referral_code = findTestData('profile').getValue('referral code', n)

    WebUI.click(findTestObject('profile/1. btn user'))

    WebUI.click(findTestObject('profile/2. profile pengguna'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('profile/3. nama depan'), nama_depan)

    WebUI.setText(findTestObject('profile/4. nama belakang'), nama_belakang)

    WebUI.setText(findTestObject('profile/5. no hp'), no_hp)

    WebUI.setText(findTestObject('profile/6. email'), email)

    WebUI.setText(findTestObject('profile/7. referralcode'), referral_code)

    WebUI.click(findTestObject('profile/8. btn save'))

    WebUI.delay(2)
}

