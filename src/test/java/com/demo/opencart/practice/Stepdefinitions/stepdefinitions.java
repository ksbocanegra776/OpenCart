package com.demo.opencart.practice.Stepdefinitions;

import com.demo.opencart.practice.tasks.Catalog;
import com.demo.opencart.practice.tasks.Category;
import com.demo.opencart.practice.tasks.OpenUp;
import com.demo.opencart.practice.tasks.UpdateCategory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class stepdefinitions {
    @Given("^that Karina logs in correctly$")
    public void thatKarinaLogsInCorrectly(DataTable arg1) throws Exception {
        theActorCalled("Karina").wasAbleTo(OpenUp.thePage());
    }

    @When("^Select menu Catalog to reach the Category$")
    public void selectMenuCatalogToReachTheCategory() throws Exception {
        theActorCalled("Karina").wasAbleTo(Catalog.thePage());
    }

    @When("^Add a new category$")
    public void addANewCategory() throws Exception {
        theActorCalled("Karina").wasAbleTo(Category.thePage());
    }

    @Then("^Karina you can save the new record\\.$")
    public void karinaYouCanSaveTheNewRecord() throws Exception {
        theActorCalled("Karina").wasAbleTo(UpdateCategory.thePage());
    }
}
