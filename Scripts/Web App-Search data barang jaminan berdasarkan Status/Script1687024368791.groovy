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

WebUI.callTestCase(findTestCase('Web App-Melihat Halaman Inventory'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Teregistrasi'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Tersimpan'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Menunggu'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Diizinkan'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Dipinjam'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Checkout Tanpa Izin'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Ditebus'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Diambil'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Dikoreksi'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Kadaluwarsa'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Teregistrasi'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_barang jaminan teregistrasi'), 
        'barang jaminan teregistrasi')
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Teregistrasi'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Tersimpan'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_barang jaminan tersimpan'), 
        'barang jaminan tersimpan')
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Tersimpan'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Menunggu'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_barang jaminan menunggu approval'), 
        'barang jaminan menunggu approval')
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Menunggu'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Diizinkan'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_barang jaminan diijinkan untuk dipinja_a1011b'), 
        'barang jaminan diijinkan untuk dipinjam, tetapi masih tersimpan di gudang')
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Diizinkan'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Dipinjam'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5, FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Dipinjam'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Checkout Tanpa Izin'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_barang jaminan checkout tanpa ijin'), 
        'barang jaminan checkout tanpa ijin')
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Checkout Tanpa Izin'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Ditebus'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5, FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Ditebus'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Diambil'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5, FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Diambil'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Dikoreksi'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 0)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_barang jaminan dikoreksi'), 
        'barang jaminan dikoreksi')
}

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Dikoreksi'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/span_Kadaluwarsa'))

WebUI.click(findTestObject('Object Repository/Page_RFID - Inventory Management System/button_Cari'))

if (true) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_RFID - Inventory Management System/div_1'), 5, FailureHandling.OPTIONAL)
}

