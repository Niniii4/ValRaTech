@PositiveTests @AllTests
Feature: Positive Tests - All positive API calls

  Background:
    * url 'http://localhost:8080'

  Scenario: Greet a user with a valid name
    Given path 'name'
    And request { name: 'Nina' }
    When method POST
    Then status 200
    And match response == 'You said: {"name":"Nina"}'

  Scenario: Default name
    Given path 'hello'
    When method GET
    Then status 200
    And match response == 'Hello, World!'

  Scenario: Clear name
    Given path 'clear'
    When method DELETE
    Then status 200
    And match response == 'Greeting cleared.'