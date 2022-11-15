package com.h1.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/advantageonlineshopping/advantageonlineshopping.feature"
        ,glue = "com.h1.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
        //,tags = ""
)

public class AdvantageonlineshoppingRunners {
}
