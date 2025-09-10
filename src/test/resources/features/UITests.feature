@UITests
Feature: Greeting behavior validation

  Scenario: Validate greeting after clicking hello button and clear actions
    * configure driver = { type: 'chromedriver', executable: 'src/test/resources/chromedriver.exe' }
    * driver 'http://localhost:8080/'

    # Enter name, click Hello and validate greeting is populated
    * input('#name', 'Nina')
    * click('#helloBtn')
    * waitFor('#greeting')
    * match text('#greeting') == 'Hello, Nina!'
    * screenshot()

    # Click Clear and check greeting is empty
    * click('#clearBtn')
    * waitFor('#greeting')
    * match text('#greeting') == ''
    * screenshot()