import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions/Edurete/",
        tags = {"@RunEdu1"},
        plugin ={"pretty","html:test-output/CucumberReport"}
)
public class TestRunnerEdu {
}
