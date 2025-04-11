package config;

import org.aeonbits.owner.Config;

import static com.codeborne.selenide.Browsers.CHROME;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface DataConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("Remo")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue(CHROME)
    String getBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("126")
    String getBrowserVersion();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteUrl")
    String remoteUrl();
}
