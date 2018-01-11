package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by admin on 14-11-2017.
 */
public class BenifitsValidDataPage {

    WebDriver driver;

    public BenifitsValidDataPage(WebDriver driver){

        this.driver = driver;
    }
    // ALL THE LOCATOR AND METHODS OF BENIFITSVALIDDATAPAGE

    @FindBy(xpath = "//*[@id=\"eods-byb-tab\"]")
    public WebElement BeforeYouBeginBtn;

    @FindBy(xpath = "//*[@id=\"eods-benefits-tab\"]/div/span[1]")
    public WebElement BenifitsTab;

    @FindBy(xpath = "//*[@id=\"Health Benefits (FEHB)\"]/span[1]")
    public WebElement Health;

    @FindBy(xpath = "//*[@id=\"Life Insurance (FEGLI)\"]/span[1]")
    public WebElement Life;

    @FindBy(xpath = "//*[@id=\"Retirement\"]/span[1]")
    public WebElement RetireMent;

    @FindBy(xpath = "//*[@id=\"Thrift Savings Plan (TSP)\"]/span[1]")
    public WebElement Thrift;

    @FindBy(xpath = "//*[@id=\"Unpaid Compensation\"]/span[1]")
    public WebElement UnPaid;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[4]/button[1]/span")
    public WebElement SaveLife;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[7]/button[1]/span")
    public WebElement SaveRetirement;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[5]/button[1]/span")
    public WebElement SaveThrift;

    @FindBy(xpath = "//*[@id=\"eods-form-left\"]/div[2]/button[1]")
    public WebElement SaveUnpaid;

    //*[@id="buttMore"]
    @FindBy(xpath = "//*[@id=\"buttMore\"]")
    public WebElement DisableBtn;

    //ALL METHODS FOR VALID DATA TO FILL BENEFITS PAEG
    public BenifitsValidDataPage BeforeYouBeginBtn() {

        LoginPage loginx = new LoginPage(driver);
        loginx.LoginForFresh();

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 500);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(BeforeYouBeginBtn));

        BeforeYouBeginBtn.click();
        return this;

    }

    public BenifitsValidDataPage ClickOnBenifitsTab(){

        BenifitsTab.click();
        return this;

    }
    public BenifitsValidDataPage HealthSavedBtnCheck(String Status) {

        WebDriverWait healthwait = new WebDriverWait(driver, 500);
        healthwait.until(ExpectedConditions.elementToBeClickable(Health));

        String PI = Health.getText();
        System.out.println(PI);
        Assert.assertEquals(PI, Status);

        if (PI.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait emergencywait = new WebDriverWait(driver, 60);
            emergencywait.until(ExpectedConditions.elementToBeClickable(Life));
            try {
                Life.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public BenifitsValidDataPage ClickOnLife() {


        WebDriverWait Lifewait = new WebDriverWait(driver, 90);
        Lifewait.until(ExpectedConditions.elementToBeClickable(Life));

        Life.click();

        return this;

    }

    public BenifitsValidDataPage IframeLife() {

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

    public BenifitsValidDataPage SaveLifeBtn(){

        WebDriverWait lifewait = new WebDriverWait(driver,50);
        lifewait.until(ExpectedConditions.elementToBeClickable(SaveLife));

        try {
            SaveLife.click();
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    public BenifitsValidDataPage RetiremrntSavedBtnCheck(String Status) {

        WebDriverWait retirementwait = new WebDriverWait(driver, 500);
        retirementwait.until(ExpectedConditions.elementToBeClickable(RetireMent));

        String RetireMentTex = RetireMent.getText();
        System.out.println(RetireMentTex);
        Assert.assertEquals(RetireMentTex, Status);

        if (RetireMentTex.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait Rewait = new WebDriverWait(driver, 60);
            Rewait.until(ExpectedConditions.elementToBeClickable(RetireMent));
            try {
                RetireMent.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public BenifitsValidDataPage ClickOnRetirement() {


        WebDriverWait rewait = new WebDriverWait(driver, 90);
        rewait.until(ExpectedConditions.elementToBeClickable(RetireMent));

        RetireMent.click();

        return this;

    }

    public BenifitsValidDataPage IframeRetirement() {

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

    public BenifitsValidDataPage SaveRetirement(){

        WebDriverWait Rewait = new WebDriverWait(driver,90);
        Rewait.until(ExpectedConditions.elementToBeClickable(SaveRetirement));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveRetirement);



        try {
            SaveRetirement.click();
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    public BenifitsValidDataPage ThriftSavedBtnCheck(String Status) {

        WebDriverWait thriftwait = new WebDriverWait(driver, 500);
        thriftwait.until(ExpectedConditions.elementToBeClickable(Thrift));

        String thrift = Thrift.getText();
        System.out.println(thrift);
        Assert.assertEquals(thrift, Status);

        if (thrift.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait thrift1wait = new WebDriverWait(driver, 60);
            thrift1wait.until(ExpectedConditions.elementToBeClickable(Thrift));
            try {
                Thrift.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public BenifitsValidDataPage ClickOnThrift() {


        WebDriverWait thriftwait = new WebDriverWait(driver, 90);
        thriftwait.until(ExpectedConditions.elementToBeClickable(Thrift));

        Thrift.click();

        return this;

    }

    public BenifitsValidDataPage IframeThrift() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Thrift Savings Plan (TSP)']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Thrift Savings Plan (TSP)']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public BenifitsValidDataPage SaveThrift(){

        WebDriverWait addwait = new WebDriverWait(driver,90);
        addwait.until(ExpectedConditions.elementToBeClickable(SaveThrift));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveThrift);




        try {
            SaveThrift.click();
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }
    public BenifitsValidDataPage UnpaidSavedBtnCheck(String Status) {


        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", UnPaid);

        WebDriverWait unpaidwait = new WebDriverWait(driver, 500);
        unpaidwait.until(ExpectedConditions.elementToBeClickable(UnPaid));



        String unpaid = UnPaid.getText();
        System.out.println(unpaid);
        Assert.assertEquals(unpaid, Status);

        if (unpaid.equals(Status)) {

            System.out.println("test");

        } else {

            WebDriverWait thriftwait = new WebDriverWait(driver, 60);
            thriftwait.until(ExpectedConditions.elementToBeClickable(UnPaid));
            try {
                UnPaid.click();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this;
    }

    public BenifitsValidDataPage ClickOnUnpaid() {


        WebDriverWait thriftwait = new WebDriverWait(driver, 90);
        thriftwait.until(ExpectedConditions.elementToBeClickable(UnPaid));

        UnPaid.click();

        return this;

    }

    public BenifitsValidDataPage IframeUnpaid() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Unpaid Compensation']")));
        List<WebElement> test1 = driver.findElements(By.xpath("//iframe[@title='Unpaid Compensation']"));
        System.out.println(test1.size());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public BenifitsValidDataPage SaveUnPaid(){

        WebDriverWait unpaidwait = new WebDriverWait(driver,50);
        unpaidwait.until(ExpectedConditions.elementToBeClickable(SaveUnpaid));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", SaveUnpaid);

        try {
            SaveUnpaid.click();

        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    //CHECK BUTTON IS ENABLE OR DISABLE
    public BenifitsValidDataPage DisableBtn() {

        try {
            WebDriverWait disablewait = new WebDriverWait(driver, 90);
            disablewait.until(ExpectedConditions.elementToBeClickable(DisableBtn));


            Assert.assertEquals(false, DisableBtn.isEnabled());
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }




}
