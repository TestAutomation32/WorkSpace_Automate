package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 16-11-2017.
 */
public class LifeInsuranceCheckValidationTest extends BaseTest {


    public static int Errorcount = 0;


    //METHODS CALLED FOR CHECK VALIDATION FOR ALL FIELDS OF BENIFITS PAGE
    @Test(priority = 0)
    public void Benifits() {


        lifeInsuranceCheckValidationPage.BeforeYouBeginBtn();
        lifeInsuranceCheckValidationPage.ClickOnBenifitsTab();

    }
    @Test(priority = 1)
    public void Life(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (lifeInsuranceCheckValidationPage.Life.getText().equals("BEGIN")) {
        lifeInsuranceCheckValidationPage.ClickOnLife();
        lifeInsuranceCheckValidationPage.IframeLife();
        lifeInsuranceCheckValidationPage.ClickonSaveLife();

    }
        else
        {
            Assert.fail();
            System.out.println("Click on next");
            Reporter.log("BEGIN Button not found for Life Insurance");

        }

    }
    @Test(priority = 2, dependsOnMethods = {"Life"})
    public void CheckValidationForBeneficiary(){

        try {
            lifeInsuranceCheckValidationPage.CheckValidationforBeneficiary(prop.getProperty("beneficiary"));
        }
        catch (AssertionError E){
            Errorcount++;

        }
        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Beneficiary validation");
        }
    }
    @Test(priority = 3, dependsOnMethods = {"Life"})
    public void CheckValidationForInsurance(){

        try {
            lifeInsuranceCheckValidationPage.CheckValidationforInsurance(prop.getProperty("insurance"));
        }
        catch (AssertionError E){
            Errorcount++;

        }
        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Insurance validation");
        }
    }
    @Test(priority = 4, dependsOnMethods = {"Life"})
    public void CheckValidationForSignature(){

        try {
            lifeInsuranceCheckValidationPage.CheckValidationforSignature(prop.getProperty("signature"));
        }
        catch (AssertionError E){
            Errorcount++;

        }
        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Signature validation");
        }
    }

}