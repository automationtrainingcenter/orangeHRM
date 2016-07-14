package orange.hrm;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//runwith annotation is to run cucumber with junit
//@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Resources",
		glue="orange.hrm", //package name in which glue code is implemented
		monochrome =true,
		tags={"@multiple"},plugin={"pretty","html:target/Cucumber"})

/*
 * To run code through maven use the following commands
 * in command prompt go through the project directory and enter the commands
 * in jenkins add the comments at goals and options
 * or if you are running through eclipse don't use mvn before each command 
 * mvn test------- to runwhole project
 * mvn test -Dcucumber.options="--tags = @tagName"
 */

/*//to run cucumber with junit
public class TestRunner{
	
}*/

//to run with cucumber with testng
public class TestRunner extends AbstractTestNGCucumberTests{

}
