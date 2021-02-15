package com.autotrader.Runner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
          "html:target/default-html-reports"
        },
        glue = "com/autotrader/searchSteps",
        features = "src/test/resources/features/",
        strict = true, //Removes some red lines after execution in Terminal
        dryRun= false,
        tags = "@wip"
)

public class CukesRunner {
}
