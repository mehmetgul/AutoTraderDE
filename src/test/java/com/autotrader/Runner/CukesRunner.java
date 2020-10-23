package com.autotrader.Runner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/report.json",
        glue = "com/autotrader/searchSteps",
        features = "src/test/resources/features/",
        dryRun= false,
        tags = "@wip"
)

public class CukesRunner {
}
