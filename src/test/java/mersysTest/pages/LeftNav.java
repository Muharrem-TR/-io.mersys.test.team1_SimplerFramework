package mersysTest.pages;
import mersysTest.utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends BaseFunctions {

    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    @FindBy(xpath = "(//span[text()='States'])")
    private WebElement states;

    @FindBy(xpath="(//span[contains(text(),'Document Types')])[1]")
    private WebElement documentTypes;

    @FindBy(xpath="//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(xpath="//span[text()='Cities']")
    private WebElement cities;

    @FindBy(xpath = "(//span[text()='Discounts'])")
    private WebElement discounts;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement hrSetup;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestations;


    public WebElement getSetupOne() {
        return setupOne;
    }

    public WebElement getParameters() {
        return parameters;
    }

    public WebElement getCountries() {
        return countries;
    }

    public WebElement getCitizenShip() {
        return citizenShip;
    }

    public WebElement getNationalities() {
        return nationalities;
    }

    public WebElement getFees() {
        return fees;
    }

    public WebElement getEntranceExamsOne() {
        return entranceExamsOne;
    }

    public WebElement getSetupTwo() {
        return setupTwo;
    }

    public WebElement getEntranceExamsTwo() {
        return entranceExamsTwo;
    }

    public WebElement getStates() {
        return states;
    }

    public WebElement getDocumentTypes() {
        return documentTypes;
    }

    public WebElement getGradeLevels() {
        return gradeLevels;
    }

    public WebElement getCities() {
        return cities;
    }

    public WebElement getDiscounts() {
        return discounts;
    }

    public WebElement getHumanResources() {
        return humanResources;
    }

    public WebElement getHrSetup() {
        return hrSetup;
    }

    public WebElement getAttestations() {
        return attestations;
    }
}
