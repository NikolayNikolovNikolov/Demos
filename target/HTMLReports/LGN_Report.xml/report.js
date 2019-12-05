$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/SAfeatureFiles/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality of Social Alien(SA) social network web-application",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login in SA with valid username and password",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Registered user launches the SA LoginPage with URL \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user enters valid userName as \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user enters valid password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user clicks on the login form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The user is successfully logged in SA",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User`s name is presented as a link at the navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "url",
        "userName",
        "password"
      ],
      "line": 14,
      "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-valid-username-and-password;;1"
    },
    {
      "cells": [
        "http://localhost:8080/login",
        "N3TestUser",
        "123"
      ],
      "line": 15,
      "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-valid-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Login in SA with valid username and password",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Registered user launches the SA LoginPage with URL \"http://localhost:8080/login\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user enters valid userName as \"N3TestUser\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user enters valid password as \"123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user clicks on the login form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The user is successfully logged in SA",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User`s name is presented as a link at the navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:8080/login",
      "offset": 52
    }
  ],
  "location": "LGNstepDefinitions.registeredUserLaunchesTheSALoginPageWithURL(String)"
});
formatter.result({
  "duration": 11200998800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "N3TestUser",
      "offset": 35
    }
  ],
  "location": "LGNstepDefinitions.theUserEntersValidUserNameAs(String)"
});
formatter.result({
  "duration": 307759200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 35
    }
  ],
  "location": "LGNstepDefinitions.theUserEntersValidPasswordAs(String)"
});
formatter.result({
  "duration": 341501100,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserClicksOnTheLoginFormSubmitButton()"
});
formatter.result({
  "duration": 668158700,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserIsSuccessfullyLoggedInSA()"
});
formatter.result({
  "duration": 612414500,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.userSNameIsPresentedAsALinkAtTheNavigation()"
});
formatter.result({
  "duration": 896451000,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserClosesTheBrowser()"
});
formatter.result({
  "duration": 4716288400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 22,
  "name": "Login in SA with invalid username and valid password",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-invalid-username-and-valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Registered user launches the SA LoginPage with URL \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "The user enters invalid userName as \"\u003cinvalidUser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "The user enters valid password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "The user clicks on the login form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "The user is not logged in SA",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "The user stays on the loginPage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "A error message is shown",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-invalid-username-and-valid-password;",
  "rows": [
    {
      "cells": [
        "url",
        "invalidUser",
        "password"
      ],
      "line": 34,
      "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-invalid-username-and-valid-password;;1"
    },
    {
      "cells": [
        "http://localhost:8080/login",
        "N3TestUser",
        "123"
      ],
      "line": 35,
      "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-invalid-username-and-valid-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "Login in SA with invalid username and valid password",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;login-in-sa-with-invalid-username-and-valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Registered user launches the SA LoginPage with URL \"http://localhost:8080/login\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "The user enters invalid userName as \"N3TestUser\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "The user enters valid password as \"123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "The user clicks on the login form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "The user is not logged in SA",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "The user stays on the loginPage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "A error message is shown",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:8080/login",
      "offset": 52
    }
  ],
  "location": "LGNstepDefinitions.registeredUserLaunchesTheSALoginPageWithURL(String)"
});
formatter.result({
  "duration": 10325348600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "N3TestUser",
      "offset": 37
    }
  ],
  "location": "LGNstepDefinitions.theUserEntersInvalidUserNameAs(String)"
});
formatter.result({
  "duration": 455950800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 35
    }
  ],
  "location": "LGNstepDefinitions.theUserEntersValidPasswordAs(String)"
});
formatter.result({
  "duration": 305824900,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserClicksOnTheLoginFormSubmitButton()"
});
formatter.result({
  "duration": 171599800,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserIsNotLoggedInSA()"
});
formatter.result({
  "duration": 205136700,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserStaysOnTheLoginPage()"
});
formatter.result({
  "duration": 8936600,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.aErrorMessageIsShown()"
});
formatter.result({
  "duration": 31657300,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserClosesTheBrowser()"
});
formatter.result({
  "duration": 599163700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 38,
  "name": "Not successful Login with invalid user and valid password",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;not-successful-login-with-invalid-user-and-valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "The guest user launches Social Alien (SA) home page with  URL \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "The user goes to Login page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "The user enters valid userName as \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "The user enters valid password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "The user clicks on the login form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "The user is successfully logged in SA",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "User`s name is presented as a link at the navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "The user clicks on logout button",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "The user is successfully logged-out from SA",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "The user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 52,
  "name": "",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;not-successful-login-with-invalid-user-and-valid-password;",
  "rows": [
    {
      "cells": [
        "url",
        "userName",
        "password"
      ],
      "line": 53,
      "id": "login-functionality-of-social-alien(sa)-social-network-web-application;not-successful-login-with-invalid-user-and-valid-password;;1"
    },
    {
      "cells": [
        "http://localhost:8080/",
        "NovemberRain",
        "novemberrain"
      ],
      "line": 54,
      "id": "login-functionality-of-social-alien(sa)-social-network-web-application;not-successful-login-with-invalid-user-and-valid-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 54,
  "name": "Not successful Login with invalid user and valid password",
  "description": "",
  "id": "login-functionality-of-social-alien(sa)-social-network-web-application;not-successful-login-with-invalid-user-and-valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "The guest user launches Social Alien (SA) home page with  URL \"http://localhost:8080/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "The user goes to Login page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "The user enters valid userName as \"NovemberRain\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "The user enters valid password as \"novemberrain\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "The user clicks on the login form submit button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "The user is successfully logged in SA",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "User`s name is presented as a link at the navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "The user clicks on logout button",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "The user is successfully logged-out from SA",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "The user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:8080/",
      "offset": 63
    }
  ],
  "location": "LGNstepDefinitions.theGuestUserLaunchesSocialAlienSAHomePageWithURL(String)"
});
formatter.result({
  "duration": 9620657800,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserGoesToLoginPage()"
});
formatter.result({
  "duration": 329645100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NovemberRain",
      "offset": 35
    }
  ],
  "location": "LGNstepDefinitions.theUserEntersValidUserNameAs(String)"
});
formatter.result({
  "duration": 254189800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "novemberrain",
      "offset": 35
    }
  ],
  "location": "LGNstepDefinitions.theUserEntersValidPasswordAs(String)"
});
formatter.result({
  "duration": 263502400,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserClicksOnTheLoginFormSubmitButton()"
});
formatter.result({
  "duration": 266191700,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserIsSuccessfullyLoggedInSA()"
});
formatter.result({
  "duration": 602874100,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.userSNameIsPresentedAsALinkAtTheNavigation()"
});
formatter.result({
  "duration": 896295500,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.the_user_clicks_on_logout_button()"
});
formatter.result({
  "duration": 407208900,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.the_user_is_successfully_logged_out_from_SA()"
});
formatter.result({
  "duration": 27724900,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserIsOnTheHomePage()"
});
formatter.result({
  "duration": 186203500,
  "status": "passed"
});
formatter.match({
  "location": "LGNstepDefinitions.theUserClosesTheBrowser()"
});
formatter.result({
  "duration": 941402200,
  "status": "passed"
});
});