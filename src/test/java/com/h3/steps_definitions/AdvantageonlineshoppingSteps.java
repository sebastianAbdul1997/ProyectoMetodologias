package com.h3.steps_definitions;

import com.h3.actions.AdvantageonlineshoppingActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AdvantageonlineshoppingSteps {
    @Managed
    WebDriver driver;

    AdvantageonlineshoppingActions advantageonlineshoppingActions = new AdvantageonlineshoppingActions(driver);

    @Given("^que el usuario ingresa a la pagina de inicio$")
    public void queElUsuarioIngresaALaPaginaDeInicio() {
        advantageonlineshoppingActions.open();

    }

    @When("^esta en la parte inferior de la pagina$")
    public void estaEnLaParteInferiorDeLaPagina() {
        //advantageonlineshoppingActions.encontarRedesSociales();
        advantageonlineshoppingActions.irParteInferiorPagina();

    }

    @Then("^deberia poder ver minino tres redes sociales$")
    public void deberiaPoderVerMininoTresRedesSociales() {
        advantageonlineshoppingActions.encontarRedesSociales();

    }





}
