package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="FeatureFile/Login.feature",glue="stepDefinitions",dryRun = false)

public class AddEmpTest {

}
