package com.h1.steps_definitions;

import com.h1.actions.AdvantageonlineshoppingActions;
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


    @When("^carga el contenido$")
    public void cargaElContenido() {
        advantageonlineshoppingActions.esperarCargaCompletaDePagina();


    }

    @Then("^deberia poder ver las diferentes categoria$")
    public void deberiaPoderVerLasDiferentesCategoria() {
        advantageonlineshoppingActions.mostrarTodasLasCategorias();
        advantageonlineshoppingActions.encontrarEspaciosDePublicidad();
    }
}
