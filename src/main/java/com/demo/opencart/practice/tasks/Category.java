package com.demo.opencart.practice.tasks;

import com.demo.opencart.practice.model.OpencartPersonasPage;
import com.demo.opencart.practice.userinterface.OpencarCategoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Category implements Task {
    private OpencarCategoryPage opencarCategoryPage;

    public static Performable thePage(){

        return Tasks.instrumented(Category.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OpencarCategoryPage.LOGIN_BUTTON),
                Enter.theValue("Lenovo ThinkPad").into(OpencarCategoryPage.CATEGORY_NAME),
                Enter.theValue("Portátil Lenovo ThinkPad").into(OpencarCategoryPage.DESCRIPTION),
                Enter.theValue("Reto automatización").into(OpencarCategoryPage.META_TAG_TITLE),
                Enter.theValue("Reto automatización OpenCart").into(OpencarCategoryPage.META_TAG_DESCRIPTION),
                Enter.theValue("Portátil").into(OpencarCategoryPage.META_TAG_KEYWORDS),
                Click.on(OpencarCategoryPage.BTN_SAVE)

                );
    }
}
