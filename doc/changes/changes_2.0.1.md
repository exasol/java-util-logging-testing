# Test utilities for `java.util.logging` 2.0.1, released 2021-11-22

Code name: Migrated to GitHub Actions and used Project Keeper

In release 2.0.1 of `java.util.logging` we migrated the CI build from Travis CI to GitHub Actions, introduced Project Keeper and updated the dependencies.

## Features

* 10: Migrated to GitHub actions

## Dependency Updates

### Test Dependency Updates

* Updated `org.junit.jupiter:junit-jupiter-engine:5.6.2` to `5.8.1`

### Plugin Dependency Updates

* Added `com.exasol:error-code-crawler-maven-plugin:0.1.1`
* Added `com.exasol:project-keeper-maven-plugin:1.3.2`
* Added `io.github.zlika:reproducible-build-maven-plugin:0.13`
* Updated `org.apache.maven.plugins:maven-deploy-plugin:2.7` to `3.0.0-M1`
* Added `org.sonatype.plugins:nexus-staging-maven-plugin:1.6.8`
