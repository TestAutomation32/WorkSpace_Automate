package Testcases;

import Pages.EmergencyContactCheckValidationPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 15-11-2017.
 */
public class EmergencyContactCheckValidationTest extends BaseTest {
    public static int Errorcount = 0;

    //METHODS CALLED FOR CHECK VALIDATION FOR ALL FIELDS OF ABOUTME PAGE
    @Test(priority = 0)
    public void AboutMe() {

        emergencyContactCheckValidationPage.BeforeYouBeginBtn();
        emergencyContactCheckValidationPage.AboutMeBtn();


    }

    @Test(priority  =1)
    public void EmergencyContact(){

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (emergencyContactCheckValidationPage.EmergencyContact.getText().equals("BEGIN")) {

        emergencyContactCheckValidationPage.ClickOnEmergenctContact();
        emergencyContactCheckValidationPage.IframeEG();
        emergencyContactCheckValidationPage.AddContacts();
        emergencyContactCheckValidationPage.ScrollToSaveEmergency();

    }
        else
        {
            Assert.fail();
            System.out.println("Click on next");

        }
        Reporter.log("Emergency Contact data Saved successfully");
    }

    @Test(priority = 2, dependsOnMethods = {"EmergencyContact"})
    public void CheckValidationStreetAdd() {

        try {
            emergencyContactCheckValidationPage.CheckStreetAddvalidation(prop.getProperty("Street"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Street validation");
        }

    }

    @Test(priority = 3, dependsOnMethods = {"EmergencyContact"})
    public void CheckValidationCountry() {

        try {
            emergencyContactCheckValidationPage.CheckCountryvalidation(prop.getProperty("Country1"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank country validation");
        }

    }

    @Test(priority = 4, dependsOnMethods = {"EmergencyContact"})
    public void CheckValidationZipcode() {

        try {
            emergencyContactCheckValidationPage.CheckZipvalidation(prop.getProperty("zipcode"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Zipcode validation");
        }

    }
    @Test(priority = 5, dependsOnMethods = {"EmergencyContact"})
    public void CheckValidationPhonetype() {

        try {
            emergencyContactCheckValidationPage.CheckPhonetypevalidation(prop.getProperty("phonetype"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Phone type validation");
        }

    }
    @Test(priority = 6, dependsOnMethods = {"EmergencyContact"})
    public void CheckValidationPhonetNumber() {

        try {
            emergencyContactCheckValidationPage.CheckPhonenumvalidation(prop.getProperty("phonenumber"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Phone Number validation");
        }

    }
    @Test(priority = 7, dependsOnMethods = {"EmergencyContact"})
    public void CheckValidationFirstname() {

        try {
            emergencyContactCheckValidationPage.CheckFirstnamevalidation(prop.getProperty("Firstname"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Firstname validation");
        }

    }
    @Test(priority = 8, dependsOnMethods = {"EmergencyContact"})
    public void CheckValidationLastname() {

        try {
            emergencyContactCheckValidationPage.CheckLastnamevalidation(prop.getProperty("Lastname"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Lastname validation");
        }

    }
    @Test(priority = 9, dependsOnMethods = {"EmergencyContact"})
    public void CheckValidationRelationship() {

        try {
            emergencyContactCheckValidationPage.CheckRelationshipnamevalidation(prop.getProperty("Relation"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Relationship validation");
        }

    }
}
