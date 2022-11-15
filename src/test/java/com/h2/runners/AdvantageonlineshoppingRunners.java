package com.h2.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/advantageonlineshopping/advantageonlineshopping1.feature"
        ,glue = "com.h2.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
       //,tags = "@Test2"
)

public class AdvantageonlineshoppingRunners {
}
