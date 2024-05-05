package com.koushal.springbootproject.ConfigurationPropertiesExample;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency")
@Component
public class ConfigurationPropertyService {
    //all this values we are getting form application.properties class and spring knows
    //it because we have used @ConfigurationProperties(prefix = "currency")
    String url;
    String userName;
    String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
