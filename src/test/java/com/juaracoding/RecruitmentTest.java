package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.juaracoding.utils.Contants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RecruitmentTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static RecruitmentPage recruitmentPage = new RecruitmentPage();

    public RecruitmentTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin logged in")
    public void admin_logged_in(){
        driver.get(Contants.URL);
        loginPage.loginUser("Admin", "admin123");
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS, "Admin logged in");
    }

    @And("Admin go to menu recruitment")
    public void admin_go_to_menu_recruitment(){
        recruitmentPage.setMenuRecruitment();
        extentTest.log(LogStatus.PASS, "Admin go to menu recruitment");
    }

    @When("Admin click button Add")
    public void admin_click_button_add(){
        recruitmentPage.setBtnAdd();
        extentTest.log(LogStatus.PASS, "Admin click button Add");
    }

    @And("Admin enter firstname")
    public void admin_enter_firstname(){
        recruitmentPage.setFirstName("Juara");
        extentTest.log(LogStatus.PASS, "Admin enter firstname");
    }

    @And("Admin enter lastname")
    public void admin_enter_lastname(){
        recruitmentPage.setLastName("Coding");
        extentTest.log(LogStatus.PASS, "Admin enter lastname");
    }

    @And("Admin enter email")
    public void admin_enter_email(){
        recruitmentPage.setEmail("admin@juaracodin.co.id");
        extentTest.log(LogStatus.PASS, "Admin enter email");
    }

    @And("Admin upload file resume")
    public void admin_upload_file_resume(){
        recruitmentPage.setResume("D:\\Fadly\\Juara Coding\\Test\\Test.docx");
        extentTest.log(LogStatus.PASS, "Admin upload file resume");
    }

    @And("Admin click button save")
    public void admin_click_button_save(){
        recruitmentPage.setBtnSave();
        extentTest.log(LogStatus.PASS, "Admin click button save");
    }

    @Then("Admin redirect to page Application stage")
    public void admin_redirect_to_page_application_stage(){
        Assert.assertEquals(recruitmentPage.getTxtApplicationStage(), "Application Stage");
        extentTest.log(LogStatus.PASS, "Admin redirect to page Application stage");
    }

    @And("Admin go to menu recruitment again")
    public void admin_go_to_menu_recruitment_again(){
        recruitmentPage.setMenuRecruitment();
        extentTest.log(LogStatus.PASS, "Admin go to menu recruitment again");
    }

    @And("Admin click button view candidate")
    public void admin_click_button_view_candidate(){
        recruitmentPage.setBtnViewCandidate();
        extentTest.log(LogStatus.PASS, "Admin click button view candidate");
    }

    @Then("Admin redirect to page Candidate profile")
    public void admin_redirect_to_page_candidate_profile(){
        Assert.assertEquals(recruitmentPage.getTxtCandidateProfile(), "Candidate Profile");
        extentTest.log(LogStatus.PASS, "Admin redirect to page Candidate profile");
    }
}
