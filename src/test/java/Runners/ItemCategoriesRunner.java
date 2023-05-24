package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/ItemCategories.feature"},
        glue = "StepDefinitions"
)
public class ItemCategoriesRunner  extends AbstractTestNGCucumberTests {
}
