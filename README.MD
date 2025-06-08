# GraphQL + H2 + Spring-boot Application
This Standalone Spring boot project demonstrates the crud operations on Tour services using GraphQL as API.

## 1. In Memory H2 Database is used

## 2. Once the application is running, you can access Graphiql under http://localhost:8080/graphiql
    ![GraphiQL](screen-shots/graphiql.PNG)

## Testing the Application
### Retrieve:
#### GraphQL Syntax
```graphql
query {
    authors {
        id
        name
    }
}
```
#### JSON Syntax
```json
{
  "query": "{authors{id name}}"
}
```