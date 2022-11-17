package com.h3.actions;

import com.h3.pages.AdvantageonlineshoppingPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class AdvantageonlineshoppingActions extends AdvantageonlineshoppingPage {
    public AdvantageonlineshoppingActions(WebDriver driver) {
        super(driver);
    }


    public void  irParteInferiorPagina(){
        //getEsperaSeccionImagenes().waitUntilPresent();
        getFooter().waitUntilPresent();
        WebElement gmailLink = getDriver().findElement(By.xpath("//div[@id='follow']/following::label"));
        Actions actionProvider = new Actions(getDriver());
        actionProvider.moveToElement(gmailLink).build().perform();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void encontarRedesSociales(){


        List<String> listaDeRedesSocialesPredefinidas = Arrays.asList(new String[]{"facebook", "twitter","linkedin"});
        int contador=0;
        for(int i=0; i<listaDeRedesSocialesPredefinidas.size(); i++){
            for(int k=0; k<getListaDeRedesSociles().size(); k++){
                if(getListaDeRedesSociles().get(i).getAttribute("name").split("_")[1].equals(listaDeRedesSocialesPredefinidas.get(k))){
                    contador++;

                }
                 System.out.println(getListaDeRedesSociles().get(k).getAttribute("name")+"**********************************");
            }

        }

        /*
        MatcherAssert.assertThat("las opciones deben coincidor",
                listaDeRedesSocialesPredefinidas.size(), Matchers.is(contador));

         */

        MatcherAssert.assertThat("deben haber 3 coincidencias",
                listaDeRedesSocialesPredefinidas.size(), Matchers.is(contador));


    }




}
