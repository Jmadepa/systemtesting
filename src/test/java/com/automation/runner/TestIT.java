package com.automation.runner;


import org.junit.runner.RunWith;

import com.automation.configuraion.Config;
import com.automation.pages.Page;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},glue = { "com.automation", }, features={"src/test/resources"})
@CucumberOptions(plugin = {"pretty", "html:target/reports/cucumber", "json:target/reports/cucumber-report.json"},glue = { "com.automation", }, features={"src/test/resources"})
public class TestIT
{
	Page page = new Page();
	Config config = new Config();
}

