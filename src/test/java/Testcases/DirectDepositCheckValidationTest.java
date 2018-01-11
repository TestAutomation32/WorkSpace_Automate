package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 15-11-2017.
 */
public class DirectDepositCheckValidationTest extends BaseTest {

    public static int Errorcount = 0;

    //METHODS CALLED FOR CHECK VALIDATION FOR ALL FIELDS OF ABOUTME PAGE
    @Test(priority = 0)
    public void AboutMe() {

        directDepositCheckValidationPage.BeforeYouBeginBtn();
        directDepositCheckValidationPage.AboutMeBtn();


    }

    @Test(priority = 1)
    public void DirectDeposit() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (directDepositCheckValidationPage.Direct_deposit.getText().equals("BEGIN")) {
            directDepositCheckValidationPage.ClickOndirectDeposit();

            directDepositCheckValidationPage.IframeDirectDeposit();
            directDepositCheckValidationPage.ScrollToSaveDeposit();
        }  else
        {
            Assert.fail();
            System.out.println("Click on next");

        }
        Reporter.log("Direct Deposit data Saved successfully");
    }

    @Test(priority = 2 , dependsOnMethods = {"DirectDeposit"})
    public void CheckValidationAccount() {

        try {
            directDepositCheckValidationPage.CheckAccountvalidation(prop.getProperty("Account"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Account validation");
        }

    }

    @Test(priority = 3, dependsOnMethods = {"DirectDeposit"})
    public void CheckValidationRounting() {

        try {
            directDepositCheckValidationPage.CheckRountingvalidation(prop.getProperty("rounting"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Rounting validation");
        }

    }

    @Test(priority = 4, dependsOnMethods = {"DirectDeposit"})
    public void AddAllotment() {

        directDepositCheckValidationPage.AddAllotment();
        directDepositCheckValidationPage.SaveAllotment();
    }

    @Test(priority = 5, dependsOnMethods = {"DirectDeposit"})
    public void CheckValidationAmount() {

        try {
            directDepositCheckValidationPage.CheckAmountvalidation(prop.getProperty("amount"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank amount validation");
        }

    }

    @Test(priority = 6, dependsOnMethods = {"DirectDeposit"})
    public void CheckValidationAllotAccount() {

        try {
            directDepositCheckValidationPage.CheckAllotAccontvalidation(prop.getProperty("allotaccount"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank amount validation");
        }

    }

    @Test(priority = 7, dependsOnMethods = {"DirectDeposit"})
    public void CheckValidationAllotRout() {

        try {
            directDepositCheckValidationPage.CheckAllotroutvalidation(prop.getProperty("allotrout"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank amount validation");
        }

    }
    @Test(priority = 8, dependsOnMethods = {"DirectDeposit"})
    public void Oraganization(){


        directDepositCheckValidationPage.ClickOraganization();
        directDepositCheckValidationPage.SaveOraganization();
    }


    @Test(priority = 9, dependsOnMethods = {"DirectDeposit"})
    public void CheckValidationOrganization() {

        try {
            directDepositCheckValidationPage.CheckOrganizationvalidation(prop.getProperty("oraganization"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Organization validation");
        }

    }

    @Test(priority = 10, dependsOnMethods = {"DirectDeposit"})
    public void CheckValidationOrganizationAccount() {

        try {
            directDepositCheckValidationPage.CheckOragAccountvalidation(prop.getProperty("amount"));

        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue Blank Organization account validation");
        }

    }

}


