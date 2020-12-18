@payee
Feature: Add new payee under pay bills

   @smoke
  Scenario: Add a new payee
  Given Add New Payee tab
  And creates new payee using following information

  |Payee Name | The Law Offices of Hyde, Price & Scharks|
  |Payee Address | 100 Same st, Anytown, USA, 10001 |
  | Account| Checking |
  |Payee detailes| XYZ account |

  Then the massage the new Payee "The Law Offices of Hyde, Price & Scharks successfully created" should be displayed