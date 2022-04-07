package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\FacebookPage.feature",
	glue="com.stepdef",monochrome=true,dryRun=false,tags= {"@Smoke"}, snippets=SnippetType.CAMELCASE,plugin="usage")


public class TestRunner {

}
