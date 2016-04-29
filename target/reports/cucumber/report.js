$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/automation/events/CreateEvent.feature");
formatter.feature({
  "line": 1,
  "name": "use case1",
  "description": "",
  "id": "use-case1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create an Event",
  "description": "",
  "id": "use-case1;create-an-event",
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
  "name": "user clicks on menu \"Login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"poojarem\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters password \"poojarem\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on button \"Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user logged in successfully as \"Add Events\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on button \"Add Events\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enters in field \"name\" value \"Test Event\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters in field \"location\" value \"Test Location\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters in field \"category\" value \"IT\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters date as today date for \"startDate\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters date as today date for \"endDate\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters date as today date for \"time\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters in field \"ticketPrice\" value \"50\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user enters in field \"description\" value \"Test Description\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user clicks on button \"create\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.user_navigates()"
});
formatter.result({
  "duration": 22673929174,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 21
    }
  ],
  "location": "LoginStepDef.user_clicks(String)"
});
formatter.result({
  "duration": 431400499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "poojarem",
      "offset": 22
    }
  ],
  "location": "LoginStepDef.user_entersusername(String)"
});
formatter.result({
  "duration": 916203583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "poojarem",
      "offset": 22
    }
  ],
  "location": "LoginStepDef.user_enterspassword(String)"
});
formatter.result({
  "duration": 200415901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 23
    }
  ],
  "location": "LoginStepDef.user_clicks_login(String)"
});
formatter.result({
  "duration": 147675919,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Events",
      "offset": 32
    }
  ],
  "location": "LoginStepDef.user_logged_in_successfully(String)"
});
formatter.result({
  "duration": 2266008630,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Events",
      "offset": 23
    }
  ],
  "location": "LoginStepDef.user_clicks_login(String)"
});
formatter.result({
  "duration": 5717782588,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 22
    },
    {
      "val": "Test Event",
      "offset": 35
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 2939867385,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "location",
      "offset": 22
    },
    {
      "val": "Test Location",
      "offset": 39
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 506869450,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "category",
      "offset": 22
    },
    {
      "val": "IT",
      "offset": 39
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 349607967,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "startDate",
      "offset": 36
    }
  ],
  "location": "LoginStepDef.enterToday(String)"
});
formatter.result({
  "duration": 1334715888,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "endDate",
      "offset": 36
    }
  ],
  "location": "LoginStepDef.enterToday(String)"
});
formatter.result({
  "duration": 3390336454,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "time",
      "offset": 36
    }
  ],
  "location": "LoginStepDef.enterToday(String)"
});
formatter.result({
  "duration": 2563741972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ticketPrice",
      "offset": 22
    },
    {
      "val": "50",
      "offset": 42
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 959674652,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "description",
      "offset": 22
    },
    {
      "val": "Test Description",
      "offset": 42
    }
  ],
  "location": "LoginStepDef.userEnters(String,String)"
});
formatter.result({
  "duration": 1046231610,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "create",
      "offset": 23
    }
  ],
  "location": "LoginStepDef.user_clicks_login(String)"
});
formatter.result({
  "duration": 6172311888,
  "status": "passed"
});
});