package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue="com.sophossolutions.stepsdefinitions",
		features = "src/test/resources/com/sophossolutions/features/practice_automatesting.feature",
		snippets = SnippetType.CAMELCASE
		)
public class PracticeAutotesting {

}
