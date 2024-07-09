package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/Feature/LearnMore.feature"},
		glue = {"Stepdefination"},
		tags="@Lmt01",
		plugin= {"pretty"}
	)
public class featureRunner {

}
