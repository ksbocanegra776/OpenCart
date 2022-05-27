package com.demo.opencart.practice.model;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.opencart.com/admin/index.php")
public class OpencartPersonasPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]"));
    public static final Target INPUT_USER = Target.the("where do we write the user").located(By.xpath("//input[@id='input-username']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.xpath("//input[@id='input-password']"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]"));

    }

