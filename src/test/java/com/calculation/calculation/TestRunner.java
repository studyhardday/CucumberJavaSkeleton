package com.calculation.calculation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        monochrome = true,
        features = {
                "src/features/calculation"
        }
)
public class TestRunner {
}
