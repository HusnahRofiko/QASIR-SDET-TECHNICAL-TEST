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

int row_ke = Integer.parseInt(findTestData('outlet').getValue('running row ke-', 1))

int row_dari = Integer.parseInt(findTestData('outlet').getValue('hingga ke-', 1))

for (int n = row_ke; n <= row_dari; n++) {
    skenario = findTestData('outlet').getValue('Skenario', n)

    nama_outlet = findTestData('outlet').getValue('nama outlet', n)

    no_outlet = findTestData('outlet').getValue('no outlet', n)

    alamat_outlet = findTestData('outlet').getValue('alamat outlet', n)

    kelurahan = findTestData('outlet').getValue('kelurahan', n)

    kode_pos = findTestData('outlet').getValue('kode pos', n)

    WebUI.click(findTestObject('outlet/btn outlet'))

    WebUI.delay(1)

    if (skenario.equals('Search')) {
        WebUI.setText(findTestObject('outlet/1. nama outlet'), nama_outlet)

        WebUI.setText(findTestObject('outlet/2. no telp'), no_outlet)

        WebUI.sendKeys(findTestObject('outlet/2. no telp'), Keys.chord(Keys.ENTER))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('outlet/4. btn ubah'))

        WebUI.delay(13)

        WebUI.setText(findTestObject('outlet/5. update nama'), nama_outlet)

        WebUI.setText(findTestObject('outlet/6. update telp'), no_outlet)

        WebUI.setText(findTestObject('outlet/7. update alamat'), alamat_outlet)

        WebUI.click(findTestObject('outlet/8. kelurahan'))

        WebUI.sendKeys(findTestObject('outlet/8. kelurahan'), Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

        WebUI.delay(3)

        WebUI.setText(findTestObject('outlet/9. input kelurahan'), kelurahan)

        WebUI.delay(3)

        WebUI.click(findTestObject('outlet/10. pilih kelurahan'))

        WebUI.delay(1)

        WebUI.setText(findTestObject('outlet/11. kode pos'), kode_pos)

        WebUI.click(findTestObject('outlet/12. btn save'))
    }
}

