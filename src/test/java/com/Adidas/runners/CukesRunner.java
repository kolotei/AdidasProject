package com.Adidas.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "summary"
        },
        //snippets = ,
        features = "src/test/resources/features",
        glue = "com/Adidas/step_definitions",
        dryRun = false,
        tags = "@Adidas or @Login",
        publish = true //generating a report with public link
)
public class CukesRunner {}


