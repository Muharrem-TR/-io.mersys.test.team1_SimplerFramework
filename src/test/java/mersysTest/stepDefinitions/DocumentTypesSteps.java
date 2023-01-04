package mersysTest.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mersysTest.pages.BaseFunctions;
import mersysTest.pages.DialogContent;
import mersysTest.pages.FormContent;
import mersysTest.pages.LeftNav;
import mersysTest.utilities.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DocumentTypesSteps extends BaseFunctions {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    FormContent fc=new FormContent();


    @And("Go to Document Types via left nav")
    public void goToDocumentTypesViaLeftNav() {
        clickFunction(ln.getSetupOne());
        clickFunction(ln.getParameters());
        clickFunction(ln.getDocumentTypes());
    }

    @And("Click Add Button")
    public void clickAddButton() {
        clickFunction(dc.getAddButton());
    }

    @And("Enter name as {string} and description as {string} for Document Types")
    public void enterNameAndDescription(String name,String description) {
//        sendKeysFunction(dc.getNameInput(),"MuharremTR2626");
//        sendKeysFunction(dc.getDescription(),"Muharrem Karapazar Eskişehir 26");
        sendKeysFunction(dc.getNameInput(),name);
        sendKeysFunction(dc.getDescription(),description);
    }

    @And("Fill in the form content for Document Types")
    public void fillInTheFormContent() {
        clickFunction(fc.getSwitchRequired());
        clickFunction(fc.getStageSelect());
        clickFunction(fc.getSelectStudentRegistration());
        clickFunction(fc.getSelectCertificate());
    }

    @And("Click the TAB key")
    public void clickTheEscKey() {
        Actions aksiyonlar = new Actions(BaseDriver.getDriver());
        aksiyonlar.click().keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
    }

    @And("Click the Save button")
    public void clickTheSaveButton() {
        clickFunction(dc.getSaveButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        verifyContainsText(dc.getSuccessMessage(), "success");
    }

    @Then("Verify that there is no data to display")
    public void verifyThatThereIsNoDataToDisplay() {
        verifyContainsText(dc.getNoDataMessage(), "There is no data to display");
    }

    @And("Type {string} in the search field")
    public void typeInTheSearchField(String searchData) {
        sendKeysFunction(dc.getSearchInput(),searchData);
    }

    @And("Press the search button and edit the result")
    public void pressTheSearchButtonAndEditTheResult() {
        clickFunction(dc.getSearchButton());
        clickFunction(dc.getEditButton());
    }

    @And("Fill in form two content for Document Types")
    public void fillInFormTwoContentForDocumentTypes() {
        clickFunction(fc.getSwitchUseCamera());
        clickFunction(fc.getStageSelect());
        clickFunction(fc.getSelectEmployment());
        clickFunction(fc.getSelectContract());
    }

    @And("Delete {string}")
    public void delete(String name) {
        dc.SearchAndDelete(name);
    }
}
