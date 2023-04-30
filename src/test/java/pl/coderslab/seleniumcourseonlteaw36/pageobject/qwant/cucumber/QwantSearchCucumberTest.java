package pl.coderslab.seleniumcourseonlteaw36.pageobject.qwant.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/zad1.qwant.phrase.search.feature",
        plugin = {"pretty","html:out"})
public class QwantSearchCucumberTest {
}