package com.h2.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("https://advantageonlineshopping.com/#/")
public class AdvantageonlineshoppingPage extends PageObject {
    public AdvantageonlineshoppingPage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade getBannerDePublicidad() {
        return bannerDePublicidad;
    }

    @FindBy(xpath = "//article[@id='slider_explore_now']")
    private WebElementFacade bannerDePublicidad;


    public WebElementFacade getIcinoBotonBuscar() {
        return icinoBotonBuscar;
    }

    @FindBy(xpath = "//div[@class='autoCompleteCover']//input[@id='autoComplete']")
    private WebElementFacade icinoBotonBuscar;


    //__________________________test2____________________________//
    @FindBy(xpath = "//div[@id='search']")
    private WebElementFacade botonBuscar1;

    public WebElementFacade getBotonBuscar1() {
        return botonBuscar1;
    }

    @FindBy(xpath = "//div[@class='autoCompleteCover']//input[@id='autoComplete']")
    private  WebElementFacade inputBuscar;

    public WebElementFacade getInputBuscar() {
        return inputBuscar;
    }

    public WebElementFacade getContenedorProductos() {
        return contenedorProductos;
    }

    @FindBy(xpath = "//div[@class='cell categoryLeft']")
    private  WebElementFacade contenedorProductos;

    public WebElementFacade getBotonBuscar2() {
        return botonBuscar2;
    }

    @FindBy(xpath = "//p[contains(@class,'filterCount roboto-light')]")
    private  WebElementFacade botonBuscar2;

    public List<WebElementFacade> getListaDeCoincidencias() {
        return listaDeCoincidencias;
    }

    @FindBy(xpath = " //p//a[@class='productName ng-binding']")
    private  List<WebElementFacade> listaDeCoincidencias;


    @FindBy(xpath = "//div//h3[@id='searchResultLabel']")
    private  WebElementFacade resultados;

    public WebElementFacade getResultados() {
        return resultados;
    }
//_____________________________________test3_______________________________________________//

    @FindBy(xpath = "//span[@class='roboto-regular ng-binding']")
    private  WebElementFacade categoriaDeProductoBuscado;

    public WebElementFacade getCategoriaDeProductoBuscado() {
        return categoriaDeProductoBuscado;
    }


    @FindBy(xpath = "//label[@class='noProducts roboto-bold ']//span")
    private WebElementFacade textoProductoQueNoExiste;

    public WebElementFacade getTextoProductoQueNoExiste() {
        return textoProductoQueNoExiste;
    }


    public WebElementFacade getBotonCerrarEmergente() {
        return botonCerrarEmergente;
    }

    @FindBy(xpath = "//div[@data-ng-click='closeSearchForce()']")
    WebElementFacade botonCerrarEmergente;
}
