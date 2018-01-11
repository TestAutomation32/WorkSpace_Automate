package Testcases;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by admin on 15-11-2017.
 */
public class EducationCheckValidationTest extends BaseTest {


    public static int Errorcount = 0;

    //METHODS CALLED FOR CHECK VALIDATION FOR ALL FIELDS OF ABOUTME PAGE
    @Test(priority = 0)
    public void AboutMe() {

        educationCheckValidationPage.BeforeYouBeginBtn();
        educationCheckValidationPage.AboutMeBtn();


    }

    @Test(priority = 1)
    public  void Education(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (educationCheckValidationPage.Education.getText().equals("BEGIN")) {
            educationCheckValidationPage.ClickOnEducation();
        educationCheckValidationPage.IframeEducation();
        educationCheckValidationPage.AddEducation();
        educationCheckValidationPage.SaveEducation();

    } else
        {
            Assert.fail();
            System.out.println("Click on next");

        }
        Reporter.log("Education data Saved successfully");
    }

    @Test(priority = 2, dependsOnMethods = {"Education"})
    public void CheckVlaidtionForEducation(){

        try {
            educationCheckValidationPage.EducationAddvalidation(prop.getProperty("Education"));

        }
        catch (AssertionError E){
            Errorcount++;
        }

        if(Errorcount>0){
            Assert.fail();
            Reporter.log("Testcase Failed, there is some other issue Blank Street validation");

        }
    }


    }
