package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 16-11-2017.
 */
public class HealthBenefitsCheckValidationTest extends BaseTest {


    public static int Errorcount = 0;


    //METHODS CALLED FOR CHECK VALIDATION FOR ALL FIELDS OF BENIFITS PAGE

    @Test(priority = 0)
    public void Benifits() {


        healthBenefitsCheckValidationPage.BeforeYouBeginBtn();
        healthBenefitsCheckValidationPage.ClickOnBenifitsTab();

    }

    @Test(priority = 1)
    public void Health() {
        int Errorcount = 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            if (healthBenefitsCheckValidationPage.Health.getText().equals("BEGIN")) {
                healthBenefitsCheckValidationPage.ClickonHealth();
                healthBenefitsCheckValidationPage.IframeHealth();
                healthBenefitsCheckValidationPage.ClickOnSelectHealth();
                healthBenefitsCheckValidationPage.ClickSaveHealth();
            } else {

                Errorcount++;

            }
        } catch (AssertionError E) {
            System.out.println("Click on next");

            // Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("BEGIN Button not found for Health");


        }




    }
    @Test(priority = 2, dependsOnMethods = {"Health"})
    public void CheckValidationforEnrollment(){

        try{
            healthBenefitsCheckValidationPage.CheckValidationforEnrollment(prop.getProperty("EnrollmentCode"));
        }
        catch (AssertionError E){
                Errorcount++;

        }
        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Enrollmentcode validation");

        }

    }
    @Test(priority = 3, dependsOnMethods = {"Health"})
    public void CheckValidationforPremium(){

        try{
            healthBenefitsCheckValidationPage.CheckValidationforPremium(prop.getProperty("Premium"));
        }
        catch (AssertionError E){
            Errorcount++;

        }
        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Enrollmentcode validation");

        }

    }


}
