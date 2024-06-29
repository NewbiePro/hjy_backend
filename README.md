# HeJiaYun Residential Property Management Backend System
## Introduction 
Designed as a web-based application, the HeJiaYun Residential Property System actively serves to boost the productivity of community staff and maintain nice customer service quality. It achieves this via the implementation of diverse functionality modules including community administration, community asset management, and visitor management, among others.

Hjy_backend represents the underlying system supporting HeJiaYun System. It seamlessly integrates a robust [tech stack](#tech-stack-introduction) comprised of Spring Boot, Spring MVC, Spring Security, MyBatis+, Redis, Docker and [Maven](#maven).

## Backend Project Structure
### Overview
```
com.msb.hjy_backend
|———— common	// common tool/utils
|———— framework // core framework
|———— community // community module services
|———— system	// system module services
|———— web	// backend interfaces to interact with frontend
```
### Common Directory
```
com.msb.hjy_backend
|———— common
      |———— constants // Stores constant values such as http status
      |———— core  // Houses base classes such as base entity, base response, base exception, base controller
      |———— enums // Houses enums of user status eg. OK, DISABLE, DELETED
      |———— utils	// Stores common utilities eg. redis utilities, excel utilities
```
The common directory houses a collection of functionalities and utility code that are widely applicable across various components of the project.
### Framework Directory
```
com.msb.hjy_backend
|———— framework
      |———— config // Houses configurations including redis, spring security config
      |———— security // Hosts security-related filter, handlers and customized permission
      |———— service // Manages services related to user permissions.
```
The framework directory forms the backbone, including essential configurations, security requisites, and  permission-based services.

### Community Directory
```
com.msb.hjy_backend
|———— community
      |———— domain // Houses entities, VO(view object), DTO(data transform object)
      |———— mapper // Contains community related mappers
      |———— service // Handles business logic for community module
```
The community directory hosts business logic, data objects, and data transformation relevant to community module.

### System Directory
```
com.msb.hjy_backend
|———— system
      |———— domain // Houses entities, VO(view object), DTO(data transform object)
      |———— mapper // Contains system administration related mappers
      |———— service // Handles business logic for system administration module
```
The system directory hosts business logic, data objects, and data transformation relevant to system administration module.

### Web Directory
```
com.msb.hjy_backend
|———— web
      |———— controller // Houses controllers to interact with frontend requests
```
The web directory is primarily responsible for front-end interactions, mainly housing the controllers.

## Module/ Feature Introduction
###

## Tech Stack Introduction
### Spring Framework
#### DI
#### AOP

### Spring Boot

### Spring Security


### Spring MVC

### Spring Security


### Maven

### Design Pattern
