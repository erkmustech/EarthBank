@account_activity
  Feature: Navigating to specific accounts in Accounts Activity

    @smoke
    Scenario: Accounts Activity page
      Given the user enter the valid credential and login
      And the user navigates to "Account Activity" Page
      When the page title should be "Zero - Account Activity"
      And account dropdown default option should be "Savings"
      Then dropdown should have following option
        | Savings | Checking | Savings | Loan | Credit Card | Brokerage |
    #This is a bug == DropdownMenu has 2 savings option
      And Transaction table should have the following columns
        | Date | Description | Deposit | Withdrawal |


    Scenario: Savings account redirect
      Given the user is logged in
      When the user clicks on Savings link on the Account Summary page
      Then the Account Activity page should be displayed
      And Account drop down should have Savings selected

      @somke
    Scenario: Brokerage account redirect
      Given the user is logged in
      When the user clicks on Brokerage link on the Account Summary page
      Then the Account Activity page should be displayed
      And Account drop down should have Brokerage selected

    Scenario: Checking account redirect
      Given the user is logged in
      When the user clicks on Checking link on the Account Summary page
      Then the Account Activity page should be displayed
      And Account drop down should have Checking selected

    Scenario: Credit Card account redirect
      Given the user is logged in
      When the user clicks on Credit card link on the Account Summary page
      Then the Account Activity page should be displayed
      And Account drop down should have Credit Card selected

    Scenario: Loan account redirect
      Given the user is logged in
      When the user clicks on Loan link on the Account Summary page
      Then the Account Activity page should be displayed
      And Account drop down should have Loan selected
      Then results table should show at least one result under Withdrawal
      But results table should show no result under Deposit

