# mywork-api-server

[mywork-infrastructure](https://github.com/skajd1/mywork-infrastructure)
이 레포를 참고하여 배포할 수 있습니다.

## Environment
- jdk17
- Spring Boot 3
- MySQL 5.7
- JPA

## API List
### HealthCheck
- **GET**
    - /health

### User Domain
- **GET**
    - /user
    - /user/{uid}
- **POST**
    - /user | param : name
- **UPDATE**
    - /user/{uid}  | param : name
- **DELETE**
    - /user/{uid}

## 동작 확인
- /health - get

<img src = https://github.com/user-attachments/assets/cfc75afb-a07e-464e-9262-bf799b196aef>

- /user - get

<img src = https://github.com/user-attachments/assets/35a8756e-fd86-461c-a684-d9aec36146a9>

- /user/{uid}

<img src = https://github.com/user-attachments/assets/1d4535fe-40bf-416c-bc00-0a7d9a8e9a29>

