package com.h3.pages;

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

    @FindBy(xpath = "//div[@id='follow']//img")
    private List<WebElement> listaDeRedesSociles;
    @FindBy(xpath = "//a[@id='hrefUserIcon']")
    private WebElementFacade esperaSeccionImagenes;
    @FindBy(xpath = "//div[@id='follow']")
    private WebElementFacade esperarBanner;
    @FindBy(xpath = "//div[@id='follow']/following::label")
    private WebElementFacade footer;

    public WebElementFacade getFooter() {
        return footer;
    }

    public WebElementFacade getEsperaSeccionImagenes() {
        return esperaSeccionImagenes;
    }

    public List<WebElement> getListaDeRedesSociles() {
        return listaDeRedesSociles;
    }
}
