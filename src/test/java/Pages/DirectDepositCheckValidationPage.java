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

import java.util.List;

/**
 * Created by admin on 15-11-2017.
 */
public class DirectDepositCheckValidationPage {

    WebDriver driver;

    public DirectDepositCheckValidationPage(WebDriver driver){

        this.driver =driver;

    }
    // ALL THE LOCATOR AND METHODS OF DIRECT DEPOSIT PAGE

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(id = "buttContinue")
    public WebElement AboutMeBtn;

    @FindBy(xpath = "//*[@id=\"Direct Deposit\"]/span[1]")
    public WebElement Direct_deposit;


    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[5]/button[1]/span")
    public WebElement SaveDirect_deposit;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li[1]")
    public WebElement AccountValidation;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li[2]")
    public WebElement RoutingValidation;

    @FindBy(xpath = "//*[@id=\"addAnotherAllotment\"]")
    public WebElement AddAllotment;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div/div/div[5]/button[1]/span")
    public WebElement saveAllotement;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[1]/a")
    public WebElement AmountValidation;


    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[2]/a")
    public WebElement AllotAccontValidation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[3]/a")
    public WebElement AllotRountingValidation;

    @FindBy(xpath = "//*[@id=\"organizationAccountAllotmentLabel\"]")
    public WebElement Oraganization;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div/div/div[5]/button[1]/span")
    public WebElement SaveOraganization;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[1]/a")
    public WebElement OraganizationValidation;


    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li[2]/a")
    public WebElement AccountOragValidation;





    public DirectDepositCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }
    public DirectDepositCheckValidationPage AboutMeBtn() {

        WebDriverWait Aboutmewait = new WebDriverWait(driver, 500);
        Aboutmewait.until(ExpectedConditions.elementToBeClickable(AboutMeBtn));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        AboutMeBtn.click();
        return this;

    }

    public DirectDepositCheckValidationPage ClickOndirectDeposit(){

        WebDriverWait eduwait = new WebDriverWait(driver,90);
        eduwait.until(ExpectedConditions.elementToBeClickable(Direct_deposit));

        Direct_deposit.click();
        return this;
    }
    public DirectDepositCheckValidationPage IframeDirectDeposit() {

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

    public DirectDepositCheckValidationPage ScrollToSaveDeposit(){

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveDirect_deposit);

        WebDriverWait depositwait = new WebDriverWait(driver,90);
        depositwait.until(ExpectedConditions.elementToBeClickable(SaveDirect_deposit));


        SaveDirect_deposit.click();
        return this;
    }
    public DirectDepositCheckValidationPage CheckAccountvalidation(String account) {

        WebDriverWait accwait = new WebDriverWait(driver, 90);
        accwait.until(ExpectedConditions.visibilityOf(AccountValidation));

        String BlankaccError = AccountValidation.getText();
        Reporter.log("Get validation :" + BlankaccError);
        System.out.println(BlankaccError);

        Assert.assertTrue(BlankaccError.contains(account));
        return this;
    }

    public DirectDepositCheckValidationPage CheckRountingvalidation(String Rounting) {

        WebDriverWait accwait = new WebDriverWait(driver, 90);
        accwait.until(ExpectedConditions.visibilityOf(RoutingValidation));

        String BlankroutError = RoutingValidation.getText();
        Reporter.log("Get validation :" + BlankroutError);
        System.out.println(BlankroutError);

        Assert.assertTrue(BlankroutError.contains(Rounting));
        return this;
    }

    public DirectDepositCheckValidationPage AddAllotment(){

        WebDriverWait allotwait = new WebDriverWait(driver, 90);
        allotwait.until(ExpectedConditions.visibilityOf(AddAllotment));

        AddAllotment.click();
        return this;
    }

    public DirectDepositCheckValidationPage SaveAllotment(){

        WebDriverWait saveallotwait = new WebDriverWait(driver, 90);
        saveallotwait.until(ExpectedConditions.visibilityOf(saveAllotement));

        saveAllotement.click();

        return this;

    }

    public DirectDepositCheckValidationPage CheckAmountvalidation(String amountValidation) {

        WebDriverWait eduwait = new WebDriverWait(driver, 90);
        eduwait.until(ExpectedConditions.visibilityOf(AmountValidation));

        String BlankamountError = AmountValidation.getText();
        Reporter.log("Get validation :" + BlankamountError);
        System.out.println(BlankamountError);

        Assert.assertTrue(BlankamountError.contains(amountValidation));
        return this;

    }
    public DirectDepositCheckValidationPage CheckAllotAccontvalidation(String amount) {

        WebDriverWait accwait = new WebDriverWait(driver, 90);
        accwait.until(ExpectedConditions.visibilityOf(AllotAccontValidation));

        String BlankallotaccontError = AllotAccontValidation.getText();
        Reporter.log("Get validation :" + BlankallotaccontError);
        System.out.println(BlankallotaccontError);

        Assert.assertTrue(BlankallotaccontError.contains(amount));
        return this;

    }
    public DirectDepositCheckValidationPage CheckAllotroutvalidation(String allotrouting) {

        WebDriverWait routwait = new WebDriverWait(driver, 90);
        routwait.until(ExpectedConditions.visibilityOf(AllotRountingValidation));

        String BlankallotroutError = AllotRountingValidation.getText();
        Reporter.log("Get validation :" + BlankallotroutError);
        System.out.println(BlankallotroutError);

        Assert.assertTrue(BlankallotroutError.contains(allotrouting));
        return this;

    }

    public DirectDepositCheckValidationPage ClickOraganization(){

        WebDriverWait allotwait = new WebDriverWait(driver, 90);
        allotwait.until(ExpectedConditions.visibilityOf(Oraganization));

        Oraganization.click();
        return this;
    }

    public DirectDepositCheckValidationPage SaveOraganization(){

        WebDriverWait savewait = new WebDriverWait(driver, 90);
        savewait.until(ExpectedConditions.visibilityOf(SaveOraganization));

        SaveOraganization.click();
        return this;
    }

    public DirectDepositCheckValidationPage CheckOrganizationvalidation(String Organizationamount) {

        WebDriverWait orgwait = new WebDriverWait(driver, 90);
        orgwait.until(ExpectedConditions.visibilityOf(OraganizationValidation));

        String BlankOrganizationError = OraganizationValidation.getText();
        Reporter.log("Get validation :" + BlankOrganizationError);
        System.out.println(BlankOrganizationError);

        Assert.assertTrue(BlankOrganizationError.contains(Organizationamount));
        return this;

    }
    public DirectDepositCheckValidationPage CheckOragAccountvalidation(String accountOrgValidation) {

        WebDriverWait orgwait = new WebDriverWait(driver, 90);
        orgwait.until(ExpectedConditions.visibilityOf(AccountOragValidation));

        String BlankorgError = AccountOragValidation.getText();
        Reporter.log("Get validation :" + BlankorgError);
        System.out.println(BlankorgError);

        Assert.assertTrue(BlankorgError.contains(accountOrgValidation));
        return this;

    }


}
