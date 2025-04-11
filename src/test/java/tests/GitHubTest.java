package tests;

import config.WebDriverConfig;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest extends TestBase {

    @Test
    void checkTitleOfEnterprisePage() {

        open("/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("Build and ship software on a single, collaborative platform"));
    }
}
