package StepDefinitions;

import Utilities.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {

    }
    @After
    public void afterScenario() {
        BasicDriver.quitDriver();
    }

}
