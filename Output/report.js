$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("user-service.feature");
formatter.feature({
  "line": 2,
  "name": "verify user is able to access user service features",
  "description": "",
  "id": "verify-user-is-able-to-access-user-service-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@user-service"
    }
  ]
});
formatter.scenario({
  "line": 13,
  "name": "Verify information of registered user",
  "description": "",
  "id": "verify-user-is-able-to-access-user-service-features;verify-information-of-registered-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@search"
    },
    {
      "line": 12,
      "name": "@smoke"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user has search endpoint with headers",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user provides username",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user hits search api",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "verify status code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify response has id",
  "keyword": "Then "
});
formatter.match({
  "location": "UserService.search_api()"
});
formatter.result({
  "duration": 1013936011,
  "status": "passed"
});
formatter.match({
  "location": "UserService.jsonRequestSearch()"
});
formatter.result({
  "duration": 7075698,
  "status": "passed"
});
formatter.match({
  "location": "UserService.search_user()"
});
formatter.result({
  "duration": 5426036862,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 22
    }
  ],
  "location": "UserService.statusCheck(int)"
});
formatter.result({
  "duration": 56113688,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "id",
      "offset": 20
    }
  ],
  "location": "UserService.attributeInResponse(String)"
});
formatter.result({
  "duration": 802357581,
  "status": "passed"
});
});