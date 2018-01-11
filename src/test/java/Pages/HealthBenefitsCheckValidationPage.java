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
public class HealthBenefitsCheckValidationPage {

   WebDriver driver;

   public HealthBenefitsCheckValidationPage(WebDriver driver){

       this.driver =driver;

   }
    // ALL THE LOCATOR AND METHODS OF HEALTHBENIFITS PAGE

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(xpath = "//*[@id=\"eods-benefits-tab\"]/div/span[1]")
    public WebElement BenifitsTab;

    @FindBy(xpath = "//*[@id=\"Health Benefits (FEHB)\"]/span[1]")
    public WebElement Health;

    @FindBy(xpath = "//*[@id=\"acceptHealthBenefitsLabel\"]")
    public WebElement SelectHealthBtn;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[6]/button[1]/span")
    public WebElement SaveHealth;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li[1]/a")
    public WebElement EnrollmentValidation;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li[2]/a")
    public WebElement Premium;


    public HealthBenefitsCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }

    public HealthBenefitsCheckValidationPage ClickOnBenifitsTab(){

        BenifitsTab.click();
        return this;

    }

    public HealthBenefitsCheckValidationPage ClickonHealth(){

        WebDriverWait healthwait = new WebDriverWait(driver,90);
        healthwait.until(ExpectedConditions.elementToBeClickable(Health));

        Health.click();
        return this;

    }
    public HealthBenefitsCheckValidationPage IframeHealth() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Health Benefits (FEHB)']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Health Benefits (FEHB)']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;

    }

    public HealthBenefitsCheckValidationPage ClickOnSelectHealth(){

        WebDriverWait healthwait = new WebDriverWait(driver,90);
        healthwait.until(ExpectedConditions.elementToBeClickable(SelectHealthBtn));

        SelectHealthBtn.click();


        return this;
    }

    public HealthBenefitsCheckValidationPage ClickSaveHealth(){

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveHealth);


        WebDriverWait healthwait = new WebDriverWait(driver,90);
        healthwait.until(ExpectedConditions.elementToBeClickable(SaveHealth));

        SaveHealth.click();
        return this;
    }


    public HealthBenefitsCheckValidationPage CheckValidationforEnrollment(String enrollment){

        WebDriverWait enrollwait = new WebDriverWait(driver,90);
        enrollwait.until(ExpectedConditions.elementToBeClickable(EnrollmentValidation));

        String Blankemrollmenterror = EnrollmentValidation.getText();
        Reporter.log("Get Validation:" +Blankemrollmenterror);
        Assert.assertTrue(Blankemrollmenterror.contains(enrollment));

        return this;

    }
    public HealthBenefitsCheckValidationPage CheckValidationforPremium(String premium){

        WebDriverWait premiumwait = new WebDriverWait(driver,90);
        premiumwait.until(ExpectedConditions.elementToBeClickable(Premium));

        String Blankemrollmenterror = Premium.getText();
        Reporter.log("Get Validation:" +Blankemrollmenterror);
        Assert.assertTrue(Blankemrollmenterror.contains(premium));

        return this;

    }


}
