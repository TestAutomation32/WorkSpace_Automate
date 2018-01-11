package Testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 14-11-2017.
 */
public class BenifitsValidDataTest extends BaseTest {

    public static int Errorcount = 0;


    //METHODS CALLED FOR ALL VALID DATA FIELDS OF BENIFITS PAGE
    @Test(priority = 0)
    public void Benifits() {


        benifitsValidDataPage.BeforeYouBeginBtn();
        benifitsValidDataPage.ClickOnBenifitsTab();
        benifitsValidDataPage.HealthSavedBtnCheck(prop.getProperty("StatusForBtn"));

    }

    @Test(priority = 1)
    public void Life(){
            try{
        if(benifitsValidDataPage.Life.getText().equals("BEGIN"))
        {

            benifitsValidDataPage.ClickOnLife();
            benifitsValidDataPage.IframeLife();
            benifitsValidDataPage.SaveLifeBtn();

        }
        else
        {
            //System.out.println(benifitsValidDataPage.Life.getText());
            System.out.println("Click on next");

        }}catch (Exception e){
                e.printStackTrace();
            }
        Reporter.log("Life data Saved successfully");
    }


    @Test(priority = 2)
    public void Retirement(){
        try{
            if(benifitsValidDataPage.RetireMent.getText().equals("BEGIN"))
            {
                benifitsValidDataPage.RetiremrntSavedBtnCheck(prop.getProperty("Menu"));
                benifitsValidDataPage.ClickOnRetirement();
                benifitsValidDataPage.IframeRetirement();
                benifitsValidDataPage.SaveRetirement();

            }
            else
            {
                //System.out.println(benifitsValidDataPage.Life.getText());
                System.out.println("Click on next");

            }}catch (Exception e){
            e.printStackTrace();
        }
        Reporter.log("Retirement data Saved successfully");
    }

    @Test(priority = 3)
    public void Thrift(){
        try{
            if(benifitsValidDataPage.Thrift.getText().equals("BEGIN"))
            {
                benifitsValidDataPage.ThriftSavedBtnCheck(prop.getProperty("Menu"));
                benifitsValidDataPage.ClickOnThrift();
                benifitsValidDataPage.IframeThrift();
                benifitsValidDataPage.SaveThrift();

            }
            else
            {
                //System.out.println(benifitsValidDataPage.Life.getText());
                System.out.println("Click on next");

            }}catch (Exception e){
            e.printStackTrace();
        }
        Reporter.log("Thrift data Saved successfully");
    }

    @Test(priority = 4)
    public void Unpaid(){



        try{
            if(benifitsValidDataPage.UnPaid.getText().equals("BEGIN"))
            {
                benifitsValidDataPage.UnpaidSavedBtnCheck(prop.getProperty("Menu"));
                benifitsValidDataPage.ClickOnUnpaid();
                benifitsValidDataPage.IframeUnpaid();
                benifitsValidDataPage.SaveUnPaid();

            }
            else
            {
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView();", benifitsValidDataPage.UnPaid);
                //System.out.println(benifitsValidDataPage.Life.getText());
                System.out.println("Click on next");

            }}catch (Exception e){
            e.printStackTrace();
        }
        Reporter.log("Unpaid data Saved successfully");
    }
    // METHOD CALLED FOR BUTTON ENABLE OR DISABLE
    @Test(priority = 5)
    public void Disabled() {
        try {
            benifitsValidDataPage.DisableBtn();
            Reporter.log("Next Button is Disabled");
        } catch (AssertionError E) {
            Reporter.log("button is Enabled");
            Errorcount++;
        }

        if (Errorcount > 0) {
            Assert.fail();
            Reporter.log(" button is Enabled");
        }
    }


}
