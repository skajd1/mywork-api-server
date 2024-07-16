# mywork-api-server

## Environment
- jdk17
- Spring Boot 3
- MySQL 5.7

## API List
### HealthCheck
- **GET**
    - /health

### User Domain
- **GET**
    - /user/list
    - /user/{uid}
- **POST**
    - /user | param : name
- **UPDATE**
    - /user/{uid}  | param : name
- **DELETE**
    - /user/{uid}
