# Projeto DemoAutentica

Realiza um processo simples de autenticação para este serviço do Spring Boot

## Modo de usar

Subir o serviço com:
```
$ ./mvnw spring-boot:run
```

Chamar o serviço com o CURL:
```
$ curl -H "Authorization: 123" http://localhost:8081/exemplo
```

Ao tentar chamar o serviço sem o Authorization, recebemos um erro 500.
