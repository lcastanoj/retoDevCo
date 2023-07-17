package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.onlinenotepad.task.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NotepadStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user is on the website")
    public void theUserIsOnTheWebsite() {
        theActorCalled("Test").wasAbleTo(Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"));
    }

    @When("enter the rich text in bold")
    public void enterTheRichTextInBold() {
        theActorInTheSpotlight().attemptsTo(NotepadEnterTextTask.NotepadEnterTextTask());
    }

    @When("user can add items to the list")
    public void userCanAddItemsToTheList() {
        theActorInTheSpotlight().attemptsTo(NotepadAddItemListTask.NotepadAddItemListTask());
    }

    @When("user can delete a data from the list")
    public void userCanDeleteADataFromTheList() {
        theActorInTheSpotlight().attemptsTo(NotepadDeleteItemListTask.NotepadDeleteItemListTask());
    }

}
