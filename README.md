# Debit Card Claim DMN Service

A Quarkus/Kogito service for evaluating debit card claims using DMN decision tables.

## Author
**Rishijeet Mishra**

## Project Structure

## Key Features
- REST API for debit card claim evaluation
- DMN-based business rules in `debit-card-claim.dmn`
- BPMN workflow support (`test-process.bpmn2`)
- JUnit 5 test coverage

## How to Run
```bash
# Development mode
mvn quarkus:dev

# Production build
mvn clean package
```

## API Endpoints
- `POST /debit-card-claim` - Evaluate a claim
  ```json
  {
    "Claim": {
      "claimTimely": true,
      "highRiskTransaction": false
    }
  }
  ```

## Testing
```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=DebitCardClaimTest
```

## Dependencies
- Quarkus 2.0+
- Kogito DMN Engine
- RESTEasy (JAX-RS)
- JUnit 5

## Configuration
Edit `src/main/resources/application.properties` for:
- Swagger UI: `quarkus.swagger-ui.enable=true`
- DMN Validation: `kogito.decisions.validation=ENABLED`
