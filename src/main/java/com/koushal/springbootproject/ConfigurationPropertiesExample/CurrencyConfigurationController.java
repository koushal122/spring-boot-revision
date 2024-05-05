package com.koushal.springbootproject.ConfigurationPropertiesExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    //here we have used @autowired because then only spring will autowire below class.
    @Autowired
    ConfigurationPropertyService configurationPropertyService;

    @RequestMapping("/currency")
    public ConfigurationPropertyService getCurrency(){
        return configurationPropertyService;
    }
}
