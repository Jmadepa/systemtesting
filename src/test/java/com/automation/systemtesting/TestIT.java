package com.automation.systemtesting;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},glue = { "com.automation", }, features={"src/test/resources"})
public class TestIT
{
   
}
