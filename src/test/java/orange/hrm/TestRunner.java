package orange.hrm;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Resources",
		glue="orange.hrm")//package name in which glue code is implemented
public class TestRunner {

}
