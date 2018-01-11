package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by admin on 20-11-2017.
 */
public class PersonalInformationCheckValidationPage {

    WebDriver driver;

    public PersonalInformationCheckValidationPage(WebDriver driver) {

        this.driver = driver;
    }
    // ALL THE LOCATOR AND METHODS OF ABOUT ME

    @FindBy(id = "buttContinue")
    public WebElement AboutMeBtn;

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;





    @FindBy(xpath = "//*[@id=\"Personal Information\"]/span[1]")
    public WebElement PIText;

    @FindBy(xpath = "//*[@id=\"Emergency Contacts\"]/span[1]")
    public WebElement EmergencyContact;

    @FindBy(xpath = "//*[@id=\"Education\"]/span[1]")
    public WebElement Education;

    @FindBy(xpath = "//*[@id=\"Citizenship\"]/span[1]")
    public WebElement Citizenship;

    @FindBy(xpath = "//*[@id=\"Ethnicity and Race\"]/span[1]")
    public WebElement Ethnicity_Race;

    @FindBy(xpath = "//*[@id=\"Disability\"]/span[1]")
    public WebElement Disability;

    @FindBy(xpath = "//*[@id=\"Direct Deposit\"]/span[1]")
    public WebElement Direct_deposit;

    @FindBy(xpath = "//*[@id=\"Federal and State Tax\"]/span[1]")
    public WebElement Federal_state;

    @FindBy(xpath = "//*[@id=\"Military and Federal Service\"]/span[1]")
    public WebElement Militari_Fedaral;

    @FindBy(xpath = "//*[@id=\"Background\"]/span[1]")
    public WebElement Background;

    @FindBy(xpath = "//*[@id=\"buttCore\"]")
    public WebElement DisableBtn;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[4]/div[2]/button")
    public WebElement Fedaral_PersonalInfoBtn;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[4]/div[2]/button")
    public List<WebElement> Fedaral_PersonalInfoBtn1;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[17]/button[1]")
    public WebElement PersonalInfoSaveBtn;

    @FindBy(id = "firstName")
    public WebElement FirstnameTxt;

    @FindBy(id = "middleName")
    public WebElement MiddleTxt;

    @FindBy(id = "lastName")
    public WebElement LastnameTxt;


    @FindBy(id = "addressLine1")
    public WebElement AddressLineTxt;

    @FindBy(id = "zip")
    public WebElement zip;


    @FindBy(id ="email" )
    public WebElement Email;

    @FindBy(id="weight")
    public  WebElement WeightLBS;


    @FindBy(xpath= "//a[text()='County is required.']")
    public WebElement CountryValidation;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Street Address or P.O. Box is required.']")
    public WebElement StreetAddress;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Zip Code is required.']")
    public WebElement Zipcode;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Phone 1 Type is required.']")
    public WebElement phonetype;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Country Of Birth is required.']")
    public WebElement CountryBirth;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Email is required.']")
    public WebElement EmailCheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='First Name is required.']")
    public WebElement Firstnamecheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Gender is required.']")
    public WebElement Gendercheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Last Name is required.']")
    public WebElement Lastnamecheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Marital Status is required.']")
    public WebElement Matirialcheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Eye Color is required.']")
    public WebElement eyecolorcheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Hair Color is required.']")
    public WebElement haircheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Height is required.']")
    public WebElement hieghtcheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Weight is required.']")
    public WebElement weightcheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='SSN Confirmation']")
    public WebElement ssncheck;

    @FindBy(xpath = "//following::ul[1]/li/a[text()='Email has to be in the format of xxx@xxx.xxx.']")
    public WebElement emailformat;

    @FindBy(id = "firstName")
    public WebElement FirstnameTxtBox;

    @FindBy(id = "middleName")
    public WebElement MiddlenameTxtbox;

    @FindBy(id = "lastName")
    public WebElement LastnameTxtbox;

    @FindBy(id = "TIN_Confirmation1")
    public WebElement SSNRadioBtn;

    @FindBy(id = "maritalstatus")
    public WebElement SelectMarital;

    @FindBy(xpath = "//*[@id=\"maritalstatus\"]/option[5]")
    public WebElement MaritalOptionSingle;

    @FindBy(id = "addressLine1")
    public WebElement AddressTxtBox;

    @FindBy(id = "country")
    public WebElement CountrySelect;

    @FindBy(xpath = "//*[@id=\"country\"]/option[4]")
    public WebElement CountryOption;

    @FindBy(id = "city")
    public WebElement Cityselect;

    @FindBy(xpath = "//*[@id=\"city\"]/option[8]")
    public WebElement CityOption;

    @FindBy(id = "zip")
    public WebElement ZipTextBox;

    @FindBy(id = "email")
    public WebElement EmailTxtBox;

    @FindBy(xpath = "//*[@id=\"phone1Type\"]")
    public WebElement PhoneTypeSelect;

    @FindBy(xpath = "//*[@id=\"phone1Type\"]/option[2]")
    public WebElement phoneOptionl;

    @FindBy(xpath = "//*[@id=\"phone1Number\"]")
    public WebElement PhoneTxtBox;


    @FindBy(id = "dobPrehire")
    public WebElement DobSelect;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a")
    public WebElement DobOption;

    @FindBy(id = "countryOfBirth")
    public WebElement CountryBirthSelect;

    @FindBy(xpath = "//*[@id=\"countryOfBirth\"]/option[8]")
    public WebElement CountrybirthOption;

    @FindBy(xpath = "stateOfBirth")
    public WebElement StateBirthSelect;

    @FindBy(xpath = "//*[@id=\"stateOfBirth\"]/option[3]")
    public WebElement StatebirthOption;

    @FindBy(id = "gender")
    public WebElement GenderSelect;

    @FindBy(xpath = "//*[@id=\"gender\"]/option[2]")
    public WebElement GenderOption;

    @FindBy(id = "eyeColor")
    public WebElement EyecolorSelect;

    @FindBy(xpath = "//*[@id=\"eyeColor\"]/option[4]")
    public WebElement EyecolorOption;

    @FindBy(id = "hairColor")
    public WebElement HailcolorSelect;

    @FindBy(xpath = "//*[@id=\"hairColor\"]/option[2]")
    public WebElement haircolorOption;

    @FindBy(id = "heightFt")
    public WebElement HieghtTxtBox;

    @FindBy(id = "weight")
    public WebElement weightTxtBox;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyFirstnameValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyLastnameValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyMaritalValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyAddressValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyCountryValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyCityValidationGet;



    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyzipValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyEmailValidationGet;



    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyPhoneValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyCountrybirthValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyGenderValidationGet;


    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyEyeColorValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyhairColorValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyHeightValidationGet;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement OnlyWeightValidationGet;

    @FindBy(xpath = "//*[@id=\"maritalstatus\"]/option[1]")
    public WebElement MaritalSelectoneBtn;

    @FindBy(xpath = "//*[@id=\"Personal Information\"]/span[1]")
    public WebElement PISavedBtn;


    public PersonalInformationCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }

    public PersonalInformationCheckValidationPage AboutMeBtn() {

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(AboutMeBtn));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        AboutMeBtn.click();
        return this;
    }
    public PersonalInformationCheckValidationPage FedaralBtnClick() {

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 100);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(Federal_state));

        // PISavedBtn.click();

        Federal_state.click();
        return this;

    }

    public PersonalInformationCheckValidationPage FedaralPersonal_InfoBtnClick(String  PersonalInfoPagename) {

        // WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 90);
        //  LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(Fedaral_PersonalInfoBtn));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Federal and State Tax']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Federal and State Tax']"));
        System.out.println(test1.size());

        //  WebDriverWait LoginAcceptwait1 = new WebDriverWait(driver, 50);
        // LoginAcceptwait1.until(ExpectedConditions.elementToBeClickable(Fedaral_PersonalInfoBtn));

        String Fedaral_PersonalInfoBtnText = Fedaral_PersonalInfoBtn.getText();
        System.out.println(Fedaral_PersonalInfoBtnText);


        Assert.assertEquals(Fedaral_PersonalInfoBtnText, PersonalInfoPagename);

        Fedaral_PersonalInfoBtn.click();
        return this;

    }


    public PersonalInformationCheckValidationPage FillData(){


        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SSNRadioBtn);


        SSNRadioBtn.click();

        MaritalSelectoneBtn.click();
        MaritalOptionSingle.click();
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SSNRadioBtn);


        phonetype.click();
        phoneOptionl.click();

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SSNRadioBtn);


        return this;
    }





    public PersonalInformationCheckValidationPage EnterFirstname(String Fname) {

        WebDriverWait firstname = new WebDriverWait(driver, 50);
        firstname.until(ExpectedConditions.visibilityOf(FirstnameTxtBox));
        try {
            FirstnameTxtBox.clear();
        }catch (Exception e){
            e.printStackTrace();
        }
        FirstnameTxtBox.sendKeys(Fname);


        return this;
    }

    public PersonalInformationCheckValidationPage EnterLastName(String LastName) {

        WebDriverWait lastname = new WebDriverWait(driver, 90);
        lastname.until(ExpectedConditions.elementToBeClickable(LastnameTxtbox));

        LastnameTxtbox.sendKeys(LastName);
        return this;
    }

    public PersonalInformationCheckValidationPage ClickOnSSNBtn() {


        WebDriverWait ssnwait = new WebDriverWait(driver, 20);
        ssnwait.until(ExpectedConditions.visibilityOf(SSNRadioBtn));

        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("window.scrollBy(0,500)", "");

        SSNRadioBtn.click();
        return this;
    }

    public PersonalInformationCheckValidationPage ClickOnSelectmarital() {


        WebDriverWait selectwait1 = new WebDriverWait(driver, 50);
        selectwait1.until(ExpectedConditions.visibilityOf(SelectMarital));

        SelectMarital.click();

        WebDriverWait optionwait2 = new WebDriverWait(driver, 90);
        optionwait2.until(ExpectedConditions.visibilityOf(MaritalOptionSingle));
        MaritalOptionSingle.click();
        return this;
    }
    public PersonalInformationCheckValidationPage EnterStreetAddress(String Addresstxt) {


        WebDriverWait addwait3 = new WebDriverWait(driver, 20);
        addwait3.until(ExpectedConditions.visibilityOf(AddressTxtBox));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", AddressTxtBox);

        AddressTxtBox.sendKeys(Addresstxt);
        return this;
    }
    public PersonalInformationCheckValidationPage ClickOnCountrySelect1() {


        WebDriverWait countrywait4 = new WebDriverWait(driver, 20);
        countrywait4.until(ExpectedConditions.visibilityOf(CountrySelect));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", CountrySelect);


        CountrySelect.click();

        CountryOption.click();
        return this;
    }
    public PersonalInformationCheckValidationPage ClickOnCityselect() {

        WebDriverWait citywait4 = new WebDriverWait(driver, 60);
        citywait4.until(ExpectedConditions.visibilityOf(Cityselect));

        Cityselect.click();
        CityOption.click();
        return this;
    }

    public PersonalInformationCheckValidationPage ClickOnCountrySelect() {


        WebDriverWait countrywait4 = new WebDriverWait(driver, 20);
        countrywait4.until(ExpectedConditions.visibilityOf(CountrySelect));

        CountrySelect.click();
        CountryOption.click();
        return this;
    }

    public PersonalInformationCheckValidationPage EnterZipTxt(String ZipCode) {


        WebDriverWait zipwait = new WebDriverWait(driver, 20);
        zipwait.until(ExpectedConditions.visibilityOf(ZipTextBox));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", ZipTextBox);

        ZipTextBox.sendKeys(ZipCode);
        return this;
    }
    public PersonalInformationCheckValidationPage EnterEmailTxtbox(String Email) {


        WebDriverWait emailwait6 = new WebDriverWait(driver, 20);
        emailwait6.until(ExpectedConditions.visibilityOf(EmailTxtBox));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", EmailTxtBox);


        EmailTxtBox.clear();
        EmailTxtBox.sendKeys(Email);
        return this;
    }
    public PersonalInformationCheckValidationPage EnterPhonetype(String phone) {


        WebDriverWait phonewait = new WebDriverWait(driver, 20);
        phonewait.until(ExpectedConditions.visibilityOf(PhoneTypeSelect));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", PhoneTypeSelect);

        PhoneTypeSelect.click();
        phoneOptionl.click();


        WebDriverWait txtwait7 = new WebDriverWait(driver, 20);
        txtwait7.until(ExpectedConditions.visibilityOf(PhoneTxtBox));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", PhoneTxtBox);

        PhoneTxtBox.sendKeys(phone);
        return this;
    }

    public PersonalInformationCheckValidationPage ClickOnCountryBirth() {


        WebDriverWait Countrywait = new WebDriverWait(driver, 90);
        Countrywait.until(ExpectedConditions.visibilityOf(CountryBirthSelect));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", CountryBirthSelect);


        CountryBirthSelect.click();
        CountrybirthOption.click();
        return this;
    }

    public PersonalInformationCheckValidationPage ClickOnGenderSelect() {

        WebDriverWait genderwait = new WebDriverWait(driver, 90);
        genderwait.until(ExpectedConditions.visibilityOf(GenderSelect));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", GenderSelect);

        GenderSelect.click();
        GenderOption.click();
        return this;
    }

    public PersonalInformationCheckValidationPage ClickOnEyeColorSelect() {


        WebDriverWait eyewait = new WebDriverWait(driver, 20);
        eyewait.until(ExpectedConditions.visibilityOf(EyecolorSelect));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", EyecolorSelect);


        EyecolorSelect.click();
        EyecolorOption.click();
        return this;
    }
    public PersonalInformationCheckValidationPage ClickOnHailcolorselect() {


        WebDriverWait hairwait = new WebDriverWait(driver, 90);
        hairwait.until(ExpectedConditions.visibilityOf(HailcolorSelect));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", HailcolorSelect);


        HailcolorSelect.click();
        haircolorOption.click();
        return this;
    }
    public PersonalInformationCheckValidationPage EnterHeight(String height) {


        WebDriverWait heiwait = new WebDriverWait(driver, 200);
        heiwait.until(ExpectedConditions.visibilityOf(HieghtTxtBox));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", HieghtTxtBox);

        HieghtTxtBox.sendKeys(height);
        return this;
    }
    public PersonalInformationCheckValidationPage EnterWeight(String weight) {

        WebDriverWait wewait = new WebDriverWait(driver, 400);
        wewait.until(ExpectedConditions.visibilityOf(weightTxtBox));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", weightTxtBox);

        weightTxtBox.sendKeys(weight);

        return this;
    }


    public PersonalInformationCheckValidationPage ClearElement(By by)
    {

        driver.findElement(by).clear();
        return this;
    }

    public PersonalInformationCheckValidationPage ClickOnSaveBtn() {


        WebDriverWait Piwait = new WebDriverWait(driver, 100);
        Piwait.until(ExpectedConditions.visibilityOf(PersonalInfoSaveBtn));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", PersonalInfoSaveBtn);


        PersonalInfoSaveBtn.click();

        return this;
    }

    public PersonalInformationCheckValidationPage GetValidationOnlyFirstNameBlank(String Fstname) {

        WebDriverWait getFnamewait = new WebDriverWait(driver, 90);
        getFnamewait.until(ExpectedConditions.visibilityOf(OnlyFirstnameValidationGet));

        String Blankfirsterror = OnlyFirstnameValidationGet.getText();
        Reporter.log("Get validation :" + Blankfirsterror);
        Assert.assertTrue(Blankfirsterror.contains(Fstname));


        LastnameTxtbox.clear();


        return this;


    }

    public PersonalInformationCheckValidationPage GetValidationOnlyLastNameBlank(String Lstname) {

        WebDriverWait getFnamewait = new WebDriverWait(driver, 90);
        getFnamewait.until(ExpectedConditions.visibilityOf(OnlyLastnameValidationGet));

        String Blanklasterror = OnlyLastnameValidationGet.getText();
        Reporter.log("Get validation :" + Blanklasterror);
        Assert.assertTrue(Blanklasterror.contains(Lstname));

        return this;
    }


    public PersonalInformationCheckValidationPage ScrolUptoMarital(){

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();",driver.findElement(By.id("maritalstatus")));


        Select dropdown = new Select(driver.findElement(By.id("maritalstatus")));
        dropdown.selectByVisibleText("Select One");


        return this;

    }

    public PersonalInformationCheckValidationPage GetValidationOnlyMaritalBlank(String Marital) {

        WebDriverWait getFnamewait = new WebDriverWait(driver, 90);
        getFnamewait.until(ExpectedConditions.visibilityOf(OnlyMaritalValidationGet));

        String Blankmaritalerror = OnlyMaritalValidationGet.getText();
        Reporter.log("Get validation :" + Blankmaritalerror);
        Assert.assertTrue(Blankmaritalerror.contains(Marital));

        return this;

    }

    public PersonalInformationCheckValidationPage ScrollToStreetAddress(){


        WebDriverWait address1wait = new WebDriverWait(driver, 90);
        address1wait.until(ExpectedConditions.visibilityOf(SelectMarital));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();",SelectMarital);

        WebDriverWait addresswait = new WebDriverWait(driver, 90);
        addresswait.until(ExpectedConditions.visibilityOf(AddressTxtBox));

        AddressTxtBox.clear();
        return this;


    }

    public PersonalInformationCheckValidationPage srcolltoCity(){

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();",CityOption);

        return this;
    }

    public PersonalInformationCheckValidationPage GetValidationOnlyAddressBlank(String addreess) {

        WebDriverWait getFnamewait = new WebDriverWait(driver, 90);
        getFnamewait.until(ExpectedConditions.visibilityOf(OnlyAddressValidationGet));

        String Blankaddresserror = OnlyAddressValidationGet.getText();
        Reporter.log("Get validation :" + Blankaddresserror);
        Assert.assertTrue(Blankaddresserror.contains(addreess));

        return this;

    }

    public PersonalInformationCheckValidationPage CountryClear(){

        Select dropdown = new Select(driver.findElement(By.id("country")));

        dropdown.selectByVisibleText("Select One");

        return this;
    }




    public PersonalInformationCheckValidationPage GetValidationOnlyCountryBlank(String addreess) {

        WebDriverWait getFnamewait = new WebDriverWait(driver, 90);
        getFnamewait.until(ExpectedConditions.visibilityOf(OnlyCountryValidationGet));

        String BlankCountryerror = OnlyCountryValidationGet.getText();
        Reporter.log("Get validation :" + BlankCountryerror);
        Assert.assertTrue(BlankCountryerror.contains(addreess));

        return this;

    }

    public PersonalInformationCheckValidationPage CityClear(){

        Select dropdown = new Select(driver.findElement(By.id("city")));

        dropdown.selectByVisibleText("Select One");

        return this;
    }




    public PersonalInformationCheckValidationPage GetValidationOnlyCityBlank(String city) {

        WebDriverWait getFnamewait = new WebDriverWait(driver, 90);
        getFnamewait.until(ExpectedConditions.visibilityOf(OnlyCityValidationGet));

        String Blankcityerror = OnlyCityValidationGet.getText();
        Reporter.log("Get validation :" + Blankcityerror);
        Assert.assertTrue(Blankcityerror.contains(city));

        return this;

    }



    public PersonalInformationCheckValidationPage ScrollTozipcode(){

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();",CityOption);

        WebDriverWait zipwait = new WebDriverWait(driver,90);
        zipwait.until(ExpectedConditions.visibilityOf(ZipTextBox));


        ZipTextBox.clear();

        return this;
    }

    public PersonalInformationCheckValidationPage GetValidationOnlyZipcodeBlank(String zip) {

        WebDriverWait getFnamewait = new WebDriverWait(driver, 90);
        getFnamewait.until(ExpectedConditions.visibilityOf(OnlyzipValidationGet));

        String BlankCountryerror = OnlyzipValidationGet.getText();
        Reporter.log("Get validation :" + BlankCountryerror);
        Assert.assertTrue(BlankCountryerror.contains(zip));

        return this;

    }

    public PersonalInformationCheckValidationPage ClearEmail(){


        WebDriverWait emailwait = new WebDriverWait(driver,60);
        emailwait.until(ExpectedConditions.visibilityOf(EmailTxtBox));

        EmailTxtBox.clear();
        return this;
    }

    public PersonalInformationCheckValidationPage GetValidationOnlyEmailBlank(String email) {

        WebDriverWait getFnamewait = new WebDriverWait(driver, 90);
        getFnamewait.until(ExpectedConditions.visibilityOf(OnlyEmailValidationGet));

        String Blankemialerror = OnlyEmailValidationGet.getText();
        Reporter.log("Get validation :" + Blankemialerror);
        Assert.assertTrue(Blankemialerror.contains(email));

        return this;

    }

    public PersonalInformationCheckValidationPage enterPhonetype(){

        Select dropdown = new Select(PhoneTypeSelect);

        dropdown.selectByVisibleText("Select One");

        return this;
    }

    public PersonalInformationCheckValidationPage GetValidationOnlyPhoneBlank(String phone){

        WebDriverWait phwait = new WebDriverWait(driver,80);
        phwait.until(ExpectedConditions.visibilityOf(OnlyPhoneValidationGet));



        String Blankemialerror = OnlyEmailValidationGet.getText();
        Reporter.log("Get validation :" + Blankemialerror);
        Assert.assertTrue(Blankemialerror.contains(phone));
        return this;
    }

    public PersonalInformationCheckValidationPage Scrolltophntype(){


        ((JavascriptExecutor) driver).executeScript("" +
                "arguments[0].scrollIntoView();",PhoneTypeSelect);

        return this;
    }


    public PersonalInformationCheckValidationPage ClearCountrybirth(){


        Select dropdown = new Select(CountryBirthSelect);
        dropdown.selectByVisibleText("Select One");

        return this;
    }

    public PersonalInformationCheckValidationPage GetValidationOnlycountrybirthBlank(String cntybirth){

        WebDriverWait phwait = new WebDriverWait(driver,80);
        phwait.until(ExpectedConditions.visibilityOf(OnlyCountrybirthValidationGet));



        String BlankCountryBirtherror = OnlyCountrybirthValidationGet.getText();
        Reporter.log("Get validation :" + BlankCountryBirtherror);
        Assert.assertTrue(BlankCountryBirtherror.contains(cntybirth));
        return this;
    }

    public PersonalInformationCheckValidationPage ScrolltoCountrybirth(){


        WebDriverWait phwait = new WebDriverWait(driver,80);
        phwait.until(ExpectedConditions.elementToBeClickable(GenderSelect));

        Select dropdown = new Select(GenderSelect);
        dropdown.selectByVisibleText("Select One");

        return this;



    }

    public PersonalInformationCheckValidationPage GetValidationOnlyGenderBlank(String gender){

        WebDriverWait phwait = new WebDriverWait(driver,80);
        phwait.until(ExpectedConditions.visibilityOf(OnlyGenderValidationGet));



        String Blankgendererror = OnlyGenderValidationGet.getText();
        Reporter.log("Get validation :" + Blankgendererror);
        Assert.assertTrue(Blankgendererror.contains(gender));
        return this;
    }

    public PersonalInformationCheckValidationPage scrollEyecolor(){

        ((JavascriptExecutor) driver).executeScript("" +
                "arguments[0].scrollIntoView();",EyecolorSelect);
        return this;

    }

    public PersonalInformationCheckValidationPage selectoneeyecolor(){


        WebDriverWait eyewait = new WebDriverWait(driver,90);
        eyewait.until(ExpectedConditions.elementToBeClickable(EyecolorSelect));

        Select dropdown = new Select(EyecolorSelect);
        dropdown.selectByVisibleText("Select One");

        return this;

    }

    public PersonalInformationCheckValidationPage GetValidationOnlyeyeColorBlank(String gender){

        WebDriverWait eyewait = new WebDriverWait(driver,80);
        eyewait.until(ExpectedConditions.visibilityOf(OnlyEyeColorValidationGet));



        String Blankeyeerror = OnlyEyeColorValidationGet.getText();
        Reporter.log("Get validation :" + Blankeyeerror);
        Assert.assertTrue(Blankeyeerror.contains(gender));
        return this;
    }

    public PersonalInformationCheckValidationPage selectonhaircolor(){

        WebDriverWait hairwait = new WebDriverWait(driver,80);
        hairwait.until(ExpectedConditions.elementToBeClickable(HailcolorSelect));

        Select dropdown = new Select(HailcolorSelect);
        dropdown.selectByVisibleText("Select One");

        return this;

    }

    public PersonalInformationCheckValidationPage GetValidationOnlyhairColorBlank(String gender){

        WebDriverWait hairwait = new WebDriverWait(driver,80);
        hairwait.until(ExpectedConditions.visibilityOf(OnlyhairColorValidationGet));


        String Blankhairerror = OnlyhairColorValidationGet.getText();
        Reporter.log("Get validation :" + Blankhairerror);
        Assert.assertTrue(Blankhairerror.contains(gender));
        return this;
    }

    public PersonalInformationCheckValidationPage clearHeight(){

        HieghtTxtBox.clear();
        return this;
    }

    public PersonalInformationCheckValidationPage GetValidationOnlyHeightBlank(String gender){

        WebDriverWait heightwait = new WebDriverWait(driver,80);
        heightwait.until(ExpectedConditions.visibilityOf(OnlyHeightValidationGet));


        String Blankheighterror = OnlyHeightValidationGet.getText();
        Reporter.log("Get validation :" + Blankheighterror);
        Assert.assertTrue(Blankheighterror.contains(gender));
        return this;
    }

    public PersonalInformationCheckValidationPage clearWeight(){

        weightTxtBox.clear();
        return this;
    }

    public PersonalInformationCheckValidationPage GetValidationOnlyWeightBlank(String gender){

        WebDriverWait weightwait = new WebDriverWait(driver,80);
        weightwait.until(ExpectedConditions.visibilityOf(OnlyWeightValidationGet));


        String Blankweighterror = OnlyWeightValidationGet.getText();
        Reporter.log("Get validation :" + Blankweighterror);
        Assert.assertTrue(Blankweighterror.contains(gender));
        return this;
    }


}
