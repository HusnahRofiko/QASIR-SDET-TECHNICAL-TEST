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


HashMap<String, Integer> row1 = new HashMap<String, Integer>();
   row1.put("a", 10);
   row1.put("b", 20);
   row1.put("c", 30);
 
HashMap<String, Integer> row2 = new HashMap<String, Integer>();
   row2.put("a", 3);
   row2.put("c", 6);
   row2.put("d", 3);

HashMap<String, Integer> SumRow = new HashMap<String, Integer>();

char alphabet;
for (alphabet = 'a'; alphabet <= 'd'; alphabet++) {
   nilairow1 = row1.get(""+alphabet+"");
   nilairow2= row2.get(""+alphabet+"");
   if((nilairow1).equals(null)){
	   totalrow = nilairow2;
	   //System.out.println(totalrow);
	   SumRow.put(""+alphabet+"", totalrow);
	   System.out.println(SumRow);
   }
   else if((nilairow2).equals(null)){
	   totalrow = nilairow1;
	   //System.out.println(totalrow);
	   SumRow.put(""+alphabet+"", totalrow);
	   System.out.println(SumRow);
   }else{
	   totalrow = nilairow1+ nilairow2;
	   //System.out.println(totalrow);
	   SumRow.put(""+alphabet+"", totalrow);
	   System.out.println(SumRow);}
   
   }