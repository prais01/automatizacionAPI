package com.nttdata.screens;

import net.thucydides.core.pages.PageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class entelPreprodScreen extends PageObject{

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"b1-b2-Input\"]")
    private WebElement clicNumero;


    public void clickSearchInputNum() {

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(clicNumero));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

         try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clicNumero.click();
    }




}
