package com.demo.opencart.practice.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.opencart.com/admin/index.php?route=catalog/category&user_token=e9tgx9bffy7x91H3xv1hXlX3W5ZVfrvs")
public class OpencartupdateCategoria extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu"));
    public static final Target BUTTON_UPDATE = Target.the("button that updates the categories form").located(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/a[2]/i[1]"));
}
