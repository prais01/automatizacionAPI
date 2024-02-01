package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jnr.ffi.annotations.In;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;


    @Given("que me encuentro en el login de Airbnb")
    public void queMeEncuentroEnElLoginDeAirbnb() {
        airbnbSearchSteps.clickClose();
    }

    @When("busco {string}")
    public void busco(String place) {
        airbnbSearchSteps.searchByText(place);
    }

    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {
        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }


    @When("buscamos {string}")
    public void buscamos(String arg0) {
        airbnbSearchSteps.searchByTextExamen(arg0);
    }


    @Then("se muestra el texto {string}")
    public void seMuestraElTexto(String arg0) {
        Assert.assertEquals(airbnbSearchSteps.getResultTextExamen(), arg0);
    }

    @And("valido que los resultados sean mayores a {int}")
    public void validoQueLosResultadosSeanMayoresA(int valorEsperado) {
       int numero = airbnbSearchSteps.obtenerResultado();
        Assert.assertTrue(numero > valorEsperado);

    }



}
