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

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"b1-b2-Input\"]")
    private WebElement digitarNumero;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"CONTINUAR\"]")
    private WebElement botonContinuar;

    public void clickSearchInputNum() {

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(clicNumero));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

         try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clicNumero.click();
    }


    public void ingresarNumero(String numero) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clicNumero.click();
        digitarNumero.sendKeys(numero);


    }

    public void clicContinuar() {
        botonContinuar.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
