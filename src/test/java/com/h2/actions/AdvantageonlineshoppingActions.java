package com.h2.actions;

import com.indra.models.AdvantageonlineshoppingModels;
import com.h2.pages.AdvantageonlineshoppingPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.*;


public class AdvantageonlineshoppingActions extends AdvantageonlineshoppingPage {
    public AdvantageonlineshoppingActions(WebDriver driver) {
        super(driver);
    }

    public void esperarCargaCompletaDePagina(){
        getBannerDePublicidad().waitUntilPresent();
    }
    public void validarBotonBuscar(){
        esperarCargaCompletaDePagina();

        int contador=0;
        if(getIcinoBotonBuscar().isVisible()){
            contador++;

        }

        getIcinoBotonBuscar().waitUntilPresent();
        MatcherAssert.assertThat("deberia haber al menos un boton de buscar",
                contador, Matchers.is(1));


    }
    /**    ***************************************       Test2       ***********************************************   */


    public void  hacerBusquedaDeProducto(AdvantageonlineshoppingModels advantageonlineshoppingModels)  {
        getBannerDePublicidad().waitUntilPresent();
        getBotonBuscar1().click();
        getInputBuscar().waitUntilPresent();
        enter(advantageonlineshoppingModels.getArticuloBuscado()).into(getInputBuscar());
        getInputBuscar().sendKeys(Keys.ENTER);
        getBotonCerrarEmergente().waitUntilPresent();
        getBotonCerrarEmergente().click();
        //getBotonBuscar2().click();
        getContenedorProductos().waitUntilPresent();




    }

    public void buscarCoincidencias(AdvantageonlineshoppingModels advantageonlineshoppingModels)  {
        int contador=0;
        List<String> articuloBuscado = Arrays.asList(new String[]{advantageonlineshoppingModels.getArticuloBuscado()});
        //System.out.println(articuloBuscado+"**************************************************");

        for(int i=0; i<getListaDeCoincidencias().size(); i++) {
            //System.out.println(getListaDeCoincidencias().get(i).getText());
            String listaCoincidencia = getListaDeCoincidencias().get(i).getText();
            int numeroDeCoincidencia= listaCoincidencia.split(" ").length;
            for(int j = 0; j<numeroDeCoincidencia; j ++ ){
                if(articuloBuscado.get(0).equals(listaCoincidencia.split(" ")[j])){
                    contador++;
                }
            }
        }

        //Thread.sleep(10000);


        MatcherAssert.assertThat("debe haber al menos una coincidencia respecto al nombre de los articulos",
                contador, Matchers.greaterThan(0));

        //System.out.println(contador);
    }


    public  void verProductosBuscados(){
        getResultados().waitUntilPresent();
    }

    /**    **************************************       Test3        *******************************************  */

    public void encontrarCategoriaDeProductosBuscado(){
        getCategoriaDeProductoBuscado().waitUntilPresent();
        System.out.println(getCategoriaDeProductoBuscado().getText());
        List<String> listaDeTodasLasCategorias = Arrays.asList(new String[]{"SPEAKERS", "TABLETS", "LAPTOPS", "MICE", "HEADPHONES"});
        int contador = 0;

        for (int i=0; i<listaDeTodasLasCategorias.size(); i++ ){
            if(listaDeTodasLasCategorias.get(i).equals(getCategoriaDeProductoBuscado().getText())){
                contador++;
            }

        }
        //System.out.println(contador+"**********************************************");
        MatcherAssert.assertThat("debe haber al menos una coincidencia",
                contador, Matchers.greaterThan(0));



    }
//____________________________________________test4____________________________________//

    public void  buscarProductoQueNoExiste(AdvantageonlineshoppingModels advantageonlineshoppingModels){
        getBannerDePublicidad().waitUntilPresent();
        getBotonBuscar1().click();
        getInputBuscar().waitUntilPresent();
        enter(advantageonlineshoppingModels.getArticuloNoExiste()).into(getInputBuscar());
        getInputBuscar().sendKeys(Keys.ENTER);
        getTextoProductoQueNoExiste().waitUntilPresent();

        System.out.println(getTextoProductoQueNoExiste().getText()+"*******************************************************");

    }
    public void  validarMensajeDeNoExistencia(){

        String mensaje = getTextoProductoQueNoExiste().getText();
        MatcherAssert.assertThat("deberia mostrar mensaje de no existencia de producto",
                mensaje, Matchers.containsString("No results for"));
    }




}
