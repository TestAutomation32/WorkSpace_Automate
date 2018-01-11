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
public class LifeInsuranceCheckValidationPage {

    WebDriver driver;

    public LifeInsuranceCheckValidationPage(WebDriver driver){

        this.driver =driver;
    }
    // ALL THE LOCATOR AND METHODS OF LIFEINSURANCE PAGE
    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(xpath = "//*[@id=\"eods-benefits-tab\"]/div/span[1]")
    public WebElement BenifitsTab;

    @FindBy(xpath = "//*[@id=\"Life Insurance (FEGLI)\"]/span[1]")
    public WebElement Life;

    @FindBy(xpath = "//*[@id=\"acceptLifeInsuranceLabel\"]")
    public WebElement SelectElectBtn;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[4]/button[1]")
    public WebElement SaveOnLife;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li[1]/a")
    public WebElement BeneficiaryValidation;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li[2]/a")
    public WebElement InsuranceValidation;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li[3]/a")
    public WebElement signatureValidation;

    public LifeInsuranceCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }

    public LifeInsuranceCheckValidationPage ClickOnBenifitsTab(){

        BenifitsTab.click();
        return this;

    }

    public LifeInsuranceCheckValidationPage ClickOnLife(){


        WebDriverWait lifewait =new WebDriverWait(driver,90);
        lifewait.until(ExpectedConditions.elementToBeClickable(Life));


        Life.click();
        return this;
    }
    public LifeInsuranceCheckValidationPage IframeLife() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Life Insurance (FEGLI)']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Life Insurance (FEGLI)']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public LifeInsuranceCheckValidationPage ClickonSaveLife(){

        SelectElectBtn.click();

        WebDriverWait save1wait = new WebDriverWait(driver,90);
        save1wait.until(ExpectedConditions.elementToBeClickable(SaveOnLife));


        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveOnLife);


        WebDriverWait savewait = new WebDriverWait(driver,90);
        savewait.until(ExpectedConditions.elementToBeClickable(SaveOnLife));


        SaveOnLife.click();

        return this;
    }

    public LifeInsuranceCheckValidationPage CheckValidationforBeneficiary(String beneficiary){

        WebDriverWait Beneficiarywait = new WebDriverWait(driver,200);
        Beneficiarywait.until(ExpectedConditions.elementToBeClickable(BeneficiaryValidation));

        String BlankBeneficiaryerror = BeneficiaryValidation.getText();
        Reporter.log("Get Validation:" +BlankBeneficiaryerror);
        Assert.assertTrue(BlankBeneficiaryerror.contains(beneficiary));

        return this;

    }
    public LifeInsuranceCheckValidationPage CheckValidationforInsurance(String Insurance){

        WebDriverWait insurancewait = new WebDriverWait(driver,200);
        insurancewait.until(ExpectedConditions.elementToBeClickable(InsuranceValidation));

        String Blankinsuranceerror = InsuranceValidation.getText();
        Reporter.log("Get Validation:" +Blankinsuranceerror);
        Assert.assertTrue(Blankinsuranceerror.contains(Insurance));

        return this;

    }
    public LifeInsuranceCheckValidationPage CheckValidationforSignature(String Signature){

        WebDriverWait signwait = new WebDriverWait(driver,200);
        signwait.until(ExpectedConditions.elementToBeClickable(signatureValidation));

        String Blanksignerror = signatureValidation.getText();
        Reporter.log("Get Validation:" +Blanksignerror);
        Assert.assertTrue(Blanksignerror.contains(Signature));

        return this;

    }


}
