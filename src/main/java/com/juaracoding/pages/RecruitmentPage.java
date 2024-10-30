package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

    private WebDriver driver;

    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    private WebElement menuRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement btnAdd;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
    private WebElement email;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement resume;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    private WebElement txtApplicationStage;

    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p'])[1]")
    private WebElement txtNameValidation;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-eye-fill'])[1]")
    private WebElement btnViewCandidate;

    @FindBy(xpath = " //h6[normalize-space()='Candidate Profile']")
    private WebElement txtCandidateProfile;

    public void setMenuRecruitment(){
        menuRecruitment.click();
    }

    public void setBtnAdd(){
        btnAdd.click();
    }

    public void setFirstName(String firstName){
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        this.lastName.sendKeys(lastName);
    }

    public void setEmail(String email){
        this.email.sendKeys(email);
    }

    public void setResume(String resume){
        this.resume.sendKeys(resume);
    }

    public void setBtnSave(){
        btnSave.click();
    }

    public void addCandidate(){
        Utils.delay(3);
        firstName.sendKeys("Juara");
        lastName.sendKeys("Coding");
        email.sendKeys("admin@juaracoding.co.id");
        resume.sendKeys("C:\\Users\\ihlas\\OneDrive\\Dokumen\\JC_SQA\\JC_RESUME.docx");
        Utils.delay(3);
    }

    // for assert add candidate
    public String getTxtApplicationStage(){
        return txtApplicationStage.getText();
    }

    public String getTxtFirstValidation(){
        return txtNameValidation.getText();
    }

    public void setBtnViewCandidate(){
        btnViewCandidate.click();
    }

    public String  getTxtCandidateProfile(){
        return txtCandidateProfile.getText();
    }


}