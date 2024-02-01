package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "com.airbnb.android:id/search_bar")
    private WebElement searchInput;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Display total before taxes\"]")
    private WebElement resultText;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_bottom_sheet_title_title")
    private WebElement resultTextExamen;

   // @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"4.91 out of 5 average rating,  104 reviews\"]")
   @AndroidFindBy(id = "com.airbnb.android:id/n2_bottom_sheet_title_title")
    private WebElement obtenerNumero;

    public void clickSearchInput(){
        searchInput.click();
    }

    public String getResultText(){
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return resultText.getText();
    }

    public String getResultTextExamen(){
        return resultTextExamen.getText();
    }





}
