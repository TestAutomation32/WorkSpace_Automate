package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by admin on 16-11-2017.
 */
public class BackgroundCheckValidationPage {

    WebDriver driver;

    public BackgroundCheckValidationPage(WebDriver driver){

        this.driver=driver;
    }

    // ALL THE LOCATOR AND METHODS OF BACKGROUND PAGE

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(id = "buttContinue")
    public WebElement AboutMeBtn;

    @FindBy(xpath = "//*[@id=\"Background\"]/span[1]")
    public WebElement Background;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[2]/div[2]/div[1]/label")
    public WebElement YesBtnBackground;

    @FindBy(xpath = "//*[@id=\"convictionsAdd\"]")
    public WebElement AddOnConviction;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div[4]/button[1]/span")
    public WebElement AcceptBackgroundBtn;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[1]/a")
    public WebElement OccurranceValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[2]/a")
    public WebElement ExplanationValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[3]/a")
    public WebElement PlaceValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[4]/a")
    public WebElement NameValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[5]/a")
    public WebElement StreetValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[6]/a")
    public WebElement CountryValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[7]/a")
    public WebElement ZipValidattion;

    @FindBy(xpath = "/html/body/div[3]/header/a")
    public WebElement CloseBackground;


    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[10]/div[2]/div[1]/label")
    public WebElement YesBtnDebt;

    @FindBy(xpath = "//*[@id=\"federalDebtAdd\"]")
    public WebElement AddDebtBtn;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div[4]/button[1]/span")
    public WebElement SaveDebtBtn;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[1]/a")
    public WebElement DebttypeValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[2]/a")
    public WebElement DebLengthValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[3]/a")
    public WebElement DebtAmountValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[4]/a")
    public WebElement DebtStepsValidation;


    @FindBy(xpath = "/html/body/div[3]/header/a")
    public WebElement CloseDebt;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[12]/div[2]/div[1]/label")
    public WebElement YesHiredBtn;

    @FindBy(xpath = "//*[@id=\"relativesAdd\"]")
    public WebElement AddRelativeBtn;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div[4]/button[1]/span")
    public WebElement SaveRelativeBtn;


    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[1]/a")
    public WebElement RelativeNameValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[2]/a")
    public WebElement RelativeRelationshipValidation;





    public BackgroundCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }
    public BackgroundCheckValidationPage AboutMeBtn() {

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(AboutMeBtn));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        AboutMeBtn.click();
        return this;

    }

    public BackgroundCheckValidationPage ClickOnBackground(){

        WebDriverWait BGwait = new WebDriverWait(driver,100);
        BGwait.until(ExpectedConditions.elementToBeClickable(Background));

        Background.click();

        return this;
    }

    public BackgroundCheckValidationPage IframeBG() {

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

    public BackgroundCheckValidationPage ClickOnYesBtn(){

        YesBtnBackground.click();


        return this;

    }
    public BackgroundCheckValidationPage ClickAddConviction(){

        WebDriverWait addwait = new WebDriverWait(driver,90);
        addwait.until(ExpectedConditions.elementToBeClickable(AddOnConviction));

        AddOnConviction.click();


        return this;
    }

    public BackgroundCheckValidationPage ClickOnSaveBackground(){

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", AcceptBackgroundBtn);

        WebDriverWait acceptwait = new WebDriverWait(driver,90);
        acceptwait.until(ExpectedConditions.elementToBeClickable(AcceptBackgroundBtn));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        AcceptBackgroundBtn.click();

        return this;
    }

    public BackgroundCheckValidationPage CheckVlaidationforOccurrance(String occurrance){

        WebDriverWait occwait = new WebDriverWait(driver,90);
        occwait.until(ExpectedConditions.elementToBeClickable(OccurranceValidation));

        String BlankOccurranceerror = OccurranceValidation.getText();
        Reporter.log("Get Validation:" +BlankOccurranceerror);
        Assert.assertTrue(BlankOccurranceerror.contains(occurrance));

        return this;

    }

    public BackgroundCheckValidationPage CheckVlaidationforExplanation(String explanation){

        WebDriverWait explanationwait = new WebDriverWait(driver,90);
        explanationwait.until(ExpectedConditions.elementToBeClickable(ExplanationValidation));

        String Blankexplanationerror = ExplanationValidation.getText();
        Reporter.log("Get Validation:" +Blankexplanationerror);
        Assert.assertTrue(Blankexplanationerror.contains(explanation));

        return this;

    }
    public BackgroundCheckValidationPage CheckVlaidationforPlace(String Place){

        WebDriverWait placewait = new WebDriverWait(driver,90);
        placewait.until(ExpectedConditions.elementToBeClickable(PlaceValidation));

        String Blankplaceerror = PlaceValidation.getText();
        Reporter.log("Get Validation:" +Blankplaceerror);
        Assert.assertTrue(Blankplaceerror.contains(Place));

        return this;

    }

    public BackgroundCheckValidationPage CheckVlaidationforName(String name){

        WebDriverWait namewait = new WebDriverWait(driver,200);
        namewait.until(ExpectedConditions.elementToBeClickable(NameValidation));

        String Blanknamerror = NameValidation.getText();
        Reporter.log("Get Validation:" +Blanknamerror);
        Assert.assertTrue(Blanknamerror.contains(name));

        return this;

    }
    public BackgroundCheckValidationPage CheckVlaidationforStreet(String streetaddress1){

        WebDriverWait streetwait = new WebDriverWait(driver,200);
        streetwait.until(ExpectedConditions.visibilityOf(StreetValidation));

        String Blankstreeterror = StreetValidation.getText();
        Reporter.log("Get Validation:" +Blankstreeterror);
        Assert.assertTrue(Blankstreeterror.contains(streetaddress1));

        return this;

    }
    public BackgroundCheckValidationPage CheckVlaidationforCountry(String country){

        WebDriverWait countrywait = new WebDriverWait(driver,200);
        countrywait.until(ExpectedConditions.visibilityOf(CountryValidation));

        String Blankcountryerror = CountryValidation.getText();
        Reporter.log("Get Validation:" +Blankcountryerror);
        Assert.assertTrue(Blankcountryerror.contains(country));

        return this;

    }
    public BackgroundCheckValidationPage CheckVlaidationforzip(String zipcode){

        WebDriverWait zipwait = new WebDriverWait(driver,200);
        zipwait.until(ExpectedConditions.elementToBeClickable(ZipValidattion));

        String Blankziperror = ZipValidattion.getText();
        Reporter.log("Get Validation:" +Blankziperror);
        Assert.assertTrue(Blankziperror.contains(zipcode));

        return this;

    }

    public BackgroundCheckValidationPage CloseDebtBtn(){


        CloseBackground.click();
        return this;
    }



    public BackgroundCheckValidationPage ClickOnYesBtnforDebt(){
        WebDriverWait zipwait = new WebDriverWait(driver,100);
        zipwait.until(ExpectedConditions.elementToBeClickable(YesBtnDebt));
        YesBtnDebt.click();


        return this;

    }
    public BackgroundCheckValidationPage ClickAdddebt(){

        WebDriverWait addwait = new WebDriverWait(driver,90);
        addwait.until(ExpectedConditions.elementToBeClickable(AddDebtBtn));

        AddDebtBtn.click();


        return this;
    }

    public BackgroundCheckValidationPage ClickOnSaveDebt(){

        WebDriverWait acceptwait = new WebDriverWait(driver,90);
        acceptwait.until(ExpectedConditions.elementToBeClickable(SaveDebtBtn));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SaveDebtBtn.click();

        return this;
    }

    public BackgroundCheckValidationPage CheckVlaidationforDebttype(String Debttype){

        WebDriverWait typewait = new WebDriverWait(driver,200);
        typewait.until(ExpectedConditions.visibilityOf(DebttypeValidation));

        String Blankdebttypeerror = DebttypeValidation.getText();
        Reporter.log("Get Validation:" +Blankdebttypeerror);
        Assert.assertTrue(Blankdebttypeerror.contains(Debttype));

        return this;

    }
    public BackgroundCheckValidationPage CheckVlaidationforlength(String Debtlength){

        WebDriverWait lengthwait = new WebDriverWait(driver,200);
        lengthwait.until(ExpectedConditions.visibilityOf(DebLengthValidation));

        String Blanklengtherror = DebLengthValidation.getText();
        Reporter.log("Get Validation:" +Blanklengtherror);
        Assert.assertTrue(Blanklengtherror.contains(Debtlength));

        return this;

    }
    public BackgroundCheckValidationPage CheckVlaidationforamount(String Debtamount){

        WebDriverWait amountwait = new WebDriverWait(driver,200);
        amountwait.until(ExpectedConditions.visibilityOf(DebtAmountValidation));

        String Blankamounterror = DebtAmountValidation.getText();
        Reporter.log("Get Validation:" +Blankamounterror);
        Assert.assertTrue(Blankamounterror.contains(Debtamount));

        return this;
    }

    public BackgroundCheckValidationPage CheckVlaidationforSteps(String Debtsteps){

        WebDriverWait stepswait = new WebDriverWait(driver,200);
        stepswait.until(ExpectedConditions.visibilityOf(DebtStepsValidation));

        String Blankstepserror = DebtStepsValidation.getText();
        Reporter.log("Get Validation:" +Blankstepserror);
        Assert.assertTrue(Blankstepserror.contains(Debtsteps));

        return this;

    }

    public BackgroundCheckValidationPage CloseDebt(){

        CloseDebt.click();
        return this;
    }



    public BackgroundCheckValidationPage ClickOnYesBtnforhired(){


        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", YesHiredBtn);


        WebDriverWait zipwait = new WebDriverWait(driver,100);
        zipwait.until(ExpectedConditions.elementToBeClickable(YesHiredBtn));
        YesHiredBtn.click();


        return this;

    }
    public BackgroundCheckValidationPage ClickAddrelative(){

        WebDriverWait addwait = new WebDriverWait(driver,90);
        addwait.until(ExpectedConditions.elementToBeClickable(AddRelativeBtn));

        AddRelativeBtn.click();


        return this;
    }

    public BackgroundCheckValidationPage ClickOnSaveHiredbtb(){

        WebDriverWait acceptwait = new WebDriverWait(driver,90);
        acceptwait.until(ExpectedConditions.elementToBeClickable(SaveRelativeBtn));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SaveRelativeBtn.click();

        return this;
    }
    public BackgroundCheckValidationPage CheckValidationforRelativename(String Relativename){

        WebDriverWait namewait = new WebDriverWait(driver,200);
        namewait.until(ExpectedConditions.visibilityOf(RelativeNameValidation));

        String Blanksnameerror = RelativeNameValidation.getText();
        Reporter.log("Get Validation:" +Blanksnameerror);
        Assert.assertTrue(Blanksnameerror.contains(Relativename));

        return this;

    }

    public BackgroundCheckValidationPage CheckValidationforRelativRelationship(String Relativerelationship){

        WebDriverWait namewait = new WebDriverWait(driver,200);
        namewait.until(ExpectedConditions.visibilityOf(RelativeRelationshipValidation));

        String Blanksrelationshiperror = RelativeRelationshipValidation.getText();
        Reporter.log("Get Validation:" +Blanksrelationshiperror);
        Assert.assertTrue(Blanksrelationshiperror.contains(Relativerelationship));

        return this;

    }

}
