# Test Utilities for `java.util.logging`

[![Build Status](https://travis-ci.com/exasol/java-util-logging-testing.svg?branch=master)](https://travis-ci.com/exasol/java-util-logging-testing)
[![Maven Central](https://img.shields.io/maven-central/v/com.exasol/java-util-logging-testing)](https://search.maven.org/artifact/com.exasol/java-util-logging-testing)

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

## Information for Users

 * [Changelog](doc/changes/changelog.md)

## Dependencies

### Run Time Dependencies

Running the Virtual Schema requires a Java Runtime version 11 or later.

### Build Time Dependencies

| Dependency                                                               | Purpose                                                | License                       |
|--------------------------------------------------------------------------|--------------------------------------------------------|-------------------------------|
| [Java Hamcrest](http://hamcrest.org/JavaHamcrest/)                       | Checking for conditions in code via matchers           | BSD License                   |
| [JUnit](https://junit.org/junit5)                                        | Unit testing framework                                 | Eclipse Public License 1.0    |

### Maven Plug-ins

| Plug-in                                                                  | Purpose                                                | License                       |
|--------------------------------------------------------------------------|--------------------------------------------------------|-------------------------------|
| [Maven Compiler Plugin][maven-compiler-plugin]                           | Setting required Java version                          | Apache License 2.0            |
| [Maven Enforcer Plugin][maven-enforcer-plugin]                           | Controlling environment constants                      | Apache License 2.0            |
| [Maven GPG Plugin](https://maven.apache.org/plugins/maven-gpg-plugin/)   | Code signing                                           | Apache License 2.0            |
| [Maven Jacoco Plugin][maven-jacoco-plugin]                               | Code coverage metering                                 | Eclipse Public License 2.0    |
| [Maven Javadoc Plugin][maven-javadoc-plugin]                             | Creating a Javadoc JAR                                 | Apache License 2.0            |
| [Maven Source Plugin][maven-source-plugin]                               | Creating a source code JAR                             | Apache License 2.0            |
| [Maven Surefire Plugin][maven-surefire-plugin]                           | Unit testing                                           | Apache License 2.0            |
| [Sonatype OSS Index Maven Plugin][sonatype-oss-index-maven-plugin]       | Checking Dependencies Vulnerability                    | ASL2                          |
| [Versions Maven Plugin][versions-maven-plugin]                           | Checking if dependencies updates are available         | Apache License 2.0            |

# License

This software is licensed under the [MIT license](LICENSE).

[maven-compiler-plugin]: https://maven.apache.org/plugins/maven-compiler-plugin/
[maven-enforcer-plugin]: http://maven.apache.org/enforcer/maven-enforcer-plugin/
[maven-jacoco-plugin]: https://www.eclemma.org/jacoco/trunk/doc/maven.html
[maven-javadoc-plugin]: https://maven.apache.org/plugins/maven-javadoc-plugin/
[maven-source-plugin]: https://maven.apache.org/plugins/maven-source-plugin/
[maven-surefire-plugin]: https://maven.apache.org/surefire/maven-surefire-plugin/
[sonatype-oss-index-maven-plugin]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[versions-maven-plugin]: https://www.mojohaus.org/versions-maven-plugin/