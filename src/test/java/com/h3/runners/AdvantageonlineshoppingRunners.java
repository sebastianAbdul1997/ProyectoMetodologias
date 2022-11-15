package com.h3.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/advantageonlineshopping/advantageonlineshopping2.feature"
        ,glue = "com.h3.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
       ,tags = "@Test1"
)

public class AdvantageonlineshoppingRunners {
}
