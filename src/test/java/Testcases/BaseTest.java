package Testcases;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by admin on 06-11-2017.
 */
public class BaseTest {


    protected WebDriver driver;
    public LoginPage loginPage;
    public AboutMeCheckValidationPage about_mePage;
    public AboutMeValidDataPage aboutMeValidDataPage;
    public BenifitsValidDataPage benifitsValidDataPage;
    public EmergencyContactCheckValidationPage emergencyContactCheckValidationPage;
    public EducationCheckValidationPage educationCheckValidationPage;
    public DisabilityCheckValidationPage disabilityCheckValidationPage;
    public DirectDepositCheckValidationPage directDepositCheckValidationPage;
    public BackgroundCheckValidationPage backgroundCheckValidationPage;
    public HealthBenefitsCheckValidationPage healthBenefitsCheckValidationPage;
    public LifeInsuranceCheckValidationPage lifeInsuranceCheckValidationPage;
    public RetirementCheckValidationPage retirementCheckValidationPage;
    public PersonalInformationCheckValidationPage personalInformationCheckValidationPage;
    public static Properties prop = null;

    @BeforeSuite
    public void setup() {
        Readdata();

        // THIS WILL LAUNCH BROWSER AND SPECIFIC URL
        try {

            System.setProperty("webdriver.chrome.driver", prop.getProperty("IEDriverPath1"));
            driver = new ChromeDriver();
             /*System.setProperty("webdriver.ie.driver", prop.getProperty("IEDriverPath"));
             driver = new InternetExplorerDriver();
*/

        } catch (Exception e) {
            e.printStackTrace();
        }

        //MAXIMIZE BROWSER WINDOW
        driver.manage().window().maximize();

        // driver.get("https://www.google.com");


        driver.get(prop.getProperty("LoginURL"));

        //PAGE FACTORY INITIALIZATION
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        about_mePage =PageFactory.initElements(driver, AboutMeCheckValidationPage.class);
        aboutMeValidDataPage =PageFactory.initElements(driver, AboutMeValidDataPage.class);
        benifitsValidDataPage=PageFactory.initElements(driver,BenifitsValidDataPage.class);
        emergencyContactCheckValidationPage=PageFactory.initElements(driver,EmergencyContactCheckValidationPage.class);
        educationCheckValidationPage=PageFactory.initElements(driver,EducationCheckValidationPage.class);
        disabilityCheckValidationPage =PageFactory.initElements(driver,DisabilityCheckValidationPage.class);
        directDepositCheckValidationPage =PageFactory.initElements(driver,DirectDepositCheckValidationPage.class);
        backgroundCheckValidationPage =PageFactory.initElements(driver, BackgroundCheckValidationPage.class);
        healthBenefitsCheckValidationPage =PageFactory.initElements(driver,HealthBenefitsCheckValidationPage.class);
        lifeInsuranceCheckValidationPage =PageFactory.initElements(driver, LifeInsuranceCheckValidationPage.class);
        retirementCheckValidationPage =PageFactory.initElements(driver, RetirementCheckValidationPage.class);
        personalInformationCheckValidationPage=PageFactory.initElements(driver,PersonalInformationCheckValidationPage.class);
    }

    public void repo_Master_Branch()
    {
        System.out.println("this is my first commit");
    }
    public void second_Master_Branch()
    {
        System.out.println("this is my second commit to master branch");
    }

    //METHOD TO READ DATA FROM PROPERTY FILE
    public void Readdata() {

        File file = new File("C:/Users/Khalil Conteh/IdeaProjects/WorkSpace_Automate/src/Data.Properties");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        prop = new Properties();

        //LOAD PROPERTIES FILE
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
