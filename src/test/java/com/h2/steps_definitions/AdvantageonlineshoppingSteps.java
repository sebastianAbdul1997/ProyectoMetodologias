package com.h2.steps_definitions;

import com.indra.actions.AdvantageonlineshoppingActions;
import com.indra.models.AdvantageonlineshoppingModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AdvantageonlineshoppingSteps {
    @Managed
    WebDriver driver;

    AdvantageonlineshoppingActions advantageonlineshoppingActions = new AdvantageonlineshoppingActions(driver);
    @Given("^que el usuario esta en la seccion home de la pagina$")
    public void queElUsuarioEstaEnLaSeccionHomeDeLaPagina() {
        advantageonlineshoppingActions.open();

    }


    @When("^la pagana carga todo su contenido$")
    public void laPaganaCargaTodoSuContenido() {
        advantageonlineshoppingActions.esperarCargaCompletaDePagina();

    }

    @Then("^deberia poder ver un icono que le permita digitgar nombres de productos$")
    public void deberiaPoderVerUnIconoQueLePermitaDigitgarNombresDeProductos() {
        advantageonlineshoppingActions.validarBotonBuscar();


    }

    //______________________________________test2___________________________________________________________//

    @Given("^que el usuario esta en la seccion inicial de la pagina$")
    public void queElUsuarioEstaEnLaSeccionInicialDeLaPagina() {
        advantageonlineshoppingActions.open();

    }


    @When("^ingresa un nombre de articulo$")
    public void ingresaUnNombreDeArticulo(List<AdvantageonlineshoppingModels> advantageonlineshoppingModels)  {
        advantageonlineshoppingActions.hacerBusquedaDeProducto(advantageonlineshoppingModels.get(0));
        advantageonlineshoppingActions.buscarCoincidencias(advantageonlineshoppingModels.get(0));

    }

    @Then("^deberia poder ver productos con nombre relacionados con la palabra introducida$")
    public void deberiaPoderVerProductosConNombreRelacionadosConLaPalabraIntroducida( )  {
        //advantageonlineshoppingActions.buscarCoincidencias(advantageonlineshoppingModels.get(0));
        advantageonlineshoppingActions.verProductosBuscados();

    }

    //___________________________________________test3_____________________________________________//


    @Given("^que el usuario esta en la seccion   home de la pagina demo$")
    public void queElUsuarioEstaEnLaSeccionHomeDeLaPaginaDemo() {
        advantageonlineshoppingActions.open();

    }


    @When("^realiza la busqueda de un articulo$")
    public void realizaLaBusquedaDeUnArticulo(List<AdvantageonlineshoppingModels> advantageonlineshoppingModels) throws InterruptedException {

        advantageonlineshoppingActions.hacerBusquedaDeProducto(advantageonlineshoppingModels.get(0));


    }

    @Then("^deberia poder ver la categoria a la que pertenece el producto que coincide con su criterio de busqueda$")
    public void deberiaPoderVerLaCategoriaALaQuePerteneceElProductoQueCoincideConSuCriterioDeBusqueda() {
        //advantageonlineshoppingActions.prueba(advantageonlineshoppingModels.get(0));
        advantageonlineshoppingActions.encontrarCategoriaDeProductosBuscado();
        //advantageonlineshoppingActions.buscarProductoQueNoExiste(advantageonlineshoppingModels.get(0));

    }


//_______________________________________________test4________________________________//


    @Given("^que el usuario esta en la seccion   home de la pagina oficial$")
    public void queElUsuarioEstaEnLaSeccionHomeDeLaPaginaOficial() {
        advantageonlineshoppingActions.open();

    }

    @When("^realiza la busqueda de un articulo que no existe$")
    public void realizaLaBusquedaDeUnArticuloQueNoExiste(List<AdvantageonlineshoppingModels> advantageonlineshoppingModels) {
        advantageonlineshoppingActions.buscarProductoQueNoExiste(advantageonlineshoppingModels.get(0));

    }

    @Then("^deberia poder ver el mensaje que el producto no existe$")
    public void deberiaPoderVerElMensajeQueElProductoNoExiste() {
        advantageonlineshoppingActions.validarMensajeDeNoExistencia();

    }










}
