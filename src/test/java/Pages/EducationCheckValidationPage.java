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
public class EducationCheckValidationPage {

    WebDriver driver;

    public EducationCheckValidationPage(WebDriver driver){

        this.driver =driver;
    }

    // ALL THE LOCATOR AND METHODS OF EDUCATION PAGE

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(id = "buttContinue")
    public WebElement AboutMeBtn;

    @FindBy(xpath = "//*[@id=\"Education\"]/span[1]")
    public WebElement Education;

    @FindBy(xpath = "//*[@id=\"addEducation\"]")
    public WebElement AddEducation;

    @FindBy(xpath = "//*[@id=\"edit-form-dialog\"]/div/div[5]/button[1]/span")
    public WebElement SaveEducation;

    @FindBy(xpath = "//*[@id=\"eods-error-sub\"]/div/div[1]/ul/li/a")
    public WebElement EducationValidation;


    public EducationCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }
    public EducationCheckValidationPage AboutMeBtn() {

        WebDriverWait Aboutmewait = new WebDriverWait(driver, 500);
        Aboutmewait.until(ExpectedConditions.elementToBeClickable(AboutMeBtn));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)", "");

        AboutMeBtn.click();
        return this;

    }
    public EducationCheckValidationPage ClickOnEducation(){

       WebDriverWait eduwait = new WebDriverWait(driver,90);
       eduwait.until(ExpectedConditions.elementToBeClickable(Education));

        Education.click();
        return this;
    }
    public EducationCheckValidationPage IframeEducation() {

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

    public EducationCheckValidationPage AddEducation(){


        WebDriverWait addwait = new WebDriverWait(driver,90);
        addwait.until(ExpectedConditions.elementToBeClickable(AddEducation));

        AddEducation.click();

        return this;
    }

    public EducationCheckValidationPage SaveEducation(){


        WebDriverWait saveaddwait = new WebDriverWait(driver,90);
        saveaddwait.until(ExpectedConditions.elementToBeClickable(SaveEducation));

        SaveEducation.click();

        return this;
    }

    public EducationCheckValidationPage EducationAddvalidation(String edu) {

        WebDriverWait eduwait = new WebDriverWait(driver, 90);
        eduwait.until(ExpectedConditions.visibilityOf(EducationValidation));

        String BlankEducationaddError = EducationValidation.getText();
        Reporter.log("Get validation :" + BlankEducationaddError);
        System.out.println(BlankEducationaddError);

        Assert.assertTrue(BlankEducationaddError.contains(edu));
        return this;

    }


}
