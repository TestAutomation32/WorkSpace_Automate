package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 16-11-2017.
 */
public class BackgroundCheckValidationTest extends BaseTest{

    public static int Errorcount =0;


    @Test(priority = 0)
    public void AboutMe() {

        backgroundCheckValidationPage.BeforeYouBeginBtn();
        backgroundCheckValidationPage.AboutMeBtn();


    }
    //METHODS CALLED FOR CHECK VALIDATION FOR ALL FIELDS OF ABOUTME PAGE
    @Test(priority  =1)
    public void Background(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (backgroundCheckValidationPage.Background.getText().equals("BEGIN")) {
        backgroundCheckValidationPage.ClickOnBackground();

        backgroundCheckValidationPage.IframeBG();
        backgroundCheckValidationPage.ClickOnYesBtn();
        backgroundCheckValidationPage.ClickAddConviction();
        backgroundCheckValidationPage.ClickOnSaveBackground();

    }  else
        {
            Assert.fail();
            System.out.println("Click on next");

        }
        Reporter.log(" Background data Saved successfully");

    }
    @Test(priority = 2, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForOccurance(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforOccurrance(prop.getProperty("Occurrance"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Occurrance validation");

        }
    }

    @Test(priority = 3, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForExplanation(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforExplanation(prop.getProperty("Explanation"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Explanation validation");

        }
    }

    @Test(priority = 4, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForPlace(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforPlace(prop.getProperty("place"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Place validation");

        }
    }
    @Test(priority = 5, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForName(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforName(prop.getProperty("Name"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank name validation");

        }
    }
    @Test(priority = 6, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForstreet(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforStreet(prop.getProperty("StAddress"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Street address validation");

        }
    }
    @Test(priority = 7, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForCountry(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforCountry(prop.getProperty("Country1"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Country validation");

        }
    }
    @Test(priority = 8, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForZip(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforzip(prop.getProperty("zipcode"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank zip validation");

        }
    }
    @Test(priority = 9, dependsOnMethods = {"Background"})
    public void Debt(){

        backgroundCheckValidationPage.CloseDebtBtn();
        backgroundCheckValidationPage.ClickOnYesBtnforDebt();
        backgroundCheckValidationPage.ClickAdddebt();
        backgroundCheckValidationPage.ClickOnSaveDebt();

    }

    @Test(priority = 10, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForDebtType() {

        try {
            backgroundCheckValidationPage.CheckVlaidationforDebttype(prop.getProperty("Debttype"));

        } catch (AssertionError E) {
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Debt type validation");

        }}

        @Test(priority = 11, dependsOnMethods = {"Background"})
        public void CheckVlaidtionForDebtLength(){

            try {
                backgroundCheckValidationPage.CheckVlaidationforlength(prop.getProperty("DebtLength"));

            } catch (AssertionError E) {
                Errorcount++;
            }

            if (Errorcount > 0) {
                Assert.fail();
                Reporter.log("Testcase Failed, there is some other issue Blank Debt length validation");

            }

           }
    @Test(priority = 12, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForDebtAmount(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforamount(prop.getProperty("DebtAmount"));

        } catch (AssertionError E) {
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Debt amount validation");

        }

    }
    @Test(priority = 13, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForDebtSteps(){

        try {
            backgroundCheckValidationPage.CheckVlaidationforSteps(prop.getProperty("DebtSteps"));

        } catch (AssertionError E) {
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Debt steps validation");

        }

    }

    @Test(priority = 14, dependsOnMethods = {"Background"})
    public void Hired(){

        backgroundCheckValidationPage.CloseDebt();
        backgroundCheckValidationPage.ClickOnYesBtnforhired();
        backgroundCheckValidationPage.ClickAddrelative();
        backgroundCheckValidationPage.ClickOnSaveHiredbtb();

    }
    @Test(priority = 15, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForRelativeName(){

        try {
            backgroundCheckValidationPage.CheckValidationforRelativename(prop.getProperty("Relativename"));

        } catch (AssertionError E) {
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Debt Relative name validation");

        }

    }
    @Test(priority = 16, dependsOnMethods = {"Background"})
    public void CheckVlaidtionForRelationship(){

        try {
            backgroundCheckValidationPage.CheckValidationforRelativRelationship(prop.getProperty("Relationship"));

        } catch (AssertionError E) {
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Relationship validation");

        }

    }




}
