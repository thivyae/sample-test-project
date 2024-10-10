package stepdefs;

import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs"},
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "json:target/cucumber.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
@Test
@Slf4j
@CucumberContextConfiguration
@SpringBootTest(classes = {TestNGCucumberRunner.class})
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
    static {
        System.out.println("Cucumber filter tags: " + System.getProperty("cucumber.filter.tags"));
    }
}
