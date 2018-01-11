package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 20-11-2017.
 */
public class PersonalInformationCheckValidationTest extends BaseTest{


    public static int Errorcount;

    @Test(priority = 0)
    public void AboutMe() {

        Errorcount = 0;
        personalInformationCheckValidationPage.BeforeYouBeginBtn();
        personalInformationCheckValidationPage.AboutMeBtn();
        personalInformationCheckValidationPage.FedaralBtnClick();
        personalInformationCheckValidationPage.FedaralPersonal_InfoBtnClick("Personal Information");

    }




    @Test(priority = 1)
    public void FirstnameValidationOnly() {
        Errorcount= 0;

        try {
            personalInformationCheckValidationPage.EnterFirstname("");
        }catch (Exception e){
            e.printStackTrace();
        }

        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlyFirstNameBlank(prop.getProperty("Firstname"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue Firstname validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue Firstname validation");
        }

    }

    @Test(priority = 2)
    public void LastnameValidationOnly() {
        Errorcount= 0;
        try {
            personalInformationCheckValidationPage.EnterFirstname(prop.getProperty("middle"));
        }catch (Exception e){
            e.printStackTrace();
        }
        //   about_mePage.EnterLastName(prop.getProperty(""));

        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlyLastNameBlank(prop.getProperty("Lastname"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue Lastname validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue Lastname validation");
        }

    }
    @Test(priority = 3)
    public void MaritalValidationOnly() {
        Errorcount= 0;

        personalInformationCheckValidationPage.EnterLastName(prop.getProperty("last"));
        personalInformationCheckValidationPage.ScrolUptoMarital();
        //  about_mePage.ClickOnSelectmarital();

        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlyMaritalBlank(prop.getProperty("maritalstatus"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue marital status validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue marital status validation");
        }

    }
    @Test(priority = 3)
    public void StreetaddressValidationOnly() {
        Errorcount= 0;
        personalInformationCheckValidationPage.ScrollToStreetAddress();
        personalInformationCheckValidationPage.ClickOnSelectmarital();

        //  about_mePage.ClickOnSelectmarital();

        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlyAddressBlank(prop.getProperty("Street"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue street address validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue street address validation");
        }

    }

    @Test(priority = 4)
    public void CountryValidationcheckOnly(){
        Errorcount= 0;
        personalInformationCheckValidationPage.ScrollToStreetAddress();
        personalInformationCheckValidationPage.EnterStreetAddress(prop.getProperty("address"));
        personalInformationCheckValidationPage.CountryClear();
        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlyCountryBlank(prop.getProperty("Country1"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue Country validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue Country validation");
        }

    }

    @Test(priority = 5)
    public void CityValidationcheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        personalInformationCheckValidationPage.srcolltoCity();
        personalInformationCheckValidationPage.ClickOnCountrySelect1();
        personalInformationCheckValidationPage.CityClear();
        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlyCityBlank(prop.getProperty("city"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue city validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue city validation");
        }

    }

    @Test(priority = 5)
    public void ZipcodeValidationCheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        personalInformationCheckValidationPage.ScrollTozipcode();
        personalInformationCheckValidationPage.ClickOnCityselect();
        personalInformationCheckValidationPage.ClickOnSaveBtn();


        try {
            personalInformationCheckValidationPage.GetValidationOnlyZipcodeBlank(prop.getProperty("zipcode"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue zip validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue zip validation");
        }

    }
    @Test (priority = 6)
    public void EmailValidationcheckOnly(){

        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        personalInformationCheckValidationPage.srcolltoCity();

        personalInformationCheckValidationPage.EnterZipTxt(prop.getProperty("zipCode"));
        personalInformationCheckValidationPage.ClearEmail();

        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlyEmailBlank(prop.getProperty("emailadreess"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue email validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue email validation");
        }

    }

    @Test(priority = 7)
    public void PhoneValidationCheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            personalInformationCheckValidationPage.enterPhonetype();
            personalInformationCheckValidationPage.EnterEmailTxtbox(prop.getProperty("Email1"));
            personalInformationCheckValidationPage.ClickOnSaveBtn();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            personalInformationCheckValidationPage.GetValidationOnlyPhoneBlank(prop.getProperty("phonetype"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue phone validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue phone validation");
        }
    }


    @Test(priority = 8)
    public void CountrybirthValidationOnly(){
        Errorcount= 0;
        personalInformationCheckValidationPage.Scrolltophntype();
        personalInformationCheckValidationPage.EnterPhonetype(prop.getProperty("Phone1"));
        personalInformationCheckValidationPage.ClearCountrybirth();
        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlycountrybirthBlank(prop.getProperty("counttybirth"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue Country birth validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue Country birth validation");
        }

    }

    @Test(priority = 9)
    public void GendervalidationOnly(){
        Errorcount= 0;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        personalInformationCheckValidationPage.ClickOnCountryBirth();
        personalInformationCheckValidationPage.ScrolltoCountrybirth();
        personalInformationCheckValidationPage.ClickOnSaveBtn();

        try {
            personalInformationCheckValidationPage.GetValidationOnlyGenderBlank(prop.getProperty("gender"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue gender validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue gender validation");
        }

    }

    @Test(priority = 10)
    public void EyecolorValidationOnly(){
        Errorcount= 0;
        personalInformationCheckValidationPage.ClickOnGenderSelect();
        personalInformationCheckValidationPage.scrollEyecolor();
        personalInformationCheckValidationPage.selectoneeyecolor();
        personalInformationCheckValidationPage.ClickOnSaveBtn();


        try {
            personalInformationCheckValidationPage.GetValidationOnlyeyeColorBlank(prop.getProperty("EyeColor"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue eye color validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue eye color validation");
        }

    }

    @Test(priority = 11)
    public void HairValidationcheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        personalInformationCheckValidationPage.ClickOnEyeColorSelect();
        personalInformationCheckValidationPage.selectonhaircolor();
        personalInformationCheckValidationPage.ClickOnSaveBtn();
        try {
            personalInformationCheckValidationPage.GetValidationOnlyhairColorBlank(prop.getProperty("HaieColor"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue hair color validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue hair color validation");
        }

    }
    @Test(priority = 12)
    public void HeightValidationCheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        personalInformationCheckValidationPage.ClickOnHailcolorselect();
        personalInformationCheckValidationPage.clearHeight();
        personalInformationCheckValidationPage.ClickOnSaveBtn();


        try {
            personalInformationCheckValidationPage.GetValidationOnlyHeightBlank(prop.getProperty("Hieght"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue height validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue height validation");
        }

    }

    @Test(priority = 13)
    public void WeightValidationCheckOnly(){
        Errorcount= 0;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        personalInformationCheckValidationPage.EnterHeight(prop.getProperty("height1"));
        personalInformationCheckValidationPage.clearWeight();
        personalInformationCheckValidationPage.ClickOnSaveBtn();


        try {
            personalInformationCheckValidationPage.GetValidationOnlyWeightBlank(prop.getProperty("Weight"));
            // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue weight validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue weight validation");
        }

    }






}
