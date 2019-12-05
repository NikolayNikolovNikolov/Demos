Feature: Login functionality of Social Alien(SA) social network web-application
  @Smoke
  Scenario Outline:Login in SA with valid username and password

    Given Registered user launches the SA LoginPage with URL "<url>"
    When The user enters valid userName as "<userName>"
    When The user enters valid password as "<password>"
    And The user clicks on the login form submit button
    Then The user is successfully logged in SA
    Then User`s name is presented as a link at the navigation
    Then the user closes the browser

    Examples:
      | url| userName|password|
      |http://localhost:8080/login | N3TestUser | 123|





  @Regression
  Scenario Outline:Login in SA with invalid username and valid password

    Given Registered user launches the SA LoginPage with URL "<url>"
    When The user enters invalid userName as "<invalidUser>"
    When The user enters valid password as "<password>"
    And The user clicks on the login form submit button
    Then The user is not logged in SA
    Then The user stays on the loginPage
    Then A error message is shown
    Then the user closes the browser

    Examples:
      | url| invalidUser|password|
      |http://localhost:8080/login | N3TestUser | 123|

  @Regression
  Scenario Outline:Not successful Login with invalid user and valid password

    Given The guest user launches Social Alien (SA) home page with  URL "<url>"
    When The user goes to Login page
    When The user enters valid userName as "<userName>"
    When The user enters valid password as "<password>"
    And The user clicks on the login form submit button
    Then The user is successfully logged in SA
    Then User`s name is presented as a link at the navigation
    When The user clicks on logout button
    Then The user is successfully logged-out from SA
    And The user is on the home page
    Then the user closes the browser

    Examples:
      | url| userName|password|
      |http://localhost:8080/ | NovemberRain | novemberrain|