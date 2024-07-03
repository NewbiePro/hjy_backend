# HeJiaYun Residential Property Management Backend System
## Introduction 
Designed as a web-based application, the HeJiaYun Residential Property System actively serves to boost the productivity of community staff and maintain nice customer service quality. It achieves this via the implementation of diverse functionality modules including community administration, community asset management, and visitor management, among others.

Hjy_backend represents the underlying system supporting HeJiaYun System. It seamlessly integrates a robust tech stack comprised of Spring Boot, Spring Security, MyBatis+, Redis, Docker and Maven.

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

## Module Introduction
### Community Module
- Performing multi-condition pagination queries for communities, such as using community name and community ID.
- Adding new community.
- Modifying community information:
  - Displaying data based on community ID.
  - Fetching three-level linkage information for province, city, and district.
  - Modifying community information.
- Deleting community information: Bulk deletion based on one or multiple community IDs.
- Changing property management department:
  - Fetching linkage information for the property.
  - Changing the property management department as needed, such as from the Beijing office to the Changsha office.
- Fetching community dropdown list.
- Exporting community data: Exporting current page data to Excel using easypoi.

### Building Module
- Performing multi-condition pagination queries for buildings.
- Fetching building dropdown list.
- Modifying building information:
  - Displaying data based on building ID.
  - Modifying and submitting data as needed.
- Adding building information.
- Deleting building information.
- Exporting current page data for buildings: Exporting current page data using easypoi.

### User Module
- Retrieving property department info: Retrieving a tree structure of department data in JSON format so to query users in related department.
- Adding users.
- Modifying users.
- Deleting users.
- Exporting user information.
- Changing user passwords: Super admin privileges are required for password changes.
- Toggling user status: Active status indicates the user is active, while disabled status indicates the user is inactive.

## Role Module Development
Users need specific roles to access corresponding menus (permissions).
- Adding roles.
- Modifying roles.
- Deleting roles.
- Querying roles.
- Exporting role information.

## Menu (Permissions) Module Development
Roles must have corresponding menu permissions to perform certain operations.
- Fetching menu information: Obtaining a tree structure of menu data in JSON format.
- Adding menu information.
- Deleting menu information.
- Modifying menu information: Includes changing menu types, such as directory menus, button menus, and regular menus.
- Changing menu status information: Includes whether the menu is displayed, cached, and whether the menu is active or disabled.

## Department Module Development
- Fetching department information: Providing department data in a tree structure as JSON.
- Querying department information.
- Adding department information.
- Deleting department information.
- Modifying department information.

## Login Module Development
- Fetching captcha: Using easy-captcha to generate a random captcha image and UUID.
- User login: Includes username and password verification, and captcha validation. The system checks the user input against the data stored in Redis using the UUID. Each login refreshes the token time.
- Fetching user information: Includes username, user roles, and user menus (permissions).

## Routing Navigation Menu Development
Fetching left-side navigation menu and sub-menu data based on user ID and corresponding permissions.

## Program Testing and Debugging
- Unit testing: Using JUnit for unit testing, such as CRUD operations on data.
- Functional testing: Using JUnit for functional testing, such as data export.
- API testing: Using Postman for API interface testing to ensure the displayed JSON format matches the interface documentation.
- Debugging and fixing: Fixing and testing modules with bugs found during testing.
