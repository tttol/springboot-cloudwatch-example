# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Spring Boot application demonstrating integration with AWS CloudWatch Logs. Outputs structured JSON logs from an ECS-hosted app to CloudWatch Logs.

- **Runtime:** Java 25 / Spring Boot 4.0.4
- **Infrastructure:** AWS ECS + CloudWatch Logs
- **Build:** Gradle Wrapper

## Commands

```bash
# Build
./gradlew build

# Run
./gradlew bootRun

# Test all
./gradlew test

# Run a single test class
./gradlew test --tests "io.github.tttol.springboot_cloudwatch_example.SomeTest"

# Clean build
./gradlew clean build
```

## Architecture

The app is in the early stage — currently only the main application class and a context-load test exist. The intended design is:

- **Structured JSON logging** to stdout (consumed by CloudWatch Logs agent on ECS)
- Log format includes fields: `@timestamp`, `@version`, `message`, `logger_name`, `level`, custom MDC fields (e.g., `orderId`, `userId`, `action`), `thread_name`

When adding features, expect to implement:
1. REST controllers under `io.github.tttol.springboot_cloudwatch_example`
2. Logback/Log4j2 configuration for JSON structured output (e.g., `logstash-logback-encoder`)
3. MDC population for request-scoped fields

## Dependencies

- `spring-boot-starter-webmvc` — Spring MVC web layer
- `lombok` — compile-time annotation processing (annotation processor configured)
- `spring-boot-devtools` — dev-only hot reload
- `spring-boot-starter-webmvc-test` — `MockMvc` for controller tests
