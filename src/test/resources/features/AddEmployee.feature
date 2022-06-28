Feature: Validation of Add Employee functionality

  Background:
    Given user enters valid admin credentials
    When user clicks on login button
    And user clicks on PIM option
    And user clicks on Add employee option

  @addemployee
  Scenario: Adding one employee from feature file
    When user enters firstname, middle name, and last name
    And user clicks on save button
    Then employee is added successfully