package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 13-11-2017.
 */
public class AboutMeValidDataTest extends BaseTest {


    public static int Errorcount = 0;

    //METHODS CALLED FOR ALL VALID DATA FIELDS OF ABOUTME PAGE
    @Test(priority = 0)
    public void AboutMe() {


        aboutMeValidDataPage.BeforeYouBeginBtn();
        aboutMeValidDataPage.AboutMeBtn();

        aboutMeValidDataPage.SavedBtnCheck(prop.getProperty("StatusForBtn"));
        Reporter.log("Personal Information Data Saved successfully");
    }

    @Test(priority = 1)
    public void EmergencyContact(){

        if(aboutMeValidDataPage.EmergencyContact.getText()=="BEGIN") {
            aboutMeValidDataPage.ClickOnEmergencyContact();
            aboutMeValidDataPage.IframeEG();
            aboutMeValidDataPage.AddContacts();
            aboutMeValidDataPage.Firstname(prop.getProperty("First"));
            aboutMeValidDataPage.Laststname(prop.getProperty("last"));
            aboutMeValidDataPage.Relationship();
            aboutMeValidDataPage.AddressSelect();
            aboutMeValidDataPage.EnterPhonetype(prop.getProperty("Phone1"));
            aboutMeValidDataPage.AcceptEmergency();
            aboutMeValidDataPage.SaveEmergencyContact();

        }
        else
        {
            System.out.println("Click on next");

        }
        Reporter.log("Emergency Contact data Saved successfully");
    }



    @Test(priority = 2)
    public void Education() {

        if (aboutMeValidDataPage.Education.getText() == "BEGIN") {
            aboutMeValidDataPage.EmergencySavedBtnCheck(prop.getProperty("StatusForBtn"));
            aboutMeValidDataPage.ClickOnEducation();
            aboutMeValidDataPage.IframeEducation();
            aboutMeValidDataPage.ClcikAddEducation();
            aboutMeValidDataPage.Selectdegree();
            aboutMeValidDataPage.AcceptEducation();
            aboutMeValidDataPage.SaveBtnEducation();
        } else {
            System.out.println("Click on next");

        }
        Reporter.log("Education Data Saved successfully");
    }

    @Test(priority = 3)
    public void Citizenship(){

        if (aboutMeValidDataPage.Citizenship.getText().equals("BEGIN")){

            aboutMeValidDataPage.CitizenshipSavedBtnCheck(prop.getProperty("Menu"));
            aboutMeValidDataPage.ClickOnCitizenship();
            aboutMeValidDataPage.IframeCitizenship();
            aboutMeValidDataPage.SaveCitizenship();

        }
        else {
            System.out.println("Click on next");

        }
        Reporter.log("Citizenship data Saved successfully");
    }

    @Test(priority = 4)
    public void Ethinic(){

        if (aboutMeValidDataPage.Ethnicity_Race.getText().equals("BEGIN")){

            aboutMeValidDataPage.EthinicSavedBtnCheck(prop.getProperty("Menu"));
            aboutMeValidDataPage.ClickOnEthinicRace();
            aboutMeValidDataPage.IframeEthinicRace();
            aboutMeValidDataPage.EnterEthinicDetails();
            aboutMeValidDataPage.SaveEhinicrace();

        }
        else {
            System.out.println("Click on next");

        }
        Reporter.log("Ethinicity data Saved successfully");
    }


    @Test(priority = 5)
    public void Disability(){

        if (aboutMeValidDataPage.Disability.getText().equals("BEGIN")){

            aboutMeValidDataPage.DisabilitySavedBtnCheck(prop.getProperty("Menu"));
            aboutMeValidDataPage.ClickOnDisability();
            aboutMeValidDataPage.IframeDisability();
            aboutMeValidDataPage.EnterDisabilityDetails();
            aboutMeValidDataPage.SaveDisability();

        }
        else {
            System.out.println("Click on next");

        }
        Reporter.log("Disability data Saved successfully");
    }

    @Test(enabled = false)
    public void Deposit(){

        if (aboutMeValidDataPage.Direct_deposit.getText().equals("BEGIN")){

            aboutMeValidDataPage.DirectDepositSavedBtnCheck(prop.getProperty("Menu"));
            aboutMeValidDataPage.ClickOnDirectDeposit();
            aboutMeValidDataPage.IframeDirectdeposit();
            aboutMeValidDataPage.EnterDirectDepositDetailsAccount(prop.getProperty("Accountnumber"));
            aboutMeValidDataPage.EnterDirectDepositDetailsRounting(prop.getProperty("RountingNumber"));
            aboutMeValidDataPage.SaveDirectdetails();

        }
        else {
            System.out.println("Click on next");

        }
        Reporter.log("Direct Deposit data Saved successfully");
    }
    @Test(enabled = false)
    public void Fedaral(){

        if (aboutMeValidDataPage.Direct_deposit.getText().equals("EDIT")){

            aboutMeValidDataPage.FeadaralSavedBtnCheck(prop.getProperty("Menu"));
            aboutMeValidDataPage.ClickOnFedaral();
            aboutMeValidDataPage.IframeFedaral();
            aboutMeValidDataPage.EnterFedaralDetails();

        }
        else {
            System.out.println("Click on next");

        }
        Reporter.log("Fedaral service Data Saved successfully");
    }
    @Test(enabled = false)
    public void Military(){

        if (aboutMeValidDataPage.Militari_Fedaral.getText().equals("SAVED")){

            aboutMeValidDataPage.MilitarySavedBtnCheck(prop.getProperty("StatusForBtn"));
            aboutMeValidDataPage.ClickOnMilitary();
            aboutMeValidDataPage.IframeMilitary();
            aboutMeValidDataPage.EnterMilitaryDetails();
            aboutMeValidDataPage.SaveMilitarydetails();

        }
        else {
            System.out.println("Click on next");

        }
        Reporter.log("Military data Saved successfully");
    }

    @Test(enabled = false)
    public void Background(){

        if (aboutMeValidDataPage.Background.getText().equals("SAVED")){

            aboutMeValidDataPage.BackgroundSavedBtnCheck(prop.getProperty("StatusForBtn"));
            aboutMeValidDataPage.ClickOnBackground();
            aboutMeValidDataPage.IframeBackground();
            aboutMeValidDataPage.SaveBackgrounddetails();

        }
        else {
            System.out.println("Click on next");

        }
        Reporter.log("BackGroundData Saved successfully");

    }
    // METHOD CALLED FOR BUTTON ENABLE OR DISABLE
    @Test(enabled = false)
    public void Disabled() {
        try {
            aboutMeValidDataPage.DisableBtn();
            Reporter.log("Next Button is Disabled");
        } catch (AssertionError E) {
            Reporter.log("button is Enabled");
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" button is Enabled");
        }
    }

    }


