## Framework Structure

src/test/java

- base
- pages
- tests
- utils


## Test Coverage

- Navigation validation
- Trading section validation
- Trading data validation
- Marketing banner validation
- App download validation
- Broken link validation
- Invalid route handling
- Cross-browser execution support


# MultiBank Selenium QA Automation Framework

Implemented Selenium automation using Java, TestNG, and Maven.

Focused on validating public user flows including navigation, trading data visibility, banners, invalid routes, and broken links.

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

## Cross-Browser Execution

The framework supports execution on Chrome, Firefox, and Edge browsers using the browser parameter.

Chrome and Firefox executions were completed successfully during local validation.

Edge browser support is also implemented in the framework. During execution, WebDriverManager was unable to download the required EdgeDriver because of a local network/DNS resolution issue. The framework logic and browser configuration for Edge are already included and can execute successfully once the driver download issue is resolved.## Cross-Browser Execution

The framework supports execution on Chrome, Firefox, and Edge browsers using the browser parameter.

Chrome and Firefox executions were completed successfully during local validation.

Edge browser support is also implemented in the framework. During execution, WebDriverManager was unable to download the required EdgeDriver because of a local network/DNS resolution issue. The framework logic and browser configuration for Edge are already included and can execute successfully once the driver download issue is resolved.## Cross-Browser Execution

The framework supports execution on Chrome, Firefox, and Edge browsers using the browser parameter.

Chrome and Firefox executions were completed successfully during local validation.

Edge browser support is also implemented in the framework. During execution, WebDriverManager was unable to download the required EdgeDriver because of a local network/DNS resolution issue. The framework logic and browser configuration for Edge are already included and can execute successfully once the driver download issue is resolved.

## Running Tests in GIT BASH
## For Running All Tests

1. Run all tests:

	mvn clean test
```

2. Run on Chrome:

	mvn clean test -Dbrowser=chrome
```

3. Run on Firefox:

	mvn clean test -Dbrowser=firefox
```

4. Run on Edge:

	mvn clean test -Dbrowser=edge (This will be failing because the reason I have already mentioned above: Edge browser support