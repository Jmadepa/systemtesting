$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/automation/systemtesting/test.feature");
formatter.feature({
  "line": 1,
  "name": "use case1",
  "description": "",
  "id": "use-case1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "a few cukes",
  "description": "",
  "id": "use-case1;a-few-cukes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.user_navigates()"
});
formatter.result({
  "duration": 14919904040,
  "status": "passed"
});
});