package octane.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","summary","com.hpe.alm.octane.OctaneGherkinFormatter:target/gherkin-results/RunnerTest_OctaneGherkinResults.xml"})
public class RunCucumberTest {

}