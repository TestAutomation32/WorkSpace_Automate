package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 15-11-2017.
 */
public class DisabilityCheckValidationTest extends BaseTest {

    public static int Errorcount= 0;

    //METHODS CALLED FOR CHECK VALIDATION FOR ALL FIELDS OF ABOUTME PAGE
    @Test(priority = 0)
    public void AboutMe() {

        disabilityCheckValidationPage.BeforeYouBeginBtn();
        disabilityCheckValidationPage.AboutMeBtn();


    }
    @Test(priority = 1)
    public void Disability() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (disabilityCheckValidationPage.Disability.getText().equals("BEGIN")) {
            disabilityCheckValidationPage.ClickOnDisability();
            disabilityCheckValidationPage.IframeDisablity();
            disabilityCheckValidationPage.ClickOnYesDisablity();
            disabilityCheckValidationPage.SaveDisablity();
        }
        else
        {
            Assert.fail();
            Reporter.log("BEGIN Button not found for Disability");
        }

}

    @Test(priority = 2,dependsOnMethods = {"Disability"})
    public void CheckVlaidtionForDisablity(){

        try {
            disabilityCheckValidationPage.Disablityvalidation(prop.getProperty("Disability"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Disability validation");

        }
    }


}
