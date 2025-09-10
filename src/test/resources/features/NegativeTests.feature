@NegativeTests @AllTests
Feature: Negative tests - Failures for reporting purposes
  Note - In real life scenario, these negative cases should match the description in Scenario expectation and pass

  Background:
    * url 'http://localhost:8080'

  Scenario: Expect invalid status
    Given path 'name'
    And request { name: 'Nina' }
    When method post
    Then status 300
    And match response == 'You said: {"name":"Nina"}'

  Scenario: Send unsupported type
    Given path 'hello'
    When method PATCH
    Then status 200
    And match response == 'Hello, World!'

  Scenario: Incorrect response
    Given path 'clear'
    When method DELETE
    Then status 200
    And match response == 'Incorrect response expected'