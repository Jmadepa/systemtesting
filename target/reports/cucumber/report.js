$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/automation/systemtesting/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "use case1",
  "description": "",
  "id": "use-case1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login positive for reviewers",
  "description": "",
  "id": "use-case1;login-positive-for-reviewers",
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
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on menu \"Registration\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters in field \"name\" value \"Tester\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters in field \"username\" value \"Tester\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters in field \"password\" value \"Testerpassword\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters in field \"cpassword\" value \"Testerpassword\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters in field \"email\" value \"tester@testing.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters in field \"phoneNumber\" value \"1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters in field \"address\" value \"1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters in field \"aboutMe\" value \"tester\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters in field \"role\" value \"tester\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on button \"Register\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_navigates()"
});
formatter.result({
  "duration": 13320227895,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration",
      "offset": 21
    }
  ],
  "location": "LoginStepDef.user_clicks(String)"
});
formatter.result({
  "duration": 274499620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 22
    },
    {
      "val": "Tester",
      "offset": 35
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 1309939080,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 22
    },
    {
      "val": "Tester",
      "offset": 39
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 212007240,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 22
    },
    {
      "val": "Testerpassword",
      "offset": 39
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 238764775,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cpassword",
      "offset": 22
    },
    {
      "val": "Testerpassword",
      "offset": 40
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 268424162,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 22
    },
    {
      "val": "tester@testing.com",
      "offset": 36
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 251491334,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "phoneNumber",
      "offset": 22
    },
    {
      "val": "1234",
      "offset": 42
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 214195918,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "address",
      "offset": 22
    },
    {
      "val": "1234",
      "offset": 38
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 230620211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aboutMe",
      "offset": 22
    },
    {
      "val": "tester",
      "offset": 38
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 212064899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "role",
      "offset": 22
    },
    {
      "val": "tester",
      "offset": 35
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 236953717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 23
    }
  ],
  "location": "LoginStepDef.user_clicks_login(String)"
});
formatter.result({
  "duration": 173857809,
  "status": "passed"
});
});