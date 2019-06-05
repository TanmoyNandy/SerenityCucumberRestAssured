package bdd.testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/",
        glue = "bdd/stepDefinition",
        monochrome = true,
        tags = {"@tags1"}
)
public class TestRunner {

}
