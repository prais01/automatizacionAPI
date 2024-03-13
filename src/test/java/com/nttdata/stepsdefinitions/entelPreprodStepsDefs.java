package com.nttdata.stepsdefinitions;

import com.nttdata.steps.entelPreprodSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class entelPreprodStepsDefs {

    @Steps
    entelPreprodSteps entelPreprodSteps;

    /*@Given("Ingreso el numero de celular y hago en clic en numero de cliente")
    public void ingresoElNumeroDeCelularYHagoEnClicEnNumeroDeCliente() {
        entelPreprodSteps.numeroCliente();
    }*/

    @Given("Ingresamos el numero de usuario {string}")
    public void ingresamosElNumeroDeUsuario(String numero) {
        entelPreprodSteps.numeroUsuario(numero);
    }

    @And("Hacemos clic en el boton de continuar")
    public void hacemosClicEnElBotonDeContinuar() {
        entelPreprodSteps.botonContinuar();
    }







}
