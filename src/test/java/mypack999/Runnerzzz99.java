package mypack999;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue={"Mystepdef99"}
		,plugin = {"json:target/cucumber.json"})
public class Runnerzzz99 {

}
