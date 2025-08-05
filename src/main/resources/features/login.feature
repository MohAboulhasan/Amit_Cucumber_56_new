Feature: Login Feature

 @Regression
Scenario: Login with valid credentials

  Given  User opens home page and click on Forum Authentication
  When  User enter valid username and password and click on login button
  Then  User is directed to Secure Area Page and success message appears

   @Sanity
  Scenario Outline: Login with invalid username
    Given  User opens home page and click on Forum Authentication
    When  User enter invalid "<username>" and "<password>" and click on login button
    Then  Error message appears


    Examples:
      | username | password |
      | ahmed    | SuperSecretPassword! |
      | salah    | salah@123            |
      | mohamed  | mohamed1             |






