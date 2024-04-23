package starter.duckduckgo;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingByKeywordTest {


    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

     NavigateActions navigate;
     SearchActions search;
    SearchResultSidebar searchResultSidebar;

    @Test
    void theKeywordShouldAppearInTheResultsSidebar() {

     navigate.toTheDuckDuckGoSearchPage();
     search.byKeyword("Cucumber");
     String value = searchResultSidebar.heading();
     assertThat(value).isEqualTo("Cucumber");

    }
}

