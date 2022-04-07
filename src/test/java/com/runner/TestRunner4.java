package com.runner;

import org.junit.runner.RunWith;




import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\FacebookPage4.feature",
	snippets=SnippetType.CAMELCASE)





public class TestRunner4 {

}
