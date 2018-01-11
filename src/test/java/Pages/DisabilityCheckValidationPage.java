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
public class DisabilityCheckValidationPage {

    WebDriver driver;

    public DisabilityCheckValidationPage(WebDriver driver){

        this.driver = driver;


    }
    // ALL THE LOCATOR AND METHODS OF DISABLITY PAGE


    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(id = "buttContinue")
    public WebElement AboutMeBtn;

    @FindBy(xpath = "//*[@id=\"Disability\"]/span[1]")
    public WebElement Disability;


    @FindBy(xpath = "//*[@id=\"yesDisabilityLabel\"]")
    public WebElement YesBtnDisablity;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[5]/button[1]/span")
    public WebElement SaveDisability;

    @FindBy(xpath = "//*[@id=\"eods-error\"]/div/div[1]/ul/li/a")
    public WebElement DisablityValidation ;

    public DisabilityCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }
    public DisabilityCheckValidationPage AboutMeBtn() {

        WebDriverWait Aboutmewait = new WebDriverWait(driver, 500);
        Aboutmewait.until(ExpectedConditions.elementToBeClickable(AboutMeBtn));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        AboutMeBtn.click();
        return this;

    }

    public DisabilityCheckValidationPage ClickOnDisability(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebDriverWait Disablitywait = new WebDriverWait(driver,90);
        Disablitywait.until(ExpectedConditions.elementToBeClickable(Disability));

        Disability.click();
        return this;
    }
    public DisabilityCheckValidationPage IframeDisablity() {

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
    public DisabilityCheckValidationPage ClickOnYesDisablity(){

        YesBtnDisablity.click();

        return this;
    }

    public DisabilityCheckValidationPage SaveDisablity(){

        WebDriverWait disaWait = new WebDriverWait(driver, 90);
        disaWait.until(ExpectedConditions.elementToBeClickable(SaveDisability));

        SaveDisability.click();
        return this;
    }

    public DisabilityCheckValidationPage Disablityvalidation(String addDisability) {

        WebDriverWait disabilitywait = new WebDriverWait(driver, 90);
        disabilitywait.until(ExpectedConditions.visibilityOf(DisablityValidation));

        String BlankdisbalityError = DisablityValidation.getText();
        Reporter.log("Get validation :" + BlankdisbalityError);
        System.out.println(BlankdisbalityError);

        Assert.assertTrue(BlankdisbalityError.contains(addDisability));
        return this;

    }


}
