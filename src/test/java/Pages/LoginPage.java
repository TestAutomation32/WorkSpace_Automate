package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Testcases.BaseTest.prop;

/**
 * Created by admin on 06-11-2017.
 */
public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }
    // ALL THE LOCATOR AND METHODS OF LOGIN PAGE

    @FindBy(id = "PlaceHolderMain_btnBehavior")
    public static WebElement LoginAccept;

    @FindBy(id = "PlaceHolderMain_pnlPassword_UserName")
    public static WebElement LoginUserName;

    @FindBy(id = "PlaceHolderMain_pnlPassword_password")
    public static WebElement LoginPassword;

    @FindBy(id = "PlaceHolderMain_pnlPassword_btnContinue")
    public static  WebElement LoginContinueBtn;

    @FindBy(id = "PlaceHolderMain_pnlPin_password")
    public static WebElement LoginPin;

    @FindBy(id = "PlaceHolderMain_pnlPin_btnContinue2")
    public static WebElement LoginBtn;

    @FindBy(id = "PlaceHolderMain_Button1")
    public static WebElement RulesAcceptBtn;

    @FindBy(id = "PlaceHolderMain_btnPrivacy")
    public static WebElement PrivacyAcceptBtn;

    //LOGIN ACCEPT CLICK
    public static void LoginAccept() {

        WebDriverWait LoginAcceptwait = new WebDriverWait(driver, 300);
        LoginAcceptwait.until(ExpectedConditions.elementToBeClickable(LoginAccept));

        LoginAccept.click();


    }
    //LOGIN USERNAME
    public static void LoginUsername(String email) {

        WebDriverWait LoginUsernametwait = new WebDriverWait(driver, 300);
        LoginUsernametwait.until(ExpectedConditions.elementToBeClickable(LoginUserName));

        LoginUserName.sendKeys(email);


    }

    //LOGIN PASSWORD
    public static void LoginPassword(String PWD) {

        WebDriverWait LoginPasswordwait = new WebDriverWait(driver, 300);
        LoginPasswordwait.until(ExpectedConditions.elementToBeClickable(LoginPassword));

        LoginPassword.sendKeys(PWD);


    }
    //LOGIN CONTINUE CLICK
    public static void LoginContinue() {

        WebDriverWait LoginContinuewait = new WebDriverWait(driver, 300);
        LoginContinuewait.until(ExpectedConditions.elementToBeClickable(LoginContinueBtn));

        LoginContinueBtn.click();


    }
    //LOGIN PIN
    public static void LoginPin(String Pin) {

        WebDriverWait LoginPinwait = new WebDriverWait(driver, 300);
        LoginPinwait.until(ExpectedConditions.elementToBeClickable(LoginPin));

        LoginPin.sendKeys(Pin);


    }
    //LOGIN BUTTEN CLICK
    public static void LoginBtn() {

        WebDriverWait LoginBtnwait = new WebDriverWait(driver, 300);
        LoginBtnwait.until(ExpectedConditions.elementToBeClickable(LoginBtn));

        LoginBtn.click();

    }

    //LOGIN RULES BTN CLICK
    public static void RulesAcceptBtn() {

        WebDriverWait RulesBtnwait = new WebDriverWait(driver, 300);
        RulesBtnwait.until(ExpectedConditions.elementToBeClickable(RulesAcceptBtn));

        RulesAcceptBtn.click();


    }

    //LOGIN PRIVACY BTN CLICK
    public static void PrivacyAcceptBtn() {

        WebDriverWait PrivacyBtnwait = new WebDriverWait(driver, 300);
        PrivacyBtnwait.until(ExpectedConditions.elementToBeClickable(PrivacyAcceptBtn));

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1500)", "");

        PrivacyAcceptBtn.click();

    }

    public static void Login() {

        LoginAccept();
        LoginUsername(prop.getProperty("UserName"));
        LoginPassword(prop.getProperty("Password"));
        LoginContinue();
        LoginPin(prop.getProperty("Pin"));
        LoginBtn();
        RulesAcceptBtn();
        PrivacyAcceptBtn();

    }

    public static void LoginForFresh(){

        LoginAccept();
        LoginUsername(prop.getProperty("UserName"));
        LoginPassword(prop.getProperty("Password"));
        LoginContinue();
        LoginPin(prop.getProperty("Pin"));
        LoginBtn();
        RulesAcceptBtn();
        PrivacyAcceptBtn();


    }
}
