package mersysTest.pages;
import mersysTest.utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class DialogContent extends BaseFunctions {

    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//ms-delete-button/button/span")
    private List<WebElement> deleteButton2;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//span")
    private WebElement active;
    //    @FindBy(xpath = "(//mat-slide-toggle[@formcontrolname='active']/label/span)[1]")
//    private WebElement active;
    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList;

    @FindBy(xpath = "//mat-form-field[@appearance='outline']//textarea")
    private WebElement description;

    @FindBy(css = "input[data-placeholder='Order']")
    private WebElement order;

    @FindBy(xpath = "//ms-edit-button//button[@color='accent']")
    private WebElement editButton;

    @FindBy(xpath = "//ms-edit-button/button")
    private WebElement editButton2;

    //@FindBy(css = "ms-edit-button[class='ng-star-inserted'] button") /** locator değişmiş */
    @FindBy(css = "ms-edit-button[class^='ng-']")
    private List<WebElement> editButton3;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement description1;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeintegration;

    @FindBy(xpath = "//div[contains(text(),'There is no data to display')]")
    private WebElement noDataMessage;

    @FindBy(css = "mat-select[role='combobox'][formcontrolname='id']")
    private WebElement countryNameInput0;


    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getShortName() {
        return shortName;
    }

    public WebElement getAlreadyExist() {
        return alreadyExist;
    }

    public WebElement getCloseDialog() {
        return closeDialog;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public List<WebElement> getDeleteButton2() {
        return deleteButton2;
    }

    public WebElement getDeleteDialogBtn() {
        return deleteDialogBtn;
    }

    public WebElement getIntegrationCode() {
        return integrationCode;
    }

    public WebElement getPriorityCode() {
        return priorityCode;
    }

    public WebElement getActive() {
        return active;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public List<WebElement> getNameList() {
        return nameList;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getOrder() {
        return order;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getEditButton2() {
        return editButton2;
    }

    public List<WebElement> getEditButton3() {
        return editButton3;
    }

    public WebElement getDescription1() {
        return description1;
    }

    public WebElement getCodeintegration() {
        return codeintegration;
    }

    public WebElement getNoDataMessage() {
        return noDataMessage;
    }

    public WebElement getCountryNameInput0() {
        return countryNameInput0;
    }
}
