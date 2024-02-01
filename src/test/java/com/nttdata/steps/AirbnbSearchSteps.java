package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

import java.awt.*;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        loginScreen.clickClose();
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        searchScreen.clickSearchInput();
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOption();
        searchDetailsScreen.clickNext();
        searchDetailsScreen.clickSearch();
    }

    public void searchByTextExamen(String place){
        searchScreen.clickSearchInput();
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOptionExamen();
        searchDetailsScreen.clickSkip();
        searchDetailsScreen.clickSearchExamen();
    }


    @Step("Obtiene el texto del resultado")
    public String getResultText(){
            return searchScreen.getResultText();
    }


    public String getResultTextExamen(){
        return searchScreen.getResultTextExamen();
    }


    public int obtenerResultado() {
        String texto = searchScreen.getResultTextExamen();
        String resultadoNumerico = texto.replaceAll("\\D+", "");
        return Integer.parseInt(resultadoNumerico);

       // return Integer.parseInt(searchScreen.getResultTextExamen());

    }


}
