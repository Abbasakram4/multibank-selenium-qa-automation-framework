# MultiBank Selenium QA Automation Framework

Production-style UI automation framework implemented using Selenium WebDriver, Java, TestNG, and Maven.

The framework focuses on validating public user journeys and quality checks including navigation, trading visibility, marketing content, application download flows, broken links, invalid routes, and cross-browser execution.

---

## Framework Structure

src/test/java

- base
- pages
- tests
- utils

Structure overview:

base
- Driver initialization
- Browser setup
- Common test lifecycle

pages
- Page Object classes
- Element handling
- Reusable page actions

tests
- Test scenarios
- Assertions
- Execution suites

utils
- Browser helpers
- Wait utilities
- Common reusable methods

---

## Test Coverage

Implemented validation for:

- Navigation validation
- Trading section validation
- Trading data validation
- Marketing banner validation
- App download validation
- Broken link validation
- Invalid route handling
- Cross-browser execution support

---

## Requirement Interpretation and Assumptions

During implementation, the automation scope was aligned to the observable behavior of the current application UI.

Observations:

- Navigation behavior was validated against the currently accessible application state.
- Some referenced flows could not be reproduced directly from visible navigation during execution.
- Only reachable and verifiable UI paths were automated.

Implementation Decision:

- Prioritized observable user journeys instead of forcing unsupported navigation.
- Focused on reproducible validations and maintainable automation design.
- Documented assumptions and kept implementation transparent.

If this were a production environment, clarification would normally be raised before implementation.

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

---

## Cross-Browser Execution

Framework supports execution across:

- Chrome
- Firefox
- Edge

Execution status:

| Browser | Status |
|----------|--------|
| Chrome | Executed Successfully |
| Firefox | Executed Successfully |
| Edge | Framework Implemented |

Edge Notes:

During local execution, WebDriverManager was unable to download EdgeDriver because of a local driver resolution / DNS-related environment issue.

Browser support remains implemented and executable once the driver dependency issue is resolved.

---

## Running Tests

Run all tests:

```bash
mvn clean test
```

Run on Chrome:

```bash
mvn clean test -Dbrowser=chrome
```

Run on Firefox:

```bash
mvn clean test -Dbrowser=firefox
```

Run on Edge:

```bash
mvn clean test -Dbrowser=edge
```

---

## Design Principles

Framework design focused on:

- Maintainability
- Reusability
- Scalability
- Separation of concerns
- Clean Page Object implementation
- Easy browser extensibility

---

## Known Limitations

- Validation scope is limited to publicly accessible UI.
- Edge execution was not completed locally due to driver download dependency.
- Dynamic UI behavior may vary depending on environment updates.

---

## Submission Notes

This assessment was completed with emphasis on:

- Automation architecture
- Reasoning and implementation decisions
- Stability of execution
- Readability of framework
- Documentation and maintainability