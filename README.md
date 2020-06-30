# Test Utilities for `java.util.logging`

[![Build Status](https://travis-ci.org/exasol/virtual-schemas.svg?branch=master)](https://travis-ci.org/exasol/java-util-logging-testing)

SonarCloud results:

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)

[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=security_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=sqale_index)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=code_smells)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=coverage)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=com.exasol%3Ajava-util-logging-testing&metric=ncloc)](https://sonarcloud.io/dashboard?id=com.exasol%3Ajava-util-logging-testing)

# Overview

The Exasol's testing utilities for `java.util.logging` allow testing log message creation in software that uses the `java.util.logging` framework.

## Utilities

## `CapturingLogHandler`

Add this log handler if you want to record log messages created by your software and check the contents as part of unit tests.

## Customer Support

This is an open source project which is officially supported by Exasol. For any question, you can contact our support team.

## Dependencies

### Run Time Dependencies

Running the Virtual Schema requires a Java Runtime version 11 or later.

### Build Time Dependencies

| Dependency                                                                          | Purpose                                                | License                       |
|-------------------------------------------------------------------------------------|--------------------------------------------------------|-------------------------------|
| [Java Hamcrest](http://hamcrest.org/JavaHamcrest/)                                  | Checking for conditions in code via matchers           | BSD License                   |
| [JUnit](https://junit.org/junit5)                                                   | Unit testing framework                                 | Eclipse Public License 1.0    |

# License

This software is licensed under the [MIT license](LICENSE).
