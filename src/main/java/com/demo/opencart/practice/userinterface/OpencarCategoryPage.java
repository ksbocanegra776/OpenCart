package com.demo.opencart.practice.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.opencart.com/admin/index.php?route=catalog/category&user_token=e9tgx9bffy7x91H3xv1hXlX3W5ZVfrvs")
public class OpencarCategoryPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu"));
    public static final Target CATEGORY_NAME = Target.the("where we add the name of the category").located(By.xpath("//input[@id='input-name1']"));
    public static final Target DESCRIPTION = Target.the("where we add the description of the category").located(By.xpath("//body/div[@id='container']/div[@id='content']/div[2]/div[1]/div[2]/form[1]/div[1]/div["));
    public static final Target META_TAG_TITLE = Target.the("where a title is added to the category").located(By.xpath("//input[@id='input-meta-title1']"));
    public static final Target META_TAG_DESCRIPTION = Target.the("where a description is added to the tag").located(By.xpath("//textarea[@id='input-meta-description1']"));
    public static final Target META_TAG_KEYWORDS = Target.the("where the tag keyword is added").located(By.xpath("//textarea[@id='input-meta-keyword1']"));
    public static final Target BTN_SAVE = Target.the("where do we save the category").located(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/button[1]"));
}
