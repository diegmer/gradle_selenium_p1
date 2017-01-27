package com.diegmer.testRunner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by diego.merino on 27/01/2017.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = { "src/test/resources/features" },
        glue = { "com.diegmer.stepDefinitions" }
)
public class LoginTest {
}
