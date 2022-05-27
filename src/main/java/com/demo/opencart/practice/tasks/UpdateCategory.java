package com.demo.opencart.practice.tasks;

import com.demo.opencart.practice.userinterface.OpencarCategoryPage;
import com.demo.opencart.practice.userinterface.OpencartupdateCategoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class UpdateCategory implements Task {
    private OpencartupdateCategoria opencartupdateCategoria;

    public static Performable thePage(){
        return Tasks.instrumented(UpdateCategory.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OpencartupdateCategoria.LOGIN_BUTTON),
                Click.on(OpencartupdateCategoria.BUTTON_UPDATE));
    }
}
