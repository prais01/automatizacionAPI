package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchDetailsScreen extends PageObject {

   // @AndroidFindBy(id="search_input")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Search destinations\"]")
    //android.view.ViewGroup[@resource-id="com.airbnb.android:id/stays_where_panel_compose"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]

    private WebElement searchDetailInput;

    @AndroidFindBy(id="com.airbnb.android:id/input_bar_input")
    private WebElement searchDetailInputText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    private WebElement firstOption;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.airbnb.android:id/title\" and @text=\"Vichayito, Peru\"]")
    private WebElement firstOpciones;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_simple_search_footer_gradient_button")
    private WebElement nextButton;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_simple_search_footer_link")
    private WebElement nextSkip;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_dls_action_footer_gradient_button")
    private WebElement searchButton;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_dls_action_footer_gradient_button")
    private WebElement searchButtons;

    public void enterSearchInput(String place){
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        searchDetailInput.click();
        searchDetailInputText.sendKeys(place);
    }

    public void clickFirstOption(){
        firstOption.click();
    }

    public void clickNext(){
        nextButton.click();
    }

    public void clickSearch(){
        searchButton.click();
    }

    public void clickFirstOptionExamen(){
        firstOpciones.click();
    }

    public void clickSkip() {
        nextSkip.click();
    }

    public void clickSearchExamen() {
        searchButtons.click();
    }

}
