Feature: Facebook login

  Scenario: loginpage
    Given Open Facebook and launch the application
    When Enter the Username and Password
      | One   | Bala      |
      | Two   | Suresh    |
      | Three | Mukesh    |
      | Four  | Keerthana |
    Then Close the browser
      | S.No | Username  | Password     |
      |    1 | Bala      | bala123      |
      |    2 | Suresh    | suresh123    |
      |    3 | Keerthana | keerthana123 |
      
      
      
