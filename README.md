# Spring Boot Device Seller

## Endpoints

### Sign Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
{
    "name": "hw3a",
    "username": "hw3a",
    "password": "hw3a"
}
```

### Sign In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
{
    "username": "hw3a",
    "password": "hw3a"
}
```

### Change Role

```
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJodzNhIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjMsImV4cCI6MTY1Mjc4MDEyN30.SPaAqtyn0KNYtfftGoaWfJ0OzNSk67hyOdFcR06oNfSD8ozfHu7tV1OfDnGl0wIB6z2jNnqxBGrO5Qk0fXCCoA
```