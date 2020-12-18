$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Only authorized users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "log in as a \"authorized user\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter the valid credential and login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_enter_the_valid_credential_and_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the dashboard open and the title should be contain\"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_dashboard_open_and_the_title_should_be_contain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "blank username or password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@no"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users enter blank username or password to login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.users_enter_blank_username_or_password_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "invalid username or password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter invalid information to login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_enter_invalid_information_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message  Login id or password are wrong should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.error_message_Login_id_or_password_are_wrong_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "wrong usename or wrong password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enter wrong username or wrong password to login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_users_enter_wrong_username_or_wrong_password_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login as a user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user logs in using \u003cuser\u003e and \u003ccode\u003e and login",
  "keyword": "When "
});
formatter.step({
  "name": "the dashboard open and the title should be contain\u003cexpectedTitle\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "code",
        "expectedTitle"
      ]
    },
    {
      "cells": [
        "\"username\"",
        "\"password\"",
        "\"Zero - Account Summary\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login as a user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using \"username\" and \"password\" and login",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_user_logs_in_using_and_and_login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the dashboard open and the title should be contain\"Zero - Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.the_dashboard_open_and_the_title_should_be_contain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});