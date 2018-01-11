package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by admin on 15-11-2017.
 */
public class EmergencyContactCheckValidationPage {

    WebDriver driver;

    public  EmergencyContactCheckValidationPage(WebDriver driver){

        this.driver= driver;
    }

    // ALL THE LOCATOR AND METHODS OF EMERGENCY CONTACT PAGE

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(id = "buttContinue")
    public WebElement AboutMeBtn;

    @FindBy(xpath = "//*[@id=\"Emergency Contacts\"]/span[1]")
    public WebElement EmergencyContact;

    @FindBy(xpath = "//*[@id=\"addEmergencyContact\"]")
    public WebElement ClickAddContact;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div[4]/button[1]/span")
    public WebElement SaveEG;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[1]/a")
    public WebElement StreetAddValidation;


    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[2]/a")
    public WebElement CountryValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[3]/a")
    public WebElement zipValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[4]/a")
    public WebElement phonetypeValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[5]/a")
    public WebElement phoneNumValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[6]/a")
    public WebElement FirstnameValidation;


    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[7]/a")
    public WebElement LastnameValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[8]/a")
    public WebElement RelationValidation;



    public EmergencyContactCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }
    public EmergencyContactCheckValidationPage AboutMeBtn() {

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(AboutMeBtn));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        AboutMeBtn.click();
        return this;

    }

    public EmergencyContactCheckValidationPage ClickOnEmergenctContact(){

        WebDriverWait EGwait = new WebDriverWait(driver,90);
        EGwait.until(ExpectedConditions.elementToBeClickable(EmergencyContact));

        EmergencyContact.click();

        return this;
    }

    public EmergencyContactCheckValidationPage IframeEG() {

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

    public EmergencyContactCheckValidationPage AddContacts(){

        ClickAddContact.click();
        return this;
    }

    public EmergencyContactCheckValidationPage ScrollToSaveEmergency(){

        WebDriverWait ECwait = new WebDriverWait(driver,200);
        ECwait.until(ExpectedConditions.elementToBeClickable(SaveEG));




        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveEG);

        WebDriverWait ECwait1 = new WebDriverWait(driver,100);
        ECwait1.until(ExpectedConditions.elementToBeClickable(SaveEG));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SaveEG.click();


        return this;

    }

    public EmergencyContactCheckValidationPage CheckStreetAddvalidation(String addStreetAddress) {

        WebDriverWait streetwait = new WebDriverWait(driver, 90);
        streetwait.until(ExpectedConditions.visibilityOf(StreetAddValidation));

        String BlankStreetaddError = StreetAddValidation.getText();
        Reporter.log("Get validation :" + BlankStreetaddError);
        System.out.println(BlankStreetaddError);

        Assert.assertTrue(BlankStreetaddError.contains(addStreetAddress));
        return this;

    }

    public EmergencyContactCheckValidationPage CheckCountryvalidation(String Country) {

        WebDriverWait countrywait = new WebDriverWait(driver, 90);
        countrywait.until(ExpectedConditions.visibilityOf(CountryValidation));

        String BlankCountryError = CountryValidation.getText();
        Reporter.log("Get validation :" + BlankCountryError);
        System.out.println(BlankCountryError);

        Assert.assertTrue(BlankCountryError.contains(Country));
        return this;

    }
    public EmergencyContactCheckValidationPage CheckZipvalidation(String zip) {

        WebDriverWait zipwait = new WebDriverWait(driver, 90);
        zipwait.until(ExpectedConditions.visibilityOf(zipValidation));

        String BlankzipError = zipValidation.getText();
        Reporter.log("Get validation :" + BlankzipError);
        System.out.println(BlankzipError);

        Assert.assertTrue(BlankzipError.contains(zip));
        return this;

    }
    public EmergencyContactCheckValidationPage CheckPhonetypevalidation(String phonetype) {

        WebDriverWait phonewait = new WebDriverWait(driver, 90);
        phonewait.until(ExpectedConditions.visibilityOf(phonetypeValidation));

        String BlankphonetypeError = phonetypeValidation.getText();
        Reporter.log("Get validation :" + BlankphonetypeError);
        System.out.println(BlankphonetypeError);

        Assert.assertTrue(BlankphonetypeError.contains(phonetype));
        return this;

    }
    public EmergencyContactCheckValidationPage CheckPhonenumvalidation(String number) {

        WebDriverWait phonewait = new WebDriverWait(driver, 90);
        phonewait.until(ExpectedConditions.visibilityOf(phoneNumValidation));

        String BlankphonenumError = phoneNumValidation.getText();
        Reporter.log("Get validation :" + BlankphonenumError);
        System.out.println(BlankphonenumError);

        Assert.assertTrue(BlankphonenumError.contains(number));
        return this;

    }
    public EmergencyContactCheckValidationPage CheckFirstnamevalidation(String Firstname) {

        WebDriverWait firstnamewait = new WebDriverWait(driver, 90);
        firstnamewait.until(ExpectedConditions.visibilityOf(FirstnameValidation));

        String BlankfirstnameError = FirstnameValidation.getText();
        Reporter.log("Get validation :" + BlankfirstnameError);
        System.out.println(BlankfirstnameError);

        Assert.assertTrue(BlankfirstnameError.contains(Firstname));
        return this;

    }
    public EmergencyContactCheckValidationPage CheckLastnamevalidation(String Lastname) {

        WebDriverWait firstnamewait = new WebDriverWait(driver, 90);
        firstnamewait.until(ExpectedConditions.visibilityOf(LastnameValidation));

        String BlanklastnameError = LastnameValidation.getText();
        Reporter.log("Get validation :" + BlanklastnameError);
        System.out.println(BlanklastnameError);

        Assert.assertTrue(BlanklastnameError.contains(Lastname));
        return this;

    }
    public EmergencyContactCheckValidationPage CheckRelationshipnamevalidation(String Relation) {

        WebDriverWait relationwait = new WebDriverWait(driver, 90);
        relationwait.until(ExpectedConditions.visibilityOf(RelationValidation));

        String BlankRelationshipError = RelationValidation.getText();
        Reporter.log("Get validation :" + BlankRelationshipError);
        System.out.println(BlankRelationshipError);

        Assert.assertTrue(BlankRelationshipError.contains(Relation));
        return this;

    }
}
