package Pages;

import org.openqa.selenium.By;
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
public class RetirementCheckValidationPage {

    WebDriver driver;


    public RetirementCheckValidationPage(WebDriver driver){

        this.driver=driver;
    }
    // ALL THE LOCATOR AND METHODS OF RETIREMENT PAGE

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(xpath = "//*[@id=\"eods-benefits-tab\"]/div/span[1]")
    public WebElement BenifitsTab;

    @FindBy(xpath = "//*[@id=\"Retirement\"]/span[1]")
    public WebElement Retirement;

    @FindBy(xpath = "//*[@id=\"rdoDesignateLabel\"]")
    public WebElement SelectDesignate;

    @FindBy(xpath = "//*[@id=\"addDesignate\"]")
    public WebElement AddDesignate;

    @FindBy(xpath = "//*[@id=\"beneficiary-template-window\"]/div/div[3]/button[1]/span")
    public WebElement SaveDesignateBtn;

    @FindBy(xpath = "//*[@id=\"eods-beneficiaries-error\"]/div/div[1]/ul/li/a")
    public WebElement DesignateTypeValidation;

    public RetirementCheckValidationPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.Login();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }

    public RetirementCheckValidationPage ClickOnBenifitsTab(){

        BenifitsTab.click();
        return this;

    }
    public RetirementCheckValidationPage ClickOnRetirement(){


        WebDriverWait retirementwait = new WebDriverWait(driver,90);
        retirementwait.until(ExpectedConditions.elementToBeClickable(Retirement));

        Retirement.click();
        return this;
    }
    public RetirementCheckValidationPage IframeRetirement() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Retirement']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Retirement']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;

    }

    public RetirementCheckValidationPage ClickOnselectDesinate(){

        SelectDesignate.click();

        return this;


    }
    public RetirementCheckValidationPage ClickOnAddDesignate(){


        AddDesignate.click();
        return this;
    }
    public RetirementCheckValidationPage ClickOnSaveDesignate(){

        WebDriverWait desiwait = new WebDriverWait(driver,90);
        desiwait.until(ExpectedConditions.elementToBeClickable(SaveDesignateBtn));


        SaveDesignateBtn.click();
        return this;
    }

    public RetirementCheckValidationPage CheckValidationfordesignateType(String Designatetype){

        WebDriverWait designwaitwait = new WebDriverWait(driver,90);
        designwaitwait.until(ExpectedConditions.elementToBeClickable(DesignateTypeValidation));

        String Blankdesignerror = DesignateTypeValidation.getText();
        Reporter.log("Get Validation:" +Blankdesignerror);
        Assert.assertTrue(Blankdesignerror.contains(Designatetype));

        return this;

    }

}
