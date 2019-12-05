Feature: Registration functionality of Social Alien(SA) social network web-application
  As a  registered user,
  I want to be able to login in the SA
  so that I can use all user`s functionality of the SA App

  @Smoke
  Scenario Outline: Registration with must field fields

    Given A guest user lunches the SA registration page with with URL "<url>"
    When The user enters new userName as "<userName>"
    When The user enters new email as "<email>"
    When The user enters password as "<password>"
    When The user reenters the password
    And The user clicks on the registration form submit button
    Then The user is successfully registered in SA
    Then A welcome message is shown at the home page
    Then The browser is closed by the user

    Examples:
      | url| userName|email|password|
      |http://localhost:8080/register | newU|email | newPass|

  @Regression
  Scenario: Registration with data provided by excel

    Given The user is on the registration page
    When The user enters valid/invalid data in the registration form must field fields provided by "RegTestData.xlsx"
    And The user clicks on the registration form submit button
    Then Then an error message is displayed and users is at the home page
