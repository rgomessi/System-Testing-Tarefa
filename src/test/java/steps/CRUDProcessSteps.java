package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;
import sun.java2d.SunGraphics2D;
import support.BaseSteps;

public class CRUDProcessSteps extends BaseSteps {

    private Home home = new Home(driver);
    private MenuProcess menu = new MenuProcess(driver);
    private ProcessGrid processGrid = new ProcessGrid(driver);
    private ProcessNew processnew = new ProcessNew(driver);
    private ProcessShow processShow = new ProcessShow(driver);
    private ProcessEdit processEdit = new ProcessEdit(driver);

    @Given("^the user is on Agapito Server page$")
    public void theUserIsOnAgapitoServerPage() {
        home.openPage();
    }

    @And("^the user clicks on Process menu$")
    public void theUserClicksOnProcessMenu() {
        menu.clickProcess();
    }

    @And("^the user clicks on new process button$")
    public void theUserClicksOnNewProcessButton() {
        processGrid.clickNewProcess();
    }

    @And("^the user fills \"([^\"]*)\" with value equal \"([^\"]*)\"$")
    public void theUserFillWithValueEqual(String field, String value) throws Throwable {
        processnew.fill(field, value);

    }

    @When("^the user clicks on save button$")
    public void theUserClicksOnSaveButton() {
        processnew.clickSave();
        processShow.saveIdLastProcess();
    }

    @Then("^the user should see \"([^\"]*)\" into view process page$")
    public void theUserShouldSeeIntoViewProcessPage(String message) throws Throwable {
        Assert.assertEquals(message, processShow.getNotice());

    }

    @And("^the user backs to the process grid$")
    public void theUserBacksToTheProcessGrid() {
        processShow.clickBack();
    }

    @When("^the user clicks on show button$")
    public void theUserClicksOnShowButton() {
        processGrid.clickShow(processShow.getLastProcess());
    }

    @Then("^the user should see \"([^\"]*)\" with value equal \"([^\"]*)\"$")
    public void theUserShouldSeeWithValueEqual(String field, String value) throws Throwable {
        Assert.assertEquals(value, processShow.getField(field));
    }

    @And("^the user clicks on edit button$")
    public void theUserClicksOnEditButton() {
        processGrid.clickEdit(processShow.getLastProcess());
    }

    @And("^the user clicks on edit save button$")
    public void theUserClicksOnEditSaveButton() {
        processEdit.clickSave();
    }

    @When("^the user clicks on delete button$")
    public void theUserClicksOnDeleteButton() {
        processGrid.clickDelete(processShow.getLastProcess());
    }

    @And("^the user confirms delete$")
    public void theUserConfirmsDelete() {
        processGrid.clickConfirmDelete();
    }

    @Then("^the user should not see last process code$")
    public void theUserShouldNotSeeLastProcessCode() {
        Assert.assertFalse("ERROR: There is a process with this code " + processShow.getLastProcess(),
                                    processGrid.existProcess(processShow.getLastProcess()) );
    }

    @And("^the user selects urgency with value equal \"([^\"]*)\"$")
    public void theUserSelectsWithValueEqual(String urgency) throws Throwable {
        processnew.selectUrgency(urgency);

    }

    @And("^the user clicks on arbitramento equals \"([^\"]*)\"$")
    public void theUserClicksOnArbitramentoEquals(String res) throws Throwable {
       processnew.clickArbitramento(res);
    }
}
