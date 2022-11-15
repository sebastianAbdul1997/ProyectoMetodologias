package com.h1.actions;

import com.h1.pages.AdvantageonlineshoppingPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;


public class AdvantageonlineshoppingActions extends AdvantageonlineshoppingPage {
    public AdvantageonlineshoppingActions(WebDriver driver) {
        super(driver);
    }

    public void esperarCargaCompletaDePagina(){
        getEsperaSeccionImagenes().waitUntilPresent();
    }

    public void mostrarTodasLasCategorias(){
        //List<WebElementFacade> categorias = getTodasLasCategorias();

        for(int i=0; i<getTodasLasCategorias().size(); i++){
            String categorias  = getTodasLasCategorias().get(i).getText();
            ArrayList al = new ArrayList();
            al.add(categorias);
            //System.out.println("****************"+categorias+"***********");

            for (int j=0; j<al.size(); j++){
                MatcherAssert.assertThat("las categorias deben coincidir",
                        getTodasLasCategorias().get(i).getText(), Matchers.equalTo(al.get(j).toString()));
                //System.out.println("****************"+al+"***********");

            }

        }
    }

    public void encontrarEspaciosDePublicidad(){

        /*int numeroDeImagenesEspaciosDePublicidad;
        numeroDeImagenesEspaciosDePublicidad = getEspacioPublicidad().size();
        System.out.println("numero de imagenes en banner es "+numeroDeImagenesEspaciosDePublicidad);

        */
        //WebElementFacade banner = getEspacioDelBanner();

        getEspacioDelBanner().waitUntilPresent();


        /*MatcherAssert.assertThat("espacio del banner debe estar presente",
                getEspacioDelBanner(), Matchers.equalTo(getEspacioDelBanner().isPresent())); */

        System.out.println(getTextoDelBanner().getText()+"****************************************************************");

    }
}
