@login @smoke
  Feature: Only authorized users should be able to login

     @wip
    Scenario: log in as a "authorized user"
      Given the user is on the login page
      When the user enter the valid credential and login
      Then the dashboard open and the title should be contain"Zero - Account Summary"

      @no
    Scenario: blank username or password
      Given the user is on the login page
      When Users enter blank username or password to login
      Then the user should not be able to login

      Scenario: invalid username or password
        Given the user is on the login page
        When user enter invalid information to login
        Then error message  Login id or password are wrong should be displayed

    Scenario: wrong usename or wrong password
      Given the user is on the login page
      When the users enter wrong username or wrong password to login
      Then user should not be able to login


    Scenario Outline: Login as a user
      Given the user is on the login page
      When the user logs in using <user> and <code> and login
      Then the dashboard open and the title should be contain<expectedTitle>
      Examples:
        | user     | code    | expectedTitle            |
        | "username" | "password" | "Zero - Account Summary" |


