package com.demo.opencart.practice.tasks;

import com.demo.opencart.practice.model.OpencarCatalogPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Catalog implements Task {
    private OpencarCatalogPage opencarCatalogPage;
 public static Performable thePage(){
     return Tasks.instrumented(Catalog.class);
 }
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
