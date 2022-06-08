Feature: Dashboard tabs verification functionality

  @dashboard
  Scenario: Verify dashboard tabs
    Given user enters valid admin credentials
    When user clicks on login button
    And admin user is navigated to dashboard page
    Then admin user verifies all the dashboard tabs
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | Performance |
      | Dashboard   |
      | Folders  |