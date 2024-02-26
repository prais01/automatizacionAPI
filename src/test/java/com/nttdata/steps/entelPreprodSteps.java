package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import com.nttdata.screens.entelPreprodScreen;
import net.thucydides.core.annotations.Step;

public class entelPreprodSteps {

    entelPreprodScreen entelPreprodScreens;
    SearchScreen searchScreen;
/*
    public void numeroCliente(String nume) {
      //  entelPreprodScreens.clickSearchInputNum();
        searchScreen.enterSearchInput(nume);
    }
*/
    @Step
    public void numeroCliente() {
        entelPreprodScreens.clickSearchInputNum();
    }



}
