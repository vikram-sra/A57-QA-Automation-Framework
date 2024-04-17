Feature: Login Tests

  Scenario: Login Success
    Given I open login page
    When I enter email "vikramjit@testpro.io"
    And I enter password "Vv3ZKxcI"
    And I submit
    Then I am logged in