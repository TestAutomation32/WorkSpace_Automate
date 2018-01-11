package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;

import static Pages.LoginPage.RulesAcceptBtn;

/**
 * Created by admin on 13-11-2017.
 */
public class AboutMeValidDataPage {

    WebDriver driver;

    public AboutMeValidDataPage(WebDriver driver) {

        this.driver = driver;
    }
// ALL THE LOCATOR AND METHODS OF ABOUTMEVALIDDATAPAGE

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(id = "buttContinue")
    public WebElement AboutMeBtn;

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

    @FindBy(xpath = ".//*[@id='addEmergencyContact'and text()='Add Emergency Contact']")
    public WebElement Addcontacts;

    @FindBy(id = "firstName")
    public WebElement FirstnameTxtBox;

    @FindBy(id = "middleName")
    public WebElement MiddlenameTxtbox;

    @FindBy(id = "lastName")
    public WebElement LastnameTxtbox;

    @FindBy(xpath = "//*[@id=\"relationship\"]")
    public WebElement SelectRelationshipDropdown;

    @FindBy(xpath = "//*[@id=\"relationship\"]/option[5]")
    public WebElement OptionRelationshipDropdown;

    @FindBy(xpath = "//*[@id=\"sameAsMine\"]/div/div[1]/label")
    public WebElement RadioBtnAdreess;

    @FindBy(xpath = "//*[@id=\"phone1Type\"]")
    public WebElement PhoneTypeSelect;

    @FindBy(xpath = "//*[@id=\"phone1Type\"]/option[2]")
    public WebElement phoneOptionl;

    @FindBy(xpath = "//*[@id=\"phone1Number\"]")
    public WebElement PhoneTxtBox;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div[4]/button[1]")
    public WebElement AcceptBtn;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[2]/button[1]/span")
    public WebElement SaveCoseEmergenctContact;

    @FindBy(xpath = "//*[@id=\"addEducation\"]")
    public WebElement ClickAddEducation;

    @FindBy(xpath = "//*[@id=\"degree\"]")
    public WebElement SelectDegree;

    @FindBy(xpath = "//*[@id=\"degree\"]/option[4]")
    public WebElement OptionDegree;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div[5]/button[1]/span")
    public WebElement AcceptEducation;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[2]/button[1]/span")
    public WebElement SaveEducation;

    @FindBy(xpath = "//*[@id=\"eods-ethnicity-section\"]/label[1]")
    public WebElement RadioBtnEthinic;

    @FindBy(xpath = "//*[@id=\"eods-race-section\"]/div/div[2]/div/label/span")
    public WebElement Checkboxethinic;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[6]/button[1]/span")
    public WebElement SaveCitizenship;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[4]/button[1]")
    public WebElement Saveehinic;

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

    @FindBy(xpath = "//*[@id=\"notSpecifiedDisabilityLabel\"]")
    public WebElement DisabilityDetails;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[5]/button[1]/span")
    public WebElement Savedisability;

    @FindBy(xpath = "//*[@id=\"savingAccount\"]")
    public WebElement SaveOnSaving_Deposit;

    @FindBy(xpath = "//*[@id=\"accountNumber\"]")
    public WebElement AccountNumTxtBox;

    @FindBy(xpath = "//*[@id=\"routingNumber\"]")
    public WebElement RountingNumberTextBox;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[5]/button[1]/span")
    public WebElement SaveDeposit;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[3]/div[2]/button/span")
    public WebElement OkFedaral;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[3]/div/div[1]")
    public WebElement RadioBtnServiceRegistartion;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[6]/div/div[2]")
    public WebElement RadioBtnMilitaryService;
    //*[@id="pensionPaymentNo"]

    @FindBy(xpath = "//*[@id=\"pensionPaymentNo\"]")
    public WebElement RadioBtnRetirementPayService;

    @FindBy(xpath = "//*[@id=\"Radio2\"]")
    public WebElement RadioBtnFedaralService;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[9]/div/div[2]")
    public WebElement RadioBtnVeteranService;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[15]/button[1]/span")
    public WebElement SaveMilitary;


    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[14]/button[1]/span")
    public WebElement SaveBackdround;


    @FindBy(xpath = "//*[@id=\"buttCore\"]")
    public WebElement DisableBtn;


    //ALL METHODS FOR VALID DATA TO FILL
    public AboutMeValidDataPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.LoginForFresh();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }

    public AboutMeValidDataPage AboutMeBtn() {

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(AboutMeBtn));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        AboutMeBtn.click();
        return this;

    }

    public AboutMeValidDataPage SavedBtnCheck(String Status) {

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(PIText));

        String PI = PIText.getText();
        System.out.println(PI);
        Assert.assertEquals(PI, Status);

        if (PI.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait emergencywait = new WebDriverWait(driver, 60);
            emergencywait.until(ExpectedConditions.elementToBeClickable(EmergencyContact));
            try {
                EmergencyContact.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnEmergencyContact() {


        WebDriverWait emergencywait = new WebDriverWait(driver, 90);
        emergencywait.until(ExpectedConditions.elementToBeClickable(EmergencyContact));

        EmergencyContact.click();

        return this;

    }

    public AboutMeValidDataPage IframeEG() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Emergency Contacts']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Emergency Contacts']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage AddContacts() {

        WebDriverWait addwait = new WebDriverWait(driver, 50);
        addwait.until(ExpectedConditions.elementToBeClickable(Addcontacts));

        try {
            Addcontacts.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public AboutMeValidDataPage Firstname(String FN) {

        FirstnameTxtBox.sendKeys(FN);
        return this;
    }

    public AboutMeValidDataPage Laststname(String LN) {

        LastnameTxtbox.sendKeys(LN);
        return this;
    }

    public AboutMeValidDataPage Relationship() {

        WebDriverWait selectwait = new WebDriverWait(driver, 50);
        selectwait.until(ExpectedConditions.elementToBeClickable(SelectRelationshipDropdown));


        SelectRelationshipDropdown.click();
        OptionRelationshipDropdown.click();
        return this;
    }

    public AboutMeValidDataPage AddressSelect() {

        WebDriverWait selectwait = new WebDriverWait(driver, 50);
        selectwait.until(ExpectedConditions.elementToBeClickable(RadioBtnAdreess));

        RadioBtnAdreess.click();
        return this;
    }

    public AboutMeValidDataPage EnterPhonetype(String phone) {


        WebDriverWait phonewait = new WebDriverWait(driver, 20);
        phonewait.until(ExpectedConditions.visibilityOf(PhoneTypeSelect));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", PhoneTypeSelect);

        PhoneTypeSelect.click();
        phoneOptionl.click();


        WebDriverWait txtwait7 = new WebDriverWait(driver, 20);
        txtwait7.until(ExpectedConditions.visibilityOf(PhoneTxtBox));


        PhoneTxtBox.sendKeys(phone);
        return this;
    }

    public AboutMeValidDataPage AcceptEmergency() {

        WebDriverWait txtwait7 = new WebDriverWait(driver, 20);
        txtwait7.until(ExpectedConditions.visibilityOf(AcceptBtn));

        AcceptBtn.click();

        return this;
    }

    public AboutMeValidDataPage SaveEmergencyContact() {


        WebDriverWait savewait = new WebDriverWait(driver, 90);
        savewait.until(ExpectedConditions.elementToBeClickable(SaveCoseEmergenctContact));

        SaveCoseEmergenctContact.click();
        return this;
    }

    public AboutMeValidDataPage EmergencySavedBtnCheck(String Status) {

        WebDriverWait emergency1wait = new WebDriverWait(driver, 500);
        emergency1wait.until(ExpectedConditions.elementToBeClickable(EmergencyContact));

        String EC = EmergencyContact.getText();
        System.out.println(EC);
        Assert.assertEquals(EC, Status);

        if (EC.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait emergencywait = new WebDriverWait(driver, 60);
            emergencywait.until(ExpectedConditions.elementToBeClickable(Education));
            try {
                Education.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnEducation() {

        WebDriverWait educationwait = new WebDriverWait(driver, 60);
        educationwait.until(ExpectedConditions.elementToBeClickable(Education));

        Education.click();
        return this;
    }

    public AboutMeValidDataPage IframeEducation() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Education']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Education']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage ClcikAddEducation() {

        WebDriverWait eduwait = new WebDriverWait(driver, 60);
        eduwait.until(ExpectedConditions.elementToBeClickable(ClickAddEducation));
        ClickAddEducation.click();

        return this;
    }

    public AboutMeValidDataPage Selectdegree() {


        WebDriverWait degreewait = new WebDriverWait(driver, 60);
        degreewait.until(ExpectedConditions.elementToBeClickable(SelectDegree));

        SelectDegree.click();
        OptionDegree.click();

        return this;
    }

    public AboutMeValidDataPage AcceptEducation() {


        AcceptEducation.click();
        return this;
    }


    public AboutMeValidDataPage SaveBtnEducation() {

        SaveEducation.click();
        return this;
    }

    public AboutMeValidDataPage CitizenshipSavedBtnCheck(String Status) {

        WebDriverWait Citywait = new WebDriverWait(driver, 500);
        Citywait.until(ExpectedConditions.elementToBeClickable(Citizenship));

        String Education = Citizenship.getText();
        System.out.println(Education);
        Assert.assertEquals(Education, Status);

        if (Education.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait City1wait = new WebDriverWait(driver, 60);
            City1wait.until(ExpectedConditions.elementToBeClickable(Citizenship));
            try {
                Citizenship.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnCitizenship() {

        WebDriverWait Citywait = new WebDriverWait(driver, 60);
        Citywait.until(ExpectedConditions.elementToBeClickable(Citizenship));

        Citizenship.click();
        return this;
    }

    public AboutMeValidDataPage IframeCitizenship() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Citizenship']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Citizenship']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage SaveCitizenship() {


        SaveCitizenship.click();
        return this;
    }

    public AboutMeValidDataPage EthinicSavedBtnCheck(String Status) {

        WebDriverWait ethinicity1wait = new WebDriverWait(driver, 500);
        ethinicity1wait.until(ExpectedConditions.elementToBeClickable(Ethnicity_Race));

        String Education = Ethnicity_Race.getText();
        System.out.println(Education);
        Assert.assertEquals(Education, Status);

        if (Education.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait ethinicitywait = new WebDriverWait(driver, 60);
            ethinicitywait.until(ExpectedConditions.elementToBeClickable(Ethnicity_Race));
            try {
                Ethnicity_Race.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnEthinicRace() {

        WebDriverWait ethinicitywait = new WebDriverWait(driver, 60);
        ethinicitywait.until(ExpectedConditions.elementToBeClickable(Ethnicity_Race));

        Ethnicity_Race.click();
        return this;
    }

    public AboutMeValidDataPage IframeEthinicRace() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Ethnicity and Race']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Ethnicity and Race']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage EnterEthinicDetails() {

        RadioBtnEthinic.click();
        Checkboxethinic.click();


        return this;
    }


    public AboutMeValidDataPage SaveEhinicrace() {


        WebDriverWait savwait = new WebDriverWait(driver, 90);
        savwait.until(ExpectedConditions.elementToBeClickable(Saveehinic));


        Saveehinic.click();
        return this;
    }

    public AboutMeValidDataPage DisabilitySavedBtnCheck(String Status) {

        WebDriverWait Disabilitywait = new WebDriverWait(driver, 500);
        Disabilitywait.until(ExpectedConditions.elementToBeClickable(Disability));

        String Education = Disability.getText();
        System.out.println(Education);
        Assert.assertEquals(Education, Status);

        if (Education.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait Disability1wait = new WebDriverWait(driver, 60);
            Disability1wait.until(ExpectedConditions.elementToBeClickable(Disability));
            try {
                Disability.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnDisability() {

        WebDriverWait Disabilitywait = new WebDriverWait(driver, 60);
        Disabilitywait.until(ExpectedConditions.elementToBeClickable(Disability));

        Disability.click();
        return this;
    }

    public AboutMeValidDataPage IframeDisability() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Disability']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Disability']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage EnterDisabilityDetails() {

        DisabilityDetails.click();


        return this;
    }


    public AboutMeValidDataPage SaveDisability() {


        WebDriverWait savwait = new WebDriverWait(driver, 90);
        savwait.until(ExpectedConditions.elementToBeClickable(Savedisability));


        Savedisability.click();
        return this;
    }

    public AboutMeValidDataPage DirectDepositSavedBtnCheck(String Status) {

        WebDriverWait Deposittwait = new WebDriverWait(driver, 500);
        Deposittwait.until(ExpectedConditions.elementToBeClickable(Direct_deposit));

        String Education = Direct_deposit.getText();
        System.out.println(Education);
        Assert.assertEquals(Education, Status);

        if (Education.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait Deposit1twait = new WebDriverWait(driver, 60);
            Deposit1twait.until(ExpectedConditions.elementToBeClickable(Direct_deposit));
            try {
                Direct_deposit.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnDirectDeposit() {

        WebDriverWait Depositwait = new WebDriverWait(driver, 60);
        Depositwait.until(ExpectedConditions.elementToBeClickable(Direct_deposit));

        Direct_deposit.click();
        return this;
    }

    public AboutMeValidDataPage IframeDirectdeposit() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Direct Deposit']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Direct Deposit']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage EnterDirectDepositDetailsAccount(String number) {

        SaveOnSaving_Deposit.click();

        WebDriverWait accountwait = new WebDriverWait(driver, 90);
        accountwait.until(ExpectedConditions.elementToBeClickable(AccountNumTxtBox));

        AccountNumTxtBox.sendKeys(number);

        return this;
    }

    public AboutMeValidDataPage EnterDirectDepositDetailsRounting(String number1) {


        WebDriverWait accountwait = new WebDriverWait(driver, 90);
        accountwait.until(ExpectedConditions.elementToBeClickable(RountingNumberTextBox));


        RountingNumberTextBox.sendKeys(number1);

        return this;
    }

    public AboutMeValidDataPage SaveDirectdetails() {


        WebDriverWait savwait = new WebDriverWait(driver, 90);
        savwait.until(ExpectedConditions.elementToBeClickable(Savedisability));


        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveDeposit);

        SaveDeposit.click();
        return this;
    }

    public AboutMeValidDataPage FeadaralSavedBtnCheck(String Status) {

        WebDriverWait Fedaraltwait = new WebDriverWait(driver, 500);
        Fedaraltwait.until(ExpectedConditions.elementToBeClickable(Federal_state));

        String Education = Federal_state.getText();
        System.out.println(Education);
        Assert.assertEquals(Education, Status);

        if (Education.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait Fedaral1twait = new WebDriverWait(driver, 60);
            Fedaral1twait.until(ExpectedConditions.elementToBeClickable(Federal_state));
            try {
                Federal_state.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnFedaral() {

        WebDriverWait Fedaralwait = new WebDriverWait(driver, 60);
        Fedaralwait.until(ExpectedConditions.elementToBeClickable(Federal_state));

        Federal_state.click();
        return this;
    }

    public AboutMeValidDataPage IframeFedaral() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Federal and State Tax']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Federal and State Tax']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage EnterFedaralDetails() {

        OkFedaral.click();


        return this;
    }

    public AboutMeValidDataPage MilitarySavedBtnCheck(String Status) {

        WebDriverWait militarywait = new WebDriverWait(driver, 500);
        militarywait.until(ExpectedConditions.elementToBeClickable(Militari_Fedaral));

        String Education = Militari_Fedaral.getText();
        System.out.println(Education);
        Assert.assertEquals(Education, Status);

        if (Education.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait military1wait = new WebDriverWait(driver, 60);
            military1wait.until(ExpectedConditions.elementToBeClickable(Militari_Fedaral));
            try {
                Militari_Fedaral.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnMilitary() {

        WebDriverWait militarywait = new WebDriverWait(driver, 60);
        militarywait.until(ExpectedConditions.elementToBeClickable(Militari_Fedaral));

        Militari_Fedaral.click();
        return this;
    }

    public AboutMeValidDataPage IframeMilitary() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Military and Federal Service']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Military and Federal Service']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage EnterMilitaryDetails() {


        WebDriverWait militarywait = new WebDriverWait(driver, 90);
        militarywait.until(ExpectedConditions.elementToBeClickable(RadioBtnServiceRegistartion));

        RadioBtnServiceRegistartion.click();
        RadioBtnMilitaryService.click();
        RadioBtnVeteranService.click();
        RadioBtnFedaralService.click();
        RadioBtnRetirementPayService.click();


        return this;
    }


    public AboutMeValidDataPage SaveMilitarydetails() {


        WebDriverWait savwait = new WebDriverWait(driver, 90);
        savwait.until(ExpectedConditions.elementToBeClickable(SaveMilitary));


        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveMilitary);

        SaveMilitary.click();
        return this;
    }

    public AboutMeValidDataPage BackgroundSavedBtnCheck(String Status) {

        WebDriverWait Background1wait = new WebDriverWait(driver, 500);
        Background1wait.until(ExpectedConditions.elementToBeClickable(Background));

        String Education = Background.getText();
        System.out.println(Education);
        Assert.assertEquals(Education, Status);

        if (Education.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait Backgroundwait = new WebDriverWait(driver, 60);
            Backgroundwait.until(ExpectedConditions.elementToBeClickable(Background));
            try {
                Background.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public AboutMeValidDataPage ClickOnBackground() {

        WebDriverWait Backgroundwait = new WebDriverWait(driver, 60);
        Backgroundwait.until(ExpectedConditions.elementToBeClickable(Background));

        Background.click();
        return this;
    }

    public AboutMeValidDataPage IframeBackground() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Background']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Background']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public AboutMeValidDataPage SaveBackgrounddetails() {


        WebDriverWait savwait = new WebDriverWait(driver, 90);
        savwait.until(ExpectedConditions.elementToBeClickable(SaveBackdround));


        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveBackdround);

        SaveBackdround.click();
        return this;
    }

    //CHECK BUTTON IS ENABLE OR DISABLE
    public AboutMeValidDataPage DisableBtn() {

            Assert.assertEquals(false, DisableBtn.isEnabled());
            return this;
        }



    }
