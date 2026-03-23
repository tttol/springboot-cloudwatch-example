# springboot-cloudwatch-example
This is a sample project which is built by SpringBoot. The purpose is:

- To test connecting SpringBoot application and CloudWatch
- To test output log in CloudWatch Logs

## Spec
### App
- Java 25 / SpringBoot
- Use structured log like below:
```json
  {
    "@timestamp": "2026-03-23T10:00:00.123Z",
    "@version": "1",
    "message": "Order processing started",
    "logger_name": "com.example.OrderService",
    "level": "INFO",
    "orderId": "ORD-001",
    "userId": "USR-123",
    "action": "process_order",
    "thread_name": "main"
  }
```
### Infra
- AWS ECS
- CloudWatch Logs

