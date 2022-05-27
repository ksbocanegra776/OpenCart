package com.demo.opencart.practice.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/categoriaopencart.feature",
        tags = "@stories",
        glue = {"com.demo.opencart.practice.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
