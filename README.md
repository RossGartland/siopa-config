# siopa-config

Siopa Config Server is a centralized configuration management service for the Siopa platform, built using Spring Cloud Config Server. It allows microservices to fetch configuration properties from a remote Git repository.

## Features

- Centralized configuration management for microservices
- Fetches configuration from a Git repository
- Supports multiple environments (e.g., `dev`, `prod`)
- Compatible with Spring Boot 3 and Spring Cloud 2024.x
- Optional integration with Eureka for service discovery

## Prerequisites

- Java 17 or later
- Maven 3+
- A Git repository for storing configurations (e.g., `siopa-properties`)
- Spring Boot 3.x and Spring Cloud 2024.x

