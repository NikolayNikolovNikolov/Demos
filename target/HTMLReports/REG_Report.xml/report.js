$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/SAfeatureFiles/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration functionality of Social Alien(SA) social network web-application",
  "description": "As a  registered user,\r\nI want to be able to login in the SA\r\nso that I can use all user`s functionality of the SA App",
  "id": "registration-functionality-of-social-alien(sa)-social-network-web-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Registration with must field fields",
  "description": "",
  "id": "registration-functionality-of-social-alien(sa)-social-network-web-application;registration-with-must-field-fields",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "A guest user lunches the SA registration page with with URL \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "The user enters new userName as \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The user enters new email as \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The user enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The user reenters the password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The user clicks on the registration form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "The user is successfully registered in SA",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "A welcome message is shown at the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "The browser is closed by the user",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "registration-functionality-of-social-alien(sa)-social-network-web-application;registration-with-must-field-fields;",
  "rows": [
    {
      "cells": [
        "url",
        "userName",
        "email",
        "password"
      ],
      "line": 20,
      "id": "registration-functionality-of-social-alien(sa)-social-network-web-application;registration-with-must-field-fields;;1"
    },
    {
      "cells": [
        "http://localhost:8080/register",
        "newU",
        "email",
        "newPass"
      ],
      "line": 21,
      "id": "registration-functionality-of-social-alien(sa)-social-network-web-application;registration-with-must-field-fields;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Registration with must field fields",
  "description": "",
  "id": "registration-functionality-of-social-alien(sa)-social-network-web-application;registration-with-must-field-fields;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "A guest user lunches the SA registration page with with URL \"http://localhost:8080/register\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "The user enters new userName as \"newU\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The user enters new email as \"email\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The user enters password as \"newPass\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The user reenters the password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "The user clicks on the registration form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "The user is successfully registered in SA",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "A welcome message is shown at the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "The browser is closed by the user",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:8080/register",
      "offset": 61
    }
  ],
  "location": "REGstepDefinitions.a_guest_user_lunches_the_sa_registration_page_with_with_url_something(String)"
});
formatter.result({
  "duration": 10184176500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "newU",
      "offset": 33
    }
  ],
  "location": "REGstepDefinitions.the_user_enters_new_username_as_something(String)"
});
formatter.result({
  "duration": 114129000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 30
    }
  ],
  "location": "REGstepDefinitions.the_user_enters_new_email_as_something(String)"
});
formatter.result({
  "duration": 66436300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "newPass",
      "offset": 29
    }
  ],
  "location": "REGstepDefinitions.the_user_enters_new_password_as_something(String)"
});
formatter.result({
  "duration": 65604500,
  "status": "passed"
});
formatter.match({
  "location": "REGstepDefinitions.theUserReentersThePasswordAs()"
});
formatter.result({
  "duration": 60798400,
  "status": "passed"
});
formatter.match({
  "location": "REGstepDefinitions.the_user_clicks_on_the_registration_form_submit_button()"
});
formatter.result({
  "duration": 1947131300,
  "status": "passed"
});
formatter.match({
  "location": "REGstepDefinitions.the_user_is_successfully_registered_in_sa()"
});
formatter.result({
  "duration": 25487600,
  "status": "passed"
});
formatter.match({
  "location": "REGstepDefinitions.a_welcome_message_is_shown_at_the_home_page()"
});
formatter.result({
  "duration": 4998600,
  "status": "passed"
});
formatter.match({
  "location": "REGstepDefinitions.theUserClosesTheBrowser()"
});
formatter.result({
  "duration": 580819300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Registration with data provided by excel",
  "description": "",
  "id": "registration-functionality-of-social-alien(sa)-social-network-web-application;registration-with-data-provided-by-excel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "The user is on the registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "The user enters valid/invalid data in the registration form must field fields provided by \"RegTestData.xlsx\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "The user clicks on the registration form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Then an error message is displayed and users is at the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "REGstepDefinitions.theUserIsOnTheRegistrationPage()"
});
formatter.result({
  "duration": 15201493600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegTestData.xlsx",
      "offset": 91
    }
  ],
  "location": "REGstepDefinitions.theUserEntersValidInvalidDataInTheRegistrationFormMustFieldFieldsProvidedBy(DataTable)"
});
formatter.result({
  "duration": 1313306500,
  "status": "passed"
});
formatter.match({
  "location": "REGstepDefinitions.the_user_clicks_on_the_registration_form_submit_button()"
});
formatter.result({
  "duration": 1618689600,
  "status": "passed"
});
formatter.match({
  "location": "REGstepDefinitions.thenAnErrorMessageIsDisplayedAndUsersIsAtTheHomePage()"
});
formatter.result({
  "duration": 618013200,
  "status": "passed"
});
});