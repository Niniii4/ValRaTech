# ValRaTech Testing Project

A project with basic tests for practicing API, Performance and UI tests using the Karate framework.

## Features

- `src/test/resources/features/api` — API tests
- `src/test/resources/features/ui` — ui tests
- `src/test/java/perf` — performance tests

## Prerequisites
To run the tests, the application under test must be started in the background. 
The application tested with this project is: https://github.com/Niniii4/spring-karate-demo.
Please follow the Readme.md file to set up the project above as a prerequisite.

Some plugins might be required to be installed, such as Gherkin and Karate plugins. 

## Build and Run

**Build the project with:**  
```bash
mvn clean install
```

**Run the API/UI tests by updating the TestRunner and executing the command:**  
```bash
mvn test
```
**Run the Performance tests by executing the command:**
```bash
mvn gatling:test
```
Visit http://localhost:8080 to try the UI.

## Usage
Use this app as a knowledge base for basic Karate API, Performance and UI automation tests.
