Feature: Validation of login scenarios

  @smoke
  Scenario: Admin login
    Given user enters valid admin credentials
    When user clicks on login button
    Then admin user is navigated to dashboard page

  @negative
  Scenario: Invalid username
    Given user enters valid admin credentials
    When user clicks on login button
    Then user sees the error message "Invalid credentials"