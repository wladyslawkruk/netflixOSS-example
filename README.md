# netflix-example

The purpose of this project is to show the way to organize the basic microserice app structure
using Netflix OSS stack.

The project contains the following subprojects: 

1. Gateway-service
2. EUREKA Discovery-service (combined with Config-service)
3. Order-service

## Environment

To run all services with docker-compose use this command:
```
$sudo docker-compose up -d
```

## Interactions

You can get the list of services discovered by Eureka:

```bash
curl http://localhost:8888/eureka/apps
```

You can reach order-service controller via gateway. Get list of orders with GET request:
response: []
```bash
curl http://localhost:9090/api/order/
```




