package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 16-11-2017.
 */
public class RetirementCheckValidationTest extends BaseTest {

    public static int Errorcount = 0;


    //METHODS CALLED FOR CHECK VALIDATION FOR ALL FIELDS OF BENIFITS PAGE
    @Test(priority = 0)
    public void Benifits() {


        retirementCheckValidationPage.BeforeYouBeginBtn();
        retirementCheckValidationPage.ClickOnBenifitsTab();

    }
    @Test(priority = 1)
    public void Retirement(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (retirementCheckValidationPage.Retirement.getText().equals("BEGIN")) {

        retirementCheckValidationPage.ClickOnRetirement();
        retirementCheckValidationPage.IframeRetirement();
        retirementCheckValidationPage.ClickOnselectDesinate();
        retirementCheckValidationPage.ClickOnAddDesignate();
        retirementCheckValidationPage.ClickOnSaveDesignate();
    }  else
        {
            Assert.fail();
            System.out.println("Click on next");
            Reporter.log("BEGIN Button not found for Retirement");

        }

    }

    @Test(priority = 1, dependsOnMethods = {"Retirement"})
    public void CheckValidationforEnrollment(){

        try{
            retirementCheckValidationPage.CheckValidationfordesignateType(prop.getProperty("DesignateType"));
        }
        catch (AssertionError E){
            Errorcount++;

        }
        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Desinate validation");

        }

}}