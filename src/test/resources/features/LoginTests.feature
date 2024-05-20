Feature: Login feature

  Scenario: Login Success
    Given I open Login Page
    When I enter email "vikramjit@testpro.io"
    And I enter password "Vv3ZKxcI"
    And I submit
    Then I am logged in