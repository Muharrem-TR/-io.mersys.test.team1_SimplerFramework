package mersysTest.pages;


import mersysTest.utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends BaseFunctions {

    public FormContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//mat-slide-toggle[@formcontrolname='required']//span)[3]")
    private WebElement switchRequired;

    @FindBy(xpath = "(//mat-slide-toggle[@formcontrolname='useCamera']//span)[3]")
    private WebElement switchUseCamera;

    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']/div")
    private WebElement stageSelect;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement selectStudentRegistration;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[4]")
    private WebElement selectCertificate;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[3]")
    private WebElement selectEmployment;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[5]")
    private WebElement selectContract;

    @FindBy(xpath = "//span[text()=' Turkey ']")
    private WebElement Turkey;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']/div")
    private WebElement countryBlog;

    @FindBy(xpath = "//div[contains(@class,'mat-form-field-infix ng-tns-c77')]/mat-select")
    private WebElement countryBlogSearchForm;


    public WebElement getSwitchRequired() {
        return switchRequired;
    }

    public WebElement getSwitchUseCamera() {
        return switchUseCamera;
    }

    public WebElement getStageSelect() {
        return stageSelect;
    }

    public WebElement getSelectStudentRegistration() {
        return selectStudentRegistration;
    }

    public WebElement getSelectCertificate() {
        return selectCertificate;
    }

    public WebElement getSelectEmployment() {
        return selectEmployment;
    }

    public WebElement getSelectContract() {
        return selectContract;
    }

    public WebElement getTurkey() {
        return Turkey;
    }

    public WebElement getCountryBlog() {
        return countryBlog;
    }

    public WebElement getCountryBlogSearchForm() {
        return countryBlogSearchForm;
    }
}

