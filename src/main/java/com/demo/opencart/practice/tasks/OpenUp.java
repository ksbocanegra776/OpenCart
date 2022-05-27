package com.demo.opencart.practice.tasks;

import com.demo.opencart.practice.model.OpencartPersonasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private OpencartPersonasPage opencartPersonasPage;

    public static Performable thePage(){

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(opencartPersonasPage.LOGIN_BUTTON),
                Enter.theValue("demo").into(OpencartPersonasPage.INPUT_USER),
                Enter.theValue("demo").into(OpencartPersonasPage.INPUT_PASSWORD),
                Click.on(OpencartPersonasPage.ENTER_BUTTON)
                );


    }
}
