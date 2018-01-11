package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 06-11-2017.
 */
public class AboutMeCheckValidationTest extends BaseTest {

    public static int Errorcount;

    @Test(priority = 0)
    public void AboutMe() {

        Errorcount= 0;
        about_mePage.BeforeYouBeginBtn();
        about_mePage.AboutMeBtn();

       try {
           // about_mePage.BeginStatusCheck("BEGIN");
            Reporter.log("Begin button is there");
        } catch (Exception E) {
            Reporter.log("Begin button is not there");
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Begin button is not there");
        }


    }
    @Test(enabled = false)
    public void Disabled() {
        Errorcount= 0;
        try {
            about_mePage.DisableBtn();
            Reporter.log("Next Button is disabled");
        } catch (AssertionError E) {
            Reporter.log("button is enabled");
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" button is enabled");
        }
    }
    @Test(priority = 1)
    public void FedralClick(){
        about_mePage.FedaralBtnClick();

       about_mePage.FedaralPersonal_InfoBtnClick("Personal Information");


    }
    @Test( priority = 2)
    public void CheckValidations() {


           about_mePage.CheckBlankFirstNameTxt();



    }
    @Test(enabled = false)
    public void CheckValidationcountry() {

        try {
            about_mePage.CheckBlankcountryvalidation("County is required.");
            //Reporter.log("Get Validation,Country is required");
        } catch (AssertionError E) {
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue invalid country validation");
        }

    }

    @Test(priority = 3)
    public void CheckValidationStreet() {
        Errorcount= 0;
        try {
            about_mePage.CheckBlankstreetAddvalidation(prop.getProperty("Street"));
           // Reporter.log("Get Validation,street address is required");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue invalid address validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" Testcase Failed, there is some other issue invalid address validation");
        }
    }

   @Test(priority = 4)
    public void CheckValidationzipcode() {
       Errorcount= 0;
        try {
            about_mePage.CheckBlankzipvalidation(prop.getProperty("zipcode"));
            //Reporter.log("Get Validation,zip code is required");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue invalid zip code validation");
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue invalid zip code validation");
        }

    }
    @Test(priority = 5)
    public void CheckValidationphone() {
        Errorcount= 0;
        try {
            about_mePage.CheckBlankphonevalidation(prop.getProperty("phonetype"));
           // Reporter.log("Get Validation,Phone 1 Type is required");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue phone type validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue phone type validation");
        }
    }

    @Test(priority = 6)
    public void CheckValidationcountrybirth() {
        Errorcount= 0;
        try {
            about_mePage.CheckBlankcountrybirthvalidation(prop.getProperty("counttybirth"));
           // Reporter.log("Get Validation,Country of Birth is required");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue country Birth validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue country Birth validation");
        }
    }

    @Test(priority = 7)
    public void CheckValidationEmail() {
        Errorcount= 0;
        try {
            about_mePage.CheckBlankemailvalidation(prop.getProperty("emailadreess"));
           // Reporter.log("Get Validation, Email is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue email validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue email validation");
        }

    }
    @Test(priority = 8)
    public void CheckValidationFirstname() {
        Errorcount= 0;
        try {
            about_mePage.CheckFirstnamemailvalidation(prop.getProperty("Firstname"));
            //Reporter.log("Get Validation, First Name is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue firstname validation");
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue firstname validation");
        }
    }
    @Test(priority = 9)
    public void CheckValidationgender() {
        Errorcount= 0;
        try {
            about_mePage.CheckGendernamemailvalidation(prop.getProperty("gender"));
           // Reporter.log("Get Validation, Gender is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue gender validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue gender validation");
        }

    }
    @Test(priority =10)
    public void CheckValidationlastname() {
        Errorcount= 0;
        try {
            about_mePage.Checklastnamemailvalidation(prop.getProperty("Lastname"));
           // Reporter.log("Get Validation, Last Name is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue lastname validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue lastname validation");
        }

    }

    @Test(priority =11)
    public void CheckValidationmarital() {
        Errorcount= 0;
        try {
            about_mePage.CheckMaritalvalidation(prop.getProperty("maritalstatus"));
           //Reporter.log("Get Validation, Marital Status is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue marital validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue marital validation");
        }

    }
    @Test(priority =12)
    public void CheckValidationeyecolor() {
        Errorcount= 0;
        try {
            about_mePage.Checkeyevalidation(prop.getProperty("EyeColor"));
           // Reporter.log("Get Validation, Eye Color is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue eyecolor validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue eyecolor validation");
        }


    }

    @Test(priority =13)
    public void CheckValidationhaircolor() {
        Errorcount= 0;
        try {
            about_mePage.Checkhairvalidation(prop.getProperty("HaieColor"));
           // Reporter.log("Get Validation, Hair Color is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue hair validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue hair validation");
        }

    }
    @Test(priority =14)
    public void CheckValidationheight() {
        Errorcount= 0;
        try {
            about_mePage.Checkheightvalidation(prop.getProperty("Hieght"));
            //Reporter.log("Get Validation, Height is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue hieght validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue hieght validation");
        }



    }
    @Test(priority =15)
    public void CheckValidationweight() {
        Errorcount= 0;
        try {
            about_mePage.Checkweightvalidation(prop.getProperty("Weight"));
           // Reporter.log("Get Validation, Weight is required.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue Weight validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue Weight validation");
        }

    }

    @Test(priority =16)
    public void CheckValidationssn() {
        Errorcount= 0;
        try {
            about_mePage.Checkssnvalidation(prop.getProperty("SSNNum"));
           // Reporter.log("Get Validation, SSN Confirmation");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue ssn validation");
            Errorcount++;
        }
        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue ssn validation");
        }


    }

    @Test(priority = 17)
    public void CheckValidationemailformat() {
        Errorcount= 0;
        try {
            about_mePage.Checkformatvalidation(prop.getProperty("EmailFormat"));
           // Reporter.log("Get Validation, Email has to be in the format of xxx@xxx.xxx.");
        } catch (AssertionError E) {
            Reporter.log("Testcase Failed, there is some other issue format validation");
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log("Testcase Failed,there is some other issue format validation");
        }
    }

    /*@Test(priority = 18)
    public void FirstnameValidationOnly() {
        Errorcount= 0;

        try {
            about_mePage.IframePI();

            about_mePage.EnterFirstname("");
        }catch (Exception e){
            e.printStackTrace();
        }

        about_mePage.ClickOnSaveBtn();

        try {
            about_mePage.GetValidationOnlyFirstNameBlank(prop.getProperty("Firstname"));
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

   @Test(priority = 19)
    public void LastnameValidationOnly() {
       Errorcount= 0;
        try {
           about_mePage.EnterFirstname(prop.getProperty("middle"));
       }catch (Exception e){
            e.printStackTrace();
        }
     //   about_mePage.EnterLastName(prop.getProperty(""));

        about_mePage.ClickOnSaveBtn();

       try {
            about_mePage.GetValidationOnlyLastNameBlank(prop.getProperty("Lastname"));
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
    @Test(priority = 20)
    public void MaritalValidationOnly() {
        Errorcount= 0;

        about_mePage.EnterLastName(prop.getProperty("last"));
            about_mePage.ScrolUptoMarital();
      //  about_mePage.ClickOnSelectmarital();

        about_mePage.ClickOnSaveBtn();

       try {
            about_mePage.GetValidationOnlyMaritalBlank(prop.getProperty("maritalstatus"));
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
    @Test(priority = 21)
    public void StreetaddressValidationOnly() {
        Errorcount= 0;
        about_mePage.ScrollToStreetAddress();
        about_mePage.ClickOnSelectmarital();

        //  about_mePage.ClickOnSelectmarital();

        about_mePage.ClickOnSaveBtn();

        try {
            about_mePage.GetValidationOnlyAddressBlank(prop.getProperty("Street"));
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

    @Test(priority = 22)
    public void CountryValidationcheckOnly(){
        Errorcount= 0;
        about_mePage.ScrollToStreetAddress();
        about_mePage.EnterStreetAddress(prop.getProperty("address"));
        about_mePage.CountryClear();
        about_mePage.ClickOnSaveBtn();

        try {
            about_mePage.GetValidationOnlyCountryBlank(prop.getProperty("Country1"));
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

    @Test(priority = 23)
    public void CityValidationcheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        about_mePage.srcolltoCity();
       about_mePage.ClickOnCountrySelect1();
        about_mePage.CityClear();
        about_mePage.ClickOnSaveBtn();

        try {
            about_mePage.GetValidationOnlyCityBlank(prop.getProperty("city"));
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

    @Test(priority = 24)
    public void ZipcodeValidationCheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        about_mePage.ScrollTozipcode();
        about_mePage.ClickOnCityselect();
        about_mePage.ClickOnSaveBtn();


        try {
            about_mePage.GetValidationOnlyZipcodeBlank(prop.getProperty("zipcode"));
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
    @Test (priority = 25)
    public void EmailValidationcheckOnly(){

        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        about_mePage.srcolltoCity();
        about_mePage.EnterZipTxt(prop.getProperty("zipCode"));
        about_mePage.ClearEmail();

        about_mePage.ClickOnSaveBtn();

        try {
            about_mePage.GetValidationOnlyEmailBlank(prop.getProperty("emailadreess"));
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

    @Test(priority = 26)
    public void PhoneValidationCheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            about_mePage.enterPhonetype();
            about_mePage.EnterEmailTxtbox(prop.getProperty("Email1"));
            about_mePage.ClickOnSaveBtn();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            about_mePage.GetValidationOnlyPhoneBlank(prop.getProperty("phonetype"));
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


    @Test(priority = 27)
    public void CountrybirthValidationOnly(){
        Errorcount= 0;
        about_mePage.Scrolltophntype();
        about_mePage.EnterPhonetype(prop.getProperty("Phone1"));
        about_mePage.ClearCountrybirth();
        about_mePage.ClickOnSaveBtn();

        try {
            about_mePage.GetValidationOnlycountrybirthBlank(prop.getProperty("counttybirth"));
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

    @Test(priority = 28)
    public void GendervalidationOnly(){
        Errorcount= 0;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        about_mePage.ClickOnCountryBirth();
        about_mePage.ScrolltoCountrybirth();
        about_mePage.ClickOnSaveBtn();

        try {
            about_mePage.GetValidationOnlyGenderBlank(prop.getProperty("gender"));
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

    @Test(priority = 29)
    public void EyecolorValidationOnly(){
        Errorcount= 0;
        about_mePage.ClickOnGenderSelect();
        about_mePage.scrollEyecolor();
        about_mePage.selectoneeyecolor();
        about_mePage.ClickOnSaveBtn();


        try {
            about_mePage.GetValidationOnlyeyeColorBlank(prop.getProperty("EyeColor"));
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

    @Test(priority = 30)
    public void HairValidationcheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        about_mePage.ClickOnEyeColorSelect();
        about_mePage.selectonhaircolor();
        about_mePage.ClickOnSaveBtn();
        try {
            about_mePage.GetValidationOnlyhairColorBlank(prop.getProperty("HaieColor"));
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
    @Test(priority = 31)
    public void HeightValidationCheckOnly(){
        Errorcount= 0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        about_mePage.ClickOnHailcolorselect();
        about_mePage.clearHeight();
        about_mePage.ClickOnSaveBtn();


        try {
            about_mePage.GetValidationOnlyHeightBlank(prop.getProperty("Hieght"));
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

    @Test(priority = 32)
    public void WeightValidationCheckOnly(){
        Errorcount= 0;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        about_mePage.EnterHeight(prop.getProperty("height1"));
        about_mePage.clearWeight();
        about_mePage.ClickOnSaveBtn();


        try {
            about_mePage.GetValidationOnlyWeightBlank(prop.getProperty("Weight"));
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
*/
}
